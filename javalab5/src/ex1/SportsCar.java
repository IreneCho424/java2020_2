package ex1;

//(���� 1) �߻� Ŭ���� ���� - SportsCar Ŭ����
//1817022 ���̸�

public class SportsCar extends Car{
	
	public SportsCar(String carName) {
		super(carName);
	}
	
	public void speedUp(int step) {
		velocity += (step * 20);
		//�ӵ� ���� �ʿ� ����
	}
	
	public void speedDown(int step) {
		velocity -= (step * 10);
		
		if(velocity < 0)
			velocity = 0;
	}
}