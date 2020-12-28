package pm3;

//(실습3) 브랜드 열거타입
//1817022 조이린

public enum Brand{
	SAMSUNG("삼성"), LG("엘지전자"), SONYK("소닉"), PANA("파나소닉");
	private String company;
	
	private Brand(String company) {
		this.company = company;
	}
	
	public String getValue() {
		return company;
	}
}