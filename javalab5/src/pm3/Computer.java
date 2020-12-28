package pm3;

//(실습3) Product 클래스를 상속받은 Computer 클래스
//1817022 조이린

class Computer extends Product{
	int hddSize;		//하드디스크 사이즈
	int memorySize;	//메모리 사이즈
	
	@Override
	public void displayProductInfo() {
		System.out.println("Computer 제조사 : " + company.getValue() +
				" | 제품명 : " + name + " | 가격 : " + price + " | hddSize : " + 
				hddSize + "GB | memorySize : " + memorySize + "GB");
	}
	
	public Computer(Brand company, String name, int price, int hddSize, int memorySize) {
		super(company, name, price);
		this.hddSize = hddSize;
		this.memorySize = memorySize;
	}
}