package pm3;

//(�ǽ�3) �ֻ��� ������ �����ϴ� Ŭ����
//1817022 ���̸�

public class Dice{
	private int diceNum; 	//�ֻ����� ���� ������ int�� ���� diceNum ����
	
	public void setDiceNum() {	//diceNum�� ���� �����ϴ� �޼ҵ�
		System.out.println("\nDice is rolled.");//�ֻ����� ���� ������ ������ �޼��� ���
		diceNum = (int)(Math.random() * 6) + 1;	//1~6 ������ ������ ���� ����� diceNum�� ����
	}
	
	public int getDiceNum() {
		return diceNum;			//diceNum�� ���� ��ȯ���ִ� �޼ҵ�
	}
}