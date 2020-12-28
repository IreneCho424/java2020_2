package pm2;

//(실습2) 차량 연비 관리 프로그램_vehicle class
//1817022 조이린

public class Vehicle{
	private int passengers;
	private int fuelcap;
	private int mpg;
	
	public Vehicle(int p, int f, int m) {		//생성자
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