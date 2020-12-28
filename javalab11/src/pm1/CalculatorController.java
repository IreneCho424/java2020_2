package pm1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//(�ǽ�1) CalculatorController Ŭ���� - view�� model�� ���� ����. ��ư Ŭ���� �߻��ϴ� �̺�Ʈ�� ���������� ó���ϱ� ����
//1817022 ���̸�

public class CalculatorController implements ActionListener {
	private CalculatorModel model;
	private CalculatorView view;

	public CalculatorController(CalculatorModel model, CalculatorView view) {
		//�ʵ���� �ʱ�ȭ
		this.model = model;
		this.view = view;
	}

	//ActionListener�� �����߱� ������ actionPerformed �޼��尡 ����
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand(); //Ŭ���� ��ư�� text�� �Ѿ��
		if (command.equals("Exit")) { //�޴��� Exit ��ư Ŭ����
			System.exit(0);
		} 
		//�Ҽ��� ���� ��°�ڸ������� ǥ��
		else if (command.equals("Two Decimal Digits")) { //�޴��� Two Decimal Digits ��ư Ŭ����
			view.setDigits(2);
			view.update(model.getValue());
		} 
		//�Ҽ��� ���� ��� ǥ��
		else if (command.equals("Any Decimal Digits")) { //�޴��� Any Decimal Digits ��ư Ŭ����
			view.setDigits(-1);
			view.update(model.getValue());
		} 
		//clear �޴� �߰�
		else if(command.equals("Clear")) {
			view.setDigits(-2);
			view.update("0.0");		//�������� ���� 0.0���� �缳��
			model.update(command);  //������ ���� ��� �ʱ�ȭ!
		}
		else { //�� ��  ���� �Ǵ� ������
			model.update(command);
			view.update(model.getValue());
		}
	}
}
