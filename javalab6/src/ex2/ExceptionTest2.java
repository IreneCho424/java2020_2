package ex2;

//(����2) ����ó��-try catch ��� ����
//1817022 ���̸�

public class ExceptionTest2{
	//���� ó�� : ������ 0���� ����
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		try {
			int result = 10 / num;
			System.out.println("result = " + result);
		}
		catch(ArithmeticException e){
			System.out.println("������ 0���� ������ �ȵſ�.");
		}
		System.out.println("���α׷� ��� �����");
	}
}