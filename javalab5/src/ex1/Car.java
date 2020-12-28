package ex1;

//(���� 1) �߻� Ŭ���� ���� - abstract Car Ŭ����
//1817022 ���̸�

public abstract class Car{
	protected int velocity;		//�ӵ��� ���������� ����
	private int wheelNum; 		//������ ���� ���������� ����
	String carName;				//���� �̸��� String Ŭ������ ����
	
	public Car(int wheelNum, String carName) {
		this.wheelNum = wheelNum;
		this.carName = carName;
	}
	
	public Car(String carName) {
		this(4, carName);
	}
	
	//�ӵ��� ���δ�.
	//������ ���鸶�� �ӵ��� ���̴� ����� ���̰� �ֱ� ������ ���⼭�� �߻� �޼ҵ�� ���Ǹ� ���ȴ�.
	public abstract void speedUp(int step);
	
	//�ӵ��� �����.
	public abstract void speedDown(int step);
	
	//�����
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