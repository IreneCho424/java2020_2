package pm3;
import java.util.Scanner;

//(�ǽ�3) String ���̺귯�� Ȱ�� �ǽ� _ �Է� ���� �� ���ڿ��� ��迭�� ���ΰ� �� �� �ִ��� Ȯ��
//1817022 ���̸�

public class StringDemo{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two words>> ");
		
		String st1 = scan.next();
		String st2 = scan.next();
		st1 = st1.toLowerCase();				//���ں� �� ������ �ϱ� ���ؼ� ��� �ҹ��ڷ� ����
		st2 = st2.toLowerCase();
		
		int check = -1;							//��� �� ���� üũ����
		
		if(st1.length() != st2.length()) {		//���̰� �ٸ��� ���� �ʿ� �����Ƿ� F
			System.out.println("F");
		}
		else {									//���̰� ������ ���� ��
			for(int i=0;i<st1.length();i++) {
				char s1 = st1.charAt(i);
				for(int j=0;j<st2.length();j++) {
					char s2 = st2.charAt(j);
					if(s1 == s2) {				//s1�� �ִ� ���ڰ� s2���� �ִ��� Ȯ��
						check++;
					}
				}
			}
			if(check == st1.length()-1) {		//�� ���ڿ� ��ο� �ִ� ������ ������ ���ڿ��� ���̸�ŭ ���� ��� T (check�� -1���� ���������Ƿ� st1.length()-1)
				System.out.println("T");
			}
		}
		
		scan.close();
	}
}