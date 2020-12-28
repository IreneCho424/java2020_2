package ex3;

//(예제 3) DObject 클래스.
//1817022 조이린

public class DObject{
	public DObject next;
	
	public DObject() {
		next = null;
	}
	
	public void draw() {
		System.out.println("DObject draw");
	}
}
