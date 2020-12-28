package pm3;

//(실습3) 음원 구매 실습 - Song(음원) 클래스
//1817022 조이린


public class Song{
	private int mode;
	private String title;
	private String singer;
	private int price;
	public int totalPrice = 0;
	public int priceCal = 0;
	
	//mode에 대한 getter와 setter
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
		this(name, "익명", 10);
	}
	public Song(String title, String singer, int price) {
		this.setTitle(title);
		this.setSinger(singer);
		this.setPrice(price);
	}
	
	//title에 대한 getter와 setter	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	//singer에 대한 getter와 setter
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	//price에 대한 getter와 setter
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//할인 모드에 따라 가격 계산 및 전체에 더하는 함수
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