package ex1;

//(����1) size, name�� �Ӽ���  bark, run�� �޼ҵ带 ���� Dog Ŭ���� ����
//1817022 ���̸�

public class Dog {
	public int size;
	public String name;
	
	public void bark(int numOfBarks) {
		for(int i=0;i<numOfBarks;i++) {
			if(size>40) System.out.print("��");
			else if(size>20) System.out.print("��");
			else System.out.print("��");
		}
		System.out.println();
	}
	
	public void run() {
		System.out.println(name + " is running");
	}
}
