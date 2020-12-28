package pm1;

//(실습1) Book 클래스를 상속받은 ConversationBook 클래스
//1817022 조이린

public class ConversationBook extends Book{
	private String language;
	
	public ConversationBook(int ID, String des, String maker, int price) {
		super(ID, des, maker, price);
	}
	
	//language에 대한 getter, setter
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	//오버라이딩
	public void showInfo() {
		super.showInfo();				//Book 클래스의 함수 오버라이딩
		System.out.println("언어>> " + language);
	}
}