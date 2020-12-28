package ex1;

//(예제1) for-each 사용
//1817022 조이린

public class ForeachEx {

	enum Color {Blue, White, Red, Black, Yellow}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		String[] fruits = { "banana", "pineapple", "apple", "grape", "strawberry" };
		int sum = 0;

		for (int k : nums) {
			sum += k;
		}

		System.out.println("Total of nums: " + sum);
		System.out.println();

		System.out.print("My favorite fruits: ");
		for (String s : fruits) {
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.print("Five cardinal colors: ");
		for (Color c : Color.values()) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

}
