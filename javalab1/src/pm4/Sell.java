package pm4;

//(�ǽ�4) �� �Ǹŷ� ���ϱ�1
//1817022 ���̸�

import java.util.Scanner;
public class Sell {
	public static void main(String[] args) {
		int phone[] = {0, 0, 0, 0, 0};
		System.out.println("�Ǹ��� �� ���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String what = sc.next();
			switch(what) {
			case "������" : 
				phone[0] += 1;
				continue;
			case "����" : 
				phone[1] += 1;
				continue;
			case "��Ƽ�ӽ�" : 
				phone[2] += 1;
				continue;
			case "��̳�" : 
				phone[3] += 1;
				continue;
			case "������" : 
				phone[4] += 1;
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