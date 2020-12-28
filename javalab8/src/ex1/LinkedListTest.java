package ex1;

import java.util.LinkedList;

//(예제1) LinkedList 함수 활용
//1817022 조이린

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> lnkList = new LinkedList<String>();
		lnkList.add("SM5");
		lnkList.add("소나타");
		lnkList.offer("아우디");
		lnkList.offer("알티마");
		
		for (int i = 0; i < lnkList.size(); i++) {
			System.out.println(lnkList.get(i));
		}
		System.out.println();
		
		lnkList.add(2, "제너시스");
		
		for (int i = 0; i < lnkList.size(); i++) {
			System.out.println(lnkList.get(i));
		}
		System.out.println();
		
		lnkList.remove(3);
		
		for (int i = 0; i < lnkList.size(); i++) {
			System.out.println(lnkList.get(i));
		}
		System.out.println();
		
		System.out.println("peek ==> " + lnkList.peek());
		//System.out.println("element ==> " + lnkList.element()); //peek와 같은 작업
		for (int i = 0; i < lnkList.size(); i++) {
			System.out.println(lnkList.get(i));
		}
		System.out.println();
		
		System.out.println("poll ==> " + lnkList.poll());
		//System.out.println("remove ==> " + lnkList.remove());	//poll과 같은 작업
		for (int i = 0; i < lnkList.size(); i++) {
			System.out.println(lnkList.get(i));
		}
		System.out.println();

	}

}
