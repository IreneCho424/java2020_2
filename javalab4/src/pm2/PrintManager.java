package pm2;
import java.util.Scanner;

//(실습2) 프린터 프로그램_ 원하는 매수만큼 각각 프린터에서 프린트 할것
//1817022 조이린

public class PrintManager{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;					//인쇄 횟수
		InkjetPrinter ip = new InkjetPrinter("Officejet V40", "HP", "Printer.USB", 5);		//초기정보
		LaserPrinter lp = new LaserPrinter("SCX-6x45", "삼성전자", "Printer.PARALLEL", 4);		//초기정보
		
		while(true) {			//인쇄 끝날때까지 반복
			
			if(ip.printPaper == 0 && lp.printPaper == 0) {		//두 프린터 모두 인쇄 완료
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.println("***"+count+"***");
			
			//--------------레이저 프린터----------------
			if(lp.printPaper != 0) {
				//토너량이 부족할 경우
				if(lp.leftToner < 5) {
					System.out.println("토너가 부족합니다.");
					System.out.print("추가할 토너량 입력 >> ");
					int newToner = scan.nextInt();
					lp.fillToner(newToner);
				}
				
				//레이저 프린터 출력
				lp.printPaper--;
				lp.print(count+1);
			}
			else if(lp.printPaper == 0) {		//레이저 프린터가 인쇄를 끝냈을 때
				System.out.println("레이저 프린트 작업 완료");
			}
	
			System.out.println();
			
			//--------------잉크젯 프린터----------------
			if(ip.printPaper != 0) {
				
				//잉크량이 부족할 경우
				if(ip.leftInk < 10) {
					System.out.println("잉크가 부족합니다.");
					System.out.print("추가할 잉크량 입력 >> ");
					int newInk = scan.nextInt();
					ip.fillInk(newInk);
				}
				
				//잉크젯 프린터 출력
				ip.printPaper--;
				ip.print(count+1);
			}
			else if(ip.printPaper == 0) {		//잉크젯 프린터가 인쇄를 끝냈을 때
				System.out.println("잉크 프린트 작업 완료");
			}
			
			System.out.println();
			
			//인쇄 순번 증가
			count++;
		}
		scan.close();
	}
}