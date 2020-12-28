package ex3;

import java.util.HashMap;
import java.util.Scanner;

//(예제3) Hashmap 예제
//1817022 조이린

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> loginData = new HashMap<String, String>();
		
		loginData.put("89123", "김승우");
		loginData.put("04123", "차태현");
		loginData.put("13323", "윤동구");
		
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String name = sc.next();
		
		if(!loginData.containsKey(id)) {
			System.out.println("아이디가 존재하지 않습니다.");
			return;
		};
		
		String val = loginData.get(id);
		if(!val.contentEquals(name)) {
			System.out.println("올바른 사용자가 아닙니다.");
			return;
		}
		sc.close();
	}

}
