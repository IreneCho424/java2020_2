package ex2;

//(예제2) size, name의 속성과  getSize, setSize, bark의 메소드를 가진 Dog 클래스 생성
//1817022 조이린

public class Dog{
	private int size;
	private String name;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {	//size가 10 이상인 경우에만 값을 넣을 수 있게!
		if(size>10) this.size = size;
	}
	
	public void bark(int numOfBarks) {
		for(int i = 0; i < numOfBarks; i++) {
			if(size > 40) System.out.print("왕");
			else if(size > 20) System.out.print("멍");
			else System.out.print("월");
		}
		System.out.println();
	}
}