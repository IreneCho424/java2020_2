package dvdhw;

import java.io.Serializable;
import java.time.LocalDate;

//1817022 조이린
/*
 * Person 클래스
 * 사람의 정보 저장 - 이름, 출생년도, 나이
 */

public class Person implements Serializable{
	private String name;
	private int birthyear;
	private int age;
	
	public Person(String name, int birthyear){
		this.name = name;
		this.birthyear = birthyear;
		
		//현재의 연도와 입력 받은 출생연도를 통해 나이를 계산 후 저장
		LocalDate today = LocalDate.now();
		age = today.getYear() - birthyear;
	}
	
	//이름만 입력했을 경우
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
		return "이름:" + name + " 나이:" + age + " ";
	}
	
}
