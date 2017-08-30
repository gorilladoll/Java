interface problem {
	void prt();
}

class A{
	int out =18;
	problem cyka(){
		int a = 20;
		final int b = 22;
		class B implements problem{
			public void prt(){
				System.out.println(out);
				System.out.println(a);
				System.out.println(b);
			}
		}
		return new B();
	}
}
public class nmainC {

	public static void main(String[] args) {
		A varA = new A();
		problem varB = varA.cyka();
		varB.prt();

	}
}
