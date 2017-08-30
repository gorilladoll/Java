package AdventureKensei;

public class AdventureKenseiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Stage stage = new Stage();				//스테이지 객체 불러오기 
		
		stage.nameField();						//스테이지 객체의 nameField 메소드를 이용한 이름 호출 
		stage.getStatuses();						//스테이지 객체의 getStatuses 메소드를 이용한 스테이터스 호출 
		
		while(SelectNumber.turn)					//SelectName turn 변수가 true일 경우 
		{
			stage.stageOne();					//스테이지 객체의 stageOne메소드 호출 
			stage.stageTwo();					//스테이지 객체의 stageTwo메소드 호출 
			stage.stageThree();					//스테이지 객체의 stageThree메소드 호출 
			stage.stageFour();					//스테이지 객체의 stageFour메소드 호출 
		}
	}
}
