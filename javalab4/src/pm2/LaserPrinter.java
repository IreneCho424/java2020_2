package pm2;

//(�ǽ�2) Printer Ŭ������ ��ӹ��� LaserPrinter Ŭ����
//1817022 ���̸�

public class LaserPrinter extends Printer{

	protected int leftToner = 20;				//�־��� �ʱ� ����
	
	public LaserPrinter(String modelName, String maker, String interf, int printP) {
		super(modelName, maker, interf, printP);
	}
	
	public void fillToner(int newToner) {		//��� ���� ������ ��� �߰��ϴ� �Լ�
		leftToner += newToner;
	}
	
	public void print(int count) {				//����ϴ� �Լ�
		leftToner -= 5;							//�μ� �Ҷ����� 5�� ��� �Һ��
		System.out.println("������ ������ ���");
		System.out.println("������ ������>> �μ����:" + printPaper + "��¸ż�:" + count + "����ܷ�:" + leftToner);		//��¸ż� ��į
		
	}
}