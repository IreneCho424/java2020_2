package ex4;

//(����4) ���ʸ� Ŭ���� ����
//1817022 ���̸�

public class GenericClassDemo {

	public static void main(String[] args) {
		MyClass<String> s = new MyClass<String>();
		s.set("Hello");
		System.out.println(s.get());
		
		MyClass<Integer> n = new MyClass<Integer>();
		n.set(5);
		System.out.println(n.get());
	}

}
