package ex7;

//(����7) ���ʸ� �������̽� �����
//1817022 ���̸�

interface ExInterfaceGeneric<T> {
	T example();
}

class ExGeneric implements ExInterfaceGeneric<String>{
	public String example() {
		return null;
	}
}