package dvdhw;

import java.io.Serializable;
import java.time.LocalDate;

//1817022 조이린
/*
 * RentDvd 클래스
 * DVD의 대여 및 반납 여부를 저장하는 클래스
 */

public class RentDvd implements Serializable{
	private Customer customer;
	private Dvd dvd;
	private LocalDate borrowDate;
	private LocalDate returnDate;
	private boolean isReturn = false;
	
	public RentDvd(Customer customer, Dvd dvd){ //DVD를 대여함
		this.customer = customer;
		this.dvd = dvd;
		borrowDate = LocalDate.now();	//현재 날짜를 대여 날짜로 설정
	}
	
	public void setReturn() {	//DVD를 반납함
		isReturn = true;
		returnDate = LocalDate.now();	//현재 날짜를 반납 날짜로 설정
	}

	public Customer getCustomer() {
		return customer;
	}

	public Dvd getDvd() {
		return dvd;
	}

	public boolean isReturn() {	//DVD 반납 여부 메서드
		return isReturn;
	}

	@Override
	public String toString() {
		String name = customer.getName();
		String title = dvd.getTitle();
		
		String borrow = borrowDate.toString();
		
		String rtndate = "대여 중";
		if(returnDate != null) rtndate = returnDate.toString();
		
		return "고객 이름:" + name + " DVD 제목:" + title + " 대여 날짜:" + borrow
		       + " 반납 날짜:" + rtndate;  
	}
}
