package ex1;

//(���� 1) �߻� Ŭ���� ���� - Truck Ŭ����
//1817022 ���̸�

public class Truck extends Car{
	
	public Truck(int wheelNum, String carName) {
		super(wheelNum, carName);
	}
	
	public Truck(String carName) {
		super(carName);
	}
	
	public void speedUp(int step) {
		velocity += (step * 20);
		
		//�ӵ��� �����Ѵ�.
		if(velocity > 100)
			velocity = 100;
	}
	
	public void speedDown(int step) {
		velocity -= (step * 5);
		
		//�ӵ��� �����Ѵ�.
		if(velocity < 0)
			velocity = 0;
	}
	
	public String toString() {
		String str = "This truck is " + carName + ".";
		return str;
	}
}