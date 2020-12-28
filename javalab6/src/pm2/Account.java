package pm2;
import java.util.Scanner;

//(�ǽ�2) ���� ���� ���α׷� - �ܾ� Ȯ��, �Ա�, ��� ����
//1817022 ���̸�

public class Account{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount();	//BankAccount ��ü ����
		while(true) {		//����ñ��� ���� �ݺ�
			try {
				System.out.println("������ �Ͻðڽ��ϱ�?");
				System.out.println("1. ���� ���� ���\t2. ���� ����\t3. ���� �Ա�\n(�������� 0�� �Է��ϼ���)");
				int choice = sc.nextInt();
				if(choice == 0)	//���α׷� ����
					break;
				switch(choice) {
				case(1):	//���� ���� ���
					ba.printMoney();
					break;
				case(2):	//���� ����
					System.out.printf("�� �����Ͻðڽ��ϱ�? : ");
					int delmoney = sc.nextInt();
					if(ba.getMoney() < delmoney) {	//���� �ܰ��� ���� ���� �õ��ϴ� ���
						throw new NotEnoughMoneyException();
					}
					else if(delmoney < 0)			//����� �� ���ڸ� �Է����� ���� ���
						throw new InvalidMoneyException();
					else {		//���� ����
						ba.withdraw(delmoney);
					}
					break;
				case(3):	//���� �Ա�
					System.out.printf("�� �Ա��Ͻðڽ��ϱ�? : ");
					int addmoney = sc.nextInt();
					if(addmoney < 0)		//����� ���ڸ� �Է����� ���� ��� 
						throw new InvalidMoneyException();
					else{
						ba.deposit(addmoney);
						System.out.println(addmoney + "���� �ԱݵǾ����ϴ�.");
					}
					break;
				}
			}
			catch(NotEnoughMoneyException e){
				e.getMessage();
				ba.printMoney();
				sc = new Scanner(System.in);
			}
			catch(InvalidMoneyException e) {
				e.getMessage();
				ba.printMoney();
				sc = new Scanner(System.in);
			}
		}
		sc.close();
	}
}