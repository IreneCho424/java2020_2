package pm1;

//(�ǽ�1) CalculatorModel Ŭ���� - ���� ����
//1817022 ���̸�

public class CalculatorModel {
	//����ϱ� ���� �ʿ��� �ʵ��
	private double displayValue; //���� �����ִ� ��
	private double internalValue; //���ο� ���� �ִ� ��
	private String displayString; //���� �����ִ� �� -String����
	private String operation;
	private boolean start;
	private boolean dot; //�Ҽ����� ���� ǥ��

	public CalculatorModel() {
		displayValue = 0.0;
		displayString = "" + displayValue;
		internalValue = 0;
		dot = false;
		start = true;
		operation = "";
	}

	public String getValue() {
		return displayString;
	}

	//���� ���� �ۼ�
	public void update(String text) {
		if (start) {
			internalValue = displayValue;
			displayValue = 0;
			displayString = "";
			start = false;
			dot = false;
		}
		
		if (text.length() == 1 && "0123456789".indexOf(text) >= 0) { //���� �Է� - ���� ���� 1, 0123456789 ���� �ϳ����
			displayString += text;	//���� ������ �� �ڿ� �ٿ���
			displayValue = Double.valueOf(displayString); //������ ��ȯ
		} 
		else if (text.equals(".")) { //�Ҽ����� ���
			if (!dot) {
				dot = true;
				if (displayString.equals("")) {
					displayString = "0";
				}
				displayString += ".";
			}
		} 
		else { //������ �� ��ȣ - ���� ����
			if (operation.equals("+")) {
				displayValue = internalValue + displayValue;
			} 
			else if (operation.equals("-")) {
				displayValue = internalValue - displayValue;
			} 
			else if (operation.equals("*")) {
				displayValue = internalValue * displayValue;
			} 
			else if (operation.equals("/")) {
				displayValue = internalValue / displayValue;
			}
			
			displayString = "" + displayValue;
			internalValue = displayValue;
			operation = text;
			start = true;
		}
	}
}
