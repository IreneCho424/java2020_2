package pm6;
import java.util.Scanner;

//(�ǽ�6) ��ȭ�� �¼� ���� �ý���
//1817022 ���̸�

public class SeatReserve {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Seat reserve = new Seat();							//Seat ��ü ����
		while (true) {										//�����Ҷ����� ���� �ݺ�
			System.out.println("�¼��� �����Ͻðڽ��ϱ�?(y/n)");
			String yn = scan.next();
			
			if(yn.equals("y")) {							//�¼� ����
				System.out.println("�¼��� ���° ���� �����Ͻðڽ��ϱ�?(1~5): ");
				int line = scan.nextInt();
				if(line < 1 || line > 5) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �����Ͻʽÿ�(1~5)");
				}
				else {										//�� ����� �Է�
					reserve.showSeat(line);
					System.out.println("���° �¼��� �����Ͻðڽ��ϱ�?");
					int pick = scan.nextInt();
					reserve.checkSeat(line, (pick-1));		//���� �迭������ 0���� �����ϱ� ������ pick-1
					continue;
				}
			}

			else if(yn.contentEquals("n")) {				//������
				break;
			}
			
			else {											//�߸� �Է����� ���
				System.out.println("�ٽ� �Է��ϼ���");
				continue;
			}
		}
		scan.close();
	}
}