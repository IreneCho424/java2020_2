package pm1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//(실습1) CalculatorController 클래스 - view와 model의 가교 역할. 버튼 클릭시 발생하는 이벤트를 공통적으로 처리하기 위함
//1817022 조이린

public class CalculatorController implements ActionListener {
	private CalculatorModel model;
	private CalculatorView view;

	public CalculatorController(CalculatorModel model, CalculatorView view) {
		//필드들을 초기화
		this.model = model;
		this.view = view;
	}

	//ActionListener를 구현했기 때문에 actionPerformed 메서드가 구현
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand(); //클릭된 버튼의 text가 넘어옴
		if (command.equals("Exit")) { //메뉴의 Exit 버튼 클릭시
			System.exit(0);
		} 
		//소수점 이하 둘째자리까지만 표시
		else if (command.equals("Two Decimal Digits")) { //메뉴의 Two Decimal Digits 버튼 클릭시
			view.setDigits(2);
			view.update(model.getValue());
		} 
		//소수점 이하 모두 표시
		else if (command.equals("Any Decimal Digits")) { //메뉴의 Any Decimal Digits 버튼 클릭시
			view.setDigits(-1);
			view.update(model.getValue());
		} 
		//clear 메뉴 추가
		else if(command.equals("Clear")) {
			view.setDigits(-2);
			view.update("0.0");		//보여지는 값을 0.0으로 재설정
			model.update(command);  //기존의 값을 모두 초기화!
		}
		else { //그 외  숫자 또는 연산자
			model.update(command);
			view.update(model.getValue());
		}
	}
}
