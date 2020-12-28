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

//(����5) ���� ���α׷��� ���� �Լ�
//1817022 ���̸�

public class Calculator {
	public static void main(String[] args) {
		/* create new model, view and controller */
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		//model�� view ��ü�� �����ϴ� ������ controller - �����ڿ� �� ��ü�� �ʵ��
		CalculatorController controller = new CalculatorController(model, view);
		
		/* register controller as listener */
		// ��� ��ư�� ���� �׼��� �ѹ��� ���
		view.registerListener(controller);
		
		/* start it up */
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(400, 300);
		view.setVisible(true);
	}
}
