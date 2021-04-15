package cproject1;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Pattern;

public class BluerayHandler implements Diskable{
	Scanner s;
	Vector<Blueray> blueV = new Vector<Blueray>();
	Blueray blue = new Blueray();
//	BufferedWriter bluew = new BufferedWriter(new FileWriter("inputBlueray.txt", true));
//	BufferedReader bluer = new BufferedReader(new InputStreamReader(System.in));
	BluerayHandler (){
		s = new Scanner(System.in);
	}
	@Override
		public void inputDisk(String title, int year, String code, int price, int sale, int borrow, String director, String cast,
		int runningTime, int capacity) throws IOException{
			
			String sPattern = "^[a-zA-Z0-9°¡-ÆR\\s]*$";
			int retry = MenuNum.no;
			boolean regex;
			
			do {
	//Á¦¸ñ
				
	            System.out.print("Á¦¸ñ : ");
	            title = s.nextLine();
//	            dw.write("Á¦¸ñ: " + title + ",");
	            regex = Pattern.matches(sPattern, title);
	            if (regex != true) {
	               System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	               break;
	            }
	           
	            
	//³âµµ           
	            
	            System.out.print("Ãâ½Ã¿¬µµ : ");
	            year = MenuNum.num0;
	            if (!s.hasNextInt() || (year = s.nextInt()) < MenuNum.num0) {
	            	System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	            	break;
	            }
//	            dw.write("Ãâ½Ã¿¬µµ : " + year + ",");
	         
//ÄÚµå
	            
	            System.out.print("ÄÚµå : ");
	            code = s.nextLine();
//	            dw.write("ÄÚµå: " + code + ",");            
	            regex = Pattern.matches(sPattern, code);
	            if (regex != true) {
	            	System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	            	break;
	            }
	//°¡°Ý 
	            System.out.print("°¡°Ý : ");
	            price = MenuNum.num0;
	            if (!s.hasNextInt() || (price = s.nextInt()) < MenuNum.num0) {
	               System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	               break;
	            }
//	            dw.write("°¡°Ý: " + price + ",");

//ÆÇ¸Å·®
	            System.out.print("ÆÇ¸Å·® : ");
	            sale = MenuNum.num0;
	            if (!s.hasNextInt() || (sale = s.nextInt()) < MenuNum.num0) {
	               System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	               break;
	            }
//	            dw.write("ÆÇ¸Å·®: " + sale + ",");
	            
	 //°¨µ¶
	            System.out.print("°¨µ¶ : ");
	             director = s.nextLine();
//	            dw.write("°¨µ¶ :  " + direction + ",");            
	            regex = Pattern.matches(sPattern, director);
	            if (regex != true) {
	               System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	               break;
	            }

	 //String cast, int capacity, int runningTime) {

	            System.out.print("¹è¿ì : ");
	            cast = s.nextLine();
//	            dw.write("ÃâÆÇ»ç: " + cast + ",");
	            regex = Pattern.matches(sPattern, cast);
	            if (regex != true) {
	               System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	               break;
	            }
//¿ë·®
	            System.out.print("¿ë·® : ");
	            capacity = MenuNum.num0;
	            if (!s.hasNextInt() || (capacity = s.nextInt()) < MenuNum.num0) {
	               System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	               break;
	            }
//	            dw.write("¿ë·®: " + capacity + ",");
	            
//·¯´×Å¸ÀÓ
	            System.out.print("·¯´×Å¸ÀÓ : ");
	            runningTime = MenuNum.num0;
	            if (!s.hasNextInt() || (runningTime = s.nextInt()) < MenuNum.num0) {
	               System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	               break;
	            }
//	            dw.write("·¯´×Å¸ÀÓ: " + runningTime);
	            
	            s.nextLine();

	            borrow = MenuNum.num0;
//	            bw.write("´ë¿© Á¤º¸ : 0");
//	            bw.newLine();

	            
	            
	            blue.setTitle(title);
	            blue.setYear(year);
	            blue.setCode(code);
	            blue.setPrice(price);
//	            blue.sale = sale;
//	            blue.borrow = borrow;
	            blue.setDirector(director);
	            blue.setCast(cast);
	            blue.setCapacity(capacity);
	            blue.setRunningTime(runningTime);
	            

	            blueV.add(new Blueray(title, year, code, price, sale, borrow, director, cast, capacity, runningTime));

	            System.out.println("¶Ç ÀÔ·ÂÇÏ½Ã°Ú¾î¿ä? yes..1 no..0");
	            retry = s.nextInt();
	            if (retry == MenuNum.num0) {
	               //dw.close();
	               break;
	            }
	            s.nextLine();
	         } while (retry != MenuNum.num0);
	      }
	@Override
	public void outputDisk(String title, int year, String code, int price, int sale, int borrow, String director, String cast,
			int runningTime, int capacity) throws IOException{
		
	}
	@Override
	public void searchDisk(String title, int year, String code, int price, int sale, int borrow, String director,
			String cast, int runningTime, int capacity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortDisk(String title, int year, String code, int price, int sale, int borrow, String director, String cast,
			int runningTime, int capacity) throws IOException{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteDisk(String title, int year, String code, int price, int sale, int borrow, String director, String cast,
			int runningTime, int capacity) throws IOException{
		// TODO Auto-generated method stub
		
	}

}
