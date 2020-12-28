package pm2;

//(실습2) 차량 연비 관리 프로그램
//1817022 조이린

public class VehicleDemo{
	
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14, 12);
		
		System.out.printf("미니밴은 252마일을 가기 위해 %.1f갤런의 연료가 필요하다.\n", minivan.fuelneeded(252));
		System.out.printf("스포츠카는 252마일을 가기 위해 %.1f갤런의 연료가 필요하다.\n", sportscar.fuelneeded(252));
		System.out.printf("미니밴은 현재 %d마일을 주행할 수 있다.\n", minivan.range());
		System.out.printf("스포츠카는 현재 %d마일을 주행할 수 있다.\n", sportscar.range());
	}
}