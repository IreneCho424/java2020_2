package ex3;
import java.util.Scanner;

//(���� 3) ����ó�� - throws throw ����Ͽ� ���� ó�� ȣ���ϱ�
//1817022 ���̸�

public class ExceptionTest4{
	
	public int inputData() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100 ������ ���� �Է��ϼ���!");
		int val = sc.nextInt();
		if(val < 1 || val > 100) {
			throw new Exception();
		}
		sc.close();
		return val;
	}
	
	//throws �׽�Ʈ
	public static void main(String[] args) {
		ExceptionTest4 et = new ExceptionTest4();
		try {
			int val = et.inputData();
			System.out.println("�Է°� : " + val);
		}
		catch(Exception e) {
			System.out.println("�Է°��� ������ ������ϴ�.");
		}
	}
}