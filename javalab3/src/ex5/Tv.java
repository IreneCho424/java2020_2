package ex5;

//(����5) final modifier - final�� ���
//1817022 ���̸�

public class Tv{
	
	private int size;
	private String manufacture;
	
	public Tv() {
		//size = 32;
		//manufacture = "LG";
		this(32, "LG");
		//System.out.println(size + "��ġ " + manufacture);
	}
	
	public Tv(String manufacture) {
		this(32, manufacture);
		/*
		this.size = 32;
		this.manufacture = manufacture;
		System.out.println(size + "��ġ " + manufacture);
		*/
	}
	
	public Tv(int size, String manufacture) {
		this.size = size;
		this.manufacture = manufacture;
		System.out.println(size + "��ġ " + manufacture);
	}
}