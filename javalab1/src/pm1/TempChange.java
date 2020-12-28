package pm1;

//(½Ç½À1) ¼·¾¾, È­¾¾ ¿Âµµ º¯È¯
//1817022 Á¶ÀÌ¸°

import java.util.Scanner;
public class TempChange{
	public static void main(String[] args) {
		System.out.println("¼·¾¾ ¶Ç´Â È­¾¾ ¿Âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		Scanner sc = new Scanner(System.in);
		double temp = 0;
		String typeT = sc.next();
		switch(typeT) {
		case "¼·¾¾" : 
			temp = sc.nextDouble();
			temp = temp * 9.0 / 5.0 + 32.0;
			System.out.println("È­¾¾ ¿Âµµ´Â "+ temp);
			break;
		case "È­¾¾" :
			temp = sc.nextDouble();
			temp = (temp - 32.0) * 5.0 / 9.0;
			System.out.println("¼·¾¾ ¿Âµµ´Â "+ temp);
			break;
		}
		sc.close();
	}
}