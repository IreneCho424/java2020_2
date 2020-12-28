package ex2;

//(예제2) 추상클래스
//1817022 조이린

public class AbstractTest{
	//추상 클래스의 다형성 테스트 == getMoveStyle이 알아서 move함수 호출해주니까!
	
	public static void main(String[] args) {

		Car car = new Car();
		Ship ship = new Ship();
		Plane plane = new Plane();
		VehicleUse vUse = new VehicleUse();
		
		vUse.getMoveStyle(car);
		vUse.getMoveStyle(ship);
		vUse.getMoveStyle(plane);		//동적 바인딩 -> plane으로 넘어가
	}
}