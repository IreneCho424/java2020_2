package pm2;

//(�ǽ�2) ���� ���� ���� ���α׷�_vehicle class
//1817022 ���̸�

public class Vehicle{
	private int passengers;
	private int fuelcap;
	private int mpg;
	
	public Vehicle(int p, int f, int m) {		//������
		this.passengers = p;
		this.fuelcap = f;
		this.mpg = m;
	}

	public double fuelneeded(int miles) {
		double fuelneeded = 0;
		fuelneeded = miles / this.mpg;
		return fuelneeded;
	}
	
	public int range() {
		int range = 0;
		range = this.fuelcap * this.mpg;
		return range;
	}
}