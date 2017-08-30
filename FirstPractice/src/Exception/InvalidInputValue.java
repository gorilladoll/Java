package Exception;

public class InvalidInputValue extends RuntimeException{
	private final int ERR_CODE;
	
	public InvalidInputValue(int err_code){
		ERR_CODE = err_code;
	}
	
	public int getErr_code(){
		return ERR_CODE;
	}
}
