package cproject1;

import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		DVDHandler dvd = new DVDHandler(); 
		Book b = new Book();
		DVD d = new DVD();
		String title = null; 
		int year = 0;
		String code = null;
		int price = 0;
		int sale = 0;
		int borrow = 0; 
		String director = null;
		String cast = null; 
		int runningTime = 0;
		int capacity = 0;
		dvd.inputDisk(title, year, code, price, sale, borrow, director, cast, runningTime, capacity);
		dvd.outputDisk(title, year, code, price, sale, borrow, director, cast, runningTime, capacity);
		dvd.searchDisk(title, year, code, price, sale, borrow, director, cast, runningTime, capacity);
		
	}

}
