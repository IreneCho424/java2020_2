package pm4;

//(�ǽ�4) Sub class
//1817022 ���̸�

public class Sub{
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sub() {
		int result = this.a - this.b;
		return result;
	}
}