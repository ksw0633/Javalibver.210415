package cproject1;
/**
 *  
 * �� Ŭ������ ���� ���� �ý����� ������ Ŭ�����Դϴ�.
 * <br> ������ Ŭ������ ������ ��ӹ޾� ����ϴ� Ŭ���� �Դϴ�.
 * <br> ���� ���� �ý����� Entity class�� ���մϴ�.
 * 
 * @author SHY-702-04
 *
 */
public class Admin extends User{
	/**
	 * @param AdminCheck �����ڰ� �´��� �ƴ��� Ȯ���մϴ�.
	 */
	int AdminCheck;
	/**
	 * ����Ʈ ������
	 */
	public Admin() {}
	/**
	 * ������
	 * <br> �� ������ ���� ������ ������� �� �ְ� ���ݴϴ�.
	 * @param Name �̸�
	 * @param Tel ��ȭ��ȣ
	 * @param ID ���̵�
	 * @param PW �н�����
	 * @param AdminCheck ������Ȯ��
	 */
	private Admin(String Name, String Tel, String ID, String PW, int AdminCheck){
		super(Name, Tel, ID, PW);
		this.AdminCheck = AdminCheck;

	}
	/**
	 * {@link showUser}�� ���Ͽ� ���� ������ ����� �� �ְ� ������ ���θ� Ȯ���մϴ�.
	 * ����Ʈ ������ ������ ���θ� Ȯ���Ѵ�. 
	 */
	public void showAdmin() {
		super.showUser();
		System.out.println("������ ���� : "+this.AdminCheck);
		System.out.println();
	}
	/**
	 * ���̵��� ���� �������ݴϴ�.
	 * @param ID ���̵�
	 * @return ID ���̵�
	 */
	public String getID(String ID) {
		return ID;
	}
	/**
	 * �н����� ���� �������ݴϴ�.
	 * @param PW �н�����
	 * @return PW �н�����
	 */
	public String getPW(String PW) {
		return PW;
	}//��������- �ν�ȭ
	
}
