package ex1;

//(예제 1) TwoDShape을 상속받는 Rectangle 클래스. width와 height가 같을 경우 정사각형임을 판단하는 함수 추가, area() 함수 오버라이드 
// 1817022 조이린

public class Rectangle extends TwoDShape{
	public boolean isSquare() {		//정사각형인지 여부 확인
		if(width == height) return true;
		else return false;
	}
	
	public double area() {			//직사각형의 넓이 구하는 공식
		return width * height;
	}
}