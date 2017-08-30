package AdventureKensei;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public abstract class CharacterAttribute extends SelectNumber implements Character {
	static Scanner scan = new Scanner(System.in);
	private String name;					//이름을 위한 구문
	public static int[] arr = {1,2,3,4};
	public static String[] arr2 = {"깐기","흐물즈물","돈까츠","박야동봉"};
	public static int level = 1;			//켄세이의 레벨업을 위한 스테틱 레벨 
	public int STR = 5;					//모든 케릭터의 기본 힘 
	public int DEF = 5;					//모든 케릭터의 기본 방어 
	public int MAX_HP = 50;				//모든 캐릭터의 기본 최대체력 
	public int MIN_HP = 0;				//모든 캐릭터의 기본 최소체력 
	public int HP = 50;					//모든 캐릭터의 현재 체력 	
	public int HEAL = 5;					//모든 케릭터의 기본 회복 
	public static boolean repeat = true;
	
	
	public void attack(CharacterAttribute chaRac) {								//공격 시전 
		// TODO Auto-generated method stub	
		System.out.println("------------------------------------------");			//구분 줄 
		System.out.println(chaRac.getName() + "은(는) 공격을 시전하였다.");			//공격 시전 알림 
	}

	public void deffence(CharacterAttribute chaRac,CharacterAttribute chaRact) {	//방어 시전 
		// TODO Auto-generated method stub
		System.out.println("------------------------------------------");			//구분 줄 
		System.out.println(chaRac.getName() + "은(는) 방어를 시전하였다.");			//방어 시전 알림 
		if(chaRact.STR >= chaRac.DEF)											//공격상대의 공격력 > 공격대상의 방어력 
		{
			chaRac.HP = chaRac.HP - (chaRact.STR - chaRac.DEF);					//공격대상 체력 = 공격대상 체력 - (공격상대.공격력 - 공격대상.방어력)
			System.out.println(chaRac.getName()+ "은(는)" + (chaRact.STR - chaRac.DEF) + " 의 피해를 입었다.");
																				//공격당함을 알림 
		}
		else																		//공격대상의 방어력 < 공격대상의 공격력 
		{
			chaRact.HP = chaRac.HP - 0;											//체력 = 체력 - 0 
			System.out.println(chaRac.getName()+ "은(는) 0 의 피해를 입었다.");		//0의 피해를 입음을 알림 
		}
		if(chaRac.HP <= MIN_HP)													//체력 <= 기본 최소체력 
		{
			System.out.println("------------------------------------------");		//구분 줄 
			System.out.println("적을 처치하였습니다.");								//적이 쓰러짐을 알림 
			CharacterAttribute.level++;											//켄세이 레벨 +1 
			if(CharacterAttribute.level > YadongBong)							//레벨이 올라서 보스 이상 레벨시 
			{	
				System.out.println("보스를 처치하였습니다 수고하셨습니다.");				//게임이 끝남을 알림 
				SelectNumber.turn = false;										//게임 순환 종료
			}
		}
	}

	public void heal(CharacterAttribute chaRac) {								//회복 시전 
		// TODO Auto-generated method stub
		System.out.println("------------------------------------------");			//구분 줄 
		System.out.println(chaRac.getName() + "은(는) 회복을 시전하였다.");			//회복 시전 알림 
		if(chaRac.HP >= chaRac.MAX_HP)											//공격대상 체력 >= 공격대상 최대체력 
		{
			chaRac.HP = chaRac.MAX_HP;											//공격대상 체력을 공격대상의 최대체력으로 만듦 
			System.out.println(chaRac.getName() + "은(는) 체력이 완전히 회복 되었다..");//체력이 완전히 회복됨을 알림 
		}
		
		else if(chaRac.HP + HEAL >= chaRac.MAX_HP)								//공격대상의 체력 + 회복체력 >= 최대체력 
		{
			chaRac.HP = chaRac.MAX_HP;											//현재 체력 = 최대체력 
			System.out.println(chaRac.getName() + "은(는) 체력이 완전히 회복 되었다..");//체력이 완전히 회복됨을 알림 
		}
		
		else																		//체력 + 회복이 최대체력에 미치지 않는 경우 
		{
			chaRac.HP = chaRac.HP + chaRac.HEAL;									//체력 + 회복 
			System.out.println(chaRac.getName() + "은(는) 체력이" + chaRac.HEAL + "만큼 회복 되었다.");
																				//회복량을 알림 
		}
	}

	public void hit(CharacterAttribute chaRac,CharacterAttribute chaRact) {		//피격 시전 
		// TODO Auto-generated method stub
		if(chaRac.HP <= chaRac.MIN_HP)											//피격 대상의 체력 <= 기본 최소체력 
		{
			CharacterAttribute.level++;											//레벨을 올려 스테이지 변환
			System.out.println("적을 처치하였습니다.");								//적이 쓰러짐을 표시  
			if(CharacterAttribute.level > YadongBong)							//레벨이 올라서 보스 이상 레벨시 
			{	
				System.out.println("보스를 처치하였습니다 수고하셨습니다.");				//게임이 끝남을 알림 
				SelectNumber.turn = false;										//게임 순환 종료
			}
		}
		else if(chaRac.HP > chaRac.MIN_HP)										//피격대상 체력 >기본 최소체력 
		{
			System.out.println("------------------------------------------");		//구분 줄 
			chaRac.HP = chaRac.HP - chaRact.STR;
			System.out.println(chaRac.getName()+ "은(는)" + chaRact.STR + " 의 피해를 입었다.");
																				//피격된 것을 알림 
		}
	}
	
	public void display(CharacterAttribute chaRac){
		if(CharacterAttribute.level <= YadongBong && CharacterAttribute.level >= Kangi)			//케릭터의 레벨이 야동봉 이하 깐기 이상인 경우 
		{
			if(chaRac.HP >= 0)																	// 대상 HP가 0 이상인 경우 
			{
				System.out.println("------------------------------------------");					//구분 줄 
				System.out.println(chaRac.getName());											//대상 이름 표시 
				System.out.println(chaRac.MAX_HP + " / " + chaRac.HP);							//대상의 최대체력 / 대상의 현재체력 
			}
		}
	}
	
	public void setName(String Name){															//이름 설정 
		this.name = Name;																		//입력 받는 이름을 기본 이름으로 설정 
	}
	
	
	public String getName(){																		//이름 불러오기 
		return name;																				//이름을 반환 
	}
	public void nameSet(){
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(arr[0], arr2[0]);
		map.put(arr[1], arr2[1]);
		map.put(arr[2], arr2[2]);
		map.put(arr[3], arr2[3]);
		int select = 0;
		int inselect = 0;
		String rename = "";
		
		while(repeat)
		{
			System.out.println("현재 사용하고 있는 적의 이름 입니다");
			System.out.println(map);
			System.out.println("1.추가/수정");
			System.out.println("2.삭제");
			System.out.println("3.종료");
			System.out.print("입력:");
			
			
			try{
				select = scan.nextInt();
				scan.nextLine();
				if(select == 1)
				{
					System.out.println(map);
					System.out.print("몇번의 적의 이름을 바꾸시겠습니까:");
					try{
						inselect = scan.nextInt();
						scan.nextLine();
						System.out.print("해당 적의 이름을 무엇으로 바꾸시겠습니까:");
						rename = scan.nextLine();
						if(inselect == 1)
						{
							arr[0] = inselect;
							arr2[0] = rename;
							map.put(arr[0], arr2[0]);
						}
						else if(inselect == 2)
						{
							arr[1] = inselect;
							arr2[1] = rename;
							map.put(arr[1], arr2[1]);
						}
						else if(inselect == 3)
						{
							arr[2] = inselect;
							arr2[2] = rename;
							map.put(arr[2], arr2[2]);
						}
						else if(inselect == 4)
						{
							arr[3] = inselect;
							arr2[3] = rename;
							map.put(arr[3], arr2[3]);
						}
					}
					catch(InputMismatchException e)
					{
						System.out.println("입력이 잘못 되었습니다 방금 입력한 정보로 실행합니다.");
						System.out.println("이전 실행이 없을시 기본으로 실행합니다.");
						repeat = false;
					}
					
				}
				else if(select == 2)
				{
					System.out.println(map);
					System.out.println("몇번의 적의 삭제 하시겠습니까:");
					
					try{
						inselect = scan.nextInt();
						scan.nextLine();
						map.remove(inselect);
					}
					catch(InputMismatchException e)
					{
						System.out.println("입력이 잘못 되었습니다 방금 입력한 정보로 실행합니다.");
						System.out.println("이전 실행이 없을시 기본으로 실행합니다.");
						repeat = false;
					}
				}
				else if(select == 3)
				{
					repeat = false;
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("입력이 잘못 되었습니다 방금 입력한 정보로 실행합니다.");
				System.out.println("이전 실행이 없을시 기본으로 실행합니다.");
				repeat = false;
			}
			
		}
	}
	public String nameGet(int number){																		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(arr[0],arr2[0]);
		map.put(arr[1],arr2[1]);
		map.put(arr[2],arr2[2]);
		map.put(arr[3],arr2[3]);
		return map.get(number);
	}
}
