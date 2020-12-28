package pm3;

//(실습3) Pair 제너릭 클래스
//1817022 조이린

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
