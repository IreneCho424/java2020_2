package ex6;

//(예제6) 제너릭 메소드 사용
//1817022 조이린

public class ClientDemo {

	public static void main(String[] args) {
		Integer iarray[] = {1, 2, 3, 4, 5};
		Double darray[] = {11.0, 12.0, 13.0};
		String sarray[] = {"sun", "mon", "tue"};
		//PrintAllClass의 메소드 호출
		PrintAllClass.printAll(iarray);
		PrintAllClass.printAll(darray);
		PrintAllClass.printAll(sarray);
		
		System.out.println();
		
		//PrintAllClass2의 메소드 호출
		PrintAllClass2.printAll(iarray);
		PrintAllClass2.printAll(darray);
		PrintAllClass2.printAll(sarray);
		
	}

}
