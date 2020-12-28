package ex6;

//(예제6) 제너릭 메소드 만들기2
//1817022 조이린

public class PrintAllClass2 { //제너릭 메소드
	public static <T> void printAll(T a[]) {
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
