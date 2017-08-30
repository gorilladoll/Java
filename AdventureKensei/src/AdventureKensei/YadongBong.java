package AdventureKensei;

public class YadongBong extends CharacterAttribute {						//캐릭터 속성 클래스 상속 
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
}
