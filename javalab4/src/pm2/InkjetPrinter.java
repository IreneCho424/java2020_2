package pm2;

//(�ǽ�2) Printer Ŭ������ ��ӹ��� InkjetPrinter Ŭ����
//1817022 ���̸�

public class InkjetPrinter extends Printer{
	
	protected int leftInk = 20;
	
	public InkjetPrinter(String modelName, String maker, String interf, int printP) {
		super(modelName, maker, interf, printP);
	}
	
	public void fillInk(int newInk) {		//��ũ�� ������ ��� ��ũ ä��� �Լ�
		leftInk += newInk;
	}
	
	public void print(int count) {			//����ϴ� �Լ�
		leftInk -= 10;						//�μ� �Ҷ����� 10�� ��ũ �Һ��
		System.out.println("��ũ�� ������ ���");
		System.out.println("��ũ�� ������>> �μ����:" + printPaper + "��¸ż�:" + count + "��ũ�ܷ�:" + leftInk);		//��¸ż� ��į
		
	}
}