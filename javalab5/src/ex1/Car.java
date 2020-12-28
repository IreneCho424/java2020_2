package ex1;

//(예제 1) 추상 클래스 예제 - abstract Car 클래스
//1817022 조이린

public abstract class Car{
	protected int velocity;		//속도를 정수형으로 선언
	private int wheelNum; 		//바퀴의 수를 정수형으로 선언
	String carName;				//차의 이름을 String 클래스로 선언
	
	public Car(int wheelNum, String carName) {
		this.wheelNum = wheelNum;
		this.carName = carName;
	}
	
	public Car(String carName) {
		this(4, carName);
	}
	
	//속도를 높인다.
	//하지만 차들마다 속도를 높이는 방법에 차이가 있기 때문에 여기서는 추상 메소드로 정의를 내렸다.
	public abstract void speedUp(int step);
	
	//속도를 낮춘다.
	public abstract void speedDown(int step);
	
	//멈춘다
	public void stop() {
		velocity = 0;
	}
	
	int getVelocity() {
		return velocity;
	}
	int getWheelNum() {
		return wheelNum;
	}
}