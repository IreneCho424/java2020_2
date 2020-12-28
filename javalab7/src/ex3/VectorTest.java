package ex3;

import java.util.Iterator;
import java.util.Vector;

//(예제3) Iterator를 이용한 순차 검색
//1817022 조이린

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> vt = new Vector<String>();
		vt.add("서울");
		vt.add("춘천");
		vt.add("광주");
		vt.add("대구");
		vt.add("부산");
		
		for (int i = 0; i < vt.size(); i++) {
			System.out.println("vt.get(" + i + ") = " + vt.get(i));
		}
		System.out.println();
		
		System.out.println("Iterator로 요소 출력");
		Iterator<String> it = vt.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		System.out.println("foreach로 요소 출력");
		
		for(String s : vt) {
			System.out.println(s);
		}
	}

}
