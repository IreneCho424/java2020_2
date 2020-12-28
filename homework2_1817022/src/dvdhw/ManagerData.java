package dvdhw;

import java.util.*;
import java.util.Map.Entry;

//1817022 조이린
/*
 * ManagerData 클래스
 * 매니저 로그인 기능 - 매니저의 아이디와 비밀번호를 저장한 클래스
 */

public class ManagerData {
	
	//생성자에서 미리 두 개의 데이터를 필드에 넣는다.
	HashMap<String, String> manager = new HashMap<String, String>(){{
		put("admin", "admin1234");
		put("manager", "manager1234");
	}};
	
	//아이디와 비밀번호를 받으면 해당 매니저가 필드에 있는지 검사하여 결과를 반환
	public boolean isManager(String ID, String PW) {
		boolean result = false;
		for (Entry<String, String> obj : manager.entrySet()) {
			if(obj.getKey().contentEquals(ID) && obj.getValue().contentEquals(PW)) {
				result = true;
			}
		}
		return result;
	}
}
