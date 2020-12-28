package pm1;

import java.awt.*;
import javax.swing.*;

//(실습1) CalculatorView 클래스 - 시각적 정보 저장하는 클래스, 어떤 리스너를 등록할 것인지 저장하는 클래스
//Clear 버튼 및 메뉴 항목 추가함
//1817022 조이린

public class CalculatorView extends JFrame {
	//필드로 구성 - 생성자 뿐 아니라 이 클래스의 메서드들에서도 필요하기 때문에
	private JLabel display;
	private JPanel buttonsPanel;
	private JButton clearbtn = new JButton("Clear"); //clear 버튼 추가
	private JMenu exampleMenu;
	private int digits;

	public CalculatorView() {
		super("Simple Calculator");

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		exampleMenu = new JMenu("Menu");
		menuBar.add(exampleMenu);

		JMenuItem twoDigitsButton = new JMenuItem("Two Decimal Digits");
		exampleMenu.add(twoDigitsButton);

		JMenuItem anyDigitsButton = new JMenuItem("Any Decimal Digits");
		exampleMenu.add(anyDigitsButton);
		
		//메뉴 추가!! - 처음 프로그램을 시작했을 때의 값으로 초기화시킨다.
		JMenuItem clearButton = new JMenuItem("Clear");
		exampleMenu.add(clearButton);

		JMenuItem exitButton = new JMenuItem("Exit");
		exampleMenu.add(exitButton);

		JPanel displayPanel = new JPanel();
		add(displayPanel, BorderLayout.NORTH);

		display = new JLabel("0.0");
		displayPanel.add(display);
		digits = -1;

		buttonsPanel = new JPanel();
		add(buttonsPanel, BorderLayout.CENTER);
		buttonsPanel.setLayout(new GridLayout(4, 4, 0, 0));
		
		//화면 아래에 clear 버튼 추가
		add(clearbtn, BorderLayout.SOUTH);

		String[] buttonStrings = { 
				"1", "2", "3", "+",
				"4", "5", "6", "-",
				"7", "8", "9", "*",
				"0", ".", "=", "/" };

		for (String s : buttonStrings)
			buttonsPanel.add(new JButton(s));
	}

	//버튼을 눌렀을 때 어떤 리스너를 호출할 것인지
	public void registerListener(CalculatorController controller) {
		Component[] components = buttonsPanel.getComponents(); //버튼을 눌렀을 경우
		for (Component component : components) {
			if (component instanceof AbstractButton) {
				AbstractButton button = (AbstractButton) component;
				button.addActionListener(controller);
			}
		}

		components = exampleMenu.getMenuComponents();
		for (Component component : components) { //메뉴바의 메뉴를 선택했을 경우
			if (component instanceof AbstractButton) {
				AbstractButton button = (AbstractButton) component;
				button.addActionListener(controller);
			}
		}
	}

	//연산 후 디스플레이의 변화를 나타내는 함수
	public void update(String value) {
		if(digits < 0) {
			display.setText(value);
		}
		else {
			String format = "%." + digits + "f";
			String text = String.format(format, Double.valueOf(value));
			display.setText(text);
		}
	}

	//소수 몇째자리로 할지 설정하는 함수
	public void setDigits(int digits) {
		this.digits = digits;
	}
}
