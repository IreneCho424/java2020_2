package ex1;

//(예제 1) 추상 클래스 예제 - SportsCar 클래스
//1817022 조이린

public class SportsCar extends Car{
	
	public SportsCar(String carName) {
		super(carName);
	}
	
	public void speedUp(int step) {
		velocity += (step * 20);
		//속도 제한 필요 없음
	}
	
	public void speedDown(int step) {
		velocity -= (step * 10);
		
		if(velocity < 0)
			velocity = 0;
	}
}