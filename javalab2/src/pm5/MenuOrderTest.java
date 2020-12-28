package pm5;
import java.util.Scanner;

//(�ǽ�5) ����� ���Ǳ�
//1817022 ���̸�

public class MenuOrderTest{
	public static void main(String[] args) {
		MenuOrder order = new MenuOrder();
		
		//���� �Է¹޾� ����
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
		
		while(true) {							//������ ������ ���� �ݺ�
			System.out.println("--- Input Money ---");
			int inmoney = scan.nextInt();
			if((inmoney < cokePrice) || (inmoney < lemonPrice) || (inmoney < coffeePrice)) {		//�Է��� inmoney ���� ��� ���� ���ݺ��� ������ ���
				System.out.println("WARNING: NOTHING TO BUY!");
				continue;
			}
			order.showMenu();					//�޴� �����ֱ�
			int menu = scan.nextInt();
			order.showResult(menu, inmoney);	//���� �� ��� �����ֱ�
			System.out.println("Do you want to continue?(y/n)");
			String answer = scan.next();
			if(answer.equals("y")) continue;
			else break;
		}
		scan.close();
	}
}