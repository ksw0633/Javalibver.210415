//package cproject;
//import java.util.*;
//import java.util.regex.Pattern;
//
//public class BookHandler {
//   //Book bookList[] = new Book[5];
//   Vector<Book> bv = new Vector<Book>();
//   Book b = new Book();
//   int bookCnt = 0;
//   Scanner s;
//   
//   public BookHandler() {
//      s= new Scanner(System.in);   
//   }
//   
//   void inputBook(){
//      String sPattern = "^[a-zA-Z0-9��-�R\\s]*$";
//      int retry = 0;
//      boolean regex;
//      
//      do
//      {
//    	  //if(bookList[bookCnt]==null)
//    	 // {
//    			  
//    		 
//         System.out.print("å  ���� : ");
//         String bookTitle = s.nextLine();
//         regex = Pattern.matches(sPattern, bookTitle);
//         if(regex != true) {
//            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
//            break;
//         }
//         
//         System.out.print("å  ���� : ");
//          String bookAuthor = s.nextLine();
//          regex = Pattern.matches(sPattern, bookAuthor);
//          if(regex != true) {
//             System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
//             break;
//          }
//          
//         System.out.print("���ǻ� : ");
//         String bookPublisher = s.nextLine();
//         regex = Pattern.matches(sPattern, bookPublisher);
//         if(regex != true) {
//            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
//            break;
//         }
//         
//         System.out.print("å  �ڵ�: ");
//         String bookCode = s.nextLine();
//         regex = Pattern.matches(sPattern, bookCode);
//         if(regex != true) {
//            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
//            break;
//         }
//         
//         System.out.print("å ���� : ");
//         int bookPrice = 0;
//         
//         if(!s.hasNextInt()||(bookPrice= s.nextInt())<0) {
//            System.out.println("������ �Է��ϼ��� ");
//            break;
//         }
//         
//         System.out.print("å �Ǹŷ� : ");
//         int bookSale = 0;
//         if(!s.hasNextInt()||(bookSale= s.nextInt())<0) {
//            System.out.println("������ �Է��ϼ��� ");
//            break;
//         }
//         
//         
//         System.out.print("å ���ǿ��� : ");
//         int bookYear = 0;
//         if(!s.hasNextInt()||(bookYear= s.nextInt())<0) {
//            System.out.println("������ �Է��ϼ��� ");
//            break;
//         }
//         s.nextLine();
//         
//         int borrow = 0;
//         
//         //Book book = new Book(bookTitle, bookAuthor, bookPublisher, bookCode, bookPrice, bookSale, bookYear, borrow);
//         
//         b.setBookTitle(bookTitle);
//         b.setBookAuthor(bookAuthor);
//         b.setBookPublisher(bookPublisher);
//         b.setBookCode(bookCode);
//         b.setBookPrice(bookPrice);
//         b.setBookSale(bookSale);
//         b.setBookYear(bookYear);
//         b.setBorrow(borrow);
//         bv.add(new Book(bookTitle,bookAuthor,bookPublisher,bookCode,bookPrice,bookSale,bookYear,borrow));
//         bookCnt++;
//         
//         System.out.println("�� �Է��Ͻðھ��? yes..1 no..0");
//         retry = s.nextInt();
//         s.nextLine();
//      }while(retry!=0);
//   }
//   
//   void outBook() {
//      for(int i = 0; i<bv.size(); i++)
//      {
//         if(bv.get(i)!=null)
//         {
//         System.out.println("-------------");
//         System.out.println("å ���� : " + bv.get(i).getBookTitle());
//         System.out.println("å ���� : " + bv.get(i).getBookAuthor());
//         System.out.println("���ǻ�: " + bv.get(i).getBookPublisher());
//         System.out.println("å �ڵ� : " + bv.get(i).getBookCode());
//         System.out.println("å ���� : " + bv.get(i).getBookPrice());
//         System.out.println("å �Ǹŷ� : " + bv.get(i).getBookSale());
//         System.out.println("å ���ǿ��� : " + bv.get(i).getBookYear());
//         System.out.println();
//         }
//      }
//   }
//   
//   void searchBook() {
//      
//      System.out.print("å ������ �Է����ּ��� : ");
//      String bT = s.nextLine();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null)
//         {
//            if(bT.equals(bv.get(i).getBookTitle()))
//            {
//               System.out.println("å�� ������ "+bv.get(i).getBookTitle()+"�Դϴ�."); break;
//            }else
//               System.out.println("ã�� å�� �����ϴ�.");
//         }
//      }
//   }
//   
//   void searchBook2() {
//      
//      System.out.print("å ���ڸ� �Է����ּ��� : ");
//      String bT = s.nextLine();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null)
//         {
//            if(bT.equals(bv.get(i).getBookAuthor()))
//            {
//               System.out.println("å�� ������ "+bv.get(i).getBookTitle()+"�̰�, ���ڴ� "+bv.get(i).getBookAuthor()+"�Դϴ�."); break;
//            }else
//               System.out.println("ã�� å�� �����ϴ�.");
//         }
//      }
//   }
//   
//   void searchBook3() {
//      
//      System.out.print("���ǻ縦 �Է����ּ��� : ");
//      String bT = s.nextLine();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null)
//         {
//            if(bT.equals(bv.get(i).getBookPublisher()))
//            {
//               System.out.println("å�� ������ "+bv.get(i).getBookTitle()+"�̰�, ���ǻ�� "+bv.get(i).getBookPublisher()+"�Դϴ�."); break;
//            }else
//               System.out.println("ã�� å�� �����ϴ�.");
//         }
//      }
//   }
//   
//   void searchBook4() {
//      
//      System.out.print("���ڵ带 �Է����ּ��� : ");
//      String bT = s.nextLine();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null)
//         {
//            if(bT.equals(bv.get(i).getBookCode()))
//            {
//               System.out.println("å�� ������ "+bv.get(i).getBookTitle()+"�̰�, å �ڵ�� "+bv.get(i).getBookCode()+"�Դϴ�."); break;
//            }else
//               System.out.println("ã�� å�� �����ϴ�.");
//         }
//      }
//   }
//   
//   void searchBook5() {
//      
//      System.out.print("å ������ �Է����ּ��� : ");
//      int bT = s.nextInt();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null)
//         {
//            if(bT == bv.get(i).getBookPrice())
//            {
//               System.out.println("å�� ������ "+bv.get(i).getBookTitle()+"�̰�, ������ "+bv.get(i).getBookPrice()+"�Դϴ�."); break;
//            }else
//               System.out.println("ã�� å�� �����ϴ�.");
//         }
//      }
//   }
//   
//   void searchBook6() {
//      
//      System.out.print("å �Ǹŷ��� �Է����ּ��� : ");
//      int bT = s.nextInt();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null)
//         {
//            if(bT==bv.get(i).getBookSale())
//            {
//               System.out.println("å�� ������ "+bv.get(i).getBookTitle()+"�̰�, �Ǹŷ��� "+bv.get(i).getBookSale()+"�Դϴ�."); break;
//            }else
//               System.out.println("ã�� å�� �����ϴ�.");
//         }
//      }
//   }
//   
//   void searchBook7() {
//      
//      System.out.print("å ������ �Է����ּ��� : ");
//      int bT = s.nextInt();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null)
//         {
//            if(bT==bv.get(i).getBookYear())
//            {
//               System.out.println("å�� ������ "+bv.get(i).getBookTitle()+"�̰�, ������ "+bv.get(i).getBookYear()+"�Դϴ�."); break;
//            }else
//               System.out.println("ã�� å�� �����ϴ�.");
//         }
//      }
//   }
//   
//   void sortBook() {
//      System.out.println("�Ǹŷ��� ���� �������� ����");
//      
////      for(int i = 0; i<bv.size();i++)
////         {
////         if(bv.get(i)==null )
////            {
////               bookList[i] = new Book("a","a","a","a",0,0,0,0);
////               bookCnt++;
////               System.out.println("�����ڸ� �߰��Ͽ����ϴ�.");
////            } 
////         }
////      for(int i = 0; i<bv.size();i++)
////      {
////      if(bv.get(i)==null )
////         {
////            b.Name = "a"+i;
////            b.Tel = "010"+i;
////            b.ID = "user"+(i+1);
////            b.PW = "user"+(i+1);
////            bv.add(b);
////            System.out.println("�����ڸ� �߰��Ͽ����ϴ�.");
////            bookCnt++;
////         } 
////      }
//      Collections.sort(bv);
//      
//      System.out.println();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         System.out.println("å �̸� : " + bv.get(i).getBookTitle() + "," +(i+1) + "�� : " + bv.get(i).getBookSale());
//      }
//   }
//   
//   void deleteBook1() {
//
//      System.out.print("������ å ������ �Է����ּ��� : ");
//       String bT = s.nextLine();
//       //System.out.println("bC : "+bookCnt);
//       for (int i=0; i<bv.size();i++) {
//          if(bv.get(i) == null)  
//          {
//             System.out.println("null���Դϴ�.");
//          }
//          else if(bT.equals(bv.get(i).getBookTitle())){
//        	  //bv.get(i) = null;
//             System.out.println(bT + " å�� �����Ǿ����ϴ�.");
//             bookCnt--;
//             //System.out.println("bC : "+bookCnt);
//             //System.out.println("i : "+i);
//             if(bookCnt == -1) {
//            	 ++bookCnt;
////            	 //i = 0;
////            	 System.out.println("bC : "+bookCnt);
////            	 //System.out.println("bL[bC].Code : "+bookList[bookCnt].getBookCode());
////            	 System.out.println("i : "+i);
////            	 System.out.println("bL[bC] : "+bookList[bookCnt]);
////            	 System.out.println("bL[i] : "+bookList[i]);
//             }
//          }//else
//             //System.out.println("å�ڵ尡 �����ʽ��ϴ�.");
//                 
//       } 
//      
//   }
//   
//   void deleteBook2() {
//
//         System.out.print("������ å �ڵ��� �Է����ּ��� : ");
//         String bT = s.nextLine();
//         
//         for (int i=0; i<bv.size();i++) {
//            if(bv.get(i) == null)  
//            {
//              //System.out.println("null���Դϴ�.");
//            }
//            else if(bT.equals(bv.get(i).getBookCode())){
//               System.out.println( bv.get(i).getBookTitle() + " å�� �����Ǿ����ϴ�.");
//               bv.remove(i);
//               bookCnt--;
//               
//            }//else
//               //System.out.println("å�ڵ尡 �����ʽ��ϴ�.");
//                   
//         } 
//      }
//   
//   
//   void borrowBook() {
//      
//       System.out.print("���� å�� ���� �����ּ��� : ");
//       String bName = s.nextLine();
//       
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null )
//         {
//         
// 
//        if( bName.equals(bv.get(i).getBookTitle())) {
//        	
//        	if(bv.get(i).getBorrow() == 1)
//        	{
//        		System.out.println("�̹� ����");break;
//        	}
//        	else {
//        		System.out.println("���� ����");
//        		bv.get(i).setBorrow(1);
//        		break;
//        	}
//        }
//         
//         }
//         
//      }
//   }
//   
//   void returnBook() {
//	   System.out.print("�ݳ��� å�� ���� �����ּ��� : ");
//	   String bName = s.nextLine();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null )
//         {
//         
//         if( bName.equals(bv.get(i).getBookTitle())) {
//            if(bv.get(i).getBorrow() == 0)
//            {
//               System.out.println("�̹� �ݳ�");break;
//            }
//            else {
//               System.out.println("�ݳ� ����");
//               bv.get(i).setBorrow(0) ;
//               break;
//            }
//         }
//         }
//         
//      }
//   }
//
//}









