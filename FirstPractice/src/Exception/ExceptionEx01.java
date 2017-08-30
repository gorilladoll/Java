package Exception;

import java.io.IOException;

class A{
	void L1(){
		L2();
	}
	void L2(){
		try{
			L3();			
		} catch (Exception e){
			System.out.println("후라이드 반");
		}
	}
	void L3() throws Exception{
		try{
			IOException e = new IOException("Exception text");
			//예외 객체 설정
			
			System.out.println("1");
			
			throw e;			
			//예외객체를 던진다
		} catch (Exception e){
			//코드
			System.out.println("양념 반");
			throw e;
		}
		//System.out.println("2");
	}
}

public class ExceptionEx01 {
	public static void main(String[] args) {
		A a = new A();
		a.L1();
	}

}
