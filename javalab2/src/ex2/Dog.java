package ex2;

//(����2) size, name�� �Ӽ���  getSize, setSize, bark�� �޼ҵ带 ���� Dog Ŭ���� ����
//1817022 ���̸�

public class Dog{
	private int size;
	private String name;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {	//size�� 10 �̻��� ��쿡�� ���� ���� �� �ְ�!
		if(size>10) this.size = size;
	}
	
	public void bark(int numOfBarks) {
		for(int i = 0; i < numOfBarks; i++) {
			if(size > 40) System.out.print("��");
			else if(size > 20) System.out.print("��");
			else System.out.print("��");
		}
		System.out.println();
	}
}