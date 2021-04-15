package cproject1;


public class Book extends Doc {
//	 //전체 수량 quantity
//	 private int x;
//	 //대여 후 수량 borrowOfQuantity
//	 public int y;
	
	public Book() {}

	public Book(String title, int year, String code, int price, int sale, int borrow, String author, String publisher) {
//			,int x, int y) {
		super(title, year, code, price, sale, borrow, author, publisher);
//		this.x = x;
//		this.y = y;
	}

	public int getBorrow() {
		return borrow;
	}

	public void setBorrow(int borrow) {
		super.borrow = borrow;
	}

//	public int getX() {
//		return x;
//	}
//
//	public void setX(int x) {
//		this.x = x;
//	}

}
