package ex7;

//(����7) ���� ������ �Է¹޾� ������ ���� ����ϴ� ���α׷�. 0�� �ԷµǸ� �����ϰ� �Էµ� ���� ������ ���� ���
//1817022 ���̸�

import java.util.Scanner;
public class CountAndSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0, sum = 0;
		int num;
		while(true) {
			num = in.nextInt();
			if(num == 0) break;
			else {
				count++;
				sum += num;
			}
		}
		
		
		/*for (;;) {
			num = in.nextInt();
			if(num == 0) break;
			else {
				count++;
				sum += num;
			}
		}
		*/
		
		System.out.println("count = " + count);
		System.out.println("sum = " + sum);
		
		in.close();
	}
}