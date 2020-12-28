package ex8;

//(예제8) 1차원 배열에 저장되어 있는 숫자들의 합을 구하여 출력
//1817022 조이린

public class OneDimArray{
	public static void main(String[] args) {
		int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum =0;
		for(int i=0; i<A.length; i++) {
			sum += A[i];
		}
		System.out.println("sum = "+ sum);
	}
}