package ex2;

//(����2) �߻�Ŭ����
//1817022 ���̸�

abstract class Vehicle{
	abstract void move();
}

class Car extends Vehicle{
	void move() {
		System.out.println("������ �ٴѴ�.");
	}
}

class Ship extends Vehicle{
	void move() {
		System.out.println("���η� �ٴѴ�.");
	}
}

class Plane extends Vehicle{
	void move() {
		System.out.println("�ϴ÷� �ٴѴ�.");
	}
}

class VehicleUse{
	void getMoveStyle(Vehicle vehicle) {
		vehicle.move();
	}
}
