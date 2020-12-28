package ex4;

//(예제4) 제너릭 클래스 예제
//1817022 조이린

public class MyClass<T> {

	T val;
	public void set(T a) {
		val = a;
	}
	public T get() {
		return val;
	}
}
