package pm2;

//(�ǽ�2) Printer Ŭ����
//1817022 ���̸�

public class Printer{		//protected�� ����Ͽ� getter�� setter�� �ʿ� ������ �ܺ� ��Ű�������� ���� �Ұ���
	protected String modelName;
	protected String maker;
	protected String interf;			//interface 
	protected int printPaper;
	protected int leftPaper;
	
	
	public Printer(String modelName, String maker, String interf, int printP) {
		this.modelName = modelName;
		this.maker = maker;
		this.interf = interf;
		this.printPaper = printP;
	}
	
	

	//�������̵�
	public void print() {
	}
}