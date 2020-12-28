package pm1;

//(실습1) Product 클래스를 상속받은 Book 클래스
//1817022 조이린

public class Book extends Product{
	private int ISBN;
	private String title;
	private String author;
	
	public Book(int ID, String des, String maker, int price) {
		super(ID, des, maker, price);		//Product 클래스의 생성자 이용
	}
	
	//ISBN에 대한 getter, setter
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int isbn) {
		this.ISBN = isbn;
	}
	//title에 대한 getter, setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	//author에 대한 getter, setter
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//함수 오버라이딩
	public void showInfo() {
		super.showInfo();			//Product 클래스의 함수 오버라이딩
		System.out.println("ISBN>> " + ISBN);
		System.out.println("책 제목>> " + title);
		System.out.println("저자>> " + author);
	}
}