package cproject;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.io.*;
import java.text.SimpleDateFormat;

/**
 * ���� ���� 
 * 
 *@author SHY-702-01
 *@since 2021.04.06
 *@version 8
 */

public class BookHandler {
   //Book bookList[] = new Book[5];
   Vector<Book> bv = new Vector<Book>();
   Book b = new Book();
   int bookCnt = 0;
   Scanner s = new Scanner(System.in);
   
   public BookHandler() {}

   
   /**
    *���� �Է� �޼ҵ�
    *
    *Buffered Ŭ������ ����Ͽ� �ؽ�Ʈ ������ ���Ͽ� �Է��� ������ ����ǵ��� ��
    *book Entity Ŭ�������� set,get�޼ҵ带 ���Ͽ� �����Ͽ� ���� �ִ��� Ȯ��
    *
    *@throws java.io.IOException ����� ����
    *@author SHY-702-01
    */
   void inputBook() throws IOException {
	      
	      BufferedWriter bw = new BufferedWriter(new FileWriter("stockBook.txt", true));
//	      FileInputStream fileStream = new FileInputStream("stockBook.txt");
//	      ObjectInputStream objectInputStream = new ObjectInputStream(fileStream);
//	      Object object = null;
//		try {
//			object = objectInputStream.readObject();
//		} catch (ClassNotFoundException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	      
//	      objectInputStream.close();
	      
//	      System.out.println("�о�� ��ü�� type->"+ object.getClass());
	      String sPattern = "^[a-zA-Z0-9��-�R\\s]*$";
	      int retry = 0;
	      boolean regex;

	      do {
	         System.out.print("å ���� : ");
	         String bookTitle = s.nextLine();
	         bw.write("å ����: " + bookTitle + "\t");
	         regex = Pattern.matches(sPattern, bookTitle);
	         if (regex != true) {
	            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
	            break;
	         }

	         System.out.print("å ���� : ");
	         String bookAuthor = s.nextLine();
	         bw.write("å ����: " + bookAuthor + "\t");
	         regex = Pattern.matches(sPattern, bookAuthor);
	         if (regex != true) {
	            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
	            break;
	         }

	         System.out.print("���ǻ� : ");
	         String bookPublisher = s.nextLine();
	         bw.write("���ǻ�: " + bookPublisher + "\t" + "\t");
	         regex = Pattern.matches(sPattern, bookPublisher);
	         if (regex != true) {
	            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
	            break;
	         }

	         System.out.print("å �ڵ� : ");
	         String bookCode = s.nextLine();
	         bw.write("å �ڵ�: " + bookCode + "\t");
	         regex = Pattern.matches(sPattern, bookCode);
	         if (regex != true) {
	            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
	            break;
	         }

	         System.out.print("å ���� : ");
	         int bookPrice = MenuNum.num0;
	         if (!s.hasNextInt() || (bookPrice = s.nextInt()) < MenuNum.num0) {
	            System.out.println("������ �Է��ϼ���.");
	            break;
	         }
	         bw.write("å ����: " + bookPrice + "\t");

	         System.out.print("å �Ǹŷ� : ");
	         int bookSale = MenuNum.num0;
	         if (!s.hasNextInt() || (bookSale = s.nextInt()) < MenuNum.num0) {
	            System.out.println("������ �Է��ϼ���.");
	            break;
	         }
	         bw.write("å �Ǹŷ�: " + bookSale + "\t");

	         System.out.print("å ���ǿ��� : ");
	         int bookYear = MenuNum.num0;
	         if (!s.hasNextInt() || (bookYear = s.nextInt()) < MenuNum.num0) {
	            System.out.println("������ �Է��ϼ���.");
	            break;
	         }
	         bw.write("å ���ǿ���: " + bookYear + "\t");

	         s.nextLine();

	         int borrow = MenuNum.num0;
	         bw.write("�뿩 ���� : 0");
	         bw.newLine();

	         //Book book = new Book(bookTitle, bookAuthor, bookPublisher, bookCode, bookPrice, bookSale, bookYear, borrow);
	         b.setBookTitle(bookTitle);
	         b.setBookAuthor(bookAuthor);
	         b.setBookPublisher(bookPublisher);
	         b.setBookCode(bookCode);
	         b.setBookPrice(bookPrice);
	         b.setBookSale(bookSale);
	         b.setBookYear(bookYear);
	         b.setBorrow(borrow);
	         bv.add(new Book(bookTitle, bookAuthor, bookPublisher, bookCode, bookPrice, bookSale, bookYear, borrow));
	         System.out.println("�� �Է��Ͻðھ��? yes..1 no..0");
	         retry = s.nextInt();
	         if (retry == MenuNum.num0) {
	            bw.close();
	            break;
	         }
	         s.nextLine();
	      } while (retry != MenuNum.num0);
	   }
	   
   
   /**
    * ���� ��¿� �޼ҵ�
    * 
    * File �����ڸ� �����Ͽ� �ؽ�Ʈ ���� ��ü�� ����
    * <br>tryCatch()�� ����Ͽ� ���� �߻��� �Ǹ� �ٿ����� ã�Ƴ� �ܰ躰�� ������ ����ϰ��Ѵ�.
    * <br>�Է� �޼ҵ带 ���� ����� �ؽ�Ʈ ������������ �ҷ��ͼ�
    * readLine�޼ҵ带 ����Ͽ� ���� ���� ������ null���� �ƴϸ� ���� ������ ����ϰ� �Ѵ�.
    * 
    * @throws java.io.IOException ����� ����
    * 
    * 
    */
	   void outBook() throws IOException {
//	      for (int i=0; i<bv.size(); i++) {
//	         if (bv.get(i) != null) {
//	            System.out.println("-------------");
//	            System.out.println("å ���� : " + bv.get(i).getBookTitle());
//	            System.out.println("å ���� : " + bv.get(i).getBookAuthor());
//	            System.out.println("���ǻ� : " + bv.get(i).getBookPublisher());
//	            System.out.println("å �ڵ� : " + bv.get(i).getBookCode());
//	            System.out.println("å ���� : " + bv.get(i).getBookPrice());
//	            System.out.println("å �Ǹŷ� : " + bv.get(i).getBookSale());
//	            System.out.println("å ���ǿ��� : " + bv.get(i).getBookYear());
//	            System.out.println();
//	         }
//	      }
	      File file = new File("stockBook.txt");
	      try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	         String line;
	         while ((line = br.readLine()) != null) {
	            System.out.println(line);
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      }

	   }
	   
