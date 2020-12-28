package pm3;

//(�ǽ�3) ���� ���� �ǽ� - Song(����) Ŭ����
//1817022 ���̸�


public class Song{
	private int mode;
	private String title;
	private String singer;
	private int price;
	public int totalPrice = 0;
	public int priceCal = 0;
	
	//mode�� ���� getter�� setter
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	
	public Song() {
		this(null, null, 0);
	}
	public Song(String name) {
		this(name, "�͸�", 10);
	}
	public Song(String title, String singer, int price) {
		this.setTitle(title);
		this.setSinger(singer);
		this.setPrice(price);
	}
	
	//title�� ���� getter�� setter	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	//singer�� ���� getter�� setter
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	//price�� ���� getter�� setter
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//���� ��忡 ���� ���� ��� �� ��ü�� ���ϴ� �Լ�
	public double priceCal() {
		if(this.mode == 1) {
			priceCal += this.price;
		}
		else if(this.mode == 2) {
			priceCal += this.price * 0.9;
		}
		else if(this.mode == 3) {
			priceCal += this.price * 0.7;
		}
		else {
			System.out.println("wrong number");
		}
		return priceCal;
	}


}