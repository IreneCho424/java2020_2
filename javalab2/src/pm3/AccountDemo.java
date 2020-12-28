package pm3;

//(실습3) 은행 계정 관리 프로그램
//1817022 조이린

public class AccountDemo{
	
	public static void main(String[] args) {	//각각의 객체 모두 생성
		Account kim = new Account("Kim", 1000, 0.03);
		Account lee = new Account("Lee", 0.04);
		Account park = new Account("Park", 2000, 0.05);
		
		//"Kim"객체에 대해 전체 정보 출력
		kim.showAll();
		System.out.println();
		kim.deposit(300);
		kim.withdraw(100);
		//5달치 이자 계산 후 balance에 더해
		kim.computeTotal(5);
		kim.showOwner();
		kim.showBalance();
		System.out.println();
		
		//"Lee"객체에 대해 전체 정보 출력
		lee.showAll();
		System.out.println();
		lee.deposit(300);
		lee.withdraw(100);
		//5달치 이자 계산 후 balance에 더해
		lee.computeTotal(5);
		lee.showOwner();
		lee.showBalance();
		System.out.println();
		
		//"Park"객체에 대해 전체 정보 출력
		park.showAll();
		System.out.println();
		park.deposit(300);
		park.withdraw(100);
		//5달치 이자 계산 후 balance에 더해
		park.computeTotal(5);
		park.showOwner();
		park.showBalance();
		System.out.println();
	}
}