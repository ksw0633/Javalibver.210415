package cproject1;

import java.io.IOException;

public interface Diskable {
	public void inputDisk(String title, int year, String code, int price, int sale, int borrow, String director, String cast,
			int runningTime, int capacity) throws IOException;
	public void outputDisk(String title, int year, String code, int price, int sale, int borrow, String director, String cast,
			int runningTime, int capacity) throws IOException;
	public void searchDisk(String title, int year, String code, int price, int sale, int borrow, String director, String cast,
	int runningTime, int capacity);
	
	public void sortDisk(String title, int year, String code, int price, int sale, int borrow, String director, String cast,
			int runningTime, int capacity) throws IOException;
	
	public void deleteDisk(String title, int year, String code, int price, int sale, int borrow, String director, String cast,
			int runningTime, int capacity) throws IOException;

}