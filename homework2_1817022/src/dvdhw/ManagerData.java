package dvdhw;

import java.util.*;
import java.util.Map.Entry;

//1817022 ���̸�
/*
 * ManagerData Ŭ����
 * �Ŵ��� �α��� ��� - �Ŵ����� ���̵�� ��й�ȣ�� ������ Ŭ����
 */

public class ManagerData {
	
	//�����ڿ��� �̸� �� ���� �����͸� �ʵ忡 �ִ´�.
	HashMap<String, String> manager = new HashMap<String, String>(){{
		put("admin", "admin1234");
		put("manager", "manager1234");
	}};
	
	//���̵�� ��й�ȣ�� ������ �ش� �Ŵ����� �ʵ忡 �ִ��� �˻��Ͽ� ����� ��ȯ
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
