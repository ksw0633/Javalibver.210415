//package cproject;
//import java.io.IOException;
//import java.util.*;
//
//public class MainTester {
//
//	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		AdminHandler adminHandler = new AdminHandler();
//		BookHandler b1 = new BookHandler();
//		User u = new User();
//		Admin a = new Admin();
//		Employee e = new Employee();
//		Vector<User> v = new Vector<User>();
//		
//		int checkNum;
//		int num = 0;
//		int retry = 0;
//		
//		System.out.print("�����ڸ� 1, ȸ���̸� 2 �����̸� 3�� �Է����ּ��� : ");
//		checkNum = adminHandler.CheckAD();
//		
//		do {
//			if(checkNum==1) {
//					 if(adminHandler.LoginCnt == 0) {
//								adminHandler.Login(a);
//							
//						 }else {
//						 System.out.println("������ �����Դϴ�. ����� �����ϼ��� : ");
//						 System.out.println("1 : ȸ�� ���");
//						 System.out.println("2 : ȸ�� ���� ���");
//						 System.out.println("3 : ȸ�� �˻�");
//						 System.out.println("4 : ȸ�� ����");
//						 System.out.println("5 : ȸ�� ����");
//						 System.out.println("6 : �α׾ƿ�");
//						 System.out.println("0 : ��ɼ���â���� �̵�");
//						num = s.nextInt();
//						
//						switch(num)
//						{
//							case 1 : adminHandler.registerUser(u);break;
//							case 2 : adminHandler.showUser(u);break;
//							case 3 : adminHandler.searchUser(u);break;
//							case 4 : adminHandler.deleteUser(u);break;
//							case 5 : adminHandler.sortUser(u);break;
//							case 6 : adminHandler.Logout();break;
//							case 0 : break;
//						}
//					}
//			}
//				
//				else if(checkNum==2) {
//					 if(adminHandler.LoginCnt == 0) {
//						System.out.println("��� ����");
//						System.out.println("1 : �α��� ");
//						System.out.println("2 : ȸ������ ");
//						num = s.nextInt();
//						if(num == 1)
//							adminHandler.userLogin(u);
//						else if(num == 2) {
//							adminHandler.registerUser(u);
//							}
//
//					 }else {
//					 System.out.println("����� �����Դϴ�. ����� �����ϼ��� : ");
//					 System.out.println("1 : ���� ã��");
//					 System.out.println("2 : ȸ�� Ż��");
//					 System.out.println("3 : ���� ����");
//					 System.out.println("4 : �α׾ƿ� ");
//					 System.out.println("5 : ȸ������");
//					 System.out.println("6 : ������ �¼� �̿�");
//					 
//					num = s.nextInt();
//					
//					switch(num)
//					{
//						case 1 : System.out.print("1 : ID ã�� 2 : PW ã��");
//							num = s.nextInt();
//						if(num == 1)
//						{
//							adminHandler.findID(u);break;
//						}
//						else if(num == 2)
//						{
//							adminHandler.findPW(u);break;
//						}else
//							System.out.println("�߸����Է�");
//						
//						case 2 : adminHandler.removeUser(u);break;
//						case 3 : 
//							do {
//						System.out.println("\n���ϴ� �޴��� �����ϼ���");
//				         System.out.println("1. ���� �Է�");
//				         System.out.println("2. ���� ���");
//				         System.out.println("3. ���� �˻�");
//				         System.out.println("4. ���� ����");
//				         System.out.println("5. ���� ����");
//				         System.out.println("6. ���� �ݳ� �뿩");
//				         System.out.println("0. ����");
//				         num =s.nextInt();
//				         
//				         switch(num) {
//				         case 1 : System.out.println("å�� ������ 5������ �Է� �����ϸ� 5�����ķ� �Է� �� �����Ͱ� �ʱ�ȭ�˴ϴ�.");
//				        	 b1.inputBook();break;
//				         case 2 : b1.outBook(); break;
//					     case 3 : System.out.println("���� �˻�  : 1, ���� �˻�  : 2, ���ǻ� �˻� : 3, ���ڵ� �˻� : 4, ���� �˻� : 5, �Ǹŷ� �˻� : 6, ���� �˻� : 7 "); 
//					            num = s.nextInt();
//					            if(num==1) {
//					            b1.searchBook(); break;
//					            }
//					            else if(num==2){
//					               b1.searchBook2(); break;
//					            }
//					            else if(num==3){
//					               b1.searchBook3(); break;
//					            }
//					            else if(num==4){
//					               b1.searchBook4(); break;
//					            }
//					            else if(num==5){
//					               b1.searchBook5(); break;
//					            }
//					            else if(num==6){
//					               b1.searchBook6(); break;
//					            }
//					            else if(num==7){
//					               b1.searchBook7(); break;
//					            }else 
//					               System.out.println("�߸��� ���Դϴ�.");break;
//					            
//					         case 4 : b1.sortBook(); break;
//					         case 5 : System.out.println("å �������� ���� : 1, å �ڵ�� ����  : 2, ������� �����Ǵ��� ����: 3");
//						         num = s.nextInt();
//						         if(num == 1) {
//						            b1.deleteBook1(); break;
//						         }
//						         else if(num == 2) {
//						            b1.deleteBook2(); break;
//						         }
//					            else
//					               System.out.println("�߸��� ���Դϴ�.");break;
//					     
//					         case 6 : System.out.println("�����ϱ�  : 1, �ݳ��ϱ�  : 2"); 
//					         num = s.nextInt();
//					            if(num == 1) {
//					            b1.borrowBook(u); break;
//					            }
//					            else if(num == 2) {
//					               b1.returnBook(u);break;
//					            }
//					            else
//					               System.out.println("�߸��� ���Դϴ�.");break;
//					         }
//							
//							}while(num!=0);	
//							if(num == 0)
//								System.out.println();
//						case 4 : adminHandler.Logout();break;
//						case 5 : adminHandler.showUser(u);break;
//						case 6 : adminHandler.readingRoomUse();break;
//						}
//					}
//				}else if(checkNum==3) {
//							 if(adminHandler.LoginCnt == 0) {
//										adminHandler.Login(e);
//									
//								 }else {
//								 System.out.println("���� �����Դϴ�. ����� �����ϼ��� : ");
//								 System.out.println("1 : ȸ�� ���");
//								 System.out.println("2 : ȸ�� ���� ���");
//								 System.out.println("3 : ȸ�� �˻�");
//								 System.out.println("4 : ȸ�� ����");
//								 System.out.println("5 : ȸ�� ����");
//								 System.out.println("0 : ��ɼ���â���� �̵�");
//								num = s.nextInt();
//								
//								switch(num)
//								{
//									case 1 : adminHandler.registerUser(e);break;
//									case 2 : adminHandler.showUser(e);break;
//									case 3 : adminHandler.searchUser(e);break;
//									case 4 : adminHandler.deleteUser(e);break;
//									case 5 : adminHandler.sortUser(e);break;
//									case 0 : break;
//								}
//							}
//				}
//				else
//					System.out.println("�߸��� �Է� ���Դϴ�.");
//				
//		System.out.println("��� �Ͻ÷��� 1��, ������/�����/���� ��ȯ�� 2�� ����� 0�� ? : ");
//		retry = s.nextInt();
//		if(retry == 0)
//		{
//			adminHandler.Logout();
//		}else if(retry ==2)
//		{
//			System.out.print("�����ڸ� 1, ȸ���̸� 2 �����̸� 3�� �Է����ּ��� : ");
//			checkNum = adminHandler.CheckAD();
//			adminHandler.LoginCnt = 0;
//		}
//	}while(retry!=0);
//	}
//}
//
//
//
//
//
package cproject;

