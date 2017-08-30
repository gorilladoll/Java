package Exception;

import java.io.IOException;

class A01 implements AutoCloseable{
	public void close() throws Exception{
		System.out.println("자원 반납");
	}
}

public class ExceptionEx3 {
	public static void main(String[] args) {
		System.out.println(1);
		try(A01 varA = new A01()){
			System.out.println(2);
			if(2 > 3){
				System.out.println(3);
				throw new IOException();
			}
		} catch(Exception e) {
			System.out.println(8);
		}
		System.out.println(10);
	}
}
