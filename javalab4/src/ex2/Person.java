package ex2;

//(���� 2) Person Ŭ����. name�� phone�� private�̹Ƿ� �����ϱ� ���ؼ��� getter�� setter�� �ʿ���
//1817022 ���̸�

public class Person{
	private String name;
	private String phone;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//override
	public String toString() {
		return "[name = " + name + ", phone = " + phone + "]";
	}
}