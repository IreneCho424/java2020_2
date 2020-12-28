package ex1;

//(예제 1) 추상 클래스 예제 - Truck 클래스
//1817022 조이린

public class Truck extends Car{
	
	public Truck(int wheelNum, String carName) {
		super(wheelNum, carName);
	}
	
	public Truck(String carName) {
		super(carName);
	}
	
	public void speedUp(int step) {
		velocity += (step * 20);
		
		//속도를 제한한다.
		if(velocity > 100)
			velocity = 100;
	}
	
	public void speedDown(int step) {
		velocity -= (step * 5);
		
		//속도를 제한한다.
		if(velocity < 0)
			velocity = 0;
	}
	
	public String toString() {
		String str = "This truck is " + carName + ".";
		return str;
	}
}