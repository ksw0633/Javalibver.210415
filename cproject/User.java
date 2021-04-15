package cproject;

/**
 * 
 * �� Ŭ������ ���� ���� �ý����� ����ϴ� ��� ���� Ŭ���� �Դϴ�.
 * <br>�� ���������� �޾ƿͼ� ������ �ĺ��� �� �ְ� ���ݴϴ�.
 * <br> ���� ���� �ý����� Entity class�� ���մϴ�. 
 * @author SHY-702-04
 *
 */

public class User implements Comparable<User> {
	/**
	 * @private Name �̸�
	 * */
	private String Name;
	/** @private Tel ��ȭ��ȣ 
	 * */
	private String Tel;
	/** 
	 * @private ID ���̵�
	 */
	private String ID;
	/**
	 * @private PW �н�����
	 */
	private String PW;
	/**
	 * @private Overdue ��ü�Ⱓ
	 */
	private int Overdue;

	/**
	 * ����Ʈ ������
	 * */
	public User(){}
	/**
	 * User class�� ������ 
	 * <br>�� ���� ������ ������ �ɴϴ�.
	 * <br>������ �޾� AdminHandler���� ������� �����ݴϴ�.
	 * @param Name �̸�
	 * @param Tel ��ȭ��ȣ
	 * @param ID ���̵�
	 * @param PW �н�����
	 * 
	 * */
	public User(String Name, String Tel, String ID, String PW){
		this.Name = Name;
		this.Tel = Tel;
		this.ID = ID;
		this.PW = PW;
		Overdue = 0;
	}
	/**
	 * �Է��ߴ� ���������� ����� �����ִ� �Լ��Դϴ�.
	 * */
	public void showUser() {
		System.out.println("-------------------");
		System.out.println("�̸� : "+this.Name);
		System.out.println("��ȭ��ȣ : "+this.Tel);
		System.out.println("ID : "+ this.ID);
		System.out.println("PW : "+this.PW);
		System.out.println();
	}
/**
 * 
	 *  ������ �Ͽ� �Է°��� �̸��� ���մϴ�.
	 * @return Name �̸��� �������ݴϴ�
	 
 */

	@Override
	public int compareTo(User o) {

		return Name.compareTo(((User)o).Name);
	}
	/**
	 *  �Է��ߴ� ���̵� ������ �ݴϴ�.
	 * @return Name �̸�
	 */
	public String getName() {
		return Name;
	}
	/**
	 * �̸� �Է��ߴ� ���� �����մϴ�.
	 * @param Name �̸�
	 */
	public void setName(String Name) {
		this.Name = Name;
	}
	/**
	 * �Է��ߴ� ��ȭ��ȣ�� ������ �ݴϴ�.
	 * @return Tel ��ȭ��ȣ 
	 */
	public String getTel() {
		return Tel;
	}
	/**
	 * ��ȭ��ȣ �Է��ߴ� ���� �����մϴ�.
	 * @param Tel ��ȭ��ȣ
	 */
	
	public void setTel(String Tel) {
		this.Tel = Tel;
	}
	/**
	 * �Է��ߴ� ���̵� ��ȯ�� �ݴϴ�.
	 * @return ID ���̵�
	 */
	
	public String getID() {
		return ID;
	}
	/**
	 * ���̵��� �Է��ߴ� ���� �����մϴ�.
	 * @param ID ���̵�
	 */
	public void setID(String ID) {
		this.ID = ID;
	}
	/**
	 * �Է��ߴ� �н������� ���� ��ȯ�մϴ�.
	 * @return PW �н�����
	 */
	
	public String getPW() {
		return PW;
	}
	/**
	 * �Է��ߴ� �н������� ���� �����մϴ�.
	 * @param PW �н�����
	 */
	
	public void setPW(String PW) {
		this.PW = PW;
	}
	//��������- �ν�ȭ
	//user.getID();//((User)v.get(0)).getID() �ٿ�ĳ����
	//((User)v.get(0)).getID();
	 public int getOverdue() {
	      return Overdue;
	   }

	   public void setOverdue(int Overdue) {
	      this.Overdue = Overdue;
	   }


}