package pm1;

//(�ǽ�1) Product Ŭ������ ��ӹ��� Book Ŭ����
//1817022 ���̸�

public class Book extends Product{
	private int ISBN;
	private String title;
	private String author;
	
	public Book(int ID, String des, String maker, int price) {
		super(ID, des, maker, price);		//Product Ŭ������ ������ �̿�
	}
	
	//ISBN�� ���� getter, setter
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int isbn) {
		this.ISBN = isbn;
	}
	//title�� ���� getter, setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	//author�� ���� getter, setter
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//�Լ� �������̵�
	public void showInfo() {
		super.showInfo();			//Product Ŭ������ �Լ� �������̵�
		System.out.println("ISBN>> " + ISBN);
		System.out.println("å ����>> " + title);
		System.out.println("����>> " + author);
	}
}