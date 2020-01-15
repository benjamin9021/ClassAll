package kr.co.ca;

public class Test2<K,V> { // <>안에 키워드는 유니크, 다른 것이 있으면 안된다.

	private K a;
	private V b;
	
	public Test2() {
		// TODO Auto-generated constructor stub
	}

	public Test2(K a, V b) {
		super();
		this.a = a;
		this.b = b;
	}

	public K getA() {
		return a;
	}

	public void setA(K a) {
		this.a = a;
	}

	public V getB() {
		return b;
	}

	public void setB(V b) {
		this.b = b;
	}
	
	
	
	
}
