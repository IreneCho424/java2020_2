package pm3;
import java.util.Scanner;

//(�ǽ�3) ���� ���� �ǽ� - �������� ����� ��ٱ��Ͽ� ��� ������ �� ������ ����ϴ� ���α׷�
//1817022 ���̸�


public class CartForSongs{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input user >> ");
		String user = sc.next();
		System.out.println("Start shopping - Cart of " + user);
		double totalPrice = 0;
		Song song = new Song();
		while(true) {
			System.out.println("Input Song Info(title singer price)-- to stop type(�׸� 0 0) >> ");
			String title = sc.next();
			String singer = sc.next();
			int price = sc.nextInt();
			if(title.contentEquals("�׸�")) break;
			else {
				System.out.println("Input Sale Mode(NonDiscounted(1) or OnSale(2) or TodayEvent(3) ) >> ");
				int mode = sc.nextInt();
				song.setTitle(title);
				song.setSinger(singer);
				song.setPrice(price);
				song.setMode(mode);
				totalPrice = song.priceCal();
			}	
		}
		System.out.println("Total Price(" + user + ") : " + totalPrice);
		sc.close();
	}
}