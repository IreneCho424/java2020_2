package ex2;

//(���� 2) PersonŬ������ ��ӹ��� Student Ŭ����. super�̿��ؼ� name�� phone�� ����. 
//1817022 ���̸�

public class Student extends Person{
	public Student(String name) {
		super(name);
	}
	
	public String getPhone() {
		return "Student " + super.getPhone();
	}
}