package Access01;

class A{
	void prt(){
		System.out.println("A");
	}
}

class B extends A{
	final void prt(){
		System.out.println("B");
	}
}

class C extends B{
	
}

public class Final {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A var1 = new C();
		var1.prt();
	}

}
