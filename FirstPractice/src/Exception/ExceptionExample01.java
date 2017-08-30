package Exception;

class Error{
	void L1() throws Exception{
		L2();
	} void L2() throws Exception{
		L3();
	} void L3() throws Exception{
		//Exception e =  new Exception("Exception test");
		//Exception e = new RuntimeException("Exception test");
		System.out.println("1");
		throw e;
	}
}

public class ExceptionExample01 {

	public static void main(String[] args) throws Exception {
		Error err = new Error();
		err.L1();
	}

}
