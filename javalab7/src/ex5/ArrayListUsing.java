package ex5;
import java.util.ArrayList;

//(예제5) ArrayList 메소드 활용
//1817022 조이린

public class ArrayListUsing {

	public static void main(String[] args) {
		// ArrayList 생성
		ArrayList<Integer> mArrayList = new ArrayList<Integer>();

		// ArrayList 값 추가
		mArrayList.add(10);
		mArrayList.add(20);
		mArrayList.add(30);
		mArrayList.add(10);
		mArrayList.add(50);
		System.out.println();

		// ArrayList 값 확인
		for (int i = 0; i < mArrayList.size(); i++) {
			System.out.println("one index " + i + " : value " + mArrayList.get(i));
		}
		System.out.println();

		// ArrayList 특정 index 값 제거
		mArrayList.remove(0);
		// 0번쨰 index가 지워지면서 자동으로 1번이 0번째 index가 되었다.
		for (int i = 0; i < mArrayList.size(); i++) {
			System.out.println("two index " + i + " : value " + mArrayList.get(i));
		}
		System.out.println();

		// ArrayList 특정 index 값 추가
		mArrayList.add(0, 7777);
		// 0번째 index가 추가되고 나머지 index들은 뒤로 밀린다.
		for (int i = 0; i < mArrayList.size(); i++) {
			System.out.println("three index " + i + " : value " + mArrayList.get(i));
		}
		System.out.println();

		// ArrayList 특정 index 값 수정
		mArrayList.set(0, 77779);
		// 0번째 index가 추가되고 나머지 index들은 뒤로 밀린다.
		for (int i = 0; i < mArrayList.size(); i++) {
			System.out.println("four index " + i + " : value " + mArrayList.get(i));
		}
		System.out.println();

		// ArrayList Value 포함 여부 확인
		Integer checkNumber = new Integer(99999);
		boolean isFind = mArrayList.contains(checkNumber);

		if (!isFind) {
			mArrayList.add(checkNumber);
			System.out.println("five : 99999 - not found - so, add\n");
		} else {
			System.out.println("five : 99999 - already exist \n");
		}

		for (Integer val : mArrayList) {
			System.out.println("five : value: " + val);
		}
		System.out.println();

		// ArrayList Value index 확인
		int index = mArrayList.indexOf(checkNumber);
		System.out.println("six : index " + index + "\n");

		// 위에서 찾은 값 삭제
		mArrayList.remove(index);

		// ArrayList 값 전체 삭제
		mArrayList.clear();
		System.out.println("seven : size " + mArrayList.size() + "\n");

		// ArrayList의 값 존재 여부 확인
		boolean isEmpty = mArrayList.isEmpty();
		System.out.println("eight : empty " + isEmpty + "\n");

	}

}
