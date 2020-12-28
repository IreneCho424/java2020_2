package ex2;

//(예제 2) Person클래스를 상속받은 Professor 클래스. super이용해서 name과 phone에 접근. 
//1817022 조이린

public class Professor extends Person{
	public Professor(String name) {
		super(name);
	}
	
	public String getPhone() {
		return "Professor " + super.getPhone();
	}
}