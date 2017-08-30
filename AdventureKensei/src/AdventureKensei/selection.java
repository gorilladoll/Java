package AdventureKensei;

public interface selection {
	public int ATT = 1;									//공격 선택 변수 
	public int DEFF = 2;									//방어 선택 변수 
	public int HEALING = 3;								//회복 선택 변수
	
	public void att();									//공격 메소드 인터페이스 
	public void deff();									//방어 메소드 인터페이스 
	public void healing();								//체력 메소드 인터페이스 
}
