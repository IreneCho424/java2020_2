package pm7;

//(실습7) 음의 순서 판별
//1817022 조이린

import java.util.Scanner;
public class Order {
	public static void main(String[] args) {
		System.out.println("끝내려면 0 입력\n");
		Scanner sc = new Scanner(System.in);
		int array[] = new int[100];
		int num;
		int count = 0;
		while(true) {
			num = sc.nextInt();
			if (num == 0) break;
			else {
				array[count] = num;
				count++;
			}
		}
		int check = 0;
		System.out.println(count);
		if (array[0] > array[1]) {
			for(int i = 0; i < count-1; i++) {
				if(array[i] > array[i+1]) {
					check--;
				}
				else {
					check = 0;
					break;
				}
			}
		}
		else if(array[0] < array[1]) {
			for(int i = 0; i < count-1; i++) {
				if(array[i] < array[i+1]) {
					check++;
				}
				else {
					check = 0;
					break;
				}
			}
		}
		if(check == 0) {
			System.out.println("mixed\n");
		}
		else if(check < 0) {
			System.out.println("descending\n");
		}
		else if(check > 0) {
			System.out.println("ascending\n");
		}
		
		
		
		
		
		
	/*	
		for(int i = 0; i < count; i++) {
			 {
				int max = array[0];
				for(int j = i; j < count; j++) {
					if(array[j] > max) {
						System.out.println("mixed\n");
						break;
					}
					else continue;
				}
			}
			else if(array[0] < array[1]) {
				int min = array[0];
				for(int j=i;j<count;j++) {
					if(array[j] < min) {
						System.out.println("mixed\n");
						break;
					}
					else
						System.out.println("ascending\n");
				}
			}
		}
		*/
		sc.close();
	}
}