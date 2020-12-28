package pm3;

//(실습3) 두 Pair 클래스 객체의 key 와 value 값이 모두 같은지 비교하는 프로그램
//1817022 조이린

public class CompareMethodEx {

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<String, Integer>("김남준", 3);
		Pair<String, Integer> p2 = new Pair<String, Integer>("김남준", 3);
		
		boolean result = Util.compare(p1, p2);
		System.out.println(result);
		
		Pair<String, String> p3 = new Pair<String, String>("김남준", "김남준");
		Pair<String, String> p4 = new Pair<String, String>("김남준", "준남김");
		
		result = Util.compare(p3, p4);
		System.out.println(result);
		
	}

}
