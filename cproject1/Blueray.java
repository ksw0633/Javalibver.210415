package cproject1;

public class Blueray extends CommonDisk{

	public Blueray() {
		// TODO Auto-generated constructor stub
	}

	public Blueray(String title, int year, String code, int price, int sale, int borrow, String director, String cast,
			int runningTime, int capacity) {
		super(title, year, code, price, sale, borrow, director, cast, runningTime, capacity);
		// TODO Auto-generated constructor stub
	}
	/**
	 * ArraysSort�� �̿��ϱ� ���� ���� �ռ��̴�.
	 */		

	public int compareTo(Object o) {
		Contents other = (Contents)o;
		if(getSale()<other.getSale())
			return -1;
		else if(getSale()>other.getSale())
			return 1;
		else 
			return 0;
	}
}
