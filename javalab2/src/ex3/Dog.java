package ex3;

//(����3) size, name�� �Ӽ���  getName, setName, setSize, bark, run�� �޼ҵ带 ���� Dog Ŭ���� ����
//1817022 ���̸�

public class Dog{
	private int size;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSize(int size) {
		if(size>10) this.size = size;
	}
	
	public void bark() {
		System.out.print("��!��!��!");
	}
	
	public void run() {
		System.out.println(name + " is running");
	}
}