package ex2;

//(예제 2) Person 클래스. name과 phone은 private이므로 접근하기 위해서는 getter와 setter가 필요함
//1817022 조이린

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