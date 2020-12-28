package ex6;
import java.util.*;

//(예제6) Collections - 정렬 메소드 사용
//1817022 조이린

public class SortDemo {

	public static void main(String[] args) {
		SortCollections();
		System.out.println();

		SortArrays();
		System.out.println();
	}

	public static void SortCollections() {
		ArrayList<String> v = new ArrayList<String>();
		v.add("kiwi");
		v.add("pear");
		v.add("apple");
		v.add("banana");

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i) + " ");
		}

		Collections.sort(v); // 컬렉션의 원소들을 정렬
		System.out.println();

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i) + " ");
		}
	}

	public static void SortArrays() {
		String[] arr = new String[4];
		arr[0] = "tiger";
		arr[1] = "monkey";
		arr[2] = "cow";
		arr[3] = "cat";

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

		Arrays.sort(arr); // 배열의 원소들을 정렬
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
}
