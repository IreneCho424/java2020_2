package ex7;
import java.util.Scanner;

//(����7) Wrapper Ŭ���� ��� ���� - ���ڿ��� �Է¹޾� ���ڿ��� �����ϴ� ���� �� ���� �����Ͽ� ��� ���ϴ� �ڵ�
//1817022 ���̸�

public class SomeClient{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		str = sc.nextLine();
		
		int sum = 0;
		int i = 0;
		
		while(i<str.length()) {
			if(48 <= str.charAt(i) && str.charAt(i) <= 57)
				sum += Integer.parseInt(str.substring(i, i+1));	//index i��°���� ���ڿ� �߶󳻴� �Լ�
			i++;
		}
		
		System.out.println("���� �� :: " + sum);
		sc.close();
	}
}