package ex4;
import java.util.ArrayList;

//(예제4) Collection - ArrayList<E>
//1817022 조이린

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Double> v = new ArrayList<Double>();

		for (int i = 0; i < 10; i++) {
			v.add(i * 10.0);
		}

		double sum = 0;
		for (int i = 0; i < v.size(); i++) {
			sum += v.get(i);
		}

		System.out.println(sum);
	}

}
