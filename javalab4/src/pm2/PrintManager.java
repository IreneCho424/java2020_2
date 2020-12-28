package pm2;
import java.util.Scanner;

//(�ǽ�2) ������ ���α׷�_ ���ϴ� �ż���ŭ ���� �����Ϳ��� ����Ʈ �Ұ�
//1817022 ���̸�

public class PrintManager{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;					//�μ� Ƚ��
		InkjetPrinter ip = new InkjetPrinter("Officejet V40", "HP", "Printer.USB", 5);		//�ʱ�����
		LaserPrinter lp = new LaserPrinter("SCX-6x45", "�Ｚ����", "Printer.PARALLEL", 4);		//�ʱ�����
		
		while(true) {			//�μ� ���������� �ݺ�
			
			if(ip.printPaper == 0 && lp.printPaper == 0) {		//�� ������ ��� �μ� �Ϸ�
				System.out.println("���α׷� ����");
				break;
			}
			
			System.out.println("***"+count+"***");
			
			//--------------������ ������----------------
			if(lp.printPaper != 0) {
				//��ʷ��� ������ ���
				if(lp.leftToner < 5) {
					System.out.println("��ʰ� �����մϴ�.");
					System.out.print("�߰��� ��ʷ� �Է� >> ");
					int newToner = scan.nextInt();
					lp.fillToner(newToner);
				}
				
				//������ ������ ���
				lp.printPaper--;
				lp.print(count+1);
			}
			else if(lp.printPaper == 0) {		//������ �����Ͱ� �μ⸦ ������ ��
				System.out.println("������ ����Ʈ �۾� �Ϸ�");
			}
	
			System.out.println();
			
			//--------------��ũ�� ������----------------
			if(ip.printPaper != 0) {
				
				//��ũ���� ������ ���
				if(ip.leftInk < 10) {
					System.out.println("��ũ�� �����մϴ�.");
					System.out.print("�߰��� ��ũ�� �Է� >> ");
					int newInk = scan.nextInt();
					ip.fillInk(newInk);
				}
				
				//��ũ�� ������ ���
				ip.printPaper--;
				ip.print(count+1);
			}
			else if(ip.printPaper == 0) {		//��ũ�� �����Ͱ� �μ⸦ ������ ��
				System.out.println("��ũ ����Ʈ �۾� �Ϸ�");
			}
			
			System.out.println();
			
			//�μ� ���� ����
			count++;
		}
		scan.close();
	}
}