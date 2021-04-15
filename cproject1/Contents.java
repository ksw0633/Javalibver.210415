//contents
package cproject1;

public abstract class Contents {
	 private String title;
	 private int year;
	 private String code;
	 private int price;
	 private int sale;
	 public int borrow;
//	 //전체 수량 quantity
//	 private int x;
//	 //대여 후 수량 borrowOfQuantity
//	 public int y;	 
	 
	 Contents(){}
	 
	 /**
	  * 
	  * @param title	컨텐츠제목	
	  * @param code		컨텐츠코드
	  * @param price	컨텐츠가격
	  * @param sale		컨텐츠팔린수량
	  * @param year		컨텐츠출판년도
	  * @param borrow	컨텐츠대여여부
	  * @param x		컨텐츠전체수량
	  * @param y		컨텐츠현재수량
	  */
	 
	 Contents(String title, int year,String code, int price, int sale, int borrow){
//			 ,int x,int y){
		 this.title = title;
		 this.year = year;
		 this.code = code;
		 this.price = price;
		 this.setSale(sale);
		 this.borrow = borrow;
//		 this.x = x;
//		 this.y = y;
	 }
	 
	 
	 /**
	  *getTitle을 통해  사용자로 부터 입력받았던 제목을 리턴해줍니다. 
	  * @return title 컨텐츠제목
	  */	
	public String getTitle() {
		return title;
	}
	
	
	/**
	 * setTitle을 통해  사용자로 부터 입력받았던 제목의 입력값을 출력합니다.
	 * @param title 컨텐츠제목
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	/**
	 * getCode를 통해 사용자로 부터 입력받았던 코드의 입력값을 리턴합니다.
	 * @return code 코드
	 */
	public String getCode() {
		return code;
	}
	
	
	/**
	 * setCode를 통하여 사용자로 부터 입력받았던 코드의 입력값을 출력합니다. 
	 * @param code 코드
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	
	/**
	 * getPrice를 통해 사용자로 부터 입력받았던 판매가격의 입력값을 리턴합니다.
	 * @return price
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * setPrice를 통하여 사용자로 부터 입력받았던 판매금액의 입력값을 출력합니다.
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	/**
	 * getYear를 통하여 사용자로 부터 입력받았던 출시년도의 입력값을 리턴합니다.
	 * @return year 출시년도
	 */
	public int getYear() {
		return year;
	}
	
	
	/**
	 *setYear를 통하여 사용자로 부터 입력받았던 출시년도의 입력값을 출력합니다. 
	 * @param year 출시 년도
	 */
	public void setYear(int year) {
		this.year = year;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}
	/**
	 * ArraysSort를 이용하기 위한 내장 합수이다.
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



