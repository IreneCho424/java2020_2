package ex2;

//(����2) ����ó�� -try catch finally ��� ����
//1817022 ���̸�

public class ExceptionTest3{
	//���� ó�� : ���� ���� ���� ó�� and finally �׽�Ʈ
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10/num;
			System.out.println("result = " + result);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ڸ� �ϳ� �Է��� �ּ���");
		}
		catch(NumberFormatException e) {
			System.out.println("���ڸ� ���� Ÿ������ �Է����ּ���");
		}
		catch(ArithmeticException e) {
			System.out.println("������ 0���� ������ �ȵſ�");
		}
		finally {
			System.out.println("�ݵ�� ����� ����");
		}
	}
}