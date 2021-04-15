package cproject1;

public class CommonDisk extends Contents {
//	private String title;
//	private int year;
//	private String code;
//	private int price;
//	public int sale;
//	public int borrow;
	private String director;
	private String cast;
	private int runningTime;
	private int capacity;
	
	public CommonDisk() {}
	public CommonDisk(String title, int year, String code,
			int price, int sale, int borrow,String director, String cast,
			int runningTime,int capacity) {
		super(title, year, code, price, sale, borrow);
		this.director = director;
		this.cast = cast;
		this.runningTime = runningTime;
		this.capacity= capacity;
}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