	   /**
	    * ���� �˻� �޼ҵ�
	    * 
	    * stockBook.txt �� �ִ� ������ ������ null���� �ƴ��� �Ǵ��Ͽ�
	    * ������ �Է��� ���� ������ ���� ������ ���
	    * @throws java.io.IOException ����� ����
	    * @author SHY-702-01
	    * 
	    * 
	    */
	   void searchBook() throws IOException{
      System.out.print("å ������ �Է����ּ��� : ");
      String bT = s.nextLine();    

      File file = new File("stockBook.txt");
      try (BufferedReader br = new BufferedReader(new FileReader(file))) {
         String line;
         while ((line = br.readLine()) != null) {
            if(line.contains("å ����: "+bT+"\t"))   System.out.println(line);
         }
      } catch (IOException e) {
         e.printStackTrace();
        
      }                              
   }

	   /**
	    * ���� �Ǹŷ��� ���� �������� ���� �޼ҵ�
	    * 
	    * ���� ������ ��ϵ� �ؽ�Ʈ ���Ͽ��� �����ų �ؽ�Ʈ������ �����
	    * ���� �� ���� ��Ű�鼭 �Ǹŷ��� ���� ������ ���� ���������� �ȴ�
	    * 
	    * @throws java.io.IOException ����� ����
	    * 
	    * <p>������������ {@link Book#compareTo(Object)} ����</p>
	    * 
	    */
	   public void sortBook() throws IOException{
		      System.out.println("�Ǹŷ��� ���� �������� ����");
		      BufferedWriter out =null;
		      BufferedReader in = null;
		 
		   try {
		      in = new BufferedReader(new FileReader("stockBook.txt"));
		      out = new BufferedWriter(new FileWriter("sort.txt"));
		      
		      Vector<String> list = new Vector<String>();
		      String line;
		      while((line=in.readLine()) != null) 
		      {
		         list.add(line);
		         Collections.sort(bv);   
		      }
		      out.write(list+"");
		      out.flush();
		   }catch(IOException e) {
		   }finally {
		         try {
		            if(in != null)
		               in.close();
		            if(out !=null)
		               out.close();
		         }catch(IOException e) {
		            
		         } 
		           
		   }
		   
		   }
//   void sortBook() {
//      System.out.println("�Ǹŷ��� ���� �������� ����");
//      Collections.sort(bv);
//      System.out.println();
//      for (int i=0; i<bv.size(); i++) {
//         System.out.println("å �̸� : " + bv.get(i).getBookTitle() + "," + (i+1) + "�� : " + bv.get(i).getBookSale());
//      }
//   }

   
	   /**
	    * ���� ���� �޼ҵ�
	    * 
	    * ������ �����͵��� ����� ���� �ϳ��� �о�帮�� �����ų �ؽ�Ʈ ���Ͽ� ������,
	    * ������ ��ų ��(å�� ����)�� �Է��Ͽ� �������� Ȯ���Ѵٸ�, �� ���� ������Ű�� �� ���� �Ͽ� ���� �ؽ�Ʈ ���Ͽ� ������
	    * 
	    * @throws java.io.IOException ����� ����
	    */
   void deleteBook1() throws IOException {
	      System.out.print("������ å ������ �Է����ּ��� : ");     
	      String bT = s.nextLine();
	      s.nextLine();
	      
	      File inputFile = new File("stockBook.txt"); //�����ؽ�Ʈ����
	      File tempFile = new File("newstockBook.txt"); //�����ų �ؽ�Ʈ����

	      BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	      BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

	      String lineToRemove = bT;
	      String currentLine;

	      while((currentLine = reader.readLine()) != null) {            
	          String trimmedLine = currentLine.trim();
	          if(trimmedLine.contains("å ����: "+lineToRemove+"\t")) continue;
	          writer.write(currentLine + System.getProperty("line.separator"));
	      }
	      
	      System.out.println("�ش� ������ ������ ��� �����߽��ϴ�.");
	      writer.close(); 
	      reader.close();
	      

	      if(inputFile.exists() && tempFile.exists()) {  //���� ���� �� �̸��ٲٱ�             
	         inputFile.delete();                      
	           tempFile.renameTo(new File("stockBook.txt"));                             
	       } else {
	           System.out.println("������ �������� �ʽ��ϴ�.");
	       }
	                                         
	   }

	  
   /**
    * ���� ���� �޼ҵ�
    * 
    * ������ �����͵��� ����� ���� �ϳ��� �о�帮��, �����ų �ؽ�Ʈ ���Ͽ� ������
    * ������ ��ų ��(å �ڵ�)�� �Է��Ͽ� �������� Ȯ���Ѵٸ�, �� ���� ������Ű�� �� ���� �Ͽ� ���� �ؽ�Ʈ ���Ͽ� ������
    * 
    * @throws java.io.IOException ����� ����
    */
	   void deleteBook2() throws IOException{
	      System.out.print("������ å �ڵ带 �Է����ּ��� : ");
	      String bT = s.nextLine();
	      for (int i=0; i<bv.size(); i++) {
	         if (bv.get(i) == null) {
	            //System.out.println("null���Դϴ�.");
	         }
	         else if (bT.equals(bv.get(i).getBookCode())) {
	            System.out.println(bv.get(i).getBookTitle() + " å�� �����Ǿ����ϴ�.");
	            bv.remove(i);
	            bookCnt--;
	         }
	      }
	      
	      File inputFile = new File("stockBook.txt");
	      File tempFile = new File("newstockBook.txt");

	      BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	      BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

	      String lineToRemove = bT;
	      String currentLine;

	      while((currentLine = reader.readLine()) != null) {            
	          String trimmedLine = currentLine.trim();
	          if(trimmedLine.contains("å �ڵ�: "+lineToRemove+"\t")) continue;
	          writer.write(currentLine + System.getProperty("line.separator"));
	      }
	      System.out.println("�ش� ������ ������ ��� �����߽��ϴ�.");
	      writer.close(); 
	      reader.close(); 
	      
	      if(inputFile.exists() && tempFile.exists()) {  //���� ������ �̸��ٲٱ�             
	         inputFile.delete();                      
	           tempFile.renameTo(new File("stockBook.txt"));                             
	       } else {
	           System.out.println("������ �������� �ʽ��ϴ�.");
	       }
	   }
   
