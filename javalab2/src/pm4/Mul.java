package pm4;

//(�ǽ�4) Mul class
//1817022 ���̸�

public class Mul{
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int mul() {
		int result = this.a * this.b;
		return result;
	}
}