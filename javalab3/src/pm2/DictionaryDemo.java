package pm2;
import java.util.Scanner;

//(�ǽ�2) �ѿ����� �ǽ� - �ѱ��� �ܾ �Է� �޾� ���ܾ�� �ٲٴ� ���α׷�
//1817022 ���̸�

public class DictionaryDemo{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		
		
		while(true) {
			System.out.println("�ѱ� �ܾ�?");
			String korword = sc.next();
			if(korword.contentEquals("�׸�")) break;
			else {
				System.out.println(korword + Dictionary.korToEngWord(korword));
			}
		}
		sc.close();
	}
}