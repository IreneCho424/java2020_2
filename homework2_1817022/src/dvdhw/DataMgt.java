package dvdhw;

import java.io.Serializable;
import java.util.Vector;

//1817022 ���̸�
/*
 * DataMgt Ŭ����
 * �����͸� �����ϴ� ���ʸ� Ŭ���� (�߻���)
 */

public abstract class DataMgt<T> implements Serializable{

	private Vector<T> collect = new Vector<T>(); //��ü �����ϴ� ���ʸ� ���� ����
	
	public Vector<T> getCollect() { //Ư�� ������ �����ص� ����
		return collect;
	}

	public void add(T item) {
		collect.add(item);
	}
	
	//�÷��ǿ��� �����ϴ� �޼��� �߰� ����
	public void del(T item) {
		collect.remove(item);
	}

	public String showAll() { //��ü ������ �����ִ� �޼���
		int i = 1;
		StringBuilder strBuilder = new StringBuilder();
		
		for(T c: collect) {
			strBuilder.append("[" + (i++) + "] " + c.toString() + "\n");
		}
		
		return strBuilder.toString();
	}

	public T get(int i) {
		return collect.get(i);
	}
	
	public void removeAll() {
		collect.clear();
	}
	
	public abstract T selectByName(String name);
	public abstract T selectById(String id);
	
}
