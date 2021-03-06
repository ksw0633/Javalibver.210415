package cproject1;

import java.util.*;
import java.util.regex.Pattern;
import java.io.*;
import java.text.SimpleDateFormat;


/**
 * AdminHandler는 admin과 user를 기반으로 만든 Controller class 입니다.
 * <br>Scanner를 통하여 각각의 정보를 사용자로 입력받습니다.
 * <br>이 클래스는 Controller class로 다음과 같은 함수를 사용 할 수 있다.
 * CheckAD를 통해 관리자인지 아닌지 입력값을 통하여 확인합니다.
 * adminID와adminPW를 통해 관리자가 맞는지 확인하기 위해 아이디와 비밀번호를 임의로 설정해 줍니다.
 * employeeID와 employeePW를 통해 직원이 맞는지 확인하기 위해 아이디와 비밀번호를 임의로 설정해 줍니다.
 * timerBuffer를 통해 시간을 관리하는 프로그램을 만들어 줍니다.
 * <br>{@link #Login(User)}은 관리자와 직원의 로그인을 돕는 함수입니다.
 * <br>{@link #userLogin(User)}은 유저의 로그인을 돕는 함수입니다.
 * <br>{@link #Logout()}은 로그아웃을 돕는 함수입니다.
 * <br>{@link #registerUser(User)}는 회원가입을 위한 함수로 사용됩니다.
 * <br>{@link #showUser(User)}는 사용자가 관리자로 로그인했을 경우에 관리자가 유저클레스의 모든 정보를 가지고 올 수있게 하기위해 만든 함수입니다.
 * <br>{@link #findID(User)}는 사용자가 이름을 입력하여 아이디를 찾는 함수입니다.
 * <br>{@link #findPW(User)}는 사용자가 아이디를 입력하여 패스워드를 찾는 함수입니다.
 * <br>{@link #removeUser(User)}는 유저가 탈퇴할 수 있도록 만들어 준 함수입니다.
 * <br>{@link #searchUser(User)}는 사용자가 관리자로 로그인했을 경우에 관리자가  유저를 검색할 수 있게 하기 위해 만든 함수입니다.
 * <br>{@link #deleteUser(User)}는 사용자가 관리자로 로그인했을 경우에 관리자가 유저를 삭제하는 함수입니다.
 * <br>{@link #sortUser(User)}는 사용자가 관리자로 로그인했을 경우에 관리자가 유저목록을 정렬할때 사용하는 함수 입니다.
 * <br>{@link #readingRoomUse()}는 독서실을 대여할 수 있는 함수입니다.
 * <br>{@link #secToHHMMSS()}는 독서실의 타이머를 위한 시스템 함수입니다.
 * @see User#User()
 * @see User#User(String, String, String, String)
 * @see ReadingRoom#ReadingRoom()
 * @see ReadingRoom#ReadingRoom(String, String, String, String, int)
 * @see ReadingRoom#ReadingRoom()
 * @author SHY-702-04
 * 
 *
 */



public class AdminHandler {
	
	
	/**
	 *Scanner를 통하여 사용자가 값을 입력할 수 있게 도와줍니다. 
	 */
	
	
	Scanner s;
	
	
	/**
	 *LoginCnt를 통해 로그인 여부를 확인합니다.1이면 로그인성공, 0이면 로그아웃 
	 */
	
	public int LoginCnt = MenuNum.logOut;
	
	
	/**
	 *AdminCheck를 통해 관리자 여부 판단합니다. 0이면 관리자 아님, 1이면 관리자 
	 */
	
	public int AdminCheck;
	
	
	/**
	 *User를 생성자를 호출하여 User class의 모든 변수를 사용 가능하도록 만들어 줍니다. 
	 */

	User u = new User();

	
	/**
	 * 벡터를 이용하여 User와 User에 상속된 값을(Admin,Employee) 사용 할 수 있게 합니다. 
	 */
	
