package ex1;

//(예제1) size, name의 속성과  bark, run의 메소드를 가진 Dog 클래스 생성
//1817022 조이린

public class Dog {
	public int size;
	public String name;
	
	public void bark(int numOfBarks) {
		for(int i=0;i<numOfBarks;i++) {
			if(size>40) System.out.print("왕");
			else if(size>20) System.out.print("멍");
			else System.out.print("월");
		}
		System.out.println();
	}
	
	public void run() {
		System.out.println(name + " is running");
	}
}
