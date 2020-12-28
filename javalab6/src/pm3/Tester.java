package pm3;
import java.util.Scanner;

//(�ǽ�3) �ֻ��� ���� ���α׷�
//1817022 ���̸�

public class Tester{
	public static void main(String[] args) throws Exception {
		System.out.println("****************************");
		System.out.println("Major: Computer Engineering");
		System.out.println("ID: 1817022");
		System.out.println("Name: ���̸�");
		System.out.println("****************************");
		
		Scanner sc = new Scanner(System.in);	//������� �Է��� �ޱ� ���� Scanner Ŭ���� ��ü ����
		
		Dice dice = new Dice();		//�ֻ��� ����
		Person p1 = new Person('1', sc);	//�÷��̾� 1 ����
		Person p2 = new Person('2', sc);	//�÷��̾� 2 ����
		
		char choice = 'y';	//����ڰ� ������ ��� ������ �������� ���� �ǻ縦 �Է¹��� ���� choice. ó���� 'y'�� �ʱ�ȭ�Ͽ� ������ ������ �� �ְ� ��
		
		while(choice == 'y') {
			dice.setDiceNum();	//�ֻ����� ���� ���� ���� �����ϰ�
			p1.inputGuessNum(); //�÷��̾� 1�� �ֻ����� ���� ����
			System.out.println(p1.getGuessNum());
			p2.inputGuessNum(); //�÷��̾� 2�� �ֻ����� ���� ����
			System.out.println("Dice number: " + dice.getDiceNum());	//�ֻ��� ���� ��
			
			int baseNum = dice.getDiceNum();
			int p1Num = p1.getGuessNum();
			int p2Num = p2.getGuessNum();
			
			//p1�� ������ p2�� �������� ���� ������ ���̰� ũ�ٸ�
			if(diff(baseNum, p1Num) > diff(baseNum, p2Num))
				System.out.println("Person2 won!");	//p2�� �̱�
			//p2�� ������ p1�� �������� ���� ������ ���̰� ũ�ٸ�
			else if(diff(baseNum, p1Num) < diff(baseNum, p2Num))
				System.out.println("Person1 won!");	//p1�� �̱�
			else { //p1�� ������ p2�� ������ ���������κ����� ���� ���� ���ٸ�
				System.out.println("tie.");	//���
			}
			
			System.out.println("Repeat?(y/n)");	//������ ��� �Ұ����� ���� �޼���
			choice = sc.next().charAt(0);
		}
		
		sc.close();
	}
	
	public static int diff(int a, int b) {	//�� �������� ���� ������ִ� static method
		return a > b ? a-b : b-a;		//a�� b���� ũ�ٸ� a-b��, �׷��� �ʴٸ� b-a�� ��ȯ�Ѵ�.
	}
}