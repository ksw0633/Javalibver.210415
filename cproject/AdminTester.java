//package cproject;
//import java.util.*;
//
//public class AdminTester {
//
//	public static void main(String[] args) {
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
//		System.out.print("관리자면 1, 회원이면 2 직원이면 3를 입력해주세요 : ");
//		checkNum = adminHandler.CheckAD();
//		
//		do {
//			if(checkNum==1) {
//				//do {
//					 if(adminHandler.LoginCnt == 0) {
//								adminHandler.Login(a);
//							
//						 }else {
//						 System.out.println("관리자 계정입니다. 기능을 선택하세요 : ");
//						 System.out.println("1 : 회원 등록");
//						 System.out.println("2 : 회원 정보 출력");
//						 System.out.println("3 : 회원 검색");
//						 System.out.println("4 : 회원 삭제");
//						 System.out.println("5 : 회원 정렬");
//						 System.out.println("6 : 로그아웃");
//						 System.out.println("0 : 기능선택창으로 이동");
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
//				//}while(num!=0);
//			}
//				
//				else if(checkNum==2) {
//					//do {
//					 if(adminHandler.LoginCnt == 0) {
//						System.out.println("기능 선택");
//						System.out.println("1 : 로그인 ");
//						System.out.println("2 : 회원가입 ");
//						num = s.nextInt();
//						if(num == 1)
//							adminHandler.userLogin(u);
//						else if(num == 2) {
//							adminHandler.registerUser(u);
//							}
//
//					 }else {
//					 System.out.println("사용자 계정입니다. 기능을 선택하세요 : ");
//					 System.out.println("1 : 정보 찾기");
//					 System.out.println("2 : 회원 탈퇴");
//					 System.out.println("3 : 도서 관리");
//					 System.out.println("4 : 로그아웃 ");
//					 System.out.println("5 : 회원정보");
//					num = s.nextInt();
//					
//					switch(num)
//					{
//						case 1 : System.out.print("1 : ID 찾기 2 : PW 찾기");
//							num = s.nextInt();
//						if(num == 1)
//						{
//							adminHandler.findID(u);break;
//						}
//						else if(num == 2)
//						{
//							adminHandler.findPW(u);break;
//						}else
//							System.out.println("잘못된입력");
//						
//						case 2 : adminHandler.removeUser(u);break;
//						case 3 : 
//							do {
//						System.out.println("\n원하는 메뉴를 선택하세요");
//				         System.out.println("1. 도서 입력");
//				         System.out.println("2. 도서 출력");
//				         System.out.println("3. 도서 검색");
//				         System.out.println("4. 도서 정렬");
//				         System.out.println("5. 도서 삭제");
//				         System.out.println("6. 도서 반납 대여");
//				         System.out.println("0. 종료");
//				         num =s.nextInt();
//				         
//				         switch(num) {
//				         case 1 : System.out.println("책의 개수는 5개까지 입력 가능하며 5개이후로 입력 시 데이터가 초기화됩니다.");
//				        	 b1.inputBook();break;
//				         case 2 : b1.outBook(); break;
//					     case 3 : System.out.println("제목 검색  : 1, 저자 검색  : 2, 출판사 검색 : 3, 북코드 검색 : 4, 가격 검색 : 5, 판매량 검색 : 6, 연도 검색 : 7 "); 
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
//					               System.out.println("잘못된 값입니다.");break;
//					            
//					         case 4 : b1.sortBook(); break;
//					         case 5 : System.out.println("책 제목으로 삭제 : 1, 책 코드로 삭제  : 2, 어떤구조로 삭제되는지 실행: 3");
//						         num = s.nextInt();
//						         if(num == 1) {
//						            b1.deleteBook1(); break;
//						         }
//						         else if(num == 2) {
//						            b1.deleteBook2(); break;
//						         }
//					            else
//					               System.out.println("잘못된 값입니다.");break;
//					     
//					         case 6 : System.out.println("대출하기  : 1, 반납하기  : 2"); 
//					         num = s.nextInt();
//					            if(num == 1) {
//					            b1.borrowBook(); break;
//					            }
//					            else if(num == 2) {
//					               b1.returnBook();break;
//					            }
//					            else
//					               System.out.println("잘못된 값입니다.");break;
//					         }
//							
//							}while(num!=0);	
//							if(num == 0)
//								System.out.println();
//						case 4 : adminHandler.Logout();break;
//						case 5 : adminHandler.showUser(u);break;
//						}
//					}
//				//}while(checkNum!=0);
//				}else if(checkNum==3) {
//						//do {
//							 if(adminHandler.LoginCnt == 0) {
//										adminHandler.Login(e);
//									
//								 }else {
//								 System.out.println("직원 계정입니다. 기능을 선택하세요 : ");
//								 System.out.println("1 : 회원 등록");
//								 System.out.println("2 : 회원 정보 출력");
//								 System.out.println("3 : 회원 검색");
//								 System.out.println("4 : 회원 삭제");
//								 System.out.println("5 : 회원 정렬");
//								 System.out.println("0 : 기능선택창으로 이동");
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
//					System.out.println("잘못된 입력 값입니다.");
//				
//		System.out.println("계속 하시려면 1번, 관리자/사용자/직원 변환은 2번 종료는 0번 ? : ");
//		retry = s.nextInt();
//		if(retry == 0)
//		{
//			adminHandler.Logout();
//		}else if(retry ==2)
//		{
//			System.out.print("관리자면 1, 회원이면 2 직원이면 3를 입력해주세요 : ");
//			checkNum = adminHandler.CheckAD();
//			adminHandler.LoginCnt = 0;
//		}
//	}while(retry!=0);
//	}
//}
