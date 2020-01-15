package com.naver;

public class Sum {

	public int num;
	public int val;
	
	Object key1 = this.val;
	
	public Sum() {
		num = 0;
	}

	public Sum(int num) {
		super();
		this.num = num;
	}
	
	public /* synchronized */ void plusNum(int n) { //synchronized block을 이용해야한다.
		synchronized (this) {
			num = num + n; // == num += n;
		}
	}
	
	public /* synchronized */ void plusVal(int n) {  // num은 this, val은 key1
		synchronized (key1) {
			val = val + n;
		}
	}

	public void subNum(int n) {
		synchronized (this) {
			num = num - n;
		}
	}
	
	public void subVal(int n) {
		synchronized (key1) {
			val = val - n;
		}
	}
	
	
}
