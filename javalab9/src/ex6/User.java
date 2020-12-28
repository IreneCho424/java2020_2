package ex6;

import java.io.Serializable;

//(예제6) User 객체 저장
//1817022 조이린

public class User implements Serializable{
	public String id;
	public String name;
	public int age;
	
	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "아이디 = " + id + ", 이름 = " + name + ", 나이 = " + age;
	}
}
