package ex3;

//(예제3) 객체 사이 연결 관계 예제
//1817022 조이린

public class DObjectDemo{
	public static void main(String[] args) {
		DObject start, n, obj;
		start = new Line();			//1번 Line 객체 생성
		n = start;
		
		obj = new Rect();			//2번 Rect 객체 생성
		n.next = obj; 				//1번 Line -> 2번 Rect 연결
		n = obj;

		obj = new Line();			//3번 Line 객체 생성
		n.next = obj;				//2번 Rect -> 3번 Line 연결
		n = obj;
		
		obj = new Circle();			//4번 Circle 객체 생성
		n.next = obj;				//3번 Line -> 4번 Circle 연결
		
		while(start != null) {
			start.draw();
			start = start.next;
		}
	}
}