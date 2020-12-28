package ex1;

//(예제 1) TwoDShape을 상속받는 Triangle 클래스. 삼각형의 종류를 알려주는 style 변수 및 함수 추가. area() 함수 오버라이드 
//1817022 조이린

public class Triangle extends TwoDShape{
	public String style;
	
	public double area() {				//삼각형의 넓이 공식
		return width * height / 2;
	}
	
	public void showStyle() {			//삼각형의 형태 나타내는 함수
		System.out.println("Triangle is " + style);
	}
}