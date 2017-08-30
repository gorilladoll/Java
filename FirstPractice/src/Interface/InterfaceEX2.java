package Interface;

interface network{
	public abstract boolean connect(String argTargetName);
	public abstract boolean close();
	public abstract int sendData(String argMsg);
	public abstract String receiveData();
}

class interface_test implements network{
	public boolean connect(String argTargetName){
		return false;
	}
	public boolean close(){
		return false;
	}
	public int sendData(String argMsg){
		return 0;
	}
	public String receiveData(){
		return null;
	}
}

class jjg implements network{
	public boolean connect(String argTargetName){
		return false;
	}
	public boolean close(){
		return false;
	}
	public int sendData(String argMsg){
		return 0;
	}
	public String receiveData(){
		return null;
	}
}

public class InterfaceEX2 {
	public static void main(String[] args){
		network myNetWork = new jjg();
		myNetWork.connect("myAP");
		myNetWork.sendData("ddfdf");
	}
}
