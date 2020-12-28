package pm6;

//(실습6) 영화관 좌석 에약 시스템_ Seat class
//1817022 조이린

public class Seat{
	private int[][] seat = new int[5][7];			//외부에서 함부로 수정할 수 없는 정보
	
	public void showSeat(int line) {				//현재 예약상황과 좌석을 보여주는 메소드
		System.out.printf("---%d번째 줄 좌석 예약 현황---\n", line);
		System.out.println("1 2 3 4 5 6 7");
		System.out.println("---------------------");
		for(int i=0;i<7;i++) {
			if(this.seat[line][i] == 0) {
				System.out.printf("O ");
			}
			else {
				System.out.printf("X ");
			}
		}
		System.out.println();
	}

	public int[][] getSeat() {
		return seat;
	}

	public void setSeat(int seat[][]) {
		this.seat = seat;
	}
	
	public void checkSeat(int line, int pick) {		//입력받은 좌석을 선택할 수 있는지 확인하고 비어있으면 예약하는 메소드
		if(this.seat[line][pick] == 1) {
			System.out.println("이미 예약된 좌석입니다.");
		}
		else {
			this.seat[line][pick] = 1;
			System.out.println("예약되었습니다.");
		}
	}
}