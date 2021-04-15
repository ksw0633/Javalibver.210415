//Doc
package cproject1;

public class Doc extends Contents {
	 
	 private String author;
	 private String publisher;
	public Doc() {}

	public Doc(String title, int year, String code, int price, int sale, int borrow, String author, String publisher) {
		super(title, year, code, price, sale, borrow);
		this.author = author;
		this.publisher = publisher;

		}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