	   /**
	    * ���� ����� �޼ҵ�
	    * 
	    * u �� overdue�� ���� ���� ��ü�Ǿ��ִ� ��������� �Ǵ���
	    * ��ü�Ǿ������ʴٸ� ������ ��¥�� yyyyMMdd�������� �Է¹޾� �� å�� borrow�� ����
	    * 
	    * @return ��ü�̷� ������ �뿩 �Ұ���
	    * @param u �α��� �Ͽ� ������ ������ ����
	    * <p>{@link User#getOverdue()} ����</p>
	    *
	    */
   void borrowBook(User u)
   {
      
      System.out.println("���� Ȯ��");
        String ID = s.nextLine();
        
        if(ID.equals(u.getID())) 
        {
           if (u.getOverdue() > 0)//��ü �̷��� �ִ��� Ȯ��
           {
              System.out.println("��ü �̷��� �ֱ⿡"+(u.getOverdue()-14)+"�� ���� �뿩 �Ұ���");
              return;
           }
        }
      
        System.out.print("���� å�� ���� �����ּ��� : ");
        String bName = s.nextLine();
        for(int i = 0; i<bv.size();i++)
        {
           if(bv.get(i)!=null )
           {
              if(bName.equals(bv.get(i).getBookTitle())) 
              {
                      
                 if(bv.get(i).getBorrow() != MenuNum.num0 )//borrow���� ����ÿ� �������� yyyyMMdd �������� ����Ǿ�����
                 {
                    System.out.println("�̹� ����");break;
                 }
                 else 
                 {
                    System.out.println("���� ��¥�� �Է����ּ���(yyyyMMdd 8�ڸ� ��������) : ");
                    int today = s.nextInt();
                    s.nextLine();
                    bv.get(i).setBorrow(today);//���⳯¥�� borrow�� ����
                    break;
                 }
              }   
         
           }
        }
   }
   
