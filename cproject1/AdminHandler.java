package cproject1;

import java.util.*;
import java.util.regex.Pattern;
import java.io.*;
import java.text.SimpleDateFormat;


/**
 * AdminHandler�� admin�� user�� ������� ���� Controller class �Դϴ�.
 * <br>Scanner�� ���Ͽ� ������ ������ ����ڷ� �Է¹޽��ϴ�.
 * <br>�� Ŭ������ Controller class�� ������ ���� �Լ��� ��� �� �� �ִ�.
 * CheckAD�� ���� ���������� �ƴ��� �Է°��� ���Ͽ� Ȯ���մϴ�.
 * adminID��adminPW�� ���� �����ڰ� �´��� Ȯ���ϱ� ���� ���̵�� ��й�ȣ�� ���Ƿ� ������ �ݴϴ�.
 * employeeID�� employeePW�� ���� ������ �´��� Ȯ���ϱ� ���� ���̵�� ��й�ȣ�� ���Ƿ� ������ �ݴϴ�.
 * timerBuffer�� ���� �ð��� �����ϴ� ���α׷��� ����� �ݴϴ�.
 * <br>{@link #Login(User)}�� �����ڿ� ������ �α����� ���� �Լ��Դϴ�.
 * <br>{@link #userLogin(User)}�� ������ �α����� ���� �Լ��Դϴ�.
 * <br>{@link #Logout()}�� �α׾ƿ��� ���� �Լ��Դϴ�.
 * <br>{@link #registerUser(User)}�� ȸ�������� ���� �Լ��� ���˴ϴ�.
 * <br>{@link #showUser(User)}�� ����ڰ� �����ڷ� �α������� ��쿡 �����ڰ� ����Ŭ������ ��� ������ ������ �� ���ְ� �ϱ����� ���� �Լ��Դϴ�.
 * <br>{@link #findID(User)}�� ����ڰ� �̸��� �Է��Ͽ� ���̵� ã�� �Լ��Դϴ�.
 * <br>{@link #findPW(User)}�� ����ڰ� ���̵� �Է��Ͽ� �н����带 ã�� �Լ��Դϴ�.
 * <br>{@link #removeUser(User)}�� ������ Ż���� �� �ֵ��� ����� �� �Լ��Դϴ�.
 * <br>{@link #searchUser(User)}�� ����ڰ� �����ڷ� �α������� ��쿡 �����ڰ�  ������ �˻��� �� �ְ� �ϱ� ���� ���� �Լ��Դϴ�.
 * <br>{@link #deleteUser(User)}�� ����ڰ� �����ڷ� �α������� ��쿡 �����ڰ� ������ �����ϴ� �Լ��Դϴ�.
 * <br>{@link #sortUser(User)}�� ����ڰ� �����ڷ� �α������� ��쿡 �����ڰ� ��������� �����Ҷ� ����ϴ� �Լ� �Դϴ�.
 * <br>{@link #readingRoomUse()}�� �������� �뿩�� �� �ִ� �Լ��Դϴ�.
 * <br>{@link #secToHHMMSS()}�� �������� Ÿ�̸Ӹ� ���� �ý��� �Լ��Դϴ�.
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
	 *Scanner�� ���Ͽ� ����ڰ� ���� �Է��� �� �ְ� �����ݴϴ�. 
	 */
	
	
	Scanner s;
	
	
	/**
	 *LoginCnt�� ���� �α��� ���θ� Ȯ���մϴ�.1�̸� �α��μ���, 0�̸� �α׾ƿ� 
	 */
	
	public int LoginCnt = MenuNum.logOut;
	
	
	/**
	 *AdminCheck�� ���� ������ ���� �Ǵ��մϴ�. 0�̸� ������ �ƴ�, 1�̸� ������ 
	 */
	
	public int AdminCheck;
	
	
	/**
	 *User�� �����ڸ� ȣ���Ͽ� User class�� ��� ������ ��� �����ϵ��� ����� �ݴϴ�. 
	 */

	User u = new User();

	
	/**
	 * ���͸� �̿��Ͽ� User�� User�� ��ӵ� ����(Admin,Employee) ��� �� �� �ְ� �մϴ�. 
	 */
	
	Vector<User> v = new Vector<User>();
	

	/**
	 * ReadingRoom�� �����ڷ� ȣ���Ͽ� �������� �뿩�� ���� ReadingRoom class�� ��밡���ϰ� ���ݴϴ�.
	 */
	
	ReadingRoom rent = new ReadingRoom(); 
	
	/**
	 * ReadingRoom�� �迭���� ��ȣ���Ͽ� �� �迭������ �־��ݴϴ�.
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
	 * ����Ʈ ������ 
	 * <br>Scanner�� ������ �־����ϴ�.
	 */
	
	public AdminHandler() {
		s = new Scanner(System.in);
	}
	/**
	 * CheckAD�� ���� ���������� �ƴ��� �Է°��� ���Ͽ� Ȯ���մϴ�.
	 * @return AdminCheck �����ڿ��� Ȯ��
	 */
	
	public int CheckAD() {
		AdminCheck = Integer.parseInt(s.nextLine());
		return AdminCheck;
	}
	/**
	 * Login�� �����ڿ� ������ �α����� ���� �Լ��Դϴ�.
	 * {@link #v}User�� ���ͷ� �޾ƿ� Admin�� Employee�� �������ϴ� ���Դϴ�.
	 * true�� ���� 
	 * ����ڰ� ID�� PW�� �Է��մϴ�.
	 * ���࿡ ID�� adminID�� ���ų� employeeID�� ����, 
	 * PW�� adminPW�� ���ų� employeePW�� ������쿡 �α��� ���� ��Ʈ�� ��� �� break�� ���� ����ϴ�.
	 * <br> �׷��� ���� ��쿡�� �Է��Ͻ� ID�� PW�� ��ġ���� �ʽ��ϴ�.��� ��Ʈ�� ���� �� break�� ���� ����ϴ�.
	 * break������ ���� ����  �α����� ���ϴ� LoginCnt�� 1�� ������ �ݴϴ�.
	 * @param u User ����Ŭ������ ����Ŭ������ ��ӹ��� Admin Ŭ������ EmployeeŬ������ ��� �Ű�����
	 * @return 1 �α��� ���� ����˴ϴ�.
	 */
	
	public int Login(User u) {

		while(true)
		{
			System.out.print(" ID�� �Է����ּ��� : ");
			String ID = s.nextLine();
			System.out.print(" PW�� �Է����ּ��� : ");
			String PW = s.nextLine();

			if(ID.equals(MenuNum.aId)&&PW.equals(MenuNum.aPw)||ID.equals(MenuNum.eId)&&PW.equals(MenuNum.aPw)) {
				System.out.println("�α��� ����");break;
			}else
				System.out.println("�Է��Ͻ� ID�� PW�� ��ġ���� �ʽ��ϴ�.");		
				}
		LoginCnt = MenuNum.logIn;
		return LoginCnt;
		
	}

	/**
	 * userLogin�� ������ �α����� ���� �Լ��Դϴ�.
	 * {@link #v}User�� ���ͷ� �޾ƿɴϴ�.
	 *  ����ڰ� ID�� PW�� �Է��մϴ�.
	 *  ���࿡ ID��PW�� {@link #registerUser(User)}�� �Է��ߴ�
	 *   ID��PW�� �����ϴٸ� "�α��� ����"�� ����Ʈ�� �� LoginCnt�� 1�� ������ �ְ� break�� ���� �ݴϴ�.   
	 *   <br>�׷��� �ʴ� ��쿡�� "��ϵ��� ���� ������Դϴ�. ȸ�������� �����մϴ�." ��Ʈ�� ����Ʈ�� ��
	 *   LoginCnt�� 0�� ������ �ְ� �����Լ��� {@link #registerUser(User)}�� �Ѿ�� break�� ���� �ݴϴ�.
	 *   <br>�ϳ��� ��ǻ�ʹ� �ϳ��� �α��θ� �����ϱ� ������ �ѹ��� �α��θ� ����ϰ� ������� �ѹ� �α��� �ϸ� ��� �� ���̵� ���Ͽ� ����ϰ� �˴ϴ�.
	 * @param u User ����Ŭ������ ����Ŭ������ ��ӹ��� Admin Ŭ������ EmployeeŬ������ ��� �Ű�����
	 */
	public void userLogin(User u) {
		System.out.print("����� ID�� �Է����ּ��� : ");
		String ID = s.nextLine();
		System.out.print("����� PW�� �Է����ּ��� : ");
		String PW = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)!=null) {
				if(ID.equals(v.get(i).getID())&&PW.equals(v.get(i).getPW())) {
					System.out.println("�α��� ����");
					LoginCnt = MenuNum.logIn;
					
					break;
				}			
			}else
			{
				System.out.println("��ϵ��� ���� ������Դϴ�. ȸ�������� �����մϴ�.");
				LoginCnt = 0;
				registerUser(u);
				break;
			}
		}
		//return v.get(i).LoginCnt;
	}
	/**
	 * Logout�� �α׾ƿ��� ���� �Լ��Դϴ�.
	 * �α׾ƿ��� ���� �� �α׾ƿ��� �Ǹ鼭 LoginCnt�� 0���� ����˴ϴ�.
	 * <br>�α��ο����� �䱸 �������� ���� �α׾ƿ� ���� �ܼ��� �α׾ƿ��� �ǰ� ī���Ͱ� �������� ������� �����߽��ϴ�.
	 * 
	 */
	
	public void Logout() {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		LoginCnt = MenuNum.logOut;
	}
	/**
	 * registerUser�� ȸ�������� ���� �Լ��� ���˴ϴ�.
	 * <br>sPattern�� ������ ���ڸ� �Է°����� ����ǥ������ �Է��Ͽ� ȣ���� �� �ֵ��� �����ϰ� ����ǥ������ ���� ������ ������ ���� 
	 * "���ڸ� ������ ���ڿ��� �Է��ϼ��� "�� ����Ʈ�ؼ� � �������� ǥ���� �־����ϴ�.
	 * <br>do-whlie���� ���Ͽ� retry�� 0�� �ƴѰ�쿡�� �ݺ��ϵ��� ����� �ֱ� ���� ������ ���忡 retry�� Scanner�� �޾ƿɴϴ�.
	 * "�� �Է��Ͻðھ��? yes..1 no..0"��� ������ ������ 0�� �ƴϸ� ��� �ݺ��� �� �ְ� �ϱ� �����Դϴ�.
	 * <br>"�̸��� �Է� �ϼ��� :" ��� â�� �߸� Name�� ����ڰ� �̸��� �Է��� �� �ְ�  �� �̸��� ����ǥ���Ŀ� ���� ������ ������ ǥ���� �Ͱ� ����
	 *  ������ ����Ʈ�ؼ� � �������� ǥ���� �� �� break�� ���Ͽ� ����ϴ�.
	 *  <br>"��ȭ��ȣ�� �Է� �ϼ��� :" ��� â�� �߸� Tel�� ����ڰ� ��ȭ��ȣ�� �Է��� �� �ְ�  �� ��ȭ��ȣ�� ���� ����ǥ���Ŀ� ���� ������ ������ ǥ���� �Ͱ� ����
	 *  ������ ����Ʈ�ؼ� � �������� ǥ���� �� �� break�� ���Ͽ� ���ߴ� ���� ǥ���Ϸ� ������ ���� ����� ���α׷��̱� ������ ������ �ϱ� ���� ���� ���� ǥ������ �Բ� ����Ͽ����ϴ�..
	 *  <br>"���̵� �Է� �ϼ��� :" ��� â�� �߸� ID�� ����ڰ� ���̵� �Է��� �� �ְ�  �� ���̵� ����ǥ���Ŀ� ���� ������ ������ ǥ���� �Ͱ� ����
	 *  ������ ����Ʈ�ؼ� � �������� ǥ���� �� �� break�� ���Ͽ� ����ϴ�.
	 *  <br>"�н����带 �Է� �ϼ��� :" ��� â�� �߸� PW�� ����ڰ� �н����带 �Է��� �� �ְ�  �� �н����尡 ����ǥ���Ŀ� ���� ������ ������ ǥ���� �Ͱ� ����
	 *  ������ ����Ʈ�ؼ� � �������� ǥ���� �� �� break�� ���Ͽ� ����ϴ�.
	 *  <br>��� �Է��� ��ġ�� AdminCheck�� ���Ͽ� �����ڰ� �ƴ��� ǥ���ϱ� ���� 1�� ������ �ݴϴ�.
	 *  <br>�� User class���� ������� set�Լ��� ��� ������ �����ϰ� ���Ϳ� ������ �ݴϴ�.
	 *  <br>���������� "ȸ�� ����� �Ϸ�Ǿ����ϴ�."��� ������ �ղ� "�� �Է��Ͻðھ��? yes..1 no..0"��� ������ ����Ʈ�ǰ� 0�� �ƴϸ� �ٸ� �Լ��� �Ѿ�ϴ�.
	 * @param u User ����Ŭ������ ����Ŭ������ ��ӹ��� Admin Ŭ������ EmployeeŬ������ ��� �Ű������� ��� �Ű�����
	 */
	public void registerUser(User u) {	
		
	      String sPattern = "^[a-zA-Z0-9��-�R\\s]*$";
	      int retry = MenuNum.no;
	      boolean regex;
	      
	      do {
				System.out.print("�̸��� �Է��ϼ��� : ");
				String Name = s.nextLine();
				 regex = Pattern.matches(sPattern, Name);
		         if(regex != true) {
		            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
		            break;
		         }
		         
		         
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
				String Tel = s.nextLine();
				regex = Pattern.matches(sPattern, Tel);
		         if(regex != true) {
		            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
		            break;
		         }
		         
		         
				System.out.print("ID�� �Է��ϼ��� : ");
				String ID = s.nextLine();
				regex = Pattern.matches(sPattern, ID);
		         if(regex != true) {
		            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
		            break;
		         }
		         
				System.out.print("PW�� �Է��ϼ��� : ");
				String PW = s.nextLine();
				regex = Pattern.matches(sPattern, PW);
		         if(regex != true) {
		            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
		            break;
		         }
				
				AdminCheck = MenuNum.num1;

				u.setName(Name);
				u.setTel(Tel);
				u.setID(ID);
				u.setPW(PW);
				v.add(new User(Name,Tel,ID,PW));

				System.out.println("ȸ�� ����� �Ϸ�Ǿ����ϴ�.");
				
				
				System.out.println("�� �Է��Ͻðھ��? yes..1 no..0");
		        retry = s.nextInt();
		        s.nextLine();
	      }while(retry!=MenuNum.no);
	}
	
	/**
	 * showUser�� ����ڰ� �����ڷ� �α������� ��쿡 �����ڰ� ����Ŭ������ ��� ������ ������ �� ���ְ� �ϱ����� ���� �Լ��Դϴ�.
	 * i�� ��������������� ��ġ�Ҷ� ���� �ݺ��ǰ� 
	 * ����Ŭ������ null�� �ƴ� ��� ��� ������ ������ ����մϴ�.
	 * @param u User ����Ŭ������ ����Ŭ������ ��ӹ��� Admin Ŭ������ EmployeeŬ������ ��� �Ű�����
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
	 * findID�� ����ڰ� �̸��� �Է��Ͽ� ���̵� ã�� �Լ��Դϴ�.
	 * <br>���� ����Ŭ������ i�� ��������������� ��ġ�Ҷ� ���� �ݺ��ǰ� ������ null�� �ƴ� ��� 
	 * <br>���࿡ ����ڰ� �Է��� Name�� ���������� ����Ǿ��ִ� Name�� ���� ��ġ�� ���� ������ 
	 * <br>����Ǿ� �ִ� �̸��� �Բ� ���̵� ����մϴ�.
	 * @param u User ����Ŭ������ ����Ŭ������ ��ӹ��� Admin Ŭ������ EmployeeŬ������ ��� �Ű�����
	 */
	
	public void findID(User u) {
		System.out.print("����� �̸��� �Է����ּ��� : ");
		String Name = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)!=null) {
				if(Name.equals(v.get(i).getName())) {
					System.out.println(v.get(i).getName()+"�� ID�� "+v.get(i).getID()+"�Դϴ�.");
				}
			}
		}
	}
	/**
	 * findPW�� ����ڰ� ���̵� �Է��Ͽ� �н����带 ã�� �Լ��Դϴ�.
	 * <br>����Ŭ������ i�� ��������������� ��ġ�Ҷ� ���� �ݺ��ǰ� ������ null�� �ƴ� ��� 
	 * <br>���࿡ ����ڰ� �Է��� ID�� ���������� ����Ǿ��ִ� ID�� ���� ��ġ�� ���� ������ 
	 * <br>����Ǿ� �ִ� ���̵�� �Բ� �н����带 ����մϴ�.
	 * @param u User ����Ŭ������ ����Ŭ������ ��ӹ��� Admin Ŭ������ EmployeeŬ������ ��� �Ű�����
	 */
	public void findPW(User u) {
		System.out.print("����� ID�� �Է����ּ��� : ");
		String ID = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)!=null) {
				if(ID.equals(v.get(i).getID())) {
					System.out.println(v.get(i).getID()+"�� PW�� "+v.get(i).getPW()+"�Դϴ�.");
				}
			}
		}
	}
	/**
	 * removeUser�� ������ Ż���� �� �ֵ��� ����� �� �Լ��Դϴ�.
	 * "������ Ż���Ͻðڽ��ϱ�? : Ż��� ���̵� �Է�"��� ������ ����Ʈ�� Ż���ϰڴٰ� �ϸ� ����ڷ� ���� ���̵� �Է¹ް�
	 * <br>����Ŭ������ i�� ��������������� ��ġ�Ҷ� ���� �ݺ��ǰ� ������ null�� �ƴ� ��� 
	 * <br>���࿡ ����ڰ� �Է��� ID�� ���������� ����Ǿ��ִ� ID�� ���� ��ġ�� ���� ������ 
	 * <br>����Ǿ� �ִ� ���̵�� ���õ� ��� ������ ���͸� ���� �����ݴϴ�.
	 * �׿� ���ÿ� LOginCnt�� 0�� �����Ͽ� �α����� �Ǿ��ִ� ���� �α׾ƿ��� �˴ϴ�.
	 * @param u User ����Ŭ������ ����Ŭ������ ��ӹ��� Admin Ŭ������ EmployeeŬ������ ��� �Ű�����
	 */
	
	public void removeUser(User u){
		System.out.println("������ Ż���Ͻðڽ��ϱ�? : Ż��� ���̵� �Է�");
		String ID = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)==null) {
				System.out.println("null���Դϴ�.");
			}
			else if(ID.equals(v.get(i).getID())) {
				v.remove(i);
				System.out.println(ID+"�� �����Ǿ����ϴ�.");
				LoginCnt = MenuNum.num0;
					
			}//else 
				//System.out.println("��ġ ����");
		}
	}
	/**
	 * searchUser�� ����ڰ� �����ڷ� �α������� ��쿡 �����ڰ�  ������ �˻��� �� �ְ� �ϱ� ���� ���� �Լ��Դϴ�.
	 * <br>"�˻��� ����� ID�� �Է����ּ���"��� ������ ����Ʈ �Ǹ� ����ڰ� ������ ���̵� �Է��� �ݴϴ�.
	 * <br>����Ŭ������ i�� ��������������� ��ġ�Ҷ� ���� �ݺ��ǰ� ������ null�� �ƴ� ��� 
	 * <br>���࿡ ����ڰ� �Է��� ID�� ���������� ����Ǿ��ִ� ID�� ���� ��ġ�� ���� ������ 
	 * <br>"ã���ô� ����� ������ "��" �Դϴ�. "��� ���� ���̿� ����Ǿ� �ִ� ���̵�� ���õ� ��� ������
	 *  {@link #showUser(User)}�� ���� �����ݴϴ�.
	 * @param u User ����Ŭ������ ����Ŭ������ ��ӹ��� Admin Ŭ������ EmployeeŬ������ ��� �Ű�����
	 */
	
	public void searchUser(User u){
		System.out.print("�˻��� ����� ID�� �Է����ּ���");
		String ID = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
		{
			if(v.get(i)!=null) {
				if(ID.equals(v.get(i).getID())) {
					System.out.println("ã���ô� ����� ������ ");
					v.get(i).showUser();
					System.out.print(" �Դϴ�. ");
				}
//				else 
//					System.out.println("�Ǥ̤�");
			}
		}
	}
	/**
	 * deleteUser�� ����ڰ� �����ڷ� �α������� ��쿡 �����ڰ� ������ �����ϴ� �Լ��Դϴ�.
	 * <br>"������ ����� ID�� �Է����ּ��� :"��� ������ ����Ʈ �Ǹ� ����ڰ� ������ ���̵� �Է��� �ݴϴ�.
	 * <br> i�� ��������������� ��ġ�Ҷ� ���� �ݺ��ǰ� ������ null�� �ƴ� ��� 
	 * <br>���࿡ ����ڰ� �Է��� ID�� ���������� ����Ǿ��ִ� ID�� ���� ��ġ�� ���� ������ 
	 * <br>����Ǿ� �ִ� ���̵�� ���õ� ��� ������ ���͸� ���� �����ݴϴ�.
	 * @param u User ����Ŭ������ ����Ŭ������ ��ӹ��� Admin Ŭ������ EmployeeŬ������ ��� �Ű�����
	 */
	
	public void deleteUser(User u) {
		System.out.print("������ ����� ID�� �Է����ּ��� :");
		String ID = s.nextLine();
		
		for(int i = 0; i<v.size();i++)
			{
				if(v.get(i)==null) {
					//System.out.println("null���Դϴ�.");
				}
				else if(ID.equals(v.get(i).getID())) {
						v.remove(i);
						System.out.println(ID+"�� �����Ǿ����ϴ�.");
						//userCnt--;
						//LoginCnt = MenuNum.num0;
				}//else 
					//System.out.println("��ġ ����");
			}
		}
	/**
	 * sortUser�� ����ڰ� �����ڷ� �α������� ��쿡 �����ڰ� ��������� �����Ҷ� ����ϴ� �Լ� �Դϴ�.
	 * <br>���׹迭�� sort�� ���Ͽ� �迭�� �������ݴϴ�.
	 * <br>i�� ��������������� ��ġ�Ҷ� ���� �ݺ��ǰ� {@link #showUser(User)}�� ���Ͽ� 
	 * @param u User ����Ŭ������ ����Ŭ������ ��ӹ��� Admin Ŭ������ EmployeeŬ������ ��� �Ű�����
	 */
	
	public void sortUser(User u) {
		System.out.println("��������� �����մϴ�.");
//		 for(int i = 0; i<v.size();i++)
//         {
//         if(v.get(i)==null )
//            {
//               u.setName("a"+i);
//               u.setTel("010"+i);
//               u.setID("user"+(i+1));
//               u.setPW("user"+(i+1));
//               v.add(u);
//               System.out.println("�����ڸ� �߰��Ͽ����ϴ�.");
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
	 * readingRoomUse�� �������� �뿩�� �� �ִ� �Լ��Դϴ�.
	 * "�� �� �¼��� ����Ͻðڽ��ϱ� ?"�� ����Ʈ�Ǹ� num�� ���� �¼��� �����ϰ� 
	 * ���� �Է��� ���� room�ȿ� �ִ� ���̰� 0�϶� "�ش� �¼��� ��밡���մϴ�. "�ش� �¼��� ����ϰڽ��ϱ�? yes..1, no..0"�� ����Ʈ�մϴ�.
	 * �Ǵ� �Է��� ���� room�� 1�̸� "�ش� �¼��� ������Դϴ�."��� ����Ʈ �˴ϴ�.
	 * �Ѵ� �ƴϸ� "�߸��� �Է��Դϴ�. �ٽ� ������ �ּ���"��� ����Ʈ �˴ϴ�.
	 * ����Ʈ �� checkNum�� 1�̸� "�ش� �¼��� ����Ͻ� �� �ֽ��ϴ�."�� ��Ʈ�� ����Ʈ�ϰ� ������ �¼��� 1�� ������ ��������� ���� �� 
	 * {@link #secToHHMMSS()}�Լ��� ȣ���� Ÿ�̸Ӹ� �����մϴ�. 
	 * <br> ���� checkNum�� 0�� ��� "�ش� �¼��� ����Ͻ� �� �����ϴ�. �ٸ� �¼��� �������ּ���."��� ����Ʈ�մϴ�.
	 * 
	 * User ����Ŭ������ ����Ŭ������ ��ӹ��� Admin Ŭ������ EmployeeŬ������ ��� �Ű�����
	 */
	
	public void readingRoomUse() {
	      System.out.println("�� �� �¼��� ����Ͻðڽ��ϱ� ?");
	      int num = s.nextInt();//�¼�����
	   

	         if(rent.room[num-1]==MenuNum.vacant) {//�迭�� 0���� �����̹Ƿ� �Է°�-1�� ����� �� ������ ��
	            System.out.println("�ش� �¼��� ��밡���մϴ�. �ش� �¼��� ����ϰڽ��ϱ�? yes..1, no..0");
	            int checkNum = s.nextInt();
	               if(checkNum==MenuNum.yes) {
	                  System.out.println("�ش� �¼��� ����Ͻ� �� �ֽ��ϴ�.");
	                  rent.room[num-1] = 1;
	                  //secToHHMMSS();//Ÿ�̸��Լ� ȣ��
	                  
	                  }
	               else if(checkNum == MenuNum.no) {
	                  System.out.println("�ش� �¼��� ����Ͻ� �� �����ϴ�. �ٸ� �¼��� �������ּ���."); 
	                  }else
	                     System.out.println("�߸��� �Է��Դϴ�. �ٽ� ������ �ּ���"); 
	         }else if(rent.room[num-1]==1) {
	            System.out.println("�ش� �¼��� ������Դϴ�.");
	         }else
	            System.out.println("�߸��� �Է��Դϴ�. �ٽ� ������ �ּ���");
	      
	   }

	/**
	 * secToHHMMSS()�� �������� Ÿ�̸Ӹ� ���� �ý��� �Լ��Դϴ�.
	 * cal.setTime(date)���� Date ��ü�� 1970 �� 1 �� 1 �� 00:00:00 UTC���� �и� �� ������ ��Ÿ���� �ð����� �����մϴ�.
	 * cal.add(Calendar.MINUTE, 120)���� cal ��ü�� MINUTE�� 120�� �߰��� = 2�ð� �÷��ݴϴ�.
	 * currentTime�� format���� ����ð��� ���ڿ��� �ʱ�ȭ�ϰ� 
	 * finishTime�� cal.getTime()�� �־� 120�� �߰��� cal ��ü�� ���ڿ��� �ʱ�ȭ���ݴϴ�.
	 * "���� �ð��� " + currentTime+"�Դϴ�."��� ����Ʈ �Ͽ� ���� �ð��� �����ְ�
	 * "�̿밡���� �ð��� " + finishTime+"���� �Դϴ�."��� ����Ʈ�Ͽ� ��� ���� �ð��� �����ݴϴ�.
	 * TimerTask�� ȣ���Ͽ� run()�� ���۵Ǵ� ���� count�� 1�� �����ݴϴ�.
	 * i�� r1�� ���̰� �Ǵ� ���ȱ��� timer.schedule(timerTask, 0, 1800000)�� ���ϴ� ������ 30���� �ǹ��ϱ� ������
	 *  count�� 4�� ����ǵ����Ͽ� 120���� �����ϰ� ������ ������ rent.room[i]�� 0�� �Ǹ鼭 Ÿ�̸Ӱ� ����˴ϴ�.
	 */
	public void secToHHMMSS() {
	      cal.setTime(date);//Date ��ü�� 1970 �� 1 �� 1 �� 00:00:00 UTC���� �и� �� ������ ��Ÿ���� �ð����� �����մϴ�.
	      cal.add(Calendar.MINUTE, 120);//cal ��ü�� MINUTE�� 120�� �߰��� = 2�ð� �ø�
	      String currentTime = dateFormat.format(new Date());//����ð��� ���ڿ��� �ʱ�ȭ
	      String finishTime = dateFormat.format(cal.getTime());//120�� �߰��� cal ��ü�� ���ڿ��� �ʱ�ȭ
	      
	      System.out.println("���� �ð��� " + currentTime+"�Դϴ�.");
	      System.out.println("�̿밡���� �ð��� " + finishTime+"���� �Դϴ�.");
	            
	      TimerTask timerTask = new TimerTask() {//Timer Ŭ������ ������ �۾��� ��Ÿ����.
	         @Override
	         public void run() {
	            count++;
	            for(int i = 0; i<r1.length;i++)
	            {
	               if(count<4) {//4�� ����
	               }else {
	                  rent.room[i] = 0;//4�� ���ೡ���� 0���� �ʱ�ȭ�Ͽ� ���밡��
	                  timer.cancel();//Ÿ�̸� ����
	               }
	               
	            }
	         }
	      
	      };
	      timer.schedule(timerTask, 0, 1800000);//30�е��� Ÿ�̸Ӹ� ����
	                                   // 30*4 = 120�̹Ƿ� 4�� ������ Ÿ�̸Ӹ� �����Ų��.
	   }
}
