package ex2;
import java.util.*;

//(예제2) Collection - Vector<E>
//1817022 조이린

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(2, 25);

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}

}
