package ex2;

//(����2) �߻�Ŭ����
//1817022 ���̸�

public class AbstractTest{
	//�߻� Ŭ������ ������ �׽�Ʈ == getMoveStyle�� �˾Ƽ� move�Լ� ȣ�����ִϱ�!
	
	public static void main(String[] args) {

		Car car = new Car();
		Ship ship = new Ship();
		Plane plane = new Plane();
		VehicleUse vUse = new VehicleUse();
		
		vUse.getMoveStyle(car);
		vUse.getMoveStyle(ship);
		vUse.getMoveStyle(plane);		//���� ���ε� -> plane���� �Ѿ
	}
}