package genericspractice1.classes;

public class Box<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Box(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public Box() {

	}

}
