//package cproject1;
//
//import java.awt.Button;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class NoteByInnerclass {
//	public static void main (String[] args) {
//		try {
//			startInstall();
//			copyFiles();
//	
//		}catch(SpaceException e) {
//			System.out.println("����"+e.getMessage());
//			e.printStackTrace();
//			System.out.println("������Ȯ��");
//		}catch(MemoryException me) {
//			System.out.println("����"+me.getMessage());
//			me.printStackTrace();
//			System.gc();
//			System.out.println("��ġ ��õ�");
//		}finally{
//			deleteTempFiles();
//		}
//	}
//
//
//	static void startInstall() throws SpaceException, MemoryException{
//		if(!enoughSpace())
//			throw new SpaceException("���� ����");
//		if(!enoughMemory())
//			throw new MemoryException("�޸� ����");
//	}
//	static void copyFiles() {}
//	static void deleteTempFiles() {}
//	static boolean enoughSpace() {
//		return false;
//	}
//	static boolean enoughMemory() {
//		return true;
//	}
//	class SpaceException extends Exception{
//		SpaceException(String msg){
//			super(msg);
//		}
//		
//	}
//	class MemoryException extends Exception{
//		MemoryException(String msg){
//
//			super(msg);
//		}
//	}
//}//�𸣰ڴٸ𸣰ھ� �ѹ���ġ�� ã�� �� ����.��������
//
//
