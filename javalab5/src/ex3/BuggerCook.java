package ex3;

//(���� 3) �������̽� ����
//1817022 ���̸�

interface BuggerCook{
	public void makeBurger();
	public void makeSalad();
}

class HotelCook implements BuggerCook{
	
	public void makeBurger() {
		System.out.println("ȣ�ڱ� �ܹ��� �丮 ��");
	}
	
	public void makeSalad() {
		System.out.println("ȣ�ڱ� ������ �丮 ��");
	}
}

class PartTimeCook implements BuggerCook{
	public void makeBurger() {
		System.out.println("�Ƹ�����Ʈ�� �ܹ��� �丮 ��");
	}
	
	public void makeSalad() {
		System.out.println("�Ƹ�����Ʈ�� ������ �丮 ��");
	}
}

class BuggerClerk{
	
	//���� �䱸���� ó��
	public void orderBurger(BuggerCook cook) {
		System.out.println("�ܹ��� �ֹ�");
		cook.makeBurger();
	}
	
	public void orderSalad(BuggerCook cook) {
		System.out.println("������ �ֹ�");
		cook.makeSalad();
	}
}