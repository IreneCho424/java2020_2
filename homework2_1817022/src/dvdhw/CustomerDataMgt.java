package dvdhw;

import java.io.Serializable;
import java.util.Vector;

//1817022 조이린
/*
 * CustomerDataMgt 클래스
 * 고객의 정보를 Customer 타입의 벡터에 저장하기 위한 클래스
 */

public class CustomerDataMgt extends DataMgt<Customer> implements Serializable{
	private Vector<Customer> collect;
	
	public CustomerDataMgt() {
		collect = getCollect();
	}
	
	@Override
	public Customer selectByName(String name) {	//이름으로 고객을 검색할 때 사용할 메서드
	
		if(name.length() == 1) { //성을 입력했을 경우
			for(Customer obj : collect) {
				if(name.equals(obj.getName().substring(0, 1))) {
					return obj;
				}
			}
		}
		
		else if(name.length() == 2) { //이름(2글자)을 입력했을 경우
			for(Customer obj : collect) {
				if(name.equals(obj.getName().substring(1, 3))) {
					return obj;
				}
			}
		}
		return null;
	}


	@Override
	public Customer selectById(String id) { //아이디로 고객을 검색할 때 사용할 메서드
		for(Customer obj : collect) {
			if(id.equals(obj.getLoginId())) {
				return obj;
			}
		}
		
		return null;
	}
	
}
