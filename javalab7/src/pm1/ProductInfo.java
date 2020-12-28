package pm1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//(실습1) 상품의 종류에 따라 정보를 입력 받고 저장된 목록 확인 하는 프로그램 - 기존의 배열이 아닌 가변적 배열로 재정의
//1817022 조이린

public class ProductInfo{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;			//상품의 개수, ID 설정 위해 정의
		ArrayList<Product> product = new ArrayList<Product>();		//상품을 저장할 가변적 배열 정의
		
		
		while(true) {
			System.out.print("상품 추가(1), 모든 상품 조회(2), 모든 상품 삭제(3), 특정 생산자 상품 삭제(4), 끝내기(5)>> ");
			int choice = scan.nextInt();
			if(choice == 1) {			//상품 추가 
					System.out.println();
					System.out.println("상품 종류 책(1), 음악CD(2), 회화책(3)>>");
					int num = scan.nextInt();
					if(num == 1) {			//상품 종류 책 추가
						System.out.print("상품 설명>> ");
						String description = scan.next();
						System.out.print("생산자>>");
						String maker = scan.next();
						System.out.print("가격>>");
						int price = scan.nextInt();
						System.out.print("책 제목>>");
						String title = scan.next();
						System.out.print("저자>>");
						String author = scan.next();
						System.out.print("ISBN>>");
						int ISBN = scan.nextInt();
						
						Book book = new Book(count, description, maker, price);
						book.setTitle(title);
						book.setAuthor(author);
						book.setISBN(ISBN);
						product.add(book);		//정보 저장!!!!
						
						count++;
						continue;
					}
					
					else if(num == 2) {			//상품 종류 음악CD 추가
						System.out.print("상품 설명>> ");
						String description = scan.next();
						System.out.print("생산자>>");
						String maker = scan.next();
						System.out.print("가격>>");
						int price = scan.nextInt();
						System.out.print("앨범 제목>>");
						String title = scan.next();
						System.out.print("가수>>");
						String artist = scan.next();
						
						CompactDisc compactDisc = new CompactDisc(count, description, maker, price);
						compactDisc.setAlbumTitle(title);
						compactDisc.setArtist(artist);
						product.add(compactDisc);
						
						count++;
						continue;
					}
					
					else if(num == 3) {			//상품 종류 회화책 추가
						System.out.print("상품 설명>> ");
						String description = scan.next();
						System.out.print("생산자>>");
						String maker = scan.next();
						System.out.print("가격>>");
						int price = scan.nextInt();
						System.out.print("책 제목>>");
						String title = scan.next();
						System.out.print("저자>>");
						String author = scan.next();
						System.out.print("언어>>");
						String language = scan.next();
						System.out.print("ISBN>>");
						int ISBN = scan.nextInt();
						
						ConversationBook conversationBook = new ConversationBook(count, description, maker, price);
						conversationBook.setLanguage(language);
						conversationBook.setISBN(ISBN);
						conversationBook.setAuthor(author);
						conversationBook.setTitle(title);
						product.add(conversationBook);
						
						count++;
						continue;
					}
				}
			
			else if(choice == 2) {		//모든 상품 조회
				for(int i=0;i<product.size();i++) {
					product.get(i).showInfo();
					System.out.println();
				}
			}
			
			else if(choice == 3) {		//모든 상품 삭제
				product.clear();
				System.out.println("모든 상품을 삭제했습니다!");
			}
			
			else if(choice == 4) {		//특정 생산자 상품 삭제
				System.out.print("삭제할 생산자를 입력 : ");
				String makerDelete = scan.next();
				Iterator<Product> iter = product.iterator();
				int numCount = 0;
				while(iter.hasNext()) {
					Product p = iter.next();
					if(p.getMaker().contentEquals(makerDelete)) {
						iter.remove();
						numCount++;
					}
				}
				if(numCount > 0) {
					System.out.println("상품 " + numCount + "개를 삭제했습니다.");
				}
				else {
					System.out.println("해당 상품이 없습니다.");
				}
				
			}
			
			else if(choice == 5) {		//끝내기
				break;
			}
			
			else {
				System.out.println("잘못 입력했습니다.");
				continue;
			}
		}
		scan.close();
		System.out.println("***THE END***");
	}
}