package pm1;

//(실습1) Product 클래스를 상속받은 CompactDisc 클래스
//1817022 조이린

public class CompactDisc extends Product{
	public CompactDisc(int ID, String des, String maker, int price) {
		super(ID, des, maker, price);			//Product의 생성자 이용
	}
	private String albumTitle;
	private String artist;
	
	//albumTitle에 대한 getter, setter
	public String getAlbumTitle() {
		return albumTitle;
	}
	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	//artist에 대한 getter, setter
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}	
	
	//오버라이딩
	public void showInfo() {
		super.showInfo();			//Product 클래스의 함수 오버라이딩
		System.out.println("앨범 제목>> " + albumTitle);
		System.out.println("가수>> " + artist);
	}
}