package dvdhw;

import java.io.Serializable;

//1817022 ���̸�
/*
 * Customer Ŭ���� 
 * ���� �̸�, �������, ���̵�, �ּ�, ��ȭ��ȣ�� �����ϰ� �ִ� Ŭ����
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
		return super.toString() + "���̵�:" + loginId + " �ּ�:" + address + " ��ȭ��ȣ:" + phoneNumber;
	}
}
