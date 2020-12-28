package ex5;

//(예제5) 비교 연산자와 논리연산자
//1817022 조이린

public class LogicalOperator {
	public static void main(String[] args) {
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		System.out.println((3 > 2) && (3 > 4));
		System.out.println((3 != 2) || (-1 > 0)); // OR 연산자에 의해 앞이 이미 틀려서 의미 없기에 노란줄 발생
		System.out.println((3 != 2) ^ (-1 > 0));
	}
}