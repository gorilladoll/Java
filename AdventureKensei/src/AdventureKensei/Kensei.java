package AdventureKensei;

import java.util.InputMismatchException;	
import java.util.Scanner;

public class Kensei extends CharacterAttribute {							//캐릭터 속성 클래스 상속 
	Scanner scan = new Scanner(System.in);								//스캐너객체 사용 설정 
	private String name;													//단독 이름변수 사용 
	public static int Level = 1;											//캐릭터 레벨 설정 
	
	public void setStatus(int str,int def,int max_hp,int hp,int heal){	//캐릭터 속성 재설정 
		this.STR = str;													//입력 받는 값으로 힘 설정 
		this.DEF = def;													//입력 받는 값으로 방어 설정 
		this.MAX_HP = max_hp;											//입력 받는 값으로 최대체력 설정 
		this.HP = hp;													//입력 받는 값으로 현재체력 설정 
		this.HEAL = heal;												//입력 받는 값으로 회복량 설정 
	}
	public int setStatus(String str,String def,String max_hp,String hp,String heal){
		//생성자 오버로딩
		this.STR = Integer.parseInt(str);								//강제 형변환 
		this.DEF = Integer.parseInt(def);								//강제 형변환
		this.MAX_HP = Integer.parseInt(max_hp);							//강제 형변환
		this.HP = Integer.parseInt(hp);									//강제 형변환 
		this.HEAL = Integer.parseInt(heal);								//강제 형변환 
		return 0;
	}

	public void levelUp(){												//레벨 업 메소드 설정 
		if(CharacterAttribute.level == Level + 1){						//스테틱 레벨이 현재 켄세이 레벨 + 1과 같을경우 
			System.out.println("------------------------------------------");			
																		//구분 줄 
			System.out.println("레벨 업!");								//레벨업 출력 
			this.STR = this.STR + 10;									//레벨업시 현재 힘 + 10 
			this.DEF = this.DEF + 10;									//레벨업시 현재 방어 + 10 		
			this.MAX_HP = this.MAX_HP + 100;								//레벨업시 현재 최대체력  + 100 
			this.HP = this.MAX_HP;										//레벨업시 현재 현재체력을 최대체력으로 회복 
			this.HEAL = this.HEAL + 10;									//레벨업시 현재 회복량 + 10 
			Level++;														//켄세이 레벨 증가
		}
		
	}
	
	
	public void setName(){												//이름 설정을 위한 메소드 설정 
		String Name;														//이름 설정을 위한 지역변수 
		System.out.print("이름을 입력해 주세요: ");							//이름 입력을 위한 기본 출력 
		Name = scan.nextLine();											//이름을 입력 받음 
		this.name = Name;												//입력받은 이름을 저장 
	}
	
	
	
	public String getName(){												//이름 출력을 위한 메소드 설정 
		return name;														//이름값을 반환 
	}
	
	public void selectMenu(){											//메뉴 선택을 위한 메소드 
		try{																//예외 될 수 있는 코드
			System.out.print("하나를 선택하세요: ");							//입력을 받기위한 출력문 
			SELECT = scan.nextInt();										//입력을 받음 
			scan.nextLine();												//오입 방지 개행 
		}
		catch(InputMismatchException e){									//숫자 이외 입력 예외 처리 
			System.out.println();										//개행 
			System.out.println("숫자를 입력해야만 합니다.");					//숫자 이외 입력 알림 
			System.out.println("게임을 종료합니다 다시 시작 해 주십시오.");		//게임이 종료됨을 알림 
			SelectNumber.turn = false;									//게임을 종료시킴 
		}
	}

	public void hit(CharacterAttribute chaRac,CharacterAttribute chaRact) {	//피격 메소드 
		// TODO Auto-generated method stub
		System.out.println("------------------------------------------");		//구분 줄 
		chaRac.HP = chaRac.HP - chaRact.STR;
		System.out.println(chaRac.getName()+ "은(는)" + chaRact.STR + " 의 피해를 입었다.");//피해를 입음을 알림
		
		if(chaRac.HP <= super.MIN_HP)
		{
			System.out.println("사망 하였습니다.");								//캐릭터 사망을 알림 
			System.out.println("Game Over");									//게임이 종료됨을 알림 
			CharacterAttribute.level = 0;									//게임을 종료 시키기 위해 레벨을 0으로 만듦
		}
	}
}
