package pm4;

//(�ǽ�4) Add class
//1817022 ���̸�

public class Add{
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int add() {
		int result = this.a + this.b;
		return result;
	}
}