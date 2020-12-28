package ex1;

//(예제1) final modifier - final의 사용
//1817022 조이린

public class MySoft{
	
	private String softName;
	private int softCost;
	
	private final int softTax = 10;		//final은 선언하면서 초기화해야 하고 다른 값으로 변경 불가능
	
	public static int softTotal = 0;
	
	//softName에 대한 getter와 setter
	public String getSoftName() {
		return softName;
	}
	public void setSofName(String softName) {
		this.softName = softName;
	}
	
	//softCost에 대한 getter와 setter
	public int getSoftCost() {
		return softCost;
	}
	public void setSoftCost(int cost) {
		softCost = cost + (cost/100 * softTax);
		softTotal = softTotal + softCost;
	}

}