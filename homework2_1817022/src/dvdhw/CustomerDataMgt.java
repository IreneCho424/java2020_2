package dvdhw;

import java.io.Serializable;
import java.util.Vector;

//1817022 ���̸�
/*
 * CustomerDataMgt Ŭ����
 * ���� ������ Customer Ÿ���� ���Ϳ� �����ϱ� ���� Ŭ����
 */

public class CustomerDataMgt extends DataMgt<Customer> implements Serializable{
	private Vector<Customer> collect;
	
	public CustomerDataMgt() {
		collect = getCollect();
	}
	
	@Override
	public Customer selectByName(String name) {	//�̸����� ���� �˻��� �� ����� �޼���
	
		if(name.length() == 1) { //���� �Է����� ���
			for(Customer obj : collect) {
				if(name.equals(obj.getName().substring(0, 1))) {
					return obj;
				}
			}
		}
		
		else if(name.length() == 2) { //�̸�(2����)�� �Է����� ���
			for(Customer obj : collect) {
				if(name.equals(obj.getName().substring(1, 3))) {
					return obj;
				}
			}
		}
		return null;
	}


	@Override
	public Customer selectById(String id) { //���̵�� ���� �˻��� �� ����� �޼���
		for(Customer obj : collect) {
			if(id.equals(obj.getLoginId())) {
				return obj;
			}
		}
		
		return null;
	}
	
}