   /**
    *���� �ݳ��� �޼ҵ�  
    *
    *�ݳ����� ��¥�� �Է¹޾� �뿩 �Ⱓ 2�ֿ��� �󸶳� ��ü�Ǿ����� �����
    *��ü����ŭ u�� overdue ���� ���� ��ü �ϼ��� �ø�
    *
    *@param u �α��� �Ͽ� ������ �ݳ��� ����
    */
   void returnBook(User u) 
   {   
       System.out.print("�ݳ��� å�� ������ �����ּ��� : ");
       String bName = s.nextLine();

      for(int i = 0; i<bv.size();i++)
      {
         if(bv.get(i)!=null )
         {
            if( bName.equals(bv.get(i).getBookTitle())) 
            {
               if(bv.get(i).getBorrow() == MenuNum.num0)
               {
                  System.out.println("�̹� �ݳ�");
                  break;
               }
               else 
               {
                  long overdue; //��ü�ϼ��� �����ϴ� ����
                  SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");//��¥�� �Է¹޴� ���� ����           
                  Date rt = new Date(); //�ݳ� ��¥�� �����ϴ� ����
                  Date br = new Date(); //���� ��¥�� �����ϴ� ����
                  String temp;
              
                  temp = "" + bv.get(i).getBorrow();
                  System.out.println("���� ��¥�� �Է����ּ��� (yyyyMMdd 8�ڸ����Է����ּ���) : ");
                  //rt = sdf.parse(s.nextLine());
                  //br = sdf.parse(temp);//parse�� ���� string�� date�� ��ȯ
                  try//String�� date �������� ��ȯ�ҽ� ��Ŭ������ parseexception �����������⶧���� try catch�� �ȿ� �� �־����
                  {
                     rt = sdf.parse(s.nextLine());
                     br = sdf.parse(temp);
                  }
                  catch(Exception e)
                  {
                     //TODO: handle exception
                  }
                  overdue = TimeUnit.DAYS.convert(Math.abs(rt.getTime() - br.getTime()), TimeUnit.MILLISECONDS);//�뿩�Ⱓ�� ����
                  if (overdue > 14)//�뿩�ִ� �Ⱓ�� 2��
                  {
                     System.out.println((overdue-14) + "�� ��ŭ ��ü�Ǿ����ϴ�. ��ü�� �ϼ� ��ŭ �뿩�� �Ұ����մϴ�.");
                     bv.get(i).setBorrow(MenuNum.num0);//�ݳ��� �Ǿ����� borrow�� 0���� ����
                     u.setOverdue((int)(overdue));//��ü�� ������ �����ϱ� ���� ��ü�ϼ� ��ŭ overdue�� �缳��
                     break;
                  }
                  System.out.println("�ݳ� ����");
                  bv.get(i).setBorrow(MenuNum.num0) ;
                  break;
               }
            }
         }
         
      }
   }

}