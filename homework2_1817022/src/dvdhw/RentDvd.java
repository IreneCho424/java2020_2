package dvdhw;

import java.io.Serializable;
import java.time.LocalDate;

//1817022 ���̸�
/*
 * RentDvd Ŭ����
 * DVD�� �뿩 �� �ݳ� ���θ� �����ϴ� Ŭ����
 */

public class RentDvd implements Serializable{
	private Customer customer;
	private Dvd dvd;
	private LocalDate borrowDate;
	private LocalDate returnDate;
	private boolean isReturn = false;
	
	public RentDvd(Customer customer, Dvd dvd){ //DVD�� �뿩��
		this.customer = customer;
		this.dvd = dvd;
		borrowDate = LocalDate.now();	//���� ��¥�� �뿩 ��¥�� ����
	}
	
	public void setReturn() {	//DVD�� �ݳ���
		isReturn = true;
		returnDate = LocalDate.now();	//���� ��¥�� �ݳ� ��¥�� ����
	}

	public Customer getCustomer() {
		return customer;
	}

	public Dvd getDvd() {
		return dvd;
	}

	public boolean isReturn() {	//DVD �ݳ� ���� �޼���
		return isReturn;
	}

	@Override
	public String toString() {
		String name = customer.getName();
		String title = dvd.getTitle();
		
		String borrow = borrowDate.toString();
		
		String rtndate = "�뿩 ��";
		if(returnDate != null) rtndate = returnDate.toString();
		
		return "�� �̸�:" + name + " DVD ����:" + title + " �뿩 ��¥:" + borrow
		       + " �ݳ� ��¥:" + rtndate;  
	}
}
