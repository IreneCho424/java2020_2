package pm3;

//(실습3) Pair 클래스의 값을 비교하는 클래스
//1817022 조이린

public class Util {
	public static boolean compare(Pair a, Pair b) {
		boolean result = false;
		if(a.getKey().equals(b.getKey()) && a.getValue().equals(b.getValue())) {
			result = true;
		}
		
		return result;
	}
}
