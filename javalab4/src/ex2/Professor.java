package ex2;

//(���� 2) PersonŬ������ ��ӹ��� Professor Ŭ����. super�̿��ؼ� name�� phone�� ����. 
//1817022 ���̸�

public class Professor extends Person{
	public Professor(String name) {
		super(name);
	}
	
	public String getPhone() {
		return "Professor " + super.getPhone();
	}
}