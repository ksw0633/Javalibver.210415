package cproject1;

import java.io.IOException;

public interface Bookable {
	
	public void inputBook(String title, int year, String code, int price, int sale, int borrow, String author, String publisher) throws IOException;
	public void outBook(String title, int year, String code, int price, int sale, int borrow, String author, String publisher) throws IOException;
	public void searchBook(String title, int year, String code, int price, int sale, int borrow, String author, String publisher) throws IOException;
	public void sortBook(String title, int year, String code, int price, int sale, int borrow, String author, String publisher) throws IOException;
	public void deleteBook(String title, int year, String code, int price, int sale, int borrow, String author, String publisher) throws IOException;
	
}
