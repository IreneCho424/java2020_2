package dvdhw;

import java.io.Serializable;
import java.time.LocalDate;

//1817022 ���̸�
/*
 * Person Ŭ����
 * ����� ���� ���� - �̸�, ����⵵, ����
 */

public class Person implements Serializable{
	private String name;
	private int birthyear;
	private int age;
	
	public Person(String name, int birthyear){
		this.name = name;
		this.birthyear = birthyear;
		
		//������ ������ �Է� ���� ��������� ���� ���̸� ��� �� ����
		LocalDate today = LocalDate.now();
		age = today.getYear() - birthyear;
	}
	
	//�̸��� �Է����� ���
	public Person(String name) {
		this.name = name;
		this.birthyear = 0;
		age = 0;
	}

	public String getName() {
		return name;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "�̸�:" + name + " ����:" + age + " ";
	}
	
}
