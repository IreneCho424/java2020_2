package pm3;
import java.util.Scanner;

//(�ǽ�3) �ֻ��� ���ӿ� ���� Person Ŭ����
//1817022 ���̸�

public class Person{
	Scanner kbd;
	
	private int guessNum;	//�÷��̾ ������ ���� ���� ������ int�� ���� ����
	private char ID;		//�÷��̾��� ID�� ������ char�� ���� ����
	
	Person(char ID, Scanner sc){
		this.ID = ID;	//char�� ������ ���ڷ� �޾� ID�� �����ϴ� ������
		kbd = sc;
	}
	
	public int getGuessNum() {
		return guessNum;	//guessNum�� ��ȯ���ִ� �޼ҵ�
	}
	
	public void inputGuessNum() throws GuessNumException {
		int flag = 0;		//���� ó�� ������ �� �� �ֵ��� ǥ���ϴ� ����
		while(flag == 0) {
			try {
				System.out.println("Person " + this.ID + " - Guess the number:");
				int guessNum = kbd.nextInt();
				System.out.println("���⼭ guessNum : " + guessNum);
				if(guessNum < 1 || guessNum > 6) {
					throw new GuessNumException();
				}
				else {
					this.guessNum = guessNum;
					flag = 1;
				}
			}
			catch(GuessNumException e) {
				System.out.println(e.getMessage());
				//kbd = new Scanner(System.in);
				flag = 0;
			}
		}
	}
}