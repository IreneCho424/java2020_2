package pm6;
import java.util.Scanner;

//(실습6) 영화관 좌석 에약 시스템
//1817022 조이린

public class SeatReserve {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Seat reserve = new Seat();							//Seat 객체 생성
		while (true) {										//종료할때까지 무한 반복
			System.out.println("좌석을 예약하시겠습니까?(y/n)");
			String yn = scan.next();
			
			if(yn.equals("y")) {							//좌석 예약
				System.out.println("좌석의 몇번째 줄을 선택하시겠습니까?(1~5): ");
				int line = scan.nextInt();
				if(line < 1 || line > 5) {
					System.out.println("잘못 입력하셨습니다. 다시 선택하십시오(1~5)");
				}
				else {										//줄 제대로 입력
					reserve.showSeat(line);
					System.out.println("몇번째 좌석을 예약하시겠습니까?");
					int pick = scan.nextInt();
					reserve.checkSeat(line, (pick-1));		//실제 배열에서는 0부터 시작하기 때문에 pick-1
					continue;
				}
			}

			else if(yn.contentEquals("n")) {				//끝내기
				break;
			}
			
			else {											//잘못 입력했을 경우
				System.out.println("다시 입력하세요");
				continue;
			}
		}
		scan.close();
	}
}