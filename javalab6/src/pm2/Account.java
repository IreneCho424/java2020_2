package pm2;
import java.util.Scanner;

//(실습2) 예금 관리 프로그램 - 잔액 확인, 입금, 출금 가능
//1817022 조이린

public class Account{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount();	//BankAccount 객체 생성
		while(true) {		//종료시까지 무한 반복
			try {
				System.out.println("무엇을 하시겠습니까?");
				System.out.println("1. 통장 정보 출력\t2. 현금 인출\t3. 예금 입금\n(끝내려면 0을 입력하세요)");
				int choice = sc.nextInt();
				if(choice == 0)	//프로그램 종료
					break;
				switch(choice) {
				case(1):	//통장 정보 출력
					ba.printMoney();
					break;
				case(2):	//현금 인출
					System.out.printf("얼마 인출하시겠습니까? : ");
					int delmoney = sc.nextInt();
					if(ba.getMoney() < delmoney) {	//현재 잔고보다 많이 인출 시도하는 경우
						throw new NotEnoughMoneyException();
					}
					else if(delmoney < 0)			//제대로 된 숫자를 입력하지 않은 경우
						throw new InvalidMoneyException();
					else {		//정상 인출
						ba.withdraw(delmoney);
					}
					break;
				case(3):	//예금 입금
					System.out.printf("얼마 입금하시겠습니까? : ");
					int addmoney = sc.nextInt();
					if(addmoney < 0)		//제대로 숫자를 입력하지 않은 경우 
						throw new InvalidMoneyException();
					else{
						ba.deposit(addmoney);
						System.out.println(addmoney + "원이 입금되었습니다.");
					}
					break;
				}
			}
			catch(NotEnoughMoneyException e){
				e.getMessage();
				ba.printMoney();
				sc = new Scanner(System.in);
			}
			catch(InvalidMoneyException e) {
				e.getMessage();
				ba.printMoney();
				sc = new Scanner(System.in);
			}
		}
		sc.close();
	}
}