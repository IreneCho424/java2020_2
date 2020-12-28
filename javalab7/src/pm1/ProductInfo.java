package pm1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//(�ǽ�1) ��ǰ�� ������ ���� ������ �Է� �ް� ����� ��� Ȯ�� �ϴ� ���α׷� - ������ �迭�� �ƴ� ������ �迭�� ������
//1817022 ���̸�

public class ProductInfo{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;			//��ǰ�� ����, ID ���� ���� ����
		ArrayList<Product> product = new ArrayList<Product>();		//��ǰ�� ������ ������ �迭 ����
		
		
		while(true) {
			System.out.print("��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ��� ��ǰ ����(3), Ư�� ������ ��ǰ ����(4), ������(5)>> ");
			int choice = scan.nextInt();
			if(choice == 1) {			//��ǰ �߰� 
					System.out.println();
					System.out.println("��ǰ ���� å(1), ����CD(2), ȸȭå(3)>>");
					int num = scan.nextInt();
					if(num == 1) {			//��ǰ ���� å �߰�
						System.out.print("��ǰ ����>> ");
						String description = scan.next();
						System.out.print("������>>");
						String maker = scan.next();
						System.out.print("����>>");
						int price = scan.nextInt();
						System.out.print("å ����>>");
						String title = scan.next();
						System.out.print("����>>");
						String author = scan.next();
						System.out.print("ISBN>>");
						int ISBN = scan.nextInt();
						
						Book book = new Book(count, description, maker, price);
						book.setTitle(title);
						book.setAuthor(author);
						book.setISBN(ISBN);
						product.add(book);		//���� ����!!!!
						
						count++;
						continue;
					}
					
					else if(num == 2) {			//��ǰ ���� ����CD �߰�
						System.out.print("��ǰ ����>> ");
						String description = scan.next();
						System.out.print("������>>");
						String maker = scan.next();
						System.out.print("����>>");
						int price = scan.nextInt();
						System.out.print("�ٹ� ����>>");
						String title = scan.next();
						System.out.print("����>>");
						String artist = scan.next();
						
						CompactDisc compactDisc = new CompactDisc(count, description, maker, price);
						compactDisc.setAlbumTitle(title);
						compactDisc.setArtist(artist);
						product.add(compactDisc);
						
						count++;
						continue;
					}
					
					else if(num == 3) {			//��ǰ ���� ȸȭå �߰�
						System.out.print("��ǰ ����>> ");
						String description = scan.next();
						System.out.print("������>>");
						String maker = scan.next();
						System.out.print("����>>");
						int price = scan.nextInt();
						System.out.print("å ����>>");
						String title = scan.next();
						System.out.print("����>>");
						String author = scan.next();
						System.out.print("���>>");
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
			
			else if(choice == 2) {		//��� ��ǰ ��ȸ
				for(int i=0;i<product.size();i++) {
					product.get(i).showInfo();
					System.out.println();
				}
			}
			
			else if(choice == 3) {		//��� ��ǰ ����
				product.clear();
				System.out.println("��� ��ǰ�� �����߽��ϴ�!");
			}
			
			else if(choice == 4) {		//Ư�� ������ ��ǰ ����
				System.out.print("������ �����ڸ� �Է� : ");
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
					System.out.println("��ǰ " + numCount + "���� �����߽��ϴ�.");
				}
				else {
					System.out.println("�ش� ��ǰ�� �����ϴ�.");
				}
				
			}
			
			else if(choice == 5) {		//������
				break;
			}
			
			else {
				System.out.println("�߸� �Է��߽��ϴ�.");
				continue;
			}
		}
		scan.close();
		System.out.println("***THE END***");
	}
}