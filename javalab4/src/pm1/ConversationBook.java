package pm1;

//(�ǽ�1) Book Ŭ������ ��ӹ��� ConversationBook Ŭ����
//1817022 ���̸�

public class ConversationBook extends Book{
	private String language;
	
	public ConversationBook(int ID, String des, String maker, int price) {
		super(ID, des, maker, price);
	}
	
	//language�� ���� getter, setter
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	//�������̵�
	public void showInfo() {
		super.showInfo();				//Book Ŭ������ �Լ� �������̵�
		System.out.println("���>> " + language);
	}
}