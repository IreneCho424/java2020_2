package pm4;

//(�ǽ�4) Div class
//1817022 ���̸�

public class Div{
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int div() {
		if(this.b == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
			return 0;
		}
		int result = this.a / this.b;
		return result;
	}
}