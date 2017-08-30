package InnerClass;

class siri {
	int a = 10;
}

interface cyka_1 {
	abstract public void prt();
}
public class AnonymousClass {
	public static void main(String[] args) {
		siri varC = new siri(){
			public void prt(){
				System.out.println(a);
			}
		};
		
		cyka_1 ck = new cyka_1(){
			public void prt(){
				
			}
		};
		
		varC.prt();
	}
}
