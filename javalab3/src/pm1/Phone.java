package pm1;

//(실습1) 전화번호부 실습
//1817022 조이린

public class Phone{
	
	private String name;
	private String phoneNum;
	
	public Phone() {
		this("anonymous", "000");
	}
	
	public Phone(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	//찾고자 하는 이름 입력 받아서 번호가 있으면 true, 없으면 false 반환
	public boolean isYourName(String name) {
		if(this.name.equals(name)) {
			return true;
		}
		else return false;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
}