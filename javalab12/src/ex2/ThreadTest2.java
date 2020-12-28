package ex2;

//(����2) ������ ���� ���
//1817022 ���̸�

class MyThread2 extends Thread{
	public MyThread2(String name) {
		super(name);
	}
	
	public void run() {
		long id = Thread.currentThread().getId(); //������ ID ���
		String name = Thread.currentThread().getName(); //������ �̸� ���
		int priority = Thread.currentThread().getPriority(); //������ �켱������ ���
		Thread.State s = Thread.currentThread().getState(); //������ ���� �� ���
		
		System.out.println("2.���� ������ �̸�= " + name);
		System.out.println("2.���� ������ ID = " + id);
		System.out.println("2.���� ������ �켱���� �� = " + priority);
		System.out.println("2.���� ������ ���� = " + s);
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		MyThread2 th = new MyThread2("MyThread2"); //�����ڸ� �̿� ������ �̸� ����
		th.start();

		long id = Thread.currentThread().getId(); //������ ID ���
		String name = Thread.currentThread().getName(); //������ �̸� ���
		int priority = Thread.currentThread().getPriority(); //������ �켱������ ���
		Thread.State s = Thread.currentThread().getState(); //������ ���� �� ���
		
		System.out.println("1.���� ������ �̸�= " + name);
		System.out.println("1.���� ������ ID = " + id);
		System.out.println("1.���� ������ �켱���� �� = " + priority);
		System.out.println("1.���� ������ ���� = " + s);
	}

}
