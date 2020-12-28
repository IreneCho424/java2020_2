package pm1;
import java.util.InputMismatchException;
import java.util.Scanner;

//(�ǽ�1) ���� ĳ���� ����� ���α׷�
//1817022 ���̸�

public class Game{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Character c = null;
		
		int a = 0;			//�� ���� while ���� �������� ���� ���� �Ű�ü
		
		while(a == 0) {
			try {
				System.out.println("ĳ���͸� �����ϼ���.");
				System.out.println("1.������   2.�ü�   3.������   4.���"); 
				int choice = sc.nextInt(); //���ڸ� �Է����� ���� ��� exception �߻�
				if(choice > 4) {
					System.out.println("1������ 4�� �߿��� �����ϼ���");
					continue;
				}
				switch(choice) {	//������ ĳ���Ϳ� ���� ��ü ���� �� �ɷ� ���
				case(1):
					c = new Monk();
					c.setCharName("Monk");
					break;
				case(2):
					c = new Archer();
					c.setCharName("Archer");
					break;
				case(3):
					c = new Wizard();
					c.setCharName("Wizard");
					break;
				case(4):
					c = new Knight();
					c.setCharName("Knight");
					break;
				}
				
				if(0<choice && choice < 5) {
					c.characterSkill();
					c.appendCharacter();
				}
				
				while(true) {
					System.out.println("ĳ���͸� �����ϰڽ��ϱ�?");
					String ans = sc.next();
					
					if(ans.contentEquals("Y") || ans.contentEquals("y"))
						break;		//a�� 0�� ���¿��� �ι�° while���� ������ ��
					else if(ans.contains("N") || ans.contentEquals("n")) {
						System.out.println("������ �����߽��ϴ�.");
						a=1;
						break;		//�ι�° while�� ���� �� a�� 1�̹Ƿ� ù���� while���� �ش����. ���α׷� ����
					}
					else {
						System.out.println("y/n �߿� �Է��ϼ���");		//�ι�° while������ ���ư�
					}
				}
			}
			catch(InputMismatchException e){
				sc = new Scanner(System.in);
				System.out.println("���ڸ� �Է��ϼ���!");
			}
		}
		
		sc.close();
	}
}
