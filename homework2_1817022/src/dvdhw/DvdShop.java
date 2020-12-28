package dvdhw;

import java.util.Scanner;

//1817022 조이린
/*
 * DvdShop 클래스
 * DVD 관리자 프로그램 전체의 시작 main함수 포함 클래스
 */

public class DvdShop {
	private static Scanner sc = new Scanner(System.in);	//사용자의 입력값 받기

	private static CustomerDataMgt customers = new CustomerDataMgt(); //고객 정보 저장
	private static DvdDataMgt dvds = new DvdDataMgt();				   //Dvd 정보 저장
	private static RentDvdDataMgt rentDvds = new RentDvdDataMgt();	   //대여한 Dvd 정보 저장

	public static void main(String[] args) {	//전체 프로그램 시작 메인
		
		DvdShop dvdShop = new DvdShop();
		dvdShop.start();
	}
	
	public void start() {
		decoConsole(true, "=");
		System.out.println("조이린 DVD Shop"); //<== 본인의 이름으로 변경할 것 (예: 나이화 DVD Shop) 
		decoConsole(false, "=");

		//프로그램이 시작될 때 데이터 넣기
		try {
			customers = DataFile.readCustomersData();
			System.out.println(customers.toString());
			dvds = DataFile.readDvdsData();
			rentDvds = DataFile.readRentDvdsData();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//관리자 로그인 확인 - 최대 세 번까지 입력 받는다.
		int count = 0;	//로그인 시도 횟수
		while(count<3) {
			System.out.println("아이디 입력 >> ");
			String ID = sc.next();
			System.out.println("비밀번호 입력 >> ");
			String PW = sc.next();
		
			ManagerData man = new ManagerData();
			if(man.isManager(ID, PW)) {
				System.out.println("로그인 성공. 프로그램 시작");
				break;
			}
			else {
				System.out.println("로그인 실패. 다시 입력하세요");
				count++;
			}
		}
		if(count == 3) {
			System.out.println("로그인 3회 실패. 프로그램을 종료합니다.");
			return;
		}
		
		//로그인 성공시 넘어가는 화면
		while (true) {
			System.out.println();
			
			int menu = showMenu();
			if (menu == 0) {
				//프로그램을 종료할 때 정보를 파일에 저장한다.
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
			System.out.println("=============================메뉴===============================");
			System.out.println("(0) 종료 (1) 신규가입 (2) 고객검색 (3) 전체고객검색 (4) 고객삭제");
			System.out.println("_______________________________________________________________");
			System.out.println("(5) DVD 등록 (6) DVD 검색 (7) DVD 전체검색  (8) Dvd 삭제");
			System.out.println("_______________________________________________________________");
			System.out.println("(9) DVD 대여 (10) DVD 반납 (11) 대여 목록 전체검색 (12) 반납 완료 대여 목록 삭제");
			System.out.println("_______________________________________________________________");

			System.out.print("메뉴를 선택하세요 >> ");

			try {
				menu = Integer.parseInt(sc.next());
				if (0 <= menu && menu <= 12)	//0번부터 12번 사이의 번호를 입력 받아 다음으로 진행
					break;
				else {
					//그 외의 숫자를 입력했을 경우의 예외 처리
					throw new MyException("0부터 12 사이의 숫자를 입력하세요");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
			} catch (MyException e) {}
		}

		System.out.println();
		return menu;
	}

	public static void decoConsole(boolean pre, String deco) { //어떤 프로그램인지 알려주는 부분
		if (pre)
			System.out.println();

		for (int i = 0; i < 30; i++)
			System.out.print(deco);

		System.out.println();
		if (!pre)
			System.out.println();
	}
	
	//3번 메뉴
	private void customersShowAll() {
		String str = customers.showAll(); 
		System.out.println(str);
	}

	//7번 메뉴
	private void dvdsShowAll() {
		String str = dvds.showAll(); 
		System.out.println(str);
	}

	//11번 메뉴
	private void rentDvdsShowAll() { 
		String str = rentDvds.showAll(); 
		System.out.println(str);
	}

	//2번 메뉴
	private void searchCustomer() { 
		System.out.println("검색할 고객 이름을 입력세요 >>");

		String name = sc.next();
		Customer cust = customers.selectByName(name);
		
		try {
			if(cust == null) {
				throw new MyException("고객 정보가 없습니다.");
			}
			else System.out.println("\n결과>> " + cust.toString());
		} catch (MyException e) {}
		
	}
	
	private void searchDvd() { //6번 메뉴
		System.out.println("검색할 Dvd 제목을 입력세요 >>");

		String title = sc.next();
		Dvd dvd = dvds.selectByName(title);
		
		if(dvd == null) System.out.println("Dvd 정보가 없습니다.");
		else System.out.println("\n결과>> " + dvd.toString());
		
	}

	public void newCustomer() { //1번 메뉴
		while(true) {
			try {
				System.out.println("고객 정보를 입력하세요(이름, 출생년도, 아이디, 주소, 전화번호 순으로 입력) >>");
	
				String name = sc.next();
				int year = sc.nextInt();
				String id = sc.next();
				String addr = sc.next();
				String phone = sc.next();
	
				Customer cust = new Customer(name, year, id, addr, phone);
					if(customers.selectById(id) != null) {
						//이미 존재하는 아이디의 경우 중복임을 알리고 예외 발생 및 처리
						throw new MyException("이미 존재하는 아이디입니다.");
					}
					else {
						customers.add(cust);
						System.out.println("신규 고객을 등록했습니다.");
						break;
					}
			} catch (MyException e) {}
		}
	}
		
	//4번 메뉴 - 고객 삭제 항목
	public void delCustomer() {
		System.out.println("삭제할 고객 이름을 입력하세요 >> ");
		String delCust = sc.next();
		int count = 0; //동일한 이름의 모든 고객 삭제하기 위한 카운트
		while(true) {
			try {
				Customer cust = customers.selectByName(delCust);
				if (cust == null && count == 0) {
					//검색한 고객이 없을 경우 예외 발생
					throw new MyException("고객 정보가 없습니다.");
				}
				else if(cust == null && count != 0) {
					System.out.println("모든 고객 삭제 완료");
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
	
	public void newDvd() { //5번 메뉴
		while (true) {
			try {
				System.out.println("DVD 정보를 입력하세요(ISBN, 제목, 제작자, 제조국, 장르(1.액션,2.코믹,3.로맨틱,4.드라마,5.기타) >>");
				String isbn = sc.next();
				String title = sc.next();
				String producer = sc.next();
				String contry = sc.next();
				Genre genre = Genre.ETC; //장르 열거 타입 이용
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
					//ISBN 번호가 중복되었을 경우 예외 발생 및 처리
					throw new MyException("이미 존재하는 ISBN입니다.");
				}
				else {
					System.out.println("DVD를 등록했습니다.");
					dvds.add(dvd);
					break;
				}
			} catch (MyException e) {}
		}
	}
	
	//8번 메뉴 - DVD 삭제 항목
	public void delDVD() {
		System.out.println("삭제할 DVD의 제목을 입력하세요 >>");
		String delTitle = sc.next();
		Dvd delD = dvds.selectByName(delTitle);
		if(delD == null) {
			//검색한 제목의 DVD가 없는 경우 예외 발생 및 처리
			try {
				throw new MyException("찾는 DVD가 존재하지 않습니다.");
			} catch (Exception e) {}
		}
		else {
			dvds.del(delD);
			System.out.println("DVD 삭제 완료");
		}
	}
	
	public void rentDvd() { //9번 메뉴
		while(true) { //아이디 또는 ISBN을 잘못 입력했을 경우 다시 입력 받도록 반복
			try {
			System.out.println("대여를 원하는 고객 아이디와 대여할 DVD의 ISBN을 입력하세요 >> ");
	
			String id = sc.next();
			String isbn = sc.next();
			
				Dvd dvd = dvds.selectById(isbn);
				Customer cust = customers.selectById(id);
				if(cust == null) {
					throw new MyException("아이디가 잘못되었습니다.");
				}
				if(dvd == null) {
					throw new MyException("ISBN이 잘못되었습니다.");
				}
				else {
					RentDvd rentInfo = new RentDvd(cust, dvd);
					try { //이미 대여가 된 DVD를 다시 대여할 수 없음
						if(rentDvds.selectById(isbn) != null && rentDvds.selectById(isbn).isReturn() == false) { 
							throw new MyException("이미 대여가 된 DVD입니다.");
						}
						else {
							rentDvds.add(rentInfo);			
							System.out.println("대여가 완료되었습니다.");
							break;
						}
					} catch (MyException e) {
						break;
					}
				}
			} catch (MyException e) {}
		}
	}
	
	public void returnDvd() { //10번 메뉴
		try {
			System.out.println("반납할 DVD의 ISBN을 입력하세요 >> ");

			String isbn = sc.next();
			
			RentDvd rentDvd = rentDvds.selectById(isbn);
			
			if(rentDvd== null) {
				throw new MyException("대여되지 않은 DVD입니다.");
			}
			else {
				rentDvd.setReturn();
				System.out.println("반납이 완료되었습니다.");
			}
		} catch (MyException e) {
			return;
		}
	}
	
	//12번 메뉴 - 반납 완료 목록 삭제
	public void delRentDvd() {
		for (int i = 0;i<rentDvds.getCollect().size();i++) {
			if(rentDvds.get(i).isReturn() == true) { //대여 목록 중 반납 여부가 true일 경우에 삭제
				rentDvds.del(rentDvds.get(i));
			}
		}
		System.out.println("반납 완료된 항목을 모두 삭제했습니다.");
	}
}
