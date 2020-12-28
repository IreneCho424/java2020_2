package dvdhw;

import java.io.Serializable;

//1817022 조이린
/*
 * Customer 클래스 
 * 고객의 이름, 생년월일, 아이디, 주소, 전화번호를 저장하고 있는 클래스
 */

public class Customer extends Person implements Serializable{
	private String loginId;
	private String address;
	private String phoneNumber;
	
	public Customer(String name, int birthyear, String loginId, String address, String phoneNumber) {
		super(name, birthyear);

		this.loginId = loginId; 
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getLoginId() {
		return loginId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return super.toString() + "아이디:" + loginId + " 주소:" + address + " 전화번호:" + phoneNumber;
	}
}
