package ex6;

//(예제6) 제너릭 메소드 만들기1
//1817022 조이린

public class PrintAllClass { //각 타입별 오버로딩
	public static void printAll(Integer a[]) {
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void printAll(Double a[]) {
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void printAll(String a[]) {
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}
