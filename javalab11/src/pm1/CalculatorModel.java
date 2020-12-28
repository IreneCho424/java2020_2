package pm1;

//(실습1) CalculatorModel 클래스 - 연산 수행
//1817022 조이린

public class CalculatorModel {
	//계산하기 위해 필요한 필드들
	private double displayValue; //현재 보여주는 값
	private double internalValue; //내부에 갖고 있는 값
	private String displayString; //현재 보여주는 값 -String으로
	private String operation;
	private boolean start;
	private boolean dot; //소수점을 위한 표시

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

	//실제 로직 작성
	public void update(String text) {
		if (start) {
			internalValue = displayValue;
			displayValue = 0;
			displayString = "";
			start = false;
			dot = false;
		}
		
		if (text.length() == 1 && "0123456789".indexOf(text) >= 0) { //숫자 입력 - 숫자 길이 1, 0123456789 중의 하나라면
			displayString += text;	//현재 선택한 값 뒤에 붙여줌
			displayValue = Double.valueOf(displayString); //값으로 변환
		} 
		else if (text.equals(".")) { //소수점일 경우
			if (!dot) {
				dot = true;
				if (displayString.equals("")) {
					displayString = "0";
				}
				displayString += ".";
			}
		} 
		else { //연산자 및 기호 - 연산 수행
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
