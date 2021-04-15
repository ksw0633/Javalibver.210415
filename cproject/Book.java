package cproject;

import java.util.*;
/**
 * ���� ���� �ý��� �� ������ �ش��ϴ� Ŭ���� �Դϴ�.
 * <br> ���� ������ �����ϱ� ���Ͽ� implements Comparable�� ����մϴ�.
 * @author SHY-702-04
 *
 */

public class Book implements Comparable {
/**
 * �� ������ ����ڰ� �ֵ��� �ϱ� ���Ͽ� Scanner�� ����մϴ�.
 * 
 */
	Scanner s = new Scanner(System.in);
	
	 String bookTitle;
	 String bookAuthor;
	 String bookPublisher;
	 String bookCode;
	 int bookPrice;
	 int bookSale;
	 int bookYear;
	 int borrow;
	/**
	 * ����Ʈ ������
	 */
	Book(){}
	/**
	 * �� ������ ���� �Է°� ����� �޾� ���� ���� ������ �Դϴ�.
	 * @param bookTitle 	å����
	 * @param bookAuthor 	����
	 * @param bookPublisher ���ǻ�
	 * @param bookCode		�ڵ�
	 * @param bookPrice		�Һ��� ����
	 * @param bookSale		�ȸ� ����
	 * @param bookYear		���ǳ⵵
	 * @param borrow		���� ����
	 */
	Book(String bookTitle, String bookAuthor, String bookPublisher, String bookCode, int bookPrice, int bookSale, int bookYear, int borrow)
	{
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.bookCode = bookCode;
		this.bookPrice = bookPrice;
		this.bookSale = bookSale;
		this.bookYear = bookYear;
		this.borrow = borrow;
	}
	
	/**
	 *getBookTitle�� ����  ����ڷ� ���� �Է¹޾Ҵ� ������ �������ݴϴ�. 
	 * @return bookTitle å����
	 */	
	public String getBookTitle() {
		return bookTitle;
	}
	/**
	 * setBookTitle�� ����  ����ڷ� ���� �Է¹޾Ҵ� ������ �Է°��� �����մϴ�.
	 * @param bookTitle
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	/**
	 *getBorrow�� ���� ����ڷ� ���� �Է¹޾Ҵ� ���� ���θ� �������ݴϴ�. 
	 * @return borrow;
	 */	
	public int getBorrow() {
		return borrow;
	}
	/**
	 * setBorrow�� ���Ͽ�  ����ڷ� ���� �Է¹޾Ҵ� ���� ������ �Է°��� �����մϴ�.
	 *@param borrow		���� ����
	 * 
	 */
	public void setBorrow(int borrow) {
		this.borrow = borrow;
	}
	/**
	 *getBookAuthor�� ���� ����ڷ� ���� �Է¹޾Ҵ� ���ڸ� �������ݴϴ�. 
	 * @return bookAuthor ����
	 */
	public String getBookAuthor() {
		return bookAuthor;
	}
	/**
	 * setBookAuthor�� ����  ����ڷ� ���� �Է¹޾Ҵ� ������ �Է°��� �����մϴ�.
	 * @param bookAuthor ����
	 */
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	/**
	 *getBookPublisher�� ����  ����ڷ� ���� �Է¹޾Ҵ� ���ǻ縦 �������ݴϴ�. 
	 * @return bookPublisher ���ǻ�
	 */
	public String getBookPublisher() {
		return bookPublisher;
	}
	/**
	 * setBookPublisher�� ����  ����ڷ� ���� �Է¹޾Ҵ� ���ǻ��� �Է°��� �����մϴ�.
	 * @param bookPublisher ���ǻ�
	 */
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	/**
	 *getBookPrice�� ���� ����ڷ� ���� �Է¹޾Ҵ� ������ �������ݴϴ�. 
	 * @return bookPrice å����
	 */
	public int getBookPrice() {
		return bookPrice;
	}
	/**
	 * setBookPrice�� ����  ����ڷ� ���� �Է¹޾Ҵ� å������ �Է°��� �����մϴ�.
	 * @param bookPrice
	 */
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	/**
	 *getBookSale�� ���� ����ڷ� ���� �Է¹޾Ҵ� �Ǹż����� �������ݴϴ�. 
	 * @return bookSale �Ǹż���
	 */
	public int getBookSale() {
		return bookSale;
	}
	/**
	 *setBookSale�� ���� ����ڷ� ���� �Է¹޾Ҵ� �Ǹż����� �Է°��� �����մϴ�. 
	 * @param bookSale �Ǹż���
	 */
	public void setBookSale(int bookSale) {
		this.bookSale = bookSale;
	}
	/**
	 *getBookYear�� ���� ���� ���θ� �������ݴϴ�. 
	 * @return
	 */
	public int getBookYear() {
		return bookYear;
	}

	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}
	/**
	 *getBorrow�� ���� ���� ���θ� �������ݴϴ�. 
	 * @return
	 */
	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	/**
	 * ArraysSort�� �̿��ϱ� ���� ���� �ռ��̴�.
	 */		
	@Override
	public int compareTo(Object o) {
		Book other = (Book)o;
		if(bookSale<other.bookSale)
			return -1;
		else if(bookSale>other.bookSale)
			return 1;
		else 
			return 0;
	}
	public long getOverdue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}