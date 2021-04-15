package cproject1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Pattern;

public class DVDHandler implements Diskable {

	   Vector<DVD> dv = new Vector<DVD>();
	   DVD d = new DVD();
	   int dvdCnt = MenuNum.num0;
//	   User u = new User();
	   Scanner s;
	DVDHandler(){
		s= new Scanner(System.in);
	}
	@Override

	public void inputDisk(String title, int year, String code, int price, int sale, int borrow, String director,
			String cast, int runningTime, int capacity)throws IOException {
		BufferedWriter dw = new BufferedWriter(new FileWriter("stockDVD.txt", true));
	    BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
	       
	       
	       String sPattern = "^[a-zA-Z0-9°¡-ÆR\\s]*$";
	       int retry = MenuNum.num0;
	       boolean regex;

	       do {


	    	 //title
	    	 System.out.print("Á¦¸ñ : ");
	    	 	          title = s.nextLine();
	    	 	          dw.write("Á¦¸ñ: " + title + ",");
	    	 	          regex = Pattern.matches(sPattern, title);
	    	 	          if (regex != true) {
	    	 	             System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	    	 	             break;
	    	 	          }

	    	 //°³ºÀ¿¬µµ
	    	 System.out.print("°³ºÀ ¿¬µµ : ");
	    	 	          year = MenuNum.num0;
	    	 	          if (!s.hasNextInt() || (year = s.nextInt()) < MenuNum.num0) {
	    	 	             System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	    	 	             break;
	    	 	          }
	    	 	          dw.write("°³ºÀ ¿¬µµ : " + year + ",");

	    	 //code
	    	 System.out.print("ÄÚµå : ");
	    	 	         code = s.nextLine();
	    	 	          dw.write("ÄÚµå : " + code+ ",");
	    	 	          regex = Pattern.matches(sPattern, code);
	    	 	          if (regex != true) {
	    	 	             System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	    	 	             break;
	    	 	          }
	    	 //price
	    	 System.out.print("ÆÇ¸Å°¡ : ");
	    	 	          price = MenuNum.num0;
	    	 	          if (!s.hasNextInt() || (price = s.nextInt()) < MenuNum.num0) {
	    	 	             System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	    	 	             break;
	    	 	          }
	    	 	          dw.write("ÆÇ¸Å°¡ : " + price + ",");

	    	 //sale
	    	 System.out.print("ÆÇ¸Å·® : ");
	    	 	          sale = MenuNum.num0;
	    	 	          if (!s.hasNextInt() || (sale = s.nextInt()) < MenuNum.num0) {
	    	 	             System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	    	 	             break;
	    	 	          }
	    	 	          dw.write("ÆÇ¸Å·® : " + sale + ",");


	    	 //director
	    	 System.out.print("°¨µ¶ : ");
	    	 	          director = s.nextLine();
	    	 	          dw.write("°¨µ¶ : " + director + ",");
	    	 	          regex = Pattern.matches(sPattern, director);
	    	 	          if (regex != true) {
	    	 	             System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	    	 	             break;
	    	 	          }
	    	 //cast
	    	 System.out.print("¹è¿ì : ");
	    	 	          cast = s.nextLine();
	    	 	          dw.write(" ¹è¿ì : " + cast + ",");
	    	 	          regex = Pattern.matches(sPattern, cast);
	    	 	          if (regex != true) {
	    	 	             System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	    	 	             break;
	    	 	          }
	    	 
	    	 //runningTime
	    	 System.out.print("·¯´×Å¸ÀÓ : ");
	    	 	          runningTime = MenuNum.num0;
	    	 	          if (!s.hasNextInt() || (runningTime = s.nextInt()) < MenuNum.num0) {
	    	 	             System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	    	 	             break;
	    	 	          }
	    	 	          dw.write("ÆÇ¸Å°¡ : " + borrow + ",");
	    	 //price
	    	 System.out.print("ÆÇ¸Å°¡ : ");
	    	 	          price = MenuNum.num0;
	    	 	          if (!s.hasNextInt() || (price = s.nextInt()) < MenuNum.num0) {
	    	 	             System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	    	 	             break;
	    	 	          }
	    	 	          dw.write("ÆÇ¸Å°¡ : " + price + ",");

	          

	          s.nextLine();

	          borrow = MenuNum.num0;
	          dw.write("´ë¿© Á¤º¸ : 0");
	          dw.newLine();
	          
	          dv.add(new DVD(title, year, code, price, sale, borrow, director, cast, runningTime, capacity));

	          System.out.println("¶Ç ÀÔ·ÂÇÏ½Ã°Ú¾î¿ä? yes..1 no..0");
	          retry = s.nextInt();
	          if (retry == MenuNum.num0) {
	             dw.close();
	             break;
	          }
	          s.nextLine();
	       } while (retry != MenuNum.num0);
	    }

