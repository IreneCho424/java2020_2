package pm3;

//(�ǽ�3) Pair ���ʸ� Ŭ����
//1817022 ���̸�

public class Pair<K, V> {
	K key;
	V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}
