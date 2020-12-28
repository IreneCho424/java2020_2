package pm6;

//(�ǽ�6) ��ȭ�� �¼� ���� �ý���_ Seat class
//1817022 ���̸�

public class Seat{
	private int[][] seat = new int[5][7];			//�ܺο��� �Ժη� ������ �� ���� ����
	
	public void showSeat(int line) {				//���� �����Ȳ�� �¼��� �����ִ� �޼ҵ�
		System.out.printf("---%d��° �� �¼� ���� ��Ȳ---\n", line);
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
	
	public void checkSeat(int line, int pick) {		//�Է¹��� �¼��� ������ �� �ִ��� Ȯ���ϰ� ��������� �����ϴ� �޼ҵ�
		if(this.seat[line][pick] == 1) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
		}
		else {
			this.seat[line][pick] = 1;
			System.out.println("����Ǿ����ϴ�.");
		}
	}
}