	@Override
	public void outputDisk(String title, int year, String code, int price, int sale, int borrow, String director,
			String cast, int runningTime, int capacity) throws IOException{
		File file =new File("stockDVD.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void searchDisk(String title, int year, String code, int price, int sale, int borrow, String director,
			String cast, int runningTime, int capacity) {
	      

		         System.out.print("¿øÇÏ´Â ´ë»óÀÇ Á¤º¸¸¦ ÀÔ·ÂÇÏ¼¼¿ä  : ");
		         String searchD = s.nextLine();    

		         File file = new File("stockDVD.txt");
		         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		            String line;
		            while ((line = br.readLine()) != null) {
		               if(line.contains(searchD))   
		                  System.out.println(line);
		            }
		         } catch (IOException e) {
		            e.printStackTrace();
		           
		        }  
	
	}

	@Override
	public void sortDisk(String title, int year, String code, int price, int sale, int borrow, String director,
			String cast, int runningTime, int capacity) {
		System.out.println("µî·Ï ³»¸²Â÷¼ø Á¤·Ä");
//	      Collections.sort(dv);
	      
	      System.out.println();
	      
	      for(int i = 0; i<dv.size();i++)
	      {
	         System.out.println("Á¦¸ñ : " + dv.get(i).getTitle()+ "," +(i+1) + "À§ : " + dv.get(i).compareTo(sale));
	      }
	   }
		
	

	@Override
	public void deleteDisk(String title, int year, String code, int price, int sale, int borrow, String director,
			String cast, int runningTime, int capacity) throws IOException {
		System.out.print("»èÁ¦ÇÒ Ã¥ Á¦¸ñÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");     
	      String deleteDVD = s.nextLine();
	   
	     for (int i=0; i<dv.size(); i++) {
	         if (dv.get(i) == null) {
		            System.out.println("null°ªÀÔ´Ï´Ù.");
		         }
		         else if (deleteDVD.equals(dv.get(i))) {
		            System.out.println(deleteDVD + " Ã¥ÀÌ »èÁ¦µÇ¾ú½À´Ï´Ù.");
		            dvdCnt--;
		            if (dvdCnt == MenuNum.num1) {
		               ++dvdCnt;
		            }
		         }
		      }
	      
	      File inputFile = new File("stockDVD.txt"); //±âÁ¸ÅØ½ºÆ®ÆÄÀÏ
	      File tempFile = new File("newstockDVD.txt"); //º¹»ç½ÃÅ³ ÅØ½ºÆ®ÆÄÀÏ

	      BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	      BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

	      String lineToRemove = deleteDVD;
	      String currentLine;

	      while((currentLine = reader.readLine()) != null) {            
	          String trimmedLine = currentLine.trim();
	          if(trimmedLine.contains(lineToRemove)) continue;
	          writer.write(currentLine + System.getProperty("line.separator"));
	      }
	      
	      System.out.println("ÇØ´ç µµ¼­ÀÇ Á¤º¸¸¦ ¸ðµÎ »èÁ¦Çß½À´Ï´Ù.");
	      writer.close(); 
	      reader.close();
	      

	      if(inputFile.exists() && tempFile.exists()) {  //ÆÄÀÏ »èÁ¦ ¹× ÀÌ¸§¹Ù²Ù±â             
	         inputFile.delete();                      
	           tempFile.renameTo(new File("stockDVD.txt"));                             
	       } else {
	           System.out.println("ÆÄÀÏÀÌ Á¸ÀçÇÏÁö ¾Ê½À´Ï´Ù.");
	       }
	                                         
	   }



	  


}
