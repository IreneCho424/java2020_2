package ex5;

//(����5) ����Ÿ��(enum) Currency ���� �� Ȱ�� ����
//1817022 ���̸�

enum Currency{
	DOLLAR, EURO, YEN, YUAN;
}

public class EnumDemo1{
	
	public static void main(String[] args) {
		for(Currency c : Currency.values()) {
			System.out.println(c.ordinal()+ " " + c.toString());
		}
	}
}