import java.util.*;
import java.io.*;
/**
 * ���� ���� �׽���
 * 
 * 
 * 
 * @author SHY-702-01
 * @since 2021.04.07
 *
 */
public class MainTester {
	/**

	 *�ڵ鷯 Ŭ������ ���� �޼ҵ带 ȣ���Ͽ�
	 * �� ��ɵ���  �ҷ��� ������ ����Ŭ���� ��
	 * @param args
	 * @throws java.io.IOException ����� ����
	 * 
	 * 
	 * <p>����
	 * {@link AdminHandler}
	 * {@link BookHandler}
	 * </p> 
	 */
   public static void main(String[] args) throws IOException {

      Scanner s = new Scanner(System.in);
      AdminHandler adminHandler = new AdminHandler();
      BookHandler b1 = new BookHandler();
      User u = new User();
      Admin a = new Admin();
      Employee e = new Employee();
      Vector<User> v = new Vector<User>();
      
      int checkNum;
      int num = 0;
      int retry = 0;
      
      System.out.println("������..1, ȸ��..2, ����..3");
      checkNum = adminHandler.CheckAD();
      
      do {
         if (checkNum ==  MenuNum.num1) {
            if (adminHandler.LoginCnt ==  MenuNum.num0) {
               adminHandler.Login(a);
            }
            else {
               System.out.println("������ �����Դϴ�. ����� �����ϼ��� : ");
               System.out.println("1 : ȸ�� ���");
               System.out.println("2 : ȸ�� ���� ���");
               System.out.println("3 : ȸ�� �˻�");
               System.out.println("4 : ȸ�� ����");
               System.out.println("5 : ȸ�� ����");
               System.out.println("6 : ���� ����");
               System.out.println("7 : �α׾ƿ�");
               System.out.println("0 : ��ɼ���â���� �̵�");
               num = s.nextInt();
                  
               switch (num) {
               case  MenuNum.num1 : adminHandler.registerUser(u); break;
               case MenuNum.num2 : adminHandler.showUser(u); break;
               case MenuNum.num3 : adminHandler.searchUser(u); break;
               case MenuNum.num4 : adminHandler.deleteUser(u); break;
               case MenuNum.num5 : adminHandler.sortUser(u); break;
               case MenuNum.num6 : 
                  do {
                     System.out.println("���ϴ� �޴��� �����ϼ���");
                     System.out.println("1. ���� �Է�");
                     System.out.println("2. ���� ���");
                     System.out.println("3. ���� �˻�");
                     System.out.println("4. ���� ����");
                     System.out.println("5. ���� ����");
                     System.out.println("6. ���� �ݳ� �뿩");
                     System.out.println("0. ����");
                     num =s.nextInt();
                     switch (num) {
                     case MenuNum.num1 : b1.inputBook(); break;
                     case MenuNum.num2 : b1.outBook(); break;
                     case MenuNum.num3 : b1.searchBook(); break;
                     case MenuNum.num4 : b1.sortBook(); break;
                     case MenuNum.num5 : System.out.println("å �������� ����..1, å �ڵ�� ����..2");
                     num = s.nextInt();
                     if (num == MenuNum.num1) {
                        b1.deleteBook1(); break;
                     }
                     else if (num == MenuNum.num2) {
                        b1.deleteBook2(); break;
                     }
                     else
                        System.out.println("�߸��� ���Դϴ�."); break;
                     case 6 : System.out.println("�����ϱ�..1, �ݳ��ϱ�..2"); 
                     num = s.nextInt();
                     if (num == MenuNum.num1) {
                        b1.borrowBook(u); break;
                     }
                     else if (num == MenuNum.num2) {
                        b1.returnBook(u); break;
                     }
                     else
                        System.out.println("�߸��� ���Դϴ�."); break;
                     }
                              
                  } while (num != MenuNum.num0);   
                  if (num == MenuNum.num0)
                     System.out.println();
               case MenuNum.num7 : adminHandler.Logout(); break;
               case MenuNum.num0 : break;
               }
            }

         }
         
         else if (checkNum == MenuNum.num2) {
            if (adminHandler.LoginCnt == MenuNum.num0) {
               System.out.println("��� ����");
               System.out.println("1 : �α���");
               System.out.println("2 : ȸ������");
               num = s.nextInt();
               if (num == MenuNum.num1)
                  adminHandler.userLogin(u);
               else if (num == MenuNum.num2) {
                  adminHandler.registerUser(u);
               }
            }
            else {
                  System.out.println("����� �����Դϴ�. ����� �����ϼ���.");
                  System.out.println("1 : ���� ã��");
                  System.out.println("2 : ȸ�� Ż��");
                  System.out.println("3 : ������ ����");
                  System.out.println("4 : �α׾ƿ�");
                  System.out.println("5 : ȸ������");
                  num = s.nextInt();
                  switch (num) {
                  case MenuNum.num1 : System.out.print("ID ã��..1, PW ã��..2");
                  num = s.nextInt();
                  if (num == MenuNum.num1) {
                     adminHandler.findID(u); break;
                  }
                  else if (num == MenuNum.num2) {
                     adminHandler.findPW(u); break;
                  }
                  else {
                     System.out.println("�߸����Է�");
                  }
                  case MenuNum.num2 : adminHandler.removeUser(u); break;
                  case MenuNum.num3 : 
                     do {
                        System.out.println("���ϴ� �޴��� �����ϼ���");
                        System.out.println("1. ���� ���");
                        System.out.println("2. ���� �˻�");
                        System.out.println("3. ���� ����");
                        System.out.println("4. ���� �ݳ� �뿩");
                        System.out.println("5. ������ �̿�");
                        System.out.println("0. ����");
                        num =s.nextInt();
                        switch (num) {
                        case MenuNum.num1 : b1.outBook(); break;
                        case MenuNum.num2 : b1.searchBook(); break;
                        case MenuNum.num3 : b1.sortBook(); break;
                        case MenuNum.num4 : System.out.println("�����ϱ�..1, �ݳ��ϱ�..2"); 
                        num = s.nextInt();
                        if (num == MenuNum.num1) {
                           b1.borrowBook(u); break;
                           }
                           else if (num == MenuNum.num2) {
                              b1.returnBook(u); break;
                           }
                           else {
                              System.out.println("�߸��� ���Դϴ�."); break;
                           }
                        case MenuNum.num5 : adminHandler.readingRoomUse();break;
                        }
                     
                     } while (num != MenuNum.num0);   
                     if (num == MenuNum.num0)
                        System.out.println();
                  case MenuNum.num4 : adminHandler.Logout();break;
                  case MenuNum.num5 : adminHandler.showUser(u);break;
                  }
               }
         }
            
         else if (checkNum == 3) {
            if (adminHandler.LoginCnt == 0) {
               adminHandler.Login(e);
            }
            else {
               System.out.println("���� �����Դϴ�. ����� �����ϼ��� : ");
               System.out.println("1 : ȸ�� ���");
               System.out.println("2 : ȸ�� ���� ���");
               System.out.println("3 : ȸ�� �˻�");
               System.out.println("4 : ȸ�� ����");
               System.out.println("5 : ȸ�� ����");
               System.out.println("6 : ���� ����");
               System.out.println("7 : �α׾ƿ�");
               System.out.println("0 : ��ɼ���â���� �̵�");
               num = s.nextInt();
               switch (num) {
               case MenuNum.num1 : adminHandler.registerUser(e); break;
               case MenuNum.num2 : adminHandler.showUser(e); break;
               case MenuNum.num3 : adminHandler.searchUser(e); break;
               case MenuNum.num4 : adminHandler.deleteUser(e); break;
               case MenuNum.num5 : adminHandler.sortUser(e); break;
               case MenuNum.num6 : 
                  do {
                     System.out.println("���ϴ� �޴��� �����ϼ���");
                     System.out.println("1. ���� �Է�");
                     System.out.println("2. ���� ���");
                     System.out.println("3. ���� �˻�");
                     System.out.println("4. ���� ����");
                     System.out.println("5. ���� ����");
                     System.out.println("6. ���� �ݳ� �뿩");
                     System.out.println("0. ����");
                     num =s.nextInt();
                     switch (num) {
                     case MenuNum.num1 : b1.inputBook(); break;
                     case MenuNum.num2 : b1.outBook(); break;
                     case MenuNum.num3 : b1.searchBook(); break;
                     case MenuNum.num4 : b1.sortBook(); break;
                     case MenuNum.num5 : System.out.println("å �������� ����..1, å �ڵ�� ����..2");
                     num = s.nextInt();
                     if (num == MenuNum.num1) {
                        b1.deleteBook1(); break;
                     }
                     else if (num == MenuNum.num2) {
                        b1.deleteBook2(); break;
                     }
                     else {
                        System.out.println("�߸��� ���Դϴ�."); break;
                     }
                     case MenuNum.num6 : System.out.println("�����ϱ�  : 1, �ݳ��ϱ�  : 2"); 
                     num = s.nextInt();
                     if (num == MenuNum.num1) {
                        b1.borrowBook(u); break;
                     }
                     else if (num == MenuNum.num2) {
                        b1.returnBook(u); break;
                     }
                     else {
                        System.out.println("�߸��� ���Դϴ�."); break;
                     }
                     }
                                 
                  } while (num != MenuNum.num0);   
                  if (num == MenuNum.num0)
                     System.out.println();
               case MenuNum.num7 : adminHandler.Logout(); break;
               case MenuNum.num0 : break;
               }
            }
         }
         else
            System.out.println("�߸��� �Է� ���Դϴ�.");
         
         System.out.println("��� �Ͻ÷��� 1��, ������/�����/���� ��ȯ�� 2�� ����� 0�� ? : ");
         retry = s.nextInt();
         if (retry == MenuNum.num0) {
            adminHandler.Logout();
         }
         else if (retry == MenuNum.num2) {
            System.out.print("������..1, ȸ��..2 ����..3");
            checkNum = adminHandler.CheckAD();
            adminHandler.LoginCnt = MenuNum.num0;
         }
            
      } while (retry != MenuNum.num0);
      
   }
      
}