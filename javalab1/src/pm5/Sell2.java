package pm5;

//(�ǽ�5) �� �Ǹŷ� ���ϱ�2
//1817022 ���̸�

import java.util.Scanner;
public class Sell2 {
	public static void main(String[] args) {
		int phone[] = {0, 0, 0, 0, 0};
		System.out.println("�Ǹ��� �� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			String what = sc.next();
			switch(what) {
			case "������" : 
				num = sc.nextInt();
				phone[0] += num;
				continue;
			case "����" : 
				num = sc.nextInt();
				phone[1] += num;
				continue;
			case "��Ƽ�ӽ�" : 
				num = sc.nextInt();
				phone[2] += num;
				continue;
			case "��̳�" : 
				num = sc.nextInt();
				phone[3] += num;
				continue;
			case "������" : 
				num = sc.nextInt();
				phone[4] += num;
				continue;
			case "��" :
				sc.close();
				break;
			}
			break;
		}
		for(int i=0;i<5;i++) {
			System.out.printf("%d\n",phone[i]);
		}
	}
}