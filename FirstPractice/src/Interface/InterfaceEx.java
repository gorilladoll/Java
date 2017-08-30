package Interface;

interface infinityEnginBracket{
	/*	1.		클래스 상수
	 * 	2.		추상 메서드
	 * 	3.		디폴트 메서드(자바8부터 지원)
	 * 	4.		클래스 메서드(자바8부터 지원)*/
	
	int volume = 500;
	// public final static을 생략 가능
	
	void start();			
	void stop();
	void acceleration();
	//추상 메서드 부문  -> public abstract 생략 가능
	
/*	default void ilde(){
		System.out.println("idle");
	}
	//디폴트 메서드
	
	static void getName(){
		System.out.println("getName");
	}
	//클래스 메소드
*/}

class benzEngine implements infinityEnginBracket{
	public void start(){
		System.out.println("start");
	}
	public void stop(){
		System.out.println("stop");
	}
	public void acceleration(){
		System.out.println("acceleration");
	}
}

class audiEngine implements infinityEnginBracket{
	public void start(){
		System.out.println("start");
	}
	public void stop(){
		System.out.println("stop");
	}
	public void acceleration(){
		System.out.println("acceleration");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		//infinityEnginBracket engine = new benzEngine();
		infinityEnginBracket engine = new audiEngine();
		System.out.println(engine.volume);
		engine.start();
		engine.stop();
		engine.acceleration();
	}

}
