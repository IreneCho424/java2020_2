package pm1;

import java.awt.*;
import javax.swing.*;

//(�ǽ�1) CalculatorView Ŭ���� - �ð��� ���� �����ϴ� Ŭ����, � �����ʸ� ����� ������ �����ϴ� Ŭ����
//Clear ��ư �� �޴� �׸� �߰���
//1817022 ���̸�

public class CalculatorView extends JFrame {
	//�ʵ�� ���� - ������ �� �ƴ϶� �� Ŭ������ �޼���鿡���� �ʿ��ϱ� ������
	private JLabel display;
	private JPanel buttonsPanel;
	private JButton clearbtn = new JButton("Clear"); //clear ��ư �߰�
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
		
		//�޴� �߰�!! - ó�� ���α׷��� �������� ���� ������ �ʱ�ȭ��Ų��.
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
		
		//ȭ�� �Ʒ��� clear ��ư �߰�
		add(clearbtn, BorderLayout.SOUTH);

		String[] buttonStrings = { 
				"1", "2", "3", "+",
				"4", "5", "6", "-",
				"7", "8", "9", "*",
				"0", ".", "=", "/" };

		for (String s : buttonStrings)
			buttonsPanel.add(new JButton(s));
	}

	//��ư�� ������ �� � �����ʸ� ȣ���� ������
	public void registerListener(CalculatorController controller) {
		Component[] components = buttonsPanel.getComponents(); //��ư�� ������ ���
		for (Component component : components) {
			if (component instanceof AbstractButton) {
				AbstractButton button = (AbstractButton) component;
				button.addActionListener(controller);
			}
		}

		components = exampleMenu.getMenuComponents();
		for (Component component : components) { //�޴����� �޴��� �������� ���
			if (component instanceof AbstractButton) {
				AbstractButton button = (AbstractButton) component;
				button.addActionListener(controller);
			}
		}
	}

	//���� �� ���÷����� ��ȭ�� ��Ÿ���� �Լ�
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

	//�Ҽ� ��°�ڸ��� ���� �����ϴ� �Լ�
	public void setDigits(int digits) {
		this.digits = digits;
	}
}