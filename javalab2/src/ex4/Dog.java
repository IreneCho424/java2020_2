package ex4;

//(����4) size, name�� �Ӽ���  getName, setName, setSize, bark, run�� �޼ҵ带 ���� Dog Ŭ���� ����
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
	
	public void tryToReplace(Dog otherDog) {
		System.out.println("\n === tryToReplace() start ===");
		System.out.println("	Before Assign: otherDog run ");
		otherDog.run();
		
		otherDog = this;
		System.out.println("	After Assign: otherDog run ");
		otherDog.run();
		System.out.println("\n === tryToReplace() end ===");
	}
	
	public void tryToChange(int intSize) {
		System.out.println("\n === tryToChange() start ===");
		System.out.println("	Before Assign: intSize value? " + intSize);
		intSize = this.size;
		System.out.println("	After Assign: intSize value? " + intSize);
		System.out.println("\n === tryToChange() end ===");
	}
}