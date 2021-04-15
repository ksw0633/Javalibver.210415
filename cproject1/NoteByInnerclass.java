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
//			System.out.println("에러"+e.getMessage());
//			e.printStackTrace();
//			System.out.println("공간미확보");
//		}catch(MemoryException me) {
//			System.out.println("에러"+me.getMessage());
//			me.printStackTrace();
//			System.gc();
//			System.out.println("설치 재시도");
//		}finally{
//			deleteTempFiles();
//		}
//	}
//
//
//	static void startInstall() throws SpaceException, MemoryException{
//		if(!enoughSpace())
//			throw new SpaceException("공간 부족");
//		if(!enoughMemory())
//			throw new MemoryException("메모리 부족");
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
//}//모르겠다모르겠어 한버녾치면 찾을 수 없다.히히히히
//
//
