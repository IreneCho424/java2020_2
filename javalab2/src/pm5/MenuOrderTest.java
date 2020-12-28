package pm5;
import java.util.Scanner;

//(실습5) 음료수 자판기
//1817022 조이린

public class MenuOrderTest{
	public static void main(String[] args) {
		MenuOrder order = new MenuOrder();
		
		//가격 입력받아 설정
		Scanner scan = new Scanner(System.in);
		System.out.println("Input price for Coke");
		int cokePrice = scan.nextInt();
		System.out.println("Input price for Lemonade");
		int lemonPrice = scan.nextInt();
		System.out.println("Input price for Coffee");
		int coffeePrice = scan.nextInt();
		
		order.setCokePrice(cokePrice);
		order.setLemonPrice(lemonPrice);
		order.setCoffeePrice(coffeePrice);
		
		while(true) {							//종료할 때까지 무한 반복
			System.out.println("--- Input Money ---");
			int inmoney = scan.nextInt();
			if((inmoney < cokePrice) || (inmoney < lemonPrice) || (inmoney < coffeePrice)) {		//입력한 inmoney 값이 모든 음료 가격보다 적을때 경고
				System.out.println("WARNING: NOTHING TO BUY!");
				continue;
			}
			order.showMenu();					//메뉴 보여주기
			int menu = scan.nextInt();
			order.showResult(menu, inmoney);	//선택 후 결과 보여주기
			System.out.println("Do you want to continue?(y/n)");
			String answer = scan.next();
			if(answer.equals("y")) continue;
			else break;
		}
		scan.close();
	}
}