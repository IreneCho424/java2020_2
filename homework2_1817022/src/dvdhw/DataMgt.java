package dvdhw;

import java.io.Serializable;
import java.util.Vector;

//1817022 조이린
/*
 * DataMgt 클래스
 * 데이터를 저장하는 제너릭 클래스 (추상적)
 */

public abstract class DataMgt<T> implements Serializable{

	private Vector<T> collect = new Vector<T>(); //객체 저장하는 제너릭 벡터 생성
	
	public Vector<T> getCollect() { //특정 정보를 저장해둔 벡터
		return collect;
	}

	public void add(T item) {
		collect.add(item);
	}
	
	//컬렉션에서 제거하는 메서드 추가 생성
	public void del(T item) {
		collect.remove(item);
	}

	public String showAll() { //전체 정보를 보여주는 메서드
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
