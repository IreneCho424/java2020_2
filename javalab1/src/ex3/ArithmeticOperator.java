package ex3;

//(����3) ��� ���� ;����(�� ��)�� �Է¹޾� �� �ð� �� �� �� ������ ���
//1817022 ���̸�

import java.util.Scanner;
public class ArithmeticOperator {
	public static void main(String[] args) {
		int time, second, minute, hour;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");	//��, ��, �ʷ� ��ȯ�� ���� �Է�
		
		time = sc.nextInt();
		second = time % 60; //��
		minute = (time / 60) % 60; //��
		hour = (time / 60) / 60;  //�ð�
		
		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute+ "��, ");
		System.out.println(second + "���Դϴ�.");
		
		sc.close();
	}
}