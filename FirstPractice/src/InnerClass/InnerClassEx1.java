package InnerClass;

class OuterClass{
	int A_Value = 0;
	class InnerClassOne{
		//	1) none static nested class
		int B_Value = 0;
		
		void increase(){
			B_Value = ++A_Value;
		}
	}
	
	static class InnerClassTwo{
		// 2) static nested class
	}
}

public class InnerClassEx1 {
	public static void main(String[] args){
		//OuterClass.InnerClassTwo  OCICT = new OuterClass.InnerClassTwo();
		
		OuterClass OC1 = new OuterClass();
		OuterClass.InnerClassOne IOC1 = OC1.new InnerClassOne();
		
		OuterClass.InnerClassOne IOC3 = OC1.new InnerClassOne();
		
		OuterClass OC2 = new OuterClass();
		OuterClass.InnerClassOne IOC2 = OC2.new InnerClassOne();
		
		IOC1.increase();
		IOC2.increase();
		IOC2.increase();
		
		System.out.println(OC1.A_Value);
		System.out.println(IOC1.B_Value);
		
		System.out.println(OC2.A_Value);
		System.out.println(IOC2.B_Value);
	}
}
