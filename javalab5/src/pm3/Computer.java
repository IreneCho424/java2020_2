package pm3;

//(�ǽ�3) Product Ŭ������ ��ӹ��� Computer Ŭ����
//1817022 ���̸�

class Computer extends Product{
	int hddSize;		//�ϵ��ũ ������
	int memorySize;	//�޸� ������
	
	@Override
	public void displayProductInfo() {
		System.out.println("Computer ������ : " + company.getValue() +
				" | ��ǰ�� : " + name + " | ���� : " + price + " | hddSize : " + 
				hddSize + "GB | memorySize : " + memorySize + "GB");
	}
	
	public Computer(Brand company, String name, int price, int hddSize, int memorySize) {
		super(company, name, price);
		this.hddSize = hddSize;
		this.memorySize = memorySize;
	}
}