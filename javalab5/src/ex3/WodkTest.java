package ex3;

//(����3) �������̽� ����
//1817022 ���̸�

public class WodkTest{
	
	public static void main(String[] args) {
		
		//ȣ���ֹ��� hcook, �Ƹ�����Ʈ pcook, ������ bk
		BuggerCook hcook = new HotelCook();
		BuggerCook pcook = new PartTimeCook();
		BuggerClerk bk = new BuggerClerk();
		
		//�ֹ��߻��� ���� ó��
		System.out.println("ȣ�ڽ� �ܹ��� �ֹ���û ����");
		bk.orderBurger(hcook);
		
		System.out.println("ȣ�ڽ� �ܹ��� �ֹ���û ����");
		bk.orderBurger(hcook);
		
		System.out.println("�˹ٽ� ������ �ֹ���û ����");
		bk.orderSalad(pcook);
		
		System.out.println("�˹ٽ� �ܹ��� �ֹ���û ����");
		bk.orderBurger(pcook);
		
		System.out.println("ȣ�ڽ� ������ �ֹ���û ����");
		bk.orderSalad(hcook);
	}
}