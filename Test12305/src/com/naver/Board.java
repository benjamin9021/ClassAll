package com.naver;

public class Board {

	private String article;
	private boolean isOk = false;

	
	public String getArticle() {
	
		if (!isOk) {
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
		isOk  = true;
		
		synchronized (this) {
			notifyAll();
		}
	}
	
}
