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
	       
	       
	       String sPattern = "^[a-zA-Z0-9��-�R\\s]*$";
	       int retry = MenuNum.num0;
	       boolean regex;

	       do {


	    	 //title
	    	 System.out.print("���� : ");
	    	 	          title = s.nextLine();
	    	 	          dw.write("����: " + title + ",");
	    	 	          regex = Pattern.matches(sPattern, title);
	    	 	          if (regex != true) {
	    	 	             System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
	    	 	             break;
	    	 	          }

	    	 //��������
	    	 System.out.print("���� ���� : ");
	    	 	          year = MenuNum.num0;
	    	 	          if (!s.hasNextInt() || (year = s.nextInt()) < MenuNum.num0) {
	    	 	             System.out.println("������ �Է��ϼ���.");
	    	 	             break;
	    	 	          }
	    	 	          dw.write("���� ���� : " + year + ",");

	    	 //code
	    	 System.out.print("�ڵ� : ");
	    	 	         code = s.nextLine();
	    	 	          dw.write("�ڵ� : " + code+ ",");
	    	 	          regex = Pattern.matches(sPattern, code);
	    	 	          if (regex != true) {
	    	 	             System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
	    	 	             break;
	    	 	          }
	    	 //price
	    	 System.out.print("�ǸŰ� : ");
	    	 	          price = MenuNum.num0;
	    	 	          if (!s.hasNextInt() || (price = s.nextInt()) < MenuNum.num0) {
	    	 	             System.out.println("������ �Է��ϼ���.");
	    	 	             break;
	    	 	          }
	    	 	          dw.write("�ǸŰ� : " + price + ",");

	    	 //sale
	    	 System.out.print("�Ǹŷ� : ");
	    	 	          sale = MenuNum.num0;
	    	 	          if (!s.hasNextInt() || (sale = s.nextInt()) < MenuNum.num0) {
	    	 	             System.out.println("������ �Է��ϼ���.");
	    	 	             break;
	    	 	          }
	    	 	          dw.write("�Ǹŷ� : " + sale + ",");


	    	 //director
	    	 System.out.print("���� : ");
	    	 	          director = s.nextLine();
	    	 	          dw.write("���� : " + director + ",");
	    	 	          regex = Pattern.matches(sPattern, director);
	    	 	          if (regex != true) {
	    	 	             System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
	    	 	             break;
	    	 	          }
	    	 //cast
	    	 System.out.print("��� : ");
	    	 	          cast = s.nextLine();
	    	 	          dw.write(" ��� : " + cast + ",");
	    	 	          regex = Pattern.matches(sPattern, cast);
	    	 	          if (regex != true) {
	    	 	             System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
	    	 	             break;
	    	 	          }
	    	 
	    	 //runningTime
	    	 System.out.print("����Ÿ�� : ");
	    	 	          runningTime = MenuNum.num0;
	    	 	          if (!s.hasNextInt() || (runningTime = s.nextInt()) < MenuNum.num0) {
	    	 	             System.out.println("������ �Է��ϼ���.");
	    	 	             break;
	    	 	          }
	    	 	          dw.write("�ǸŰ� : " + borrow + ",");
	    	 //price
	    	 System.out.print("�ǸŰ� : ");
	    	 	          price = MenuNum.num0;
	    	 	          if (!s.hasNextInt() || (price = s.nextInt()) < MenuNum.num0) {
	    	 	             System.out.println("������ �Է��ϼ���.");
	    	 	             break;
	    	 	          }
	    	 	          dw.write("�ǸŰ� : " + price + ",");

	          

	          s.nextLine();

	          borrow = MenuNum.num0;
	          dw.write("�뿩 ���� : 0");
	          dw.newLine();
	          
	          dv.add(new DVD(title, year, code, price, sale, borrow, director, cast, runningTime, capacity));

	          System.out.println("�� �Է��Ͻðھ��? yes..1 no..0");
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
	      

		         System.out.print("���ϴ� ����� ������ �Է��ϼ���  : ");
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
		System.out.println("��� �������� ����");
//	      Collections.sort(dv);
	      
	      System.out.println();
	      
	      for(int i = 0; i<dv.size();i++)
	      {
	         System.out.println("���� : " + dv.get(i).getTitle()+ "," +(i+1) + "�� : " + dv.get(i).compareTo(sale));
	      }
	   }
		
	

	@Override
	public void deleteDisk(String title, int year, String code, int price, int sale, int borrow, String director,
			String cast, int runningTime, int capacity) throws IOException {
		System.out.print("������ å ������ �Է����ּ��� : ");     
	      String deleteDVD = s.nextLine();
	   
	     for (int i=0; i<dv.size(); i++) {
	         if (dv.get(i) == null) {
		            System.out.println("null���Դϴ�.");
		         }
		         else if (deleteDVD.equals(dv.get(i))) {
		            System.out.println(deleteDVD + " å�� �����Ǿ����ϴ�.");
		            dvdCnt--;
		            if (dvdCnt == MenuNum.num1) {
		               ++dvdCnt;
		            }
		         }
		      }
	      
	      File inputFile = new File("stockDVD.txt"); //�����ؽ�Ʈ����
	      File tempFile = new File("newstockDVD.txt"); //�����ų �ؽ�Ʈ����

	      BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	      BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

	      String lineToRemove = deleteDVD;
	      String currentLine;

	      while((currentLine = reader.readLine()) != null) {            
	          String trimmedLine = currentLine.trim();
	          if(trimmedLine.contains(lineToRemove)) continue;
	          writer.write(currentLine + System.getProperty("line.separator"));
	      }
	      
	      System.out.println("�ش� ������ ������ ��� �����߽��ϴ�.");
	      writer.close(); 
	      reader.close();
	      

	      if(inputFile.exists() && tempFile.exists()) {  //���� ���� �� �̸��ٲٱ�             
	         inputFile.delete();                      
	           tempFile.renameTo(new File("stockDVD.txt"));                             
	       } else {
	           System.out.println("������ �������� �ʽ��ϴ�.");
	       }
	                                         
	   }



	  


}
