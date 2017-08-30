package InnerClass;

class OutClass2{
	private static  int AValue = 0;
	
	static class InnerClass3{
		int BValue = 0;
		
		void increase(){
			BValue = ++AValue;
		}
	}
}

public class InnerClassEx2 {
	public static void main(String[] args) {
		OutClass2.InnerClass3 OCIC3= new OutClass2.InnerClass3();
	}

}
