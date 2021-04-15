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
//      String sPattern = "^[a-zA-Z0-9°¡-ÆR\\s]*$";
//      int retry = 0;
//      boolean regex;
//      
//      do
//      {
//    	  //if(bookList[bookCnt]==null)
//    	 // {
//    			  
//    		 
//         System.out.print("Ã¥  Á¦¸ñ : ");
//         String bookTitle = s.nextLine();
//         regex = Pattern.matches(sPattern, bookTitle);
//         if(regex != true) {
//            System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
//            break;
//         }
//         
//         System.out.print("Ã¥  ÀúÀÚ : ");
//          String bookAuthor = s.nextLine();
//          regex = Pattern.matches(sPattern, bookAuthor);
//          if(regex != true) {
//             System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
//             break;
//          }
//          
//         System.out.print("ÃâÆÇ»ç : ");
//         String bookPublisher = s.nextLine();
//         regex = Pattern.matches(sPattern, bookPublisher);
//         if(regex != true) {
//            System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
//            break;
//         }
//         
//         System.out.print("Ã¥  ÄÚµå: ");
//         String bookCode = s.nextLine();
//         regex = Pattern.matches(sPattern, bookCode);
//         if(regex != true) {
//            System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
//            break;
//         }
//         
//         System.out.print("Ã¥ °¡°Ý : ");
//         int bookPrice = 0;
//         
//         if(!s.hasNextInt()||(bookPrice= s.nextInt())<0) {
//            System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
//            break;
//         }
//         
//         System.out.print("Ã¥ ÆÇ¸Å·® : ");
//         int bookSale = 0;
//         if(!s.hasNextInt()||(bookSale= s.nextInt())<0) {
//            System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
//            break;
//         }
//         
//         
//         System.out.print("Ã¥ ÃâÆÇ¿¬µµ : ");
//         int bookYear = 0;
//         if(!s.hasNextInt()||(bookYear= s.nextInt())<0) {
//            System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
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
//         System.out.println("¶Ç ÀÔ·ÂÇÏ½Ã°Ú¾î¿ä? yes..1 no..0");
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
//         System.out.println("Ã¥ Á¦¸ñ : " + bv.get(i).getBookTitle());
//         System.out.println("Ã¥ ÀúÀÚ : " + bv.get(i).getBookAuthor());
//         System.out.println("ÃâÆÇ»ç: " + bv.get(i).getBookPublisher());
//         System.out.println("Ã¥ ÄÚµå : " + bv.get(i).getBookCode());
//         System.out.println("Ã¥ °¡°Ý : " + bv.get(i).getBookPrice());
//         System.out.println("Ã¥ ÆÇ¸Å·® : " + bv.get(i).getBookSale());
//         System.out.println("Ã¥ ÃâÆÇ¿¬µµ : " + bv.get(i).getBookYear());
//         System.out.println();
//         }
//      }
//   }
//   
//   void searchBook() {
//      
//      System.out.print("Ã¥ Á¦¸ñÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//      String bT = s.nextLine();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null)
//         {
//            if(bT.equals(bv.get(i).getBookTitle()))
//            {
//               System.out.println("Ã¥ÀÇ Á¦¸ñÀº "+bv.get(i).getBookTitle()+"ÀÔ´Ï´Ù."); break;
//            }else
//               System.out.println("Ã£´Â Ã¥ÀÌ ¾ø½À´Ï´Ù.");
//         }
//      }
//   }
//   
//   void searchBook2() {
//      
//      System.out.print("Ã¥ ÀúÀÚ¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//      String bT = s.nextLine();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null)
//         {
//            if(bT.equals(bv.get(i).getBookAuthor()))
//            {
//               System.out.println("Ã¥ÀÇ Á¦¸ñÀº "+bv.get(i).getBookTitle()+"ÀÌ°í, ÀúÀÚ´Â "+bv.get(i).getBookAuthor()+"ÀÔ´Ï´Ù."); break;
//            }else
//               System.out.println("Ã£´Â Ã¥ÀÌ ¾ø½À´Ï´Ù.");
//         }
//      }
//   }
//   
//   void searchBook3() {
//      
//      System.out.print("ÃâÆÇ»ç¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//      String bT = s.nextLine();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null)
//         {
//            if(bT.equals(bv.get(i).getBookPublisher()))
//            {
//               System.out.println("Ã¥ÀÇ Á¦¸ñÀº "+bv.get(i).getBookTitle()+"ÀÌ°í, ÃâÆÇ»ç´Â "+bv.get(i).getBookPublisher()+"ÀÔ´Ï´Ù."); break;
//            }else
//               System.out.println("Ã£´Â Ã¥ÀÌ ¾ø½À´Ï´Ù.");
//         }
//      }
//   }
//   
//   void searchBook4() {
//      
//      System.out.print("ºÏÄÚµå¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//      String bT = s.nextLine();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null)
//         {
//            if(bT.equals(bv.get(i).getBookCode()))
//            {
//               System.out.println("Ã¥ÀÇ Á¦¸ñÀº "+bv.get(i).getBookTitle()+"ÀÌ°í, Ã¥ ÄÚµå´Â "+bv.get(i).getBookCode()+"ÀÔ´Ï´Ù."); break;
//            }else
//               System.out.println("Ã£´Â Ã¥ÀÌ ¾ø½À´Ï´Ù.");
//         }
//      }
//   }
//   
//   void searchBook5() {
//      
//      System.out.print("Ã¥ °¡°ÝÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//      int bT = s.nextInt();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null)
//         {
//            if(bT == bv.get(i).getBookPrice())
//            {
//               System.out.println("Ã¥ÀÇ Á¦¸ñÀº "+bv.get(i).getBookTitle()+"ÀÌ°í, °¡°ÝÀº "+bv.get(i).getBookPrice()+"ÀÔ´Ï´Ù."); break;
//            }else
//               System.out.println("Ã£´Â Ã¥ÀÌ ¾ø½À´Ï´Ù.");
//         }
//      }
//   }
//   
//   void searchBook6() {
//      
//      System.out.print("Ã¥ ÆÇ¸Å·®À» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//      int bT = s.nextInt();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null)
//         {
//            if(bT==bv.get(i).getBookSale())
//            {
//               System.out.println("Ã¥ÀÇ Á¦¸ñÀº "+bv.get(i).getBookTitle()+"ÀÌ°í, ÆÇ¸Å·®Àº "+bv.get(i).getBookSale()+"ÀÔ´Ï´Ù."); break;
//            }else
//               System.out.println("Ã£´Â Ã¥ÀÌ ¾ø½À´Ï´Ù.");
//         }
//      }
//   }
//   
//   void searchBook7() {
//      
//      System.out.print("Ã¥ ¿¬µµ¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//      int bT = s.nextInt();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         if(bv.get(i)!=null)
//         {
//            if(bT==bv.get(i).getBookYear())
//            {
//               System.out.println("Ã¥ÀÇ Á¦¸ñÀº "+bv.get(i).getBookTitle()+"ÀÌ°í, ¿¬µµ´Â "+bv.get(i).getBookYear()+"ÀÔ´Ï´Ù."); break;
//            }else
//               System.out.println("Ã£´Â Ã¥ÀÌ ¾ø½À´Ï´Ù.");
//         }
//      }
//   }
//   
//   void sortBook() {
//      System.out.println("ÆÇ¸Å·®¿¡ µû¸¥ ³»¸²Â÷¼ø Á¤·Ä");
//      
////      for(int i = 0; i<bv.size();i++)
////         {
////         if(bv.get(i)==null )
////            {
////               bookList[i] = new Book("a","a","a","a",0,0,0,0);
////               bookCnt++;
////               System.out.println("»ý¼ºÀÚ¸¦ Ãß°¡ÇÏ¿´½À´Ï´Ù.");
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
////            System.out.println("»ý¼ºÀÚ¸¦ Ãß°¡ÇÏ¿´½À´Ï´Ù.");
////            bookCnt++;
////         } 
////      }
//      Collections.sort(bv);
//      
//      System.out.println();
//      
//      for(int i = 0; i<bv.size();i++)
//      {
//         System.out.println("Ã¥ ÀÌ¸§ : " + bv.get(i).getBookTitle() + "," +(i+1) + "À§ : " + bv.get(i).getBookSale());
//      }
//   }
//   
//   void deleteBook1() {
//
//      System.out.print("»èÁ¦ÇÒ Ã¥ Á¦¸ñÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//       String bT = s.nextLine();
//       //System.out.println("bC : "+bookCnt);
//       for (int i=0; i<bv.size();i++) {
//          if(bv.get(i) == null)  
//          {
//             System.out.println("null°ªÀÔ´Ï´Ù.");
//          }
//          else if(bT.equals(bv.get(i).getBookTitle())){
//        	  //bv.get(i) = null;
//             System.out.println(bT + " Ã¥ÀÌ »èÁ¦µÇ¾ú½À´Ï´Ù.");
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
//             //System.out.println("Ã¥ÄÚµå°¡ ¸ÂÁö¾Ê½À´Ï´Ù.");
//                 
//       } 
//      
//   }
//   
//   void deleteBook2() {
//
//         System.out.print("»èÁ¦ÇÒ Ã¥ ÄÚµåÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
//         String bT = s.nextLine();
//         
//         for (int i=0; i<bv.size();i++) {
//            if(bv.get(i) == null)  
//            {
//              //System.out.println("null°ªÀÔ´Ï´Ù.");
//            }
//            else if(bT.equals(bv.get(i).getBookCode())){
//               System.out.println( bv.get(i).getBookTitle() + " Ã¥ÀÌ »èÁ¦µÇ¾ú½À´Ï´Ù.");
//               bv.remove(i);
//               bookCnt--;
//               
//            }//else
//               //System.out.println("Ã¥ÄÚµå°¡ ¸ÂÁö¾Ê½À´Ï´Ù.");
//                   
//         } 
//      }
//   
//   
//   void borrowBook() {
//      
//       System.out.print("ºô¸± Ã¥ÀÇ Á¦¸ñ¸¦ ¸»ÇØÁÖ¼¼¿ä : ");
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
//        		System.out.println("ÀÌ¹Ì ´ëÃâ");break;
//        	}
//        	else {
//        		System.out.println("´ëÃâ ¼º°ø");
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
//	   System.out.print("¹Ý³³ÇÒ Ã¥ÀÇ Á¦¸ñ¸¦ ¸»ÇØÁÖ¼¼¿ä : ");
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
//               System.out.println("ÀÌ¹Ì ¹Ý³³");break;
//            }
//            else {
//               System.out.println("¹Ý³³ ¼º°ø");
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
 * µµ¼­ °ü¸® 
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
    *µµ¼­ ÀÔ·Â ¸Þ¼Òµå
    *
    *Buffered Å¬·¡½º¸¦ »ç¿ëÇÏ¿¡ ÅØ½ºÆ® µ¥ÀÌÅÍ ÆÄÀÏ¿¡ ÀÔ·ÂÇÑ ³»¿ëÀÌ ÀúÀåµÇµµ·Ï ÇÔ
    *book Entity Å¬·¡½º¿¡¼­ set,get¸Þ¼Òµå¸¦ ÅëÇÏ¿© ¸®ÅÏÇÏ¿© °ªÀÌ ÀÖ´ÂÁö È®ÀÎ
    *
    *@throws java.io.IOException ÀÔÃâ·Â °ü·Ã
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
	      
