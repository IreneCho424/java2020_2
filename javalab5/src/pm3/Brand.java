package pm3;

//(�ǽ�3) �귣�� ����Ÿ��
//1817022 ���̸�

public enum Brand{
	SAMSUNG("�Ｚ"), LG("��������"), SONYK("�Ҵ�"), PANA("�ĳ��Ҵ�");
	private String company;
	
	private Brand(String company) {
		this.company = company;
	}
	
	public String getValue() {
		return company;
	}
}