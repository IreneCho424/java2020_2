package pm3;

//(�ǽ�3) Pair Ŭ������ ���� ���ϴ� Ŭ����
//1817022 ���̸�

public class Util {
	public static boolean compare(Pair a, Pair b) {
		boolean result = false;
		if(a.getKey().equals(b.getKey()) && a.getValue().equals(b.getValue())) {
			result = true;
		}
		
		return result;
	}
}
