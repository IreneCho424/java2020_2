package ex2;

//(예제2) 추상클래스
//1817022 조이린

abstract class Vehicle{
	abstract void move();
}

class Car extends Vehicle{
	void move() {
		System.out.println("차도로 다닌다.");
	}
}

class Ship extends Vehicle{
	void move() {
		System.out.println("수로로 다닌다.");
	}
}

class Plane extends Vehicle{
	void move() {
		System.out.println("하늘로 다닌다.");
	}
}

class VehicleUse{
	void getMoveStyle(Vehicle vehicle) {
		vehicle.move();
	}
}
