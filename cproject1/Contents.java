//contents
package cproject1;

public abstract class Contents {
	 private String title;
	 private int year;
	 private String code;
	 private int price;
	 private int sale;
	 public int borrow;
//	 //��ü ���� quantity
//	 private int x;
//	 //�뿩 �� ���� borrowOfQuantity
//	 public int y;	 
	 
	 Contents(){}
	 
	 /**
	  * 
	  * @param title	����������	
	  * @param code		�������ڵ�
	  * @param price	����������
	  * @param sale		�������ȸ�����
	  * @param year		���������ǳ⵵
	  * @param borrow	�������뿩����
	  * @param x		��������ü����
	  * @param y		�������������
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
	  *getTitle�� ����  ����ڷ� ���� �Է¹޾Ҵ� ������ �������ݴϴ�. 
	  * @return title ����������
	  */	
	public String getTitle() {
		return title;
	}
	
	
	/**
	 * setTitle�� ����  ����ڷ� ���� �Է¹޾Ҵ� ������ �Է°��� ����մϴ�.
	 * @param title ����������
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	/**
	 * getCode�� ���� ����ڷ� ���� �Է¹޾Ҵ� �ڵ��� �Է°��� �����մϴ�.
	 * @return code �ڵ�
	 */
	public String getCode() {
		return code;
	}
	
	
	/**
	 * setCode�� ���Ͽ� ����ڷ� ���� �Է¹޾Ҵ� �ڵ��� �Է°��� ����մϴ�. 
	 * @param code �ڵ�
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	
	/**
	 * getPrice�� ���� ����ڷ� ���� �Է¹޾Ҵ� �ǸŰ����� �Է°��� �����մϴ�.
	 * @return price
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * setPrice�� ���Ͽ� ����ڷ� ���� �Է¹޾Ҵ� �Ǹűݾ��� �Է°��� ����մϴ�.
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	/**
	 * getYear�� ���Ͽ� ����ڷ� ���� �Է¹޾Ҵ� ��ó⵵�� �Է°��� �����մϴ�.
	 * @return year ��ó⵵
	 */
	public int getYear() {
		return year;
	}
	
	
	/**
	 *setYear�� ���Ͽ� ����ڷ� ���� �Է¹޾Ҵ� ��ó⵵�� �Է°��� ����մϴ�. 
	 * @param year ��� �⵵
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



