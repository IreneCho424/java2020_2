package pm2;

//(�ǽ�2) ���� ���� ���� ���α׷�
//1817022 ���̸�

public class VehicleDemo{
	
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14, 12);
		
		System.out.printf("�̴Ϲ��� 252������ ���� ���� %.1f������ ���ᰡ �ʿ��ϴ�.\n", minivan.fuelneeded(252));
		System.out.printf("������ī�� 252������ ���� ���� %.1f������ ���ᰡ �ʿ��ϴ�.\n", sportscar.fuelneeded(252));
		System.out.printf("�̴Ϲ��� ���� %d������ ������ �� �ִ�.\n", minivan.range());
		System.out.printf("������ī�� ���� %d������ ������ �� �ִ�.\n", sportscar.range());
	}
}