package ex8;

//(����8) 1���� �迭�� ����Ǿ� �ִ� ���ڵ��� ���� ���Ͽ� ���
//1817022 ���̸�

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