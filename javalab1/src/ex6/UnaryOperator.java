package ex6;

//(예제6) 대입 연산자와 증감 연산자
//1817022 조이린

public class UnaryOperator {
	public static void main(String[] args) {
		int opr = 0;
		opr += 3;
		
		System.out.println(opr++);
		System.out.println(opr);
		System.out.println(++opr);
		System.out.println(opr);
		System.out.println(opr--);
		System.out.println(opr);
		System.out.println(--opr);
		System.out.println(opr);
	}
}