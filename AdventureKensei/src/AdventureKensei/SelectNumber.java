package AdventureKensei;

public abstract class SelectNumber implements selection {
	public int SELECT;							//선택 변수 선언 
	public static boolean turn = true;			//반복문 제어 변수 설정 
	
	
	public void att(){							//공격 메서드 구현화 
		System.out.println("1.공격하기");			//공격 선택 결정여부 출력 
	}
	
	public void deff(){							//방어 메서드 구현화 
		System.out.println("2.방어하기");			//방어 선택 결정여부 출력 
	}
	
	public void healing(){						//회복 메서드 구현화 
		System.out.println("3.회복하기");			//회복 메서드 결정여부 출력 
	}
	public void selectMenu(){					//메뉴 선택 메소드
		SELECT = (int)(Math.random() * 3) + 1;	//1~3까지의 메뉴 자동 선택 
	}
}
