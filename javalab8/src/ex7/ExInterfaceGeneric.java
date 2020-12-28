package ex7;

//(예제7) 제너릭 인터페이스 만들기
//1817022 조이린

interface ExInterfaceGeneric<T> {
	T example();
}

class ExGeneric implements ExInterfaceGeneric<String>{
	public String example() {
		return null;
	}
}