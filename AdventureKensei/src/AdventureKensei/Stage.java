package AdventureKensei;

public class Stage {
	Kensei kensei = new Kensei();													//켄세이 객체 호출 
	Kangi kangi = new Kangi();														//깐기 객체 호출 
	HumulZumul humulzumul = new HumulZumul();										//흐물즈물 객체 호출 
	Donkatsu donkatsu = new Donkatsu();												//돈까츠 객체 호출 
	YadongBong yadongbong = new YadongBong();										//야동봉 객체 호출 
	
	public void nameField(){															//이름 일제 호출 메서드
		kensei.setName();															//켄세이 이름 설정 호출 
		kangi.nameSet();
		kangi.setName(kangi.nameGet(1));												//깐기 이름 설정 및 호출 
		humulzumul.setName(kangi.nameGet(2));										//흐물즈물 이름 설정 및 호출 
		donkatsu.setName(kangi.nameGet(3));											//돈까츠 이름 설정 및 호출 
		yadongbong.setName(kangi.nameGet(4));										//박야동봉 이름 설정 및 호출 
	}
	public void getStatuses(){														//캐릭터 스테이터스 일제 호출 메소드  
		kensei.setStatus(15, 5, 100, 100, 20);										//켄세이 스테이터스 설정 및 호출 
		kangi.setStatus(5, 5, 100,100, 10);											//깐기 스테이터스 설정 및 호출 
		humulzumul.setStatus(15, 15, 200, 200, 20);									//흐물즈물 스테이터스 설정 및 호출 
		donkatsu.setStatus(25, 25, 300, 300, 30);									//돈까츠 스테이터스 설정 및 호출 
		yadongbong.setStatus(35, 35, 400, 400, 40);									//야동봉 스테이터스 설정 및 호출 
	}
	public void stageOne()															//스테이지 1 메소드 
	{	
		if(CharacterAttribute.level == Character.Kangi)								//켄세이 레벨 == 깐기 스테이지  
		{
			System.out.println("------------------------------------------");			//구분 줄 
			System.out.println(kangi.getName() + " VS " + kensei.getName());			//깐기와 켄세이가 싸움을 알림 
			System.out.println("------------------------------------------");			//구분 줄 
			kensei.att();															//공격 선택 여부 호출 
			kensei.deff();															//방어 선택 여부 호출 
			kensei.healing();														//회복 선택 여부 호출 
			kensei.selectMenu();														//켄세이의 선택 메소드 호출 
			kangi.selectMenu();														//깐기의 선택 메소드 호출 
			
			if(kensei.SELECT == selection.ATT && SelectNumber.turn == true)			//켄세이 공격 선택 및 반복가능시
			{	
				if(kangi.SELECT == selection.ATT)									//켄세이 공격 및 깐기 공격 
				{
					kensei.attack(kensei);											//켄세이 공격 메소드 실행 
					kangi.hit(kangi, kensei);										//깐기 피격 메소드 실행 
					kangi.attack(kangi);												//깐기 공격 메소드 실행 
					kensei.hit(kensei, kangi);										//켄세이 피격 메소드 실행 
				}
				else if(kangi.SELECT == selection.DEFF)								//켄세이 공격 깐기 방어 
				{
					kensei.attack(kensei);											//켄세이 공격 메소드 실행 
					kangi.deffence(kangi, kensei);									//깐기 방어 메소드 실행 
				}
				else  if(kangi.SELECT == selection.HEALING)							//켄세이 공격 깐기 회복 
				{
					kensei.attack(kensei);											//켄세이 공격 메소드 실행 
					kangi.hit(kangi, kensei);										//깐기 피격 메소드 실행 
					kangi.heal(kangi);												//깐기 회복 메소드 실행 
				}
				kensei.display(kensei);												//켄세이 현재 상태 출력 
				kangi.display(kangi);												//깐기 현재 상태 출력 
			}
			
			else if(kensei.SELECT == selection.DEFF && SelectNumber.turn == true)		//켄세이 방어선택 및 반복가능시 
			{	
				if(kangi.SELECT == selection.ATT)									//켄세이 방어 깐기 공격 
				{
					kangi.attack(kensei);											//깐기 공격 메소드 실행 
					kensei.deffence(kensei, kangi);									//켄세이 방어 메소드 실행 
				}
				else if(kangi.SELECT == selection.DEFF)								//켄세이 방어 깐기 방어 
				{
					kensei.deffence(kensei, kangi);									//켄세이 방어 메소드 실행 
					kangi.deffence(kangi, kensei);									//깐기 방어 메소드 실행
				}
				else  if(kangi.SELECT == selection.HEALING)							//켄세이 방어 깐기 회복
				{
					kangi.heal(kangi);												//깐기 회복 메소드 실행 
				}
				kensei.display(kensei);												//켄세이 현재상태 출력 
				kangi.display(kangi);												//깐기 현재상태 출력 
			}
			
			else if(kensei.SELECT == selection.HEALING && SelectNumber.turn == true)	//켄세이 회복 및 반복가능시
			{
				if(kangi.SELECT == selection.ATT)									//켄세이 회복 깐기 공격 
				{
					kensei.heal(kensei);												//켄세이 회복 메소드 실행 
					kangi.attack(kangi);												//깐기 공격 메소드 실행 
					kensei.hit(kensei, kangi);										//켄세이 피격 메소드 실행 
				}
				else if(kangi.SELECT == selection.DEFF)								//켄세이 회복 깐기 방어 
				{
					kensei.heal(kensei);												//켄세이 회복 메소드 실행 
					kangi.deffence(kangi, kensei);									//깐기 방어 메소드 실행 
				}
				else  if(kangi.SELECT == selection.HEALING)							//켄세이 회복 및 깐기 회복 
				{
					kensei.heal(kensei);												//켄세이 회복 메소드 실행 
					kangi.heal(kangi);												//깐기 회복 메소드 실행 
				}
				kensei.display(kensei);
				kangi.display(kangi);
			}
		}
	}
	public void stageTwo()															//스테이지 2 메소드 
	{
		if(CharacterAttribute.level == Character.HumulZumul)							//켄세이 레벨 == 흐물즈물 스테이지 
		{	
			kensei.levelUp();														//스테이지 시작시 레벨업 메소드 출력 
			System.out.println("------------------------------------------");			//구분 줄 
			System.out.println(humulzumul.getName() + " VS " + kensei.getName());		//흐물즈물 vs 켄세이 출력 
			System.out.println("------------------------------------------");			//구분 줄 
			kensei.att();															//공격 선택 여부 메소드 출력 
			kensei.deff();															//방어 선택 여부 메소드 출력 
			kensei.healing();														//회복 선택 여부 메소드 출력 
			kensei.selectMenu();														//켄세이 선택 메소드 출력 
			humulzumul.selectMenu();													//흐물즈물 선택 메소드 출력 
			
			if(kensei.SELECT == selection.ATT && SelectNumber.turn == true)			//켄세이 공격 및 반복 가능시 
			{
				if(humulzumul.SELECT == selection.ATT)								//켄세이 공격 및 흐물즈물 공격 
				{
					kensei.attack(kensei);											//켄세이 공격 메소드 출력 
					humulzumul.hit(humulzumul, kensei);								//흐물즈물 피격 메소드 출력 
					kangi.attack(humulzumul);										//흐물즈물 공격 메소드 출력 
					kensei.hit(kensei, humulzumul);									//켄세이 피격 메소드 출력 
				}
				else if(humulzumul.SELECT == selection.DEFF)							//켄세이 공격 흐물즈물 방어 
				{
					kensei.attack(kensei);											//켄세이 공격 메소드 출력 
					humulzumul.deffence(humulzumul, kensei);							//흐물즈물 방어 메소드 출력 
				}
				else  if(humulzumul.SELECT == selection.HEALING)						//켄세이 공격 흐물즈물 회복 
				{
					kensei.attack(kensei);											//켄세이 공격 메소드 출력 
					humulzumul.hit(humulzumul, kensei);								//흐물즈물 피격 메소드 출력 
					humulzumul.heal(humulzumul);										//흐물즈물 회복 메소드 출력 
				}
				kensei.display(kensei);												//켄세이 현재 상태 출력 
				humulzumul.display(humulzumul);										//흐물즈물 현재 상태 출력 
			}
			
			else if(kensei.SELECT == selection.DEFF && SelectNumber.turn == true)		//켄세이 방어 및 반복 가능 
			{	
				if(humulzumul.SELECT == selection.ATT)								//켄세이 방어 흐물즈물 공격 
				{
					humulzumul.attack(humulzumul);									//흐물즈물 공격 메소드 출력 
					kensei.deffence(kensei, humulzumul);								//켄세이 방어 메소드 출력 
				}
				else if(humulzumul.SELECT == selection.DEFF)							//켄세이 방어 흐물즈물 방어 
				{	
					kensei.deffence(kensei, humulzumul);								//켄세이 방어 메소드 출력 
					humulzumul.deffence(humulzumul, kensei);							//흐물즈물 방어 메소드 출력 
				}
				else  if(humulzumul.SELECT == selection.HEALING)						//켄세이 방어 흐물즈물 회복 
				{
					humulzumul.heal(humulzumul);										//흐물즈물 회복 메소드 출력 
				}
				kensei.display(kensei);												//켄세이 현재 상태 출력 
				humulzumul.display(humulzumul);										//흐물즈물 현재 상태 출력 
			}
			
			else if(kensei.SELECT == selection.HEALING && SelectNumber.turn == true)	//켄세이 회복 및 반복가능시 
			{
				if(humulzumul.SELECT == selection.ATT)								//켄세이 회복 및 흐물즈물 공격 
				{
					kensei.heal(kensei);												//켄세이 회복 메소드 출력 			
					humulzumul.attack(humulzumul);									//흐물즈물 공격 메소드 출력 
					kensei.hit(kensei, humulzumul);									//켄세이 피격 메소드 출력 
				}
				else if(humulzumul.SELECT == selection.DEFF)							//켄세이 회복  흐물즈물 방어 
				{
					kensei.heal(kensei);												//켄세이 회복 메소드 출력 
					humulzumul.deffence(humulzumul, kensei);							//흐물즈물 방어 메소드 출력 
				}
				else  if(humulzumul.SELECT == selection.HEALING)						//켄세이 회복 흐물즈물 회복 
				{
					kensei.heal(kensei);												//켄세이 회복 메소드 출력 
					humulzumul.heal(humulzumul);										//흐물즈물 회복 메소드 출력 
				}
				kensei.display(kensei);												//켄세이 현재 상태 표시 
				humulzumul.display(humulzumul);										//흐물즈물 현재 상태 표시 
			}
		}
	}
	public void stageThree()															//스테이지 3 메소드 
	{
		if(CharacterAttribute.level == Character.Donkatsu)							//켄세이 레벨 == 돈까츠 스테이지 
		{
			kensei.levelUp();														//켄세이 레벨업 객체 호출 
			System.out.println("------------------------------------------");			//구분 줄 
			System.out.println(donkatsu.getName() + " VS " + kensei.getName());		//돈까츠 vs 켄세이 
			System.out.println("------------------------------------------");			//구분 줄 
			kensei.att();															//공격 선택 여부 호출 
			kensei.deff();															//방어 선택 여부 호출 
			kensei.healing();														//회복 선택 여부 호출 
			kensei.selectMenu();														//켄세이 선택 메소드 호출	
			donkatsu.selectMenu();													//돈까츠 선택 메소드 호출 
			
			if(kensei.SELECT == selection.ATT  && SelectNumber.turn == true)			//켄세이 공격 및 반복가능시 
			{
				if(donkatsu.SELECT == selection.ATT)									//켄세이 공격 및 돈까츠 공격 
				{
					kensei.attack(kensei);											//켄세이 공격 메소드 호출 
					donkatsu.hit(donkatsu, kensei);									//돈까츠 피격 메소드 호출 
					donkatsu.attack(donkatsu);										//돈까츠 공격 메소드 호출 
					kensei.hit(kensei, donkatsu);									//켄세이 피격 메소드 호출 
				}
				else if(donkatsu.SELECT == selection.DEFF)							//켄세이 공격 돈까츠 방어 
				{
					kensei.attack(kensei);											//켄세이 공격 메소드 호출 
					donkatsu.deffence(donkatsu, kensei);								//돈까츠 방어 메소드 호출 
				}
				else if(donkatsu.SELECT == selection.HEALING)						//켄세이 공격 돈까츠 회복 
				{
					kensei.attack(kensei);											//켄세이 공격 메소드 호출 
					donkatsu.hit(donkatsu, kensei);									//돈까츠 피격 메소드 호출 
					donkatsu.heal(donkatsu);											//돈까츠 회복 메소드 호출 
				}
				kensei.display(kensei);												//켄세이 현재 상태 호출 
				donkatsu.display(donkatsu);											//돈까츠 현재 상태 호출 
			}
			
			else if(kensei.SELECT == selection.DEFF && SelectNumber.turn == true)		//켄세이 방어 및 반복 가능시 
			{
				if(donkatsu.SELECT == selection.ATT)									//켄세이 방어 및 돈까츠 공격 
				{
					donkatsu.attack(donkatsu);										//돈까츠 공격 메소드 호출 
					kensei.deffence(kensei, donkatsu);								//켄세이 방어 메소드 호출 
				}
				else if(donkatsu.SELECT == selection.DEFF)							//켄세이 방어 돈까츠 방어 
				{
					kensei.deffence(kensei, donkatsu);								//켄세이 방어 메소드 호출 
					donkatsu.deffence(donkatsu, kensei);								//돈까츠 방어 메소드 호출 
				}
				else if(donkatsu.SELECT == selection.HEALING)						//켄세이 방어 돈까츠 회복 
				{							
					donkatsu.heal(donkatsu);											//돈까츠 회복 메소드 호출 
				}
				kensei.display(kensei);												//켄세이 현재 상태 출력 
				donkatsu.display(donkatsu);											//돈까츠 현재 상태 출력 
			}
			
			else if(kensei.SELECT == selection.HEALING && SelectNumber.turn == true)	//켄세이 회복 및 반복 가능 
			{
				if(donkatsu.SELECT == selection.ATT)									//켄세이 회복 돈까츠 공격 
				{
					kensei.heal(kensei);												//켄세이 회복 메소드 호출 
					donkatsu.attack(donkatsu);										//돈까츠 공격 메소드 호출 
					kensei.hit(kensei, donkatsu);									//켄세이 피격 메소드 호출 
				}
				else if(donkatsu.SELECT == selection.DEFF)							//켄세이 회복 돈까츠 방어 
				{
					kensei.heal(kensei);												//켄세이 회복 메소드 실행 					
					donkatsu.deffence(donkatsu, kensei);								//돈까츠 방어 메소드 실행 
				}
				else if(donkatsu.SELECT == selection.HEALING)						//켄세이 회복 돈까츠 회복 
				{
					kensei.heal(kensei);												//켄세이 회복 메소드 실행 
					donkatsu.heal(donkatsu);											//돈까츠 회복 메소드 실행 
				}
				kensei.display(kensei);												//켄세이 현재 상태 표시 
				donkatsu.display(donkatsu);											//돈까츠 현재 상태 표시 
			}
		}
	}
	public void stageFour()															//스테이지 4
	{
		if(CharacterAttribute.level == Character.YadongBong)							//켄세이 레벨 == 야동봉 스테이지 
		{
			kensei.levelUp();														//켄세이 레벨업 메소드 호출 
			System.out.println("------------------------------------------");			//구분 줄 
			System.out.println(yadongbong .getName() + " VS " + kensei.getName());	//켄세이 vs 야동봉 
			System.out.println("------------------------------------------");			//구분 줄 
			kensei.att();															//공격 선택 여부 출력 
			kensei.deff();															//방어 선택 여부 출력 
			kensei.healing();														//회복 선택 여부 출력 
			kensei.selectMenu();														//켄세이 선택 메소드 출력 
			yadongbong.selectMenu();													//야동봉 선택 메소드 출력 
			
			if(kensei.SELECT == selection.ATT && SelectNumber.turn == true)			//켄세이 공격 및 반복 가능 
			{	
				if(yadongbong.SELECT == selection.ATT)								//켄세이 공격 야동봉 공격 
				{
					kensei.attack(kensei);											//켄세이 공격 메소드 호출 
					yadongbong.hit(yadongbong, kensei);								//야동봉 피격 메소드 호출 
					yadongbong.attack(yadongbong);									//야동봉 공격 메소드 호출 
					kensei.hit(kensei, kangi);										//켄세이 피격 메소드 호출 
				}
				else if(yadongbong.SELECT == selection.DEFF)							//켄세이 공격 야동봉 방어 
				{
					kensei.attack(kensei);											//켄세이 공격 메소드 호출 
					yadongbong.deffence(yadongbong, kensei);							//야동봉 방어 메소드 호출 
				}
				else if(yadongbong.SELECT == selection.HEALING)						//켄세이 공격 야동봉 회복 
				{
					kensei.attack(kensei);											//켄세이 공격 메소드 호출 
					yadongbong.hit(yadongbong, kensei);								//야동봉 피격 메소드 호출 
					yadongbong.heal(yadongbong);										//야동봉 회복 메소드 호출 
				}
				kensei.display(kensei);												//켄세이 현재 상태 호출 
				yadongbong.display(yadongbong);										//야동봉 현재 상태 호출 
			}
			
			else if(kensei.SELECT == selection.DEFF && SelectNumber.turn == true)		//켄세이 방어 및 반복가능시 
			{
				if(yadongbong.SELECT == selection.ATT)								//켄세이 방어 및 야동봉 공격 
				{
					yadongbong.attack(yadongbong);									//야동봉 공격 메소드 호출 
					kensei.deffence(kensei, yadongbong);								//켄세이 방어 메소드 호출 
				}
				else if(yadongbong.SELECT == selection.DEFF)							//켄세이 방어 야동봉 방어 
				{
					kensei.deffence(kensei, yadongbong);								//켄세이 방어 메소드 호출 
					yadongbong.deffence(yadongbong, kensei);							//야동봉 방어 메소드 호출 
				}
				else if(yadongbong.SELECT == selection.HEALING)						//켄세이 방어 야동봉 회복 
				{
					yadongbong.heal(yadongbong);										//야동봉 회복 메소드 호출 
				}
				kensei.display(kensei);												//켄세이 현재 상태 호출 
				yadongbong.display(yadongbong);										//야동봉 현재 상태 호출 
			}
			
			else if(kensei.SELECT == selection.HEALING && SelectNumber.turn == true)	//켄세이 회복 및 반복 가
			{
				if(yadongbong.SELECT == selection.ATT)								//켄세이 회복 야동봉 공격 
				{
					kensei.heal(kensei);												//켄세이 회복 메소드 출력  
					yadongbong.attack(yadongbong);									//야동봉 공격 메소드 출력 
					kensei.hit(kensei, yadongbong);									//켄세이 피격 메소드 출력 
				}
				else if(yadongbong.SELECT == selection.DEFF)							//켄세이 회복 야동봉 방어 
				{
					kensei.heal(kensei);												//켄세이 회복 메소드 출력 
					yadongbong.deffence(yadongbong, kensei);							//야동봉 방어 메소드 출력 
				}
				else if(yadongbong.SELECT == selection.HEALING)						//켄세이 회복 야동봉 회복 
				{		
					kensei.heal(kensei);												//켄세이 회복 메소드 출력 
					yadongbong.heal(yadongbong);										//야동봉 회복 메소드 출력 
				}
				kensei.display(kensei);												//켄세이 현재 상태 호출 
				yadongbong.display(yadongbong);										//야동봉 현재 상태 호출
			}
		}
	}
}
