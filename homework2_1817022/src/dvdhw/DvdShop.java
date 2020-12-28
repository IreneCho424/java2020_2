package dvdhw;

import java.util.Scanner;

//1817022 ���̸�
/*
 * DvdShop Ŭ����
 * DVD ������ ���α׷� ��ü�� ���� main�Լ� ���� Ŭ����
 */

public class DvdShop {
	private static Scanner sc = new Scanner(System.in);	//������� �Է°� �ޱ�

	private static CustomerDataMgt customers = new CustomerDataMgt(); //�� ���� ����
	private static DvdDataMgt dvds = new DvdDataMgt();				   //Dvd ���� ����
	private static RentDvdDataMgt rentDvds = new RentDvdDataMgt();	   //�뿩�� Dvd ���� ����

	public static void main(String[] args) {	//��ü ���α׷� ���� ����
		
		DvdShop dvdShop = new DvdShop();
		dvdShop.start();
	}
	
	public void start() {
		decoConsole(true, "=");
		System.out.println("���̸� DVD Shop"); //<== ������ �̸����� ������ �� (��: ����ȭ DVD Shop) 
		decoConsole(false, "=");

		//���α׷��� ���۵� �� ������ �ֱ�
		try {
			customers = DataFile.readCustomersData();
			System.out.println(customers.toString());
			dvds = DataFile.readDvdsData();
			rentDvds = DataFile.readRentDvdsData();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//������ �α��� Ȯ�� - �ִ� �� ������ �Է� �޴´�.
		int count = 0;	//�α��� �õ� Ƚ��
		while(count<3) {
			System.out.println("���̵� �Է� >> ");
			String ID = sc.next();
			System.out.println("��й�ȣ �Է� >> ");
			String PW = sc.next();
		
			ManagerData man = new ManagerData();
			if(man.isManager(ID, PW)) {
				System.out.println("�α��� ����. ���α׷� ����");
				break;
			}
			else {
				System.out.println("�α��� ����. �ٽ� �Է��ϼ���");
				count++;
			}
		}
		if(count == 3) {
			System.out.println("�α��� 3ȸ ����. ���α׷��� �����մϴ�.");
			return;
		}
		
		//�α��� ������ �Ѿ�� ȭ��
		while (true) {
			System.out.println();
			
			int menu = showMenu();
			if (menu == 0) {
				//���α׷��� ������ �� ������ ���Ͽ� �����Ѵ�.
				 try { 
					 DataFile.writeCustomersData(customers); 
					 DataFile.writeDvdData(dvds);
					 DataFile.writeRentDvdData(rentDvds);
				 } catch (Exception e) {
					 e.printStackTrace();
				 }
				 
				break;
			}
			
			switch (menu) {
			case 1: newCustomer(); break;
			case 2: searchCustomer(); break;
			case 3: customersShowAll(); break;
			case 4: delCustomer(); break;
			case 5: newDvd(); break;
			case 6:	searchDvd(); break;
			case 7: dvdsShowAll(); break;
			case 8: delDVD(); break;
			case 9: rentDvd(); break;
			case 10: returnDvd(); break;
			case 11: rentDvdsShowAll(); break;
			case 12: delRentDvd(); break;
			}
		}

	}
	
	public static int showMenu() {
		int menu = -1;

		while (true) {
			System.out.println("=============================�޴�===============================");
			System.out.println("(0) ���� (1) �ű԰��� (2) ���˻� (3) ��ü���˻� (4) ������");
			System.out.println("_______________________________________________________________");
			System.out.println("(5) DVD ��� (6) DVD �˻� (7) DVD ��ü�˻�  (8) Dvd ����");
			System.out.println("_______________________________________________________________");
			System.out.println("(9) DVD �뿩 (10) DVD �ݳ� (11) �뿩 ��� ��ü�˻� (12) �ݳ� �Ϸ� �뿩 ��� ����");
			System.out.println("_______________________________________________________________");

			System.out.print("�޴��� �����ϼ��� >> ");

			try {
				menu = Integer.parseInt(sc.next());
				if (0 <= menu && menu <= 12)	//0������ 12�� ������ ��ȣ�� �Է� �޾� �������� ����
					break;
				else {
					//�� ���� ���ڸ� �Է����� ����� ���� ó��
					throw new MyException("0���� 12 ������ ���ڸ� �Է��ϼ���");
				}
			} catch (NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
			} catch (MyException e) {}
		}

		System.out.println();
		return menu;
	}

	public static void decoConsole(boolean pre, String deco) { //� ���α׷����� �˷��ִ� �κ�
		if (pre)
			System.out.println();

		for (int i = 0; i < 30; i++)
			System.out.print(deco);

		System.out.println();
		if (!pre)
			System.out.println();
	}
	
	//3�� �޴�
	private void customersShowAll() {
		String str = customers.showAll(); 
		System.out.println(str);
	}

	//7�� �޴�
	private void dvdsShowAll() {
		String str = dvds.showAll(); 
		System.out.println(str);
	}

	//11�� �޴�
	private void rentDvdsShowAll() { 
		String str = rentDvds.showAll(); 
		System.out.println(str);
	}

	//2�� �޴�
	private void searchCustomer() { 
		System.out.println("�˻��� �� �̸��� �Է¼��� >>");

		String name = sc.next();
		Customer cust = customers.selectByName(name);
		
		try {
			if(cust == null) {
				throw new MyException("�� ������ �����ϴ�.");
			}
			else System.out.println("\n���>> " + cust.toString());
		} catch (MyException e) {}
		
	}
	
	private void searchDvd() { //6�� �޴�
		System.out.println("�˻��� Dvd ������ �Է¼��� >>");

		String title = sc.next();
		Dvd dvd = dvds.selectByName(title);
		
		if(dvd == null) System.out.println("Dvd ������ �����ϴ�.");
		else System.out.println("\n���>> " + dvd.toString());
		
	}

	public void newCustomer() { //1�� �޴�
		while(true) {
			try {
				System.out.println("�� ������ �Է��ϼ���(�̸�, ����⵵, ���̵�, �ּ�, ��ȭ��ȣ ������ �Է�) >>");
	
				String name = sc.next();
				int year = sc.nextInt();
				String id = sc.next();
				String addr = sc.next();
				String phone = sc.next();
	
				Customer cust = new Customer(name, year, id, addr, phone);
					if(customers.selectById(id) != null) {
						//�̹� �����ϴ� ���̵��� ��� �ߺ����� �˸��� ���� �߻� �� ó��
						throw new MyException("�̹� �����ϴ� ���̵��Դϴ�.");
					}
					else {
						customers.add(cust);
						System.out.println("�ű� ���� ����߽��ϴ�.");
						break;
					}
			} catch (MyException e) {}
		}
	}
		
	//4�� �޴� - �� ���� �׸�
	public void delCustomer() {
		System.out.println("������ �� �̸��� �Է��ϼ��� >> ");
		String delCust = sc.next();
		int count = 0; //������ �̸��� ��� �� �����ϱ� ���� ī��Ʈ
		while(true) {
			try {
				Customer cust = customers.selectByName(delCust);
				if (cust == null && count == 0) {
					//�˻��� ���� ���� ��� ���� �߻�
					throw new MyException("�� ������ �����ϴ�.");
				}
				else if(cust == null && count != 0) {
					System.out.println("��� �� ���� �Ϸ�");
					break;
				}
				else {
					customers.del(cust);
					count++;
					continue;
				}
			} catch (MyException e) {
				break;
			}
		}
	}
	
	public void newDvd() { //5�� �޴�
		while (true) {
			try {
				System.out.println("DVD ������ �Է��ϼ���(ISBN, ����, ������, ������, �帣(1.�׼�,2.�ڹ�,3.�θ�ƽ,4.���,5.��Ÿ) >>");
				String isbn = sc.next();
				String title = sc.next();
				String producer = sc.next();
				String contry = sc.next();
				Genre genre = Genre.ETC; //�帣 ���� Ÿ�� �̿�
				int num = sc.nextInt();
				if (num == 1)
					genre = Genre.Action;
				else if (num == 2)
					genre = Genre.Comic;
				else if (num == 3)
					genre = Genre.Romantic;
				else if (num == 4)
					genre = Genre.Drama;
				else
					genre = Genre.ETC;
				Dvd dvd = new Dvd(isbn, title, new Person(producer), contry, genre);
				if(dvds.selectById(isbn) != null) {
					//ISBN ��ȣ�� �ߺ��Ǿ��� ��� ���� �߻� �� ó��
					throw new MyException("�̹� �����ϴ� ISBN�Դϴ�.");
				}
				else {
					System.out.println("DVD�� ����߽��ϴ�.");
					dvds.add(dvd);
					break;
				}
			} catch (MyException e) {}
		}
	}
	
	//8�� �޴� - DVD ���� �׸�
	public void delDVD() {
		System.out.println("������ DVD�� ������ �Է��ϼ��� >>");
		String delTitle = sc.next();
		Dvd delD = dvds.selectByName(delTitle);
		if(delD == null) {
			//�˻��� ������ DVD�� ���� ��� ���� �߻� �� ó��
			try {
				throw new MyException("ã�� DVD�� �������� �ʽ��ϴ�.");
			} catch (Exception e) {}
		}
		else {
			dvds.del(delD);
			System.out.println("DVD ���� �Ϸ�");
		}
	}
	
	public void rentDvd() { //9�� �޴�
		while(true) { //���̵� �Ǵ� ISBN�� �߸� �Է����� ��� �ٽ� �Է� �޵��� �ݺ�
			try {
			System.out.println("�뿩�� ���ϴ� �� ���̵�� �뿩�� DVD�� ISBN�� �Է��ϼ��� >> ");
	
			String id = sc.next();
			String isbn = sc.next();
			
				Dvd dvd = dvds.selectById(isbn);
				Customer cust = customers.selectById(id);
				if(cust == null) {
					throw new MyException("���̵� �߸��Ǿ����ϴ�.");
				}
				if(dvd == null) {
					throw new MyException("ISBN�� �߸��Ǿ����ϴ�.");
				}
				else {
					RentDvd rentInfo = new RentDvd(cust, dvd);
					try { //�̹� �뿩�� �� DVD�� �ٽ� �뿩�� �� ����
						if(rentDvds.selectById(isbn) != null && rentDvds.selectById(isbn).isReturn() == false) { 
							throw new MyException("�̹� �뿩�� �� DVD�Դϴ�.");
						}
						else {
							rentDvds.add(rentInfo);			
							System.out.println("�뿩�� �Ϸ�Ǿ����ϴ�.");
							break;
						}
					} catch (MyException e) {
						break;
					}
				}
			} catch (MyException e) {}
		}
	}
	
	public void returnDvd() { //10�� �޴�
		try {
			System.out.println("�ݳ��� DVD�� ISBN�� �Է��ϼ��� >> ");

			String isbn = sc.next();
			
			RentDvd rentDvd = rentDvds.selectById(isbn);
			
			if(rentDvd== null) {
				throw new MyException("�뿩���� ���� DVD�Դϴ�.");
			}
			else {
				rentDvd.setReturn();
				System.out.println("�ݳ��� �Ϸ�Ǿ����ϴ�.");
			}
		} catch (MyException e) {
			return;
		}
	}
	
	//12�� �޴� - �ݳ� �Ϸ� ��� ����
	public void delRentDvd() {
		for (int i = 0;i<rentDvds.getCollect().size();i++) {
			if(rentDvds.get(i).isReturn() == true) { //�뿩 ��� �� �ݳ� ���ΰ� true�� ��쿡 ����
				rentDvds.del(rentDvds.get(i));
			}
		}
		System.out.println("�ݳ� �Ϸ�� �׸��� ��� �����߽��ϴ�.");
	}
}
