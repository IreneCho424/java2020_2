package pm1;

//(�ǽ�1) ��ȭ��ȣ�� �ǽ�
//1817022 ���̸�

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
	
	//ã���� �ϴ� �̸� �Է� �޾Ƽ� ��ȣ�� ������ true, ������ false ��ȯ
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