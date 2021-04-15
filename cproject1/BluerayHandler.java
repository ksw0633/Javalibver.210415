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
			
			String sPattern = "^[a-zA-Z0-9��-�R\\s]*$";
			int retry = MenuNum.no;
			boolean regex;
			
			do {
	//����
				
	            System.out.print("���� : ");
	            title = s.nextLine();
//	            dw.write("����: " + title + ",");
	            regex = Pattern.matches(sPattern, title);
	            if (regex != true) {
	               System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
	               break;
	            }
	           
	            
	//�⵵           
	            
	            System.out.print("��ÿ��� : ");
	            year = MenuNum.num0;
	            if (!s.hasNextInt() || (year = s.nextInt()) < MenuNum.num0) {
	            	System.out.println("������ �Է��ϼ���.");
	            	break;
	            }
//	            dw.write("��ÿ��� : " + year + ",");
	         
//�ڵ�
	            
	            System.out.print("�ڵ� : ");
	            code = s.nextLine();
//	            dw.write("�ڵ�: " + code + ",");            
	            regex = Pattern.matches(sPattern, code);
	            if (regex != true) {
	            	System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
	            	break;
	            }
	//���� 
	            System.out.print("���� : ");
	            price = MenuNum.num0;
	            if (!s.hasNextInt() || (price = s.nextInt()) < MenuNum.num0) {
	               System.out.println("������ �Է��ϼ���.");
	               break;
	            }
//	            dw.write("����: " + price + ",");

//�Ǹŷ�
	            System.out.print("�Ǹŷ� : ");
	            sale = MenuNum.num0;
	            if (!s.hasNextInt() || (sale = s.nextInt()) < MenuNum.num0) {
	               System.out.println("������ �Է��ϼ���.");
	               break;
	            }
//	            dw.write("�Ǹŷ�: " + sale + ",");
	            
	 //����
	            System.out.print("���� : ");
	             director = s.nextLine();
//	            dw.write("���� :  " + direction + ",");            
	            regex = Pattern.matches(sPattern, director);
	            if (regex != true) {
	               System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
	               break;
	            }

	 //String cast, int capacity, int runningTime) {

	            System.out.print("��� : ");
	            cast = s.nextLine();
//	            dw.write("���ǻ�: " + cast + ",");
	            regex = Pattern.matches(sPattern, cast);
	            if (regex != true) {
	               System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ���.");
	               break;
	            }
//�뷮
	            System.out.print("�뷮 : ");
	            capacity = MenuNum.num0;
	            if (!s.hasNextInt() || (capacity = s.nextInt()) < MenuNum.num0) {
	               System.out.println("������ �Է��ϼ���.");
	               break;
	            }
//	            dw.write("�뷮: " + capacity + ",");
	            
//����Ÿ��
	            System.out.print("����Ÿ�� : ");
	            runningTime = MenuNum.num0;
	            if (!s.hasNextInt() || (runningTime = s.nextInt()) < MenuNum.num0) {
	               System.out.println("������ �Է��ϼ���.");
	               break;
	            }
//	            dw.write("����Ÿ��: " + runningTime);
	            
	            s.nextLine();

	            borrow = MenuNum.num0;
//	            bw.write("�뿩 ���� : 0");
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

	            System.out.println("�� �Է��Ͻðھ��? yes..1 no..0");
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
