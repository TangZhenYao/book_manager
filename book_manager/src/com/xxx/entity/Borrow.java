package com.xxx.entity;

public class Borrow {
	private int id;
	private int book_id;
	private String borrowtime;
	private String returntime;
	@Override
	public String toString() {
		return "ProductBorrow [id=" + id + ", book_id=" + book_id + ", borrowtime=" + borrowtime + ", returntime="
				+ returntime + "]";
	}
	public Borrow(int id, int book_id, String borrowtime, String returntime) {
		super();
		this.id = id;
		this.book_id = book_id;
		this.borrowtime = borrowtime;
		this.returntime = returntime;
	}
	public Borrow() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBorrowtime() {
		return borrowtime;
	}
	public void setBorrowtime(String borrowtime) {
		this.borrowtime = borrowtime;
	}
	public String getReturntime() {
		return returntime;
	}
	public void setReturntime(String returntime) {
		this.returntime = returntime;
	}

}
