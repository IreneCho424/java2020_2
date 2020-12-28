package ex5;

//(예제5) TV클래스의 사용 -생성자의 사용 예제 
//1817022 조이린

public class TvDemo{
	
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv("삼성");
		Tv tv3 = new Tv(65, "대우");
	}
}