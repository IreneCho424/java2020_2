package pm1;

//(�ǽ�1) Product Ŭ������ ��ӹ��� CompactDisc Ŭ����
//1817022 ���̸�

public class CompactDisc extends Product{
	public CompactDisc(int ID, String des, String maker, int price) {
		super(ID, des, maker, price);			//Product�� ������ �̿�
	}
	private String albumTitle;
	private String artist;
	
	//albumTitle�� ���� getter, setter
	public String getAlbumTitle() {
		return albumTitle;
	}
	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	//artist�� ���� getter, setter
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}	
	
	//�������̵�
	public void showInfo() {
		super.showInfo();			//Product Ŭ������ �Լ� �������̵�
		System.out.println("�ٹ� ����>> " + albumTitle);
		System.out.println("����>> " + artist);
	}
}