	Vector<User> v = new Vector<User>();
	

	/**
	 * ReadingRoom을 생성자로 호출하여 도서관의 대여를 돕는 ReadingRoom class를 사용가능하게 해줍니다.
	 */
	
	ReadingRoom rent = new ReadingRoom(); 
	
	/**
	 * ReadingRoom를 배열으로 재호출하여 각 배열값으로 넣어줍니다.
	 */
	ReadingRoom[] r1 = new ReadingRoom[200];
	
//	public String adminID = "admin";
//	public String adminPW = "admin";
//	public String employeeID = "emp";
//	public String employeePW = "emp";	
	
	/**
	 * 
	 */
	public static String timerBuffer;
	Date date = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static int count;
    Timer timer = new Timer();
    Calendar cal = Calendar.getInstance();
    /**
	 * 디폴트 생성자 
	 * <br>Scanner를 생성해 주었습니다.
	 */
	
	public AdminHandler() {
		s = new Scanner(System.in);
	}
	/**
	 * CheckAD를 통해 관리자인지 아닌지 입력값을 통하여 확인합니다.
	 * @return AdminCheck 관리자여부 확인
	 */
	
	public int CheckAD() {
		AdminCheck = Integer.parseInt(s.nextLine());
		return AdminCheck;
	}
	/**
	 * Login은 관리자와 직원의 로그인을 돕는 함수입니다.
	 * {@link #v}User를 벡터로 받아와 Admin과 Employee를 입츌력하는 값입니다.
	 * true인 동안 
	 * 사용자가 ID와 PW를 입력합니다.
	 * 만약에 ID가 adminID와 같거나 employeeID와 같고, 
	 * PW가 adminPW와 같거나 employeePW와 같은경우에 로그인 성공 멘트를 띄운 후 break를 통해 멈춥니다.
	 * <br> 그렇지 않은 경우에는 입력하신 ID와 PW가 일치하지 않습니다.라고 멘트를 날린 후 break를 톻해 멈춥니다.
	 * break실행이 끝이 나면  로그인을 뜻하는 LoginCnt에 1을 대입해 줍니다.
	 * @param u User 유저클래스와 유저클래스를 상속받은 Admin 클래스와 Employee클래스의 모든 매개변수
	 * @return 1 로그인 값이 저장됩니다.
	 */
	
	public int Login(User u) {

		while(true)
		{
			System.out.print(" ID를 입력해주세요 : ");
			String ID = s.nextLine();
			System.out.print(" PW를 입력해주세요 : ");
			String PW = s.nextLine();

			if(ID.equals(MenuNum.aId)&&PW.equals(MenuNum.aPw)||ID.equals(MenuNum.eId)&&PW.equals(MenuNum.aPw)) {
				System.out.println("로그인 성공");break;
			}else
				System.out.println("입력하신 ID와 PW가 일치하지 않습니다.");		
				}
		LoginCnt = MenuNum.logIn;
		return LoginCnt;
		
	}

