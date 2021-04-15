package cproject;
/**
 * �� Ŭ������ ���� ���� �ý����� �� �ٸ� ������ Ŭ������ ����Ŭ������ ���մϴ�.
 * <br> �� ���������� �޾ƿͼ� ������ �ĺ��� �� �ְ� ���ݴϴ�.
 * <br> ���� ������ ���� ���̿� ������ ���� �ϵ��� �Ǿ��ֽ��ϴ�.
 * <br> ���� Ŭ������ ������ ��ӹ޾� ����ϴ� Ŭ���� �Դϴ�.
 * <br> ���� ���� �ý����� Entity class�� ���մϴ�.
 * @author SHY-702-04
 *
 */
public class Employee extends User{
	/**
	 * @param EmployeeCheck �����ش� ���� Ȯ��
	 */
	int EmployeeCheck;
	/**
	 * ����Ʈ ������
	 */
	public Employee() {}
	/**
	 * Employee class�� ������
	 * <br> �� ���� ������ ������ �ɴϴ�.
	 * <br> ������ �޾� AdminHandler���� ������� �����ݴϴ�.
	 * @param Name �����̸�
	 * @param Tel ������ȭ��ȣ
	 * @param ID �������̵�
	 * @param PW �����н�����
	 * @param EmployeeCheck ���� �ش� ���� Ȯ��.
	 */
	Employee(String Name, String Tel, String ID, String PW, int EmployeeCheck){
		super(Name, Tel, ID, PW);
		this.EmployeeCheck = EmployeeCheck;
	}
	/**
	 * showEmployee�� {@link showUser}�� ���Ͽ� ���� ������ ����� �� �ְ� ���� ���θ� Ȯ���մϴ�.
	 */
	void showEmployee() {
		super.showUser();
		System.out.println("������ ���� : "+this.EmployeeCheck);
		System.out.println();
	}
	/**
	 * getID�� �Ű������� ���̵� �޾ƿ� ���̵� ���� ������ �ݴϴ�.
	 * @param ID ���̵� 
	 * @return ID ���̵�
	 */
	public String getID(String ID) {
		return ID;
	}
	/**
	 * getPW�� �Ű������� �н����带 �޾ƿ� �н����� ���� ������ �ݴϴ�.
	 * @param PW �н�����
	 * @return PW �н�����
	 */
	public String getPW(String PW) {
		return PW;
	}//��������- ĸ��ȭ
}