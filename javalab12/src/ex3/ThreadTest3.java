package ex3;

//(����3) ���ν����� ���� ��� ���� ������ ���
//1817022 ���̸�

class MyThread3 extends Thread {
	private Object keyObj;

	public MyThread3(String name, Object keyObj) {
		super(name);
		this.keyObj = keyObj;
	}

	public void run() {
		long id = Thread.currentThread().getId(); // ������ ID ���
		String name = Thread.currentThread().getName(); // ������ �̸� ���
		int priority = Thread.currentThread().getPriority(); // ������ �켱������ ���
		Thread.State s = Thread.currentThread().getState(); // ������ ���� �� ���

		synchronized (keyObj) { // ���ν����忡�� �Ѱܹ��� Ű�� lock�� �ɾ� ��
			if (ThreadTest3.iswritten == false) { // wait�ϱ� ���� ���ν����� ������ �� �������� flag �˻�
				try {
					keyObj.wait(); // ���ν����� ������ ���� ��µ��� �ʾ��� ���� ��ٸ��� ��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println("2.���� ������ �̸�= " + name);
			System.out.println("2.���� ������ ID = " + id);
			System.out.println("2.���� ������ �켱���� �� = " + priority);
			System.out.println("2.���� ������ ���� = " + s);
		}
	}
}

public class ThreadTest3 {
	// ���ν����� ���� ����� ������ �� true�� �ǰ� �� flag
	// volatile�� �ؼ� �׻� ������ ���� ���� �� �ְ� ��
	public volatile static boolean iswritten = false;

	public static void main(String[] args) {
		Object keyObj = new Object();
		MyThread3 th = new MyThread3("MyThread2", keyObj); // �����ڸ� �̿� ������ �̸� ����
		th.start();

		long id = Thread.currentThread().getId(); // ������ ID ���
		String name = Thread.currentThread().getName(); // ������ �̸� ���
		int priority = Thread.currentThread().getPriority(); // ������ �켱������ ���
		Thread.State s = Thread.currentThread().getState(); // ������ ���� �� ���

		synchronized (keyObj) { // ���ν����忡�� �Ѱܹ��� Ű�� lock�� �ɾ� ��
			System.out.println("1.���� ������ �̸�= " + name);
			System.out.println("1.���� ������ ID = " + id);
			System.out.println("1.���� ������ �켱���� �� = " + priority);
			System.out.println("1.���� ������ ���� = " + s);
			System.out.println();

			try {
				iswritten = true; //���ν����� ���� ����� ��� �������� flag�� ���
				keyObj.notify(); // wait ���� �����忡�� �˷��� ����
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
