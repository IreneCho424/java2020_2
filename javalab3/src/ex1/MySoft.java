package ex1;

//(����1) final modifier - final�� ���
//1817022 ���̸�

public class MySoft{
	
	private String softName;
	private int softCost;
	
	private final int softTax = 10;		//final�� �����ϸ鼭 �ʱ�ȭ�ؾ� �ϰ� �ٸ� ������ ���� �Ұ���
	
	public static int softTotal = 0;
	
	//softName�� ���� getter�� setter
	public String getSoftName() {
		return softName;
	}
	public void setSofName(String softName) {
		this.softName = softName;
	}
	
	//softCost�� ���� getter�� setter
	public int getSoftCost() {
		return softCost;
	}
	public void setSoftCost(int cost) {
		softCost = cost + (cost/100 * softTax);
		softTotal = softTotal + softCost;
	}

}