//	      System.out.println("ÀÐ¾î¿Â °´Ã¼ÀÇ type->"+ object.getClass());
	      String sPattern = "^[a-zA-Z0-9°¡-ÆR\\s]*$";
	      int retry = 0;
	      boolean regex;

	      do {
	         System.out.print("Ã¥ Á¦¸ñ : ");
	         String bookTitle = s.nextLine();
	         bw.write("Ã¥ Á¦¸ñ: " + bookTitle + "\t");
	         regex = Pattern.matches(sPattern, bookTitle);
	         if (regex != true) {
	            System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	            break;
	         }

	         System.out.print("Ã¥ ÀúÀÚ : ");
	         String bookAuthor = s.nextLine();
	         bw.write("Ã¥ ÀúÀÚ: " + bookAuthor + "\t");
	         regex = Pattern.matches(sPattern, bookAuthor);
	         if (regex != true) {
	            System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	            break;
	         }

	         System.out.print("ÃâÆÇ»ç : ");
	         String bookPublisher = s.nextLine();
	         bw.write("ÃâÆÇ»ç: " + bookPublisher + "\t" + "\t");
	         regex = Pattern.matches(sPattern, bookPublisher);
	         if (regex != true) {
	            System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	            break;
	         }

	         System.out.print("Ã¥ ÄÚµå : ");
	         String bookCode = s.nextLine();
	         bw.write("Ã¥ ÄÚµå: " + bookCode + "\t");
	         regex = Pattern.matches(sPattern, bookCode);
	         if (regex != true) {
	            System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	            break;
	         }

	         System.out.print("Ã¥ °¡°Ý : ");
	         int bookPrice = MenuNum.num0;
	         if (!s.hasNextInt() || (bookPrice = s.nextInt()) < MenuNum.num0) {
	            System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	            break;
	         }
	         bw.write("Ã¥ °¡°Ý: " + bookPrice + "\t");

	         System.out.print("Ã¥ ÆÇ¸Å·® : ");
	         int bookSale = MenuNum.num0;
	         if (!s.hasNextInt() || (bookSale = s.nextInt()) < MenuNum.num0) {
	            System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	            break;
	         }
	         bw.write("Ã¥ ÆÇ¸Å·®: " + bookSale + "\t");

	         System.out.print("Ã¥ ÃâÆÇ¿¬µµ : ");
	         int bookYear = MenuNum.num0;
	         if (!s.hasNextInt() || (bookYear = s.nextInt()) < MenuNum.num0) {
	            System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
	            break;
	         }
	         bw.write("Ã¥ ÃâÆÇ¿¬µµ: " + bookYear + "\t");

	         s.nextLine();

	         int borrow = MenuNum.num0;
	         bw.write("´ë¿© Á¤º¸ : 0");
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
	         System.out.println("¶Ç ÀÔ·ÂÇÏ½Ã°Ú¾î¿ä? yes..1 no..0");
	         retry = s.nextInt();
	         if (retry == MenuNum.num0) {
	            bw.close();
	            break;
	         }
	         s.nextLine();
	      } while (retry != MenuNum.num0);
	   }
	   
   
   /**
    * µµ¼­ Ãâ·Â¿ë ¸Þ¼Òµå
    * 
    * File »ý¼ºÀÚ¸¦ »ý¼ºÇÏ¿© ÅØ½ºÆ® ÆÄÀÏ °´Ã¼¸¦ »ý¼º
    * <br>tryCatch()¸¦ »ç¿ëÇÏ¿© ¿¹¿Ü ¹ß»ýÀÌ µÇ¸é ±Ù¿øÁö¸¦ Ã£¾Æ³» ´Ü°èº°·Î ¿¡·¯¸¦ Ãâ·ÂÇÏ°ÔÇÑ´Ù.
    * <br>ÀÔ·Â ¸Þ¼Òµå¸¦ ÅëÇØ ÀúÀåµÈ ÅØ½ºÆ® µ¥ÀÌÅÍÆÄÀÏÀ» ºÒ·¯¿Í¼­
    * readLine¸Þ¼Òµå¸¦ »ç¿ëÇÏ¿© ÇÑÁÙ ÇÑÁÙ ÀÐÀ¸¸ç null°ªÀÌ ¾Æ´Ï¸é ÀÐÀº °ªµéÀ» Ãâ·ÂÇÏ°Ô ÇÑ´Ù.
    * 
    * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
    * 
    * 
    */
	   void outBook() throws IOException {
//	      for (int i=0; i<bv.size(); i++) {
//	         if (bv.get(i) != null) {
//	            System.out.println("-------------");
//	            System.out.println("Ã¥ Á¦¸ñ : " + bv.get(i).getBookTitle());
//	            System.out.println("Ã¥ ÀúÀÚ : " + bv.get(i).getBookAuthor());
//	            System.out.println("ÃâÆÇ»ç : " + bv.get(i).getBookPublisher());
//	            System.out.println("Ã¥ ÄÚµå : " + bv.get(i).getBookCode());
//	            System.out.println("Ã¥ °¡°Ý : " + bv.get(i).getBookPrice());
//	            System.out.println("Ã¥ ÆÇ¸Å·® : " + bv.get(i).getBookSale());
//	            System.out.println("Ã¥ ÃâÆÇ¿¬µµ : " + bv.get(i).getBookYear());
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
	    * µµ¼­ °Ë»ö ¸Þ¼Òµå
	    * 
	    * stockBook.txt ¿¡ ÀÖ´Â °ª¿¡¼­ Á¦¸ñÀÌ null°ªÀÌ ¾Æ´ÑÁö ÆÇ´ÜÇÏ¿©
	    * À¯Àú°¡ ÀÔ·ÂÇÑ °ª°ú µ¿ÀÏÇÑ °ªÀÌ ÀÖÀ»½Ã Ãâ·Â
	    * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
	    * @author SHY-702-01
	    * 
	    * 
	    */
	   void searchBook() throws IOException{
      System.out.print("Ã¥ Á¦¸ñÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
      String bT = s.nextLine();    

      File file = new File("stockBook.txt");
      try (BufferedReader br = new BufferedReader(new FileReader(file))) {
         String line;
         while ((line = br.readLine()) != null) {
            if(line.contains("Ã¥ Á¦¸ñ: "+bT+"\t"))   System.out.println(line);
         }
      } catch (IOException e) {
         e.printStackTrace();
        
      }                              
   }

	   /**
	    * µµ¼­ ÆÇ¸Å·®¿¡ µû¸¥ ³»¸²Â÷¼ø Á¤·Ä ¸Þ¼Òµå
	    * 
	    * ±âÁ¸ µµ¼­°¡ µî·ÏµÈ ÅØ½ºÆ® ÆÄÀÏ¿¡¼­ º¹»ç½ÃÅ³ ÅØ½ºÆ®ÆÄÀÏÀ» ¸¸µé¾î
	    * ÇÑÁÙ ¾¿ º¹»ç ½ÃÅ°¸é¼­ ÆÇ¸Å·®¿¡ ÀÇÇØ ÀûÀº°Í ºÎÅÍ ³»¸²Â÷¼øÀÌ µÈ´Ù
	    * 
	    * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
	    * 
	    * <p>³»¸²Â÷¼ø°ü·Ã {@link Book#compareTo(Object)} ÂüÁ¶</p>
	    * 
	    */
	   public void sortBook() throws IOException{
		      System.out.println("ÆÇ¸Å·®¿¡ µû¸¥ ³»¸²Â÷¼ø Á¤·Ä");
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
//      System.out.println("ÆÇ¸Å·®¿¡ µû¸¥ ³»¸²Â÷¼ø Á¤·Ä");
//      Collections.sort(bv);
//      System.out.println();
//      for (int i=0; i<bv.size(); i++) {
//         System.out.println("Ã¥ ÀÌ¸§ : " + bv.get(i).getBookTitle() + "," + (i+1) + "À§ : " + bv.get(i).getBookSale());
//      }
//   }

   
	   /**
	    * µµ¼­ »èÁ¦ ¸Þ¼Òµå
	    * 
	    * ±âÁ¸¿¡ µ¥ÀÌÅÍµéÀÌ ÀúÀåµÈ ÆÄÀÏ ÇÏ³ª¾¿ ÀÐ¾îµå¸®¸ç º¹»ç½ÃÅ³ ÅØ½ºÆ® ÆÄÀÏ¿¡ ³ÖÀ¸¸ç,
	    * »èÁ¦¸¦ ½ÃÅ³ °ª(Ã¥ÀÇ Á¦¸ñ)À» ÀÔ·ÂÇÏ¿© °°Àº°ªÀ» È®ÀÎÇÑ´Ù¸é, ±× °ª¸¸ »èÁ¦½ÃÅ°°í ´Ù º¹»ç ÇÏ¿© ±âÁ¸ ÅØ½ºÆ® ÆÄÀÏ¿¡ ÀúÀåÇÔ
	    * 
	    * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
	    */
   void deleteBook1() throws IOException {
	      System.out.print("»èÁ¦ÇÒ Ã¥ Á¦¸ñÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");     
	      String bT = s.nextLine();
	      s.nextLine();
	      
	      File inputFile = new File("stockBook.txt"); //±âÁ¸ÅØ½ºÆ®ÆÄÀÏ
	      File tempFile = new File("newstockBook.txt"); //º¹»ç½ÃÅ³ ÅØ½ºÆ®ÆÄÀÏ

	      BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	      BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

	      String lineToRemove = bT;
	      String currentLine;

	      while((currentLine = reader.readLine()) != null) {            
	          String trimmedLine = currentLine.trim();
	          if(trimmedLine.contains("Ã¥ Á¦¸ñ: "+lineToRemove+"\t")) continue;
	          writer.write(currentLine + System.getProperty("line.separator"));
	      }
	      
	      System.out.println("ÇØ´ç µµ¼­ÀÇ Á¤º¸¸¦ ¸ðµÎ »èÁ¦Çß½À´Ï´Ù.");
	      writer.close(); 
	      reader.close();
	      

	      if(inputFile.exists() && tempFile.exists()) {  //ÆÄÀÏ »èÁ¦ ¹× ÀÌ¸§¹Ù²Ù±â             
	         inputFile.delete();                      
	           tempFile.renameTo(new File("stockBook.txt"));                             
	       } else {
	           System.out.println("ÆÄÀÏÀÌ Á¸ÀçÇÏÁö ¾Ê½À´Ï´Ù.");
	       }
	                                         
	   }

	  
   /**
    * µµ¼­ »èÁ¦ ¸Þ¼Òµå
    * 
    * ±âÁ¸¿¡ µ¥ÀÌÅÍµéÀÌ ÀúÀåµÈ ÆÄÀÏ ÇÏ³ª¾¿ ÀÐ¾îµå¸®¸ç, º¹»ç½ÃÅ³ ÅØ½ºÆ® ÆÄÀÏ¿¡ ³ÖÀ¸¸ç
    * »èÁ¦¸¦ ½ÃÅ³ °ª(Ã¥ ÄÚµå)À» ÀÔ·ÂÇÏ¿© °°Àº°ªÀ» È®ÀÎÇÑ´Ù¸é, ±× °ª¸¸ »èÁ¦½ÃÅ°°í ´Ù º¹»ç ÇÏ¿© ±âÁ¸ ÅØ½ºÆ® ÆÄÀÏ¿¡ ÀúÀåÇÔ
    * 
    * @throws java.io.IOException ÀÔÃâ·Â °ü·Ã
    */
	   void deleteBook2() throws IOException{
	      System.out.print("»èÁ¦ÇÒ Ã¥ ÄÚµå¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
	      String bT = s.nextLine();
	      for (int i=0; i<bv.size(); i++) {
	         if (bv.get(i) == null) {
	            //System.out.println("null°ªÀÔ´Ï´Ù.");
	         }
	         else if (bT.equals(bv.get(i).getBookCode())) {
	            System.out.println(bv.get(i).getBookTitle() + " Ã¥ÀÌ »èÁ¦µÇ¾ú½À´Ï´Ù.");
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
	          if(trimmedLine.contains("Ã¥ ÄÚµå: "+lineToRemove+"\t")) continue;
	          writer.write(currentLine + System.getProperty("line.separator"));
	      }
	      System.out.println("ÇØ´ç µµ¼­ÀÇ Á¤º¸¸¦ ¸ðµÎ »èÁ¦Çß½À´Ï´Ù.");
	      writer.close(); 
	      reader.close(); 
	      
	      if(inputFile.exists() && tempFile.exists()) {  //ÆÄÀÏ »èÁ¦¹× ÀÌ¸§¹Ù²Ù±â             
	         inputFile.delete();                      
	           tempFile.renameTo(new File("stockBook.txt"));                             
	       } else {
	           System.out.println("ÆÄÀÏÀÌ Á¸ÀçÇÏÁö ¾Ê½À´Ï´Ù.");
	       }
	   }
   
	   /**
	    * µµ¼­ ´ëÃâ¿ë ¸Þ¼Òµå
	    * 
	    * u ÀÇ overdueÀÇ °ªÀ» ÅëÇØ ¿¬Ã¼µÇ¾îÀÖ´Â »ç¿ëÀÚÀÎÁö ÆÇ´ÜÇÔ
	    * ¿¬Ã¼µÇ¾îÀÖÁö¾Ê´Ù¸é ¿À´ÃÀÇ ³¯Â¥¸¦ yyyyMMddÇü½ÄÀ¸·Î ÀÔ·Â¹Þ¾Æ ±× Ã¥ÀÇ borrow¿¡ ÀúÀå
	    * 
	    * @return ¿¬Ã¼ÀÌ·Â ÀÖÀ»½Ã ´ë¿© ºÒ°¡´É
	    * @param u ·Î±×ÀÎ ÇÏ¿© µµ¼­¸¦ ´ëÃâÇÒ À¯Àú
	    * <p>{@link User#getOverdue()} ÂüÁ¶</p>
	    *
	    */
   void borrowBook(User u)
   {
      
      System.out.println("À¯Àú È®ÀÎ");
        String ID = s.nextLine();
        
        if(ID.equals(u.getID())) 
        {
           if (u.getOverdue() > 0)//¿¬Ã¼ ÀÌ·ÂÀÌ ÀÖ´ÂÁö È®ÀÎ
           {
              System.out.println("¿¬Ã¼ ÀÌ·ÂÀÌ ÀÖ±â¿¡"+(u.getOverdue()-14)+"ÀÏ µ¿¾È ´ë¿© ºÒ°¡´É");
              return;
           }
        }
      
        System.out.print("ºô¸± Ã¥ÀÇ Á¦¸ñ¸¦ ¸»ÇØÁÖ¼¼¿ä : ");
        String bName = s.nextLine();
        for(int i = 0; i<bv.size();i++)
        {
           if(bv.get(i)!=null )
           {
              if(bName.equals(bv.get(i).getBookTitle())) 
              {
                      
                 if(bv.get(i).getBorrow() != MenuNum.num0 )//borrow¿¡´Â ´ëÃâ½Ã¿¡ ´ëÃâÀÏÀÌ yyyyMMdd Çü½ÄÀ¸·Î ÀúÀåµÇ¾îÀÕÀ½
                 {
                    System.out.println("ÀÌ¹Ì ´ëÃâ");break;
                 }
                 else 
                 {
                    System.out.println("¿À´Ã ³¯Â¥¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä(yyyyMMdd 8ÀÚ¸® Çü½ÄÀ¸·Î) : ");
                    int today = s.nextInt();
                    s.nextLine();
                    bv.get(i).setBorrow(today);//´ëÃâ³¯Â¥¸¦ borrow¿¡ ÀúÀå
                    break;
                 }
              }   
         
           }
        }
   }
   
   /**
    *µµ¼­ ¹Ý³³¿ë ¸Þ¼Òµå  
    *
    *¹Ý³³½ÃÀÇ ³¯Â¥¸¦ ÀÔ·Â¹Þ¾Æ ´ë¿© ±â°£ 2ÁÖ¿¡¼­ ¾ó¸¶³ª ¿¬Ã¼µÇ¾ú´ÂÁö °è»êÈÄ
    *¿¬Ã¼³¯¸¸Å­ uÀÇ overdue °ªÀ» ´õÇØ ¿¬Ã¼ ÀÏ¼ö¸¦ ´Ã¸²
    *
    *@param u ·Î±×ÀÎ ÇÏ¿© µµ¼­¸¦ ¹Ý³³ÇÒ À¯Àú
    */
   void returnBook(User u) 
   {   
       System.out.print("¹Ý³³ÇÒ Ã¥ÀÌ Á¦¸ñÀ» ¸»ÇØÁÖ¼¼¿ä : ");
       String bName = s.nextLine();

      for(int i = 0; i<bv.size();i++)
      {
         if(bv.get(i)!=null )
         {
            if( bName.equals(bv.get(i).getBookTitle())) 
            {
               if(bv.get(i).getBorrow() == MenuNum.num0)
               {
                  System.out.println("ÀÌ¹Ì ¹Ý³³");
                  break;
               }
               else 
               {
                  long overdue; //¿¬Ã¼ÀÏ¼ö¸¦ ÀúÀåÇÏ´Â º¯¼ö
                  SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");//³¯Â¥¸¦ ÀÔ·Â¹Þ´Â Çü½Ä ÁöÁ¤           
                  Date rt = new Date(); //¹Ý³³ ³¯Â¥¸¦ ÀúÀåÇÏ´Â º¯¼ö
                  Date br = new Date(); //´ëÃâ ³¯Â¥¸¦ ÀúÀåÇÏ´Â º¯¼ö
                  String temp;
              
                  temp = "" + bv.get(i).getBorrow();
                  System.out.println("¿À´Ã ³¯Â¥¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä (yyyyMMdd 8ÀÚ¸®·ÎÀÔ·ÂÇØÁÖ¼¼¿ä) : ");
                  //rt = sdf.parse(s.nextLine());
                  //br = sdf.parse(temp);//parse¸¦ ÅëÇØ stringÀ» date·Î º¯È¯
                  try//StringÀ» date Çü½ÄÀ¸·Î º¯È¯ÇÒ½Ã ÀÌÅ¬¸³¿¡¼­ parseexception ¿¡·¯°¡³ª¿À±â¶§¹®¿¡ try catch¹® ¾È¿¡ ²À ³Ö¾î¾ßÇÔ
                  {
                     rt = sdf.parse(s.nextLine());
                     br = sdf.parse(temp);
                  }
                  catch(Exception e)
                  {
                     //TODO: handle exception
                  }
                  overdue = TimeUnit.DAYS.convert(Math.abs(rt.getTime() - br.getTime()), TimeUnit.MILLISECONDS);//´ë¿©±â°£À» ±¸ÇÔ
                  if (overdue > 14)//´ë¿©ÃÖ´ë ±â°£Àº 2ÁÖ
                  {
                     System.out.println((overdue-14) + "ÀÏ ¸¸Å­ ¿¬Ã¼µÇ¾ú½À´Ï´Ù. ¿¬Ã¼µÈ ÀÏ¼ö ¸¸Å­ ´ë¿©°¡ ºÒ°¡´ÉÇÕ´Ï´Ù.");
                     bv.get(i).setBorrow(MenuNum.num0);//¹Ý³³Àº µÇ¾úÀ¸´Ï borrow´Â 0À¸·Î ¼³Á¤
                     u.setOverdue((int)(overdue));//¿¬Ã¼µÈ À¯Àú¸¦ ±¸ºÐÇÏ±â À§ÇØ ¿¬Ã¼ÀÏ¼ö ¸¸Å­ overdue¸¦ Àç¼³Á¤
                     break;
                  }
                  System.out.println("¹Ý³³ ¼º°ø");
                  bv.get(i).setBorrow(MenuNum.num0) ;
                  break;
               }
            }
         }
         
      }
   }

}