package pm3;

//(�ǽ�3) �� Pair Ŭ���� ��ü�� key �� value ���� ��� ������ ���ϴ� ���α׷�
//1817022 ���̸�

public class CompareMethodEx {

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<String, Integer>("�賲��", 3);
		Pair<String, Integer> p2 = new Pair<String, Integer>("�賲��", 3);
		
		boolean result = Util.compare(p1, p2);
		System.out.println(result);
		
		Pair<String, String> p3 = new Pair<String, String>("�賲��", "�賲��");
		Pair<String, String> p4 = new Pair<String, String>("�賲��", "�س���");
		
		result = Util.compare(p3, p4);
		System.out.println(result);
		
	}

}
