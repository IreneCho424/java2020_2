package pm1;
import java.util.Scanner;

//(�ǽ�1) ��ȭ��ȣ�� �ǽ� - ��ȭ��ȣ ���� �� ã��
//1817022 ���̸�

public class PhoneBook{
	
	public static void main(String[] args) {
		System.out.println("�ο� �� >> ");
		Scanner sc = new Scanner(System.in);
		int pnum = sc.nextInt();
		
		Phone[] p = new Phone[pnum];
		
		for(int i=0;i<pnum;i++) {
			System.out.println("�̸��� ��ȭ��ȣ(�̸��� ��ȭ��ȣ�� ������� �Է�) >> ");
			String namei = sc.next();
			String phonei = sc.next();
			p[i] = new Phone(namei, phonei);
		}
		System.out.println("����Ǿ����ϴ�.");
		
		
		while(true) {
			System.out.println("�˻��� �̸� >> ");
			String fname = sc.next();
			if(fname.contentEquals("�׸�")) break;
			else{
				for(int i=0;i<pnum;i++) {
					if(p[i].isYourName(fname) == true) {
						System.out.println(fname + " ��ȭ��ȣ: " + p[i].getPhoneNum());
						break;
					}
					else continue;
				}
			}
		}
		sc.close();
	}
}