	/**
	 * userLogin는 유저의 로그인을 돕는 함수입니다.
	 * {@link #v}User를 벡터로 받아옵니다.
	 *  사용자가 ID와 PW를 입력합니다.
	 *  만약에 ID와PW가 {@link #registerUser(User)}에 입력했던
	 *   ID와PW랑 동일하다면 "로그인 성공"을 프린트한 후 LoginCnt에 1을 대입해 주고 break로 멈춰 줍니다.   
	 *   <br>그렇지 않는 경우에는 "등록되지 않은 사용자입니다. 회원가입을 시작합니다." 멘트를 프린트한 후
	 *   LoginCnt에 0을 대입해 주고 가입함수인 {@link #registerUser(User)}에 넘어가고 break로 멈춰 줍니다.
	 *   <br>하나의 컴퓨터당 하나의 로그인만 가능하기 때문에 한번의 로그인만 허용하게 만들었고 한번 로그인 하면 계속 그 아이디를 통하여 사용하게 됩니다.
	 * @param u User 유저클래스와 유저클래스를 상속받은 Admin 클래스와 Employee클래스의 모든 매개변수
	 */
	public void userLogin(User u) {
		System.out.print("사용자 ID를 입력해주세요 : ");
		String ID = s.nextLine();
		System.out.print("사용자 PW를 입력해주세요 : ");
		String PW = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)!=null) {
				if(ID.equals(v.get(i).getID())&&PW.equals(v.get(i).getPW())) {
					System.out.println("로그인 성공");
					LoginCnt = MenuNum.logIn;
					
					break;
				}			
			}else
			{
				System.out.println("등록되지 않은 사용자입니다. 회원가입을 시작합니다.");
				LoginCnt = 0;
				registerUser(u);
				break;
			}
		}
		//return v.get(i).LoginCnt;
	}
	/**
	 * Logout은 로그아웃을 돕는 함수입니다.
	 * 로그아웃을 원할 때 로그아웃이 되면서 LoginCnt가 0으로 변경됩니다.
	 * <br>로그인에서의 요구 사항으로 인해 로그아웃 또한 단순히 로그아웃이 되고 카운터가 내려가는 방식으로 구성했습니다.
	 * 
	 */
	
	public void Logout() {
		System.out.println("로그아웃 되었습니다.");
		LoginCnt = MenuNum.logOut;
	}
	/**
	 * registerUser는 회원가입을 위한 함수로 사용됩니다.
	 * <br>sPattern에 영문과 숫자만 입력가능한 정규표현식을 입력하여 호출할 수 있도록 정의하고 정규표현식이 맞지 않으면 실행을 멈춰 
	 * "숫자를 포함한 문자열만 입력하세요 "를 프린트해서 어떤 오류인지 표현해 주었습니다.
	 * <br>do-whlie문을 통하여 retry가 0이 아닌경우에만 반복하도록 만들어 주기 위해 마지막 문장에 retry를 Scanner로 받아옵니다.
	 * "또 입력하시겠어요? yes..1 no..0"라는 마지막 문구에 0이 아니면 계속 반복할 수 있게 하기 위함입니다.
	 * <br>"이름을 입력 하세요 :" 라는 창이 뜨면 Name에 사용자가 이름을 입력할 수 있고  그 이름이 정규표현식에 맞지 않으면 위에서 표현한 것과 같은
	 *  문구를 프린트해서 어떤 오류인지 표현해 준 후 break를 통하여 멈춥니다.
	 *  <br>"전화번호를 입력 하세요 :" 라는 창이 뜨면 Tel에 사용자가 전화번호를 입력할 수 있고  그 전화번호가 숫자 정규표현식에 맞지 않으면 위에서 표현한 것과 같은
	 *  문구를 프린트해서 어떤 오류인지 표현해 준 후 break를 통하여 멈추는 것을 표현하려 했으나 과제 제출용 프로그램이기 때문에 간단히 하기 위해 위와 같은 표현식을 함께 사용하였습니다..
	 *  <br>"아이디를 입력 하세요 :" 라는 창이 뜨면 ID에 사용자가 아이디를 입력할 수 있고  그 아이디가 정규표현식에 맞지 않으면 위에서 표현한 것과 같은
	 *  문구를 프린트해서 어떤 오류인지 표현해 준 후 break를 통하여 멈춥니다.
	 *  <br>"패스워드를 입력 하세요 :" 라는 창이 뜨면 PW에 사용자가 패스워드를 입력할 수 있고  그 패스워드가 정규표현식에 맞지 않으면 위에서 표현한 것과 같은
	 *  문구를 프린트해서 어떤 오류인지 표현해 준 후 break를 통하여 멈춥니다.
	 *  <br>모두 입력을 마치면 AdminCheck를 통하여 관리자가 아님을 표현하기 위해 1을 대입해 줍니다.
	 *  <br>각 User class에서 만들었던 set함수에 모든 정보를 저장하고 벡터에 저장해 줍니다.
	 *  <br>마지막으로 "회원 등록이 완료되었습니다."라는 문구와 합께 "또 입력하시겠어요? yes..1 no..0"라는 문구가 프린트되고 0이 아니면 다른 함수로 넘어갑니다.
	 * @param u User 유저클래스와 유저클래스를 상속받은 Admin 클래스와 Employee클래스의 모든 매개변수의 모든 매개변수
	 */
	public void registerUser(User u) {	
		
	      String sPattern = "^[a-zA-Z0-9가-힣\\s]*$";
	      int retry = MenuNum.no;
	      boolean regex;
	      
	      do {
				System.out.print("이름을 입력하세요 : ");
				String Name = s.nextLine();
				 regex = Pattern.matches(sPattern, Name);
		         if(regex != true) {
		            System.out.println("숫자를 포함한 문자열만 입력하세요 ");
		            break;
		         }
		         
		         
				System.out.print("전화번호를 입력하세요 : ");
				String Tel = s.nextLine();
				regex = Pattern.matches(sPattern, Tel);
		         if(regex != true) {
		            System.out.println("숫자를 포함한 문자열만 입력하세요 ");
		            break;
		         }
		         
		         
				System.out.print("ID를 입력하세요 : ");
				String ID = s.nextLine();
				regex = Pattern.matches(sPattern, ID);
		         if(regex != true) {
		            System.out.println("숫자를 포함한 문자열만 입력하세요 ");
		            break;
		         }
		         
				System.out.print("PW를 입력하세요 : ");
				String PW = s.nextLine();
				regex = Pattern.matches(sPattern, PW);
		         if(regex != true) {
		            System.out.println("숫자를 포함한 문자열만 입력하세요 ");
		            break;
		         }
				
				AdminCheck = MenuNum.num1;

				u.setName(Name);
				u.setTel(Tel);
				u.setID(ID);
				u.setPW(PW);
				v.add(new User(Name,Tel,ID,PW));

				System.out.println("회원 등록이 완료되었습니다.");
				
				
				System.out.println("또 입력하시겠어요? yes..1 no..0");
		        retry = s.nextInt();
		        s.nextLine();
	      }while(retry!=MenuNum.no);
	}
	
	/**
	 * showUser는 사용자가 관리자로 로그인했을 경우에 관리자가 유저클레스의 모든 정보를 가지고 올 수있게 하기위해 만든 함수입니다.
	 * i가 벡터유저사이즈와 일치할때 까지 반복되고 
	 * 유저클래스가 null이 아닐 경우 모든 유저의 정보를 출력합니다.
	 * @param u User 유저클래스와 유저클래스를 상속받은 Admin 클래스와 Employee클래스의 모든 매개변수
	 */
	
	public void showUser(User u) {
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)!=null )
            {
				v.get(i).showUser();
            }

		}
	}
	
	/**
	 * findID는 사용자가 이름을 입력하여 아이디를 찾는 함수입니다.
	 * <br>만약 유저클래스의 i가 벡터유저사이즈와 일치할때 까지 반복되고 유저가 null이 아닌 경우 
	 * <br>만약에 사용자가 입력한 Name이 벡터유저에 저장되어있는 Name의 값과 일치한 것이 있으면 
	 * <br>저장되어 있던 이름과 함께 아이디를 출력합니다.
	 * @param u User 유저클래스와 유저클래스를 상속받은 Admin 클래스와 Employee클래스의 모든 매개변수
	 */
	
	public void findID(User u) {
		System.out.print("사용자 이름을 입력해주세요 : ");
		String Name = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)!=null) {
				if(Name.equals(v.get(i).getName())) {
					System.out.println(v.get(i).getName()+"의 ID는 "+v.get(i).getID()+"입니다.");
				}
			}
		}
	}
	/**
	 * findPW는 사용자가 아이디를 입력하여 패스워드를 찾는 함수입니다.
	 * <br>유저클래스의 i가 벡터유저사이즈와 일치할때 까지 반복되고 유저가 null이 아닌 경우 
	 * <br>만약에 사용자가 입력한 ID가 벡터유저에 저장되어있는 ID의 값과 일치한 것이 있으면 
	 * <br>저장되어 있던 아이디와 함께 패스워드를 출력합니다.
	 * @param u User 유저클래스와 유저클래스를 상속받은 Admin 클래스와 Employee클래스의 모든 매개변수
	 */
	public void findPW(User u) {
		System.out.print("사용자 ID를 입력해주세요 : ");
		String ID = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)!=null) {
				if(ID.equals(v.get(i).getID())) {
					System.out.println(v.get(i).getID()+"의 PW는 "+v.get(i).getPW()+"입니다.");
				}
			}
		}
	}
	/**
	 * removeUser는 유저가 탈퇴할 수 있도록 만들어 준 함수입니다.
	 * "정말로 탈퇴하시겠습니까? : 탈퇴면 아이디 입력"라는 문구를 프린트해 탈퇴하겠다고 하면 사용자로 부터 아이디를 입력받고
	 * <br>유저클래스의 i가 벡터유저사이즈와 일치할때 까지 반복되고 유저가 null이 아닌 경우 
	 * <br>만약에 사용자가 입력한 ID가 벡터유저에 저장되어있는 ID의 값과 일치한 것이 있으면 
	 * <br>저장되어 있던 아이디와 관련된 모든 정보를 백터를 통해 지워줍니다.
	 * 그와 동시에 LOginCnt에 0을 대입하여 로그인이 되어있던 것이 로그아웃이 됩니다.
	 * @param u User 유저클래스와 유저클래스를 상속받은 Admin 클래스와 Employee클래스의 모든 매개변수
	 */
	
	public void removeUser(User u){
		System.out.println("정말로 탈퇴하시겠습니까? : 탈퇴면 아이디 입력");
		String ID = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)==null) {
				System.out.println("null값입니다.");
			}
			else if(ID.equals(v.get(i).getID())) {
				v.remove(i);
				System.out.println(ID+"가 삭제되었습니다.");
				LoginCnt = MenuNum.num0;
					
			}//else 
				//System.out.println("일치 안함");
		}
	}
	/**
	 * searchUser는 사용자가 관리자로 로그인했을 경우에 관리자가  유저를 검색할 수 있게 하기 위해 만든 함수입니다.
	 * <br>"검색할 사용자 ID를 입력해주세요"라는 문구가 프린트 되면 사용자가 유저의 아이디를 입력해 줍니다.
	 * <br>유저클래스의 i가 벡터유저사이즈와 일치할때 까지 반복되고 유저가 null이 아닌 경우 
	 * <br>만약에 사용자가 입력한 ID가 벡터유저에 저장되어있는 ID의 값과 일치한 것이 있으면 
	 * <br>"찾으시는 사용자 정보는 "과" 입니다. "라는 문구 사이에 저장되어 있던 아이디와 관련된 모든 정보를
	 *  {@link #showUser(User)}를 통해 보여줍니다.
	 * @param u User 유저클래스와 유저클래스를 상속받은 Admin 클래스와 Employee클래스의 모든 매개변수
	 */
	
	public void searchUser(User u){
		System.out.print("검색할 사용자 ID를 입력해주세요");
		String ID = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)!=null) {
				if(ID.equals(v.get(i).getID())) {
					System.out.println("찾으시는 사용자 정보는 ");
					v.get(i).showUser();
					System.out.print(" 입니다. ");
				}
//				else 
//					System.out.println("ㅗㅜㅑ");
			}
		}
	}
	/**
	 * deleteUser는 사용자가 관리자로 로그인했을 경우에 관리자가 유저를 삭제하는 함수입니다.
	 * <br>"삭제할 사용자 ID를 입력해주세요 :"라는 문구가 프린트 되면 사용자가 유저의 아이디를 입력해 줍니다.
	 * <br> i가 벡터유저사이즈와 일치할때 까지 반복되고 유저가 null이 아닌 경우 
	 * <br>만약에 사용자가 입력한 ID가 벡터유저에 저장되어있는 ID의 값과 일치한 것이 있으면 
	 * <br>저장되어 있던 아이디와 관련된 모든 정보를 백터를 통해 지워줍니다.
	 * @param u User 유저클래스와 유저클래스를 상속받은 Admin 클래스와 Employee클래스의 모든 매개변수
	 */
	
	public void deleteUser(User u) {
		System.out.print("삭제할 사용자 ID를 입력해주세요 :");
		String ID = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
			{
				if(v.get(i)==null) {
					//System.out.println("null값입니다.");
				}
				else if(ID.equals(v.get(i).getID())) {
						v.remove(i);
						System.out.println(ID+"가 삭제되었습니다.");
						//userCnt--;
						//LoginCnt = MenuNum.num0;
				}//else 
					//System.out.println("일치 안함");
			}
		}
	/**
	 * sortUser는 사용자가 관리자로 로그인했을 경우에 관리자가 유저목록을 정렬할때 사용하는 함수 입니다.
	 * <br>벡테배열의 sort를 통하여 배열을 정렬해줍니다.
	 * <br>i가 벡터유저사이즈와 일치할때 까지 반복되고 {@link #showUser(User)}를 통하여 
	 * @param u User 유저클래스와 유저클래스를 상속받은 Admin 클래스와 Employee클래스의 모든 매개변수
	 */
	
	public void sortUser(User u) {
		System.out.println("유저목록을 정렬합니다.");
//		 for(int i = 0; i<v.size();i++)
//         {
//         if(v.get(i)==null )
//            {
//               u.setName("a"+i);
//               u.setTel("010"+i);
//               u.setID("user"+(i+1));
//               u.setPW("user"+(i+1));
//               v.add(u);
//               System.out.println("생성자를 추가하였습니다.");
//            } 
//         }
//		 
		Collections.sort(v);
		
		for(int i = 0; i < v.size();i++)
		{
			v.get(i).showUser();	
		}
	}
	
	/**
	 * readingRoomUse는 독서실을 대여할 수 있는 함수입니다.
	 * "몇 번 좌석을 사용하시겠습니까 ?"가 프린트되면 num을 통해 좌석을 선택하고 
	 * 만약 입력한 값이 room안에 있는 값이고 0일때 "해당 좌석은 사용가능합니다. "해당 좌석을 사용하겠습니까? yes..1, no..0"를 프린트합니다.
	 * 또는 입력한 값의 room이 1이면 "해당 좌석은 사용중입니다."라고 프린트 됩니다.
	 * 둘다 아니면 "잘못된 입력입니다. 다시 선택해 주세요"라고 프린트 됩니다.
	 * 프린트 후 checkNum이 1이면 "해당 좌석을 사용하실 수 있습니다."의 멘트를 프린트하고 선택한 좌석을 1로 변경해 사용중으로 만든 후 
	 * {@link #secToHHMMSS()}함수를 호출해 타이머를 시작합니다. 
	 * <br> 만약 checkNum이 0일 경우 "해당 좌석을 사용하실 수 없습니다. 다른 좌석을 선택해주세요."라고 프린트합니다.
	 * 
	 * User 유저클래스와 유저클래스를 상속받은 Admin 클래스와 Employee클래스의 모든 매개변수
	 */
	
	public void readingRoomUse() {
	      System.out.println("몇 번 좌석을 사용하시겠습니까 ?");
	      int num = s.nextInt();//좌석선택
	   

	         if(rent.room[num-1]==MenuNum.vacant) {//배열은 0부터 시작이므로 입력값-1을 해줘야 그 방으로 들어감
	            System.out.println("해당 좌석은 사용가능합니다. 해당 좌석을 사용하겠습니까? yes..1, no..0");
	            int checkNum = s.nextInt();
	               if(checkNum==MenuNum.yes) {
	                  System.out.println("해당 좌석을 사용하실 수 있습니다.");
	                  rent.room[num-1] = 1;
	                  //secToHHMMSS();//타이머함수 호출
	                  
	                  }
	               else if(checkNum == MenuNum.no) {
	                  System.out.println("해당 좌석을 사용하실 수 없습니다. 다른 좌석을 선택해주세요."); 
	                  }else
	                     System.out.println("잘못된 입력입니다. 다시 선택해 주세요"); 
	         }else if(rent.room[num-1]==1) {
	            System.out.println("해당 좌석은 사용중입니다.");
	         }else
	            System.out.println("잘못된 입력입니다. 다시 선택해 주세요");
	      
	   }

	/**
	 * secToHHMMSS()는 독서실의 타이머를 위한 시스템 함수입니다.
	 * cal.setTime(date)으로 Date 객체를 1970 년 1 월 1 일 00:00:00 UTC부터 밀리 초 단위로 나타내는 시간으로 설정합니다.
	 * cal.add(Calendar.MINUTE, 120)으로 cal 객체의 MINUTE를 120분 추가함 = 2시간 늘려줍니다.
	 * currentTime에 format으로 현재시각을 문자열로 초기화하고 
	 * finishTime에 cal.getTime()를 넣어 120분 추가한 cal 객체를 문자열로 초기화해줍니다.
	 * "현재 시각은 " + currentTime+"입니다."라고 프린트 하여 현재 시각을 보여주고
	 * "이용가능한 시각은 " + finishTime+"까지 입니다."라고 프린트하여 사용 가능 시각을 보여줍니다.
	 * TimerTask를 호출하여 run()이 시작되는 동안 count를 1씩 더해줍니다.
	 * i가 r1의 길이가 되는 동안까지 timer.schedule(timerTask, 0, 1800000)를 뜻하는 문장이 30분을 의미하기 때문에
	 *  count가 4번 실행되도록하여 120분을 설정하고 실행이 끝나면 rent.room[i]가 0이 되면서 타이머가 종료됩니다.
	 */
	public void secToHHMMSS() {
	      cal.setTime(date);//Date 객체를 1970 년 1 월 1 일 00:00:00 UTC부터 밀리 초 단위로 나타내는 시간으로 설정합니다.
	      cal.add(Calendar.MINUTE, 120);//cal 객체의 MINUTE를 120분 추가함 = 2시간 늘림
	      String currentTime = dateFormat.format(new Date());//현재시간을 문자열로 초기화
	      String finishTime = dateFormat.format(cal.getTime());//120분 추가한 cal 객체를 문자열로 초기화
	      
	      System.out.println("현재 시각은 " + currentTime+"입니다.");
	      System.out.println("이용가능한 시각은 " + finishTime+"까지 입니다.");
	            
	      TimerTask timerTask = new TimerTask() {//Timer 클래스가 수행할 작업을 나타낸다.
	         @Override
	         public void run() {
	            count++;
	            for(int i = 0; i<r1.length;i++)
	            {
	               if(count<4) {//4번 실행
	               }else {
	                  rent.room[i] = 0;//4번 실행끝나면 0으로 초기화하여 재사용가능
	                  timer.cancel();//타이머 종료
	               }
	               
	            }
	         }
	      
	      };
	      timer.schedule(timerTask, 0, 1800000);//30분동안 타이머를 실행
	                                   // 30*4 = 120이므로 4번 실행후 타이머를 종료시킨다.
	   }
}
