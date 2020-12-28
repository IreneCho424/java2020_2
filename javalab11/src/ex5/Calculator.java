/**
 * The Calculator class along with CalculatorController,
 * CalculatorModel and CalculatorView implements a 
 * simple-minded calculator.
 * The implementation is based on the MVC design pattern.
 * 
 * @author Tom Bylander
*/

package ex5;

import javax.swing.JFrame;

//(예제5) 계산기 프로그램의 메인 함수
//1817022 조이린

public class Calculator {
	public static void main(String[] args) {
		/* create new model, view and controller */
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		//model과 view 객체를 연결하는 역할의 controller - 생성자에 두 객체를 필드로
		CalculatorController controller = new CalculatorController(model, view);
		
		/* register controller as listener */
		// 모든 버튼에 대한 액션을 한번에 등록
		view.registerListener(controller);
		
		/* start it up */
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(400, 300);
		view.setVisible(true);
	}
}
