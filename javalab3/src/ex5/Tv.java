package ex5;

//(예제5) final modifier - final의 사용
//1817022 조이린

public class Tv{
	
	private int size;
	private String manufacture;
	
	public Tv() {
		//size = 32;
		//manufacture = "LG";
		this(32, "LG");
		//System.out.println(size + "인치 " + manufacture);
	}
	
	public Tv(String manufacture) {
		this(32, manufacture);
		/*
		this.size = 32;
		this.manufacture = manufacture;
		System.out.println(size + "인치 " + manufacture);
		*/
	}
	
	public Tv(int size, String manufacture) {
		this.size = size;
		this.manufacture = manufacture;
		System.out.println(size + "인치 " + manufacture);
	}
}