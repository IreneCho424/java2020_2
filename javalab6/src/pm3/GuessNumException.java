package pm3;

//(�ǽ�3) ����� ���� ���� ó�� Ŭ���� - ���� �Է¿� ���� ���� ó��
//1817022 ���̸�

public class GuessNumException extends Exception{
	
	public GuessNumException() {}
	
	public String getMessage() {
		return("Number should be between 1~6\nTry again");
	}
}