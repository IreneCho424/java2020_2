package pm3;

//(�ǽ�3) ���� ����� �հ� ���
//1817022 ���̸�

import java.util.Scanner;
public class SaveAndSum{
	public static void main(String[] args) {
		int A[] = new int[5];
		System.out.println("���� 5�� �Է�: ");
		Scanner sc = new Scanner(System.in);
		int sum = 0;	//sum �� �ʱ�ȭ
		int max = 0;	//max �� �ʱ�ȭ
		for(int i=0;i<5;i++) {
			A[i] = sc.nextInt();	//�迭�� �Է¹��� �� ����
			if(A[i] > max) max = A[i];	//ũ�� �� - �ִ밪 ã��
			sum += A[i];			//�հ� ���ϱ�
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�հ� : " + sum);
		
		sc.close();
	}
}