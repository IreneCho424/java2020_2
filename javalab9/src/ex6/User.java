package ex6;

import java.io.Serializable;

//(����6) User ��ü ����
//1817022 ���̸�

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
		return "���̵� = " + id + ", �̸� = " + name + ", ���� = " + age;
	}
}
