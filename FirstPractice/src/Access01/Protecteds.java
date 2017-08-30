package Access01;

/*class eNB{
	protected String num = "jung";									//이렇게 쓰면 의미가 없다. 쓰게 된다면 차라리 다른 클래스를 만들어
}*/

class a{																			//임의의클래스를 선언 
	static class b{															//이너클래스에서는 static이 사용이 가능하다.
		
	}																					//b클래스 닫기 
}																						//a클래스 닫기 

class sENB extends Access02 {
	void prt(){
		System.out.println(name);
	}
}


public class Protecteds {
	public static void main(String[] args) {
		sENB var = new sENB();
		System.out.println(var.name);

	}

}
