package First;

import java.util.Scanner;																					//scanner를 사용하기 위한 임포트 

class students{																									//클래스 student를 선언 
	int sum = 0;																										//멤버변수 sum을 선언 
	double average = 0.0;																					//멤버변수 average를 선언 

	public int sum(int korean,int english,int math){											//멤버 메소드 sum을 선언하고 가인수(korean,english,math)를 받는다 
		sum = korean+english+math;																		//입력받은 가인수의 값들을 합친다.
		return sum;																									//결과값을 변환 
	}																														//sum 메소드 닫기 
	
	public double average(int sum){																	//출력한 sum의 값을 받아 평균을 내기위한 멤버메소드 선언 
		average = sum / 3.0d;																					//입력받은 sum으로 평균을 구하는 구문 
		return average;																							//결과값을 반환 
	}																														//average 메소드 닫
	
	public void printResult(){																				//결과값을 구하기 위한 멤버 메소드
		Scanner scan = new Scanner(System.in);													//값을 받아오기 위한 라이브러리 
		int std_Num = 0;																							//몇명의 학생의 평균인지를 알기위해 사용한 변수 
			
		System.out.print("학생이 몇명입니까: ");														//학생의 수를 질문하는 print문 
		std_Num = scan.nextInt();																			//std_Num에 scan을 이용하여 입력받는 구문 
		System.out.println();																					//구분을 위한 개행 
		
		String[] name = new String[std_Num];														//이름을 배열로 받아아 인원수 만큼 길이를 만들기 위한 선언 
		int[] korean = new int[std_Num];																//국어 성적을 배열로 입력받아 인원수 만큼 길이를 만들기 위한 선언 
		int[] english = new int[std_Num];																//영어성적을 배열로 입력받아 인원수 만큼 길이를 만들기 위한 선언
		int[] math = new int[std_Num];																	//수학 성적을 배열로 입력받아 인원수 만큼 길이를 만들기 위한 선언
		double [] average = new double[std_Num];												//성적을 배열로 입력받아 인원수만틈 길이를 만들기 위한 선언 
		
		
		
		for(int index=0;index <=std_Num-1;index++){											//배열은 0부터 시작하므로 입력받은 수 보다 
																															//1만큼 작아야 하기 때문에 입력받은수 -1로 주었다.
			System.out.print("이름을 입력하세요: ");													//이름을 입력 하라는 출력
			name[index] = scan.next();																		//이름에 name[0]~name[std_Num-1]까지 입력받는 구문 
																															//nextLine()을 썼더니 2번째 반복부터 이름을 입력받지 않아버림 
			System.out.print("국어성적을 입력하세요: ");												//국어성적을 입력하라는 출력문 
			korean[index] = scan.nextInt();																//국어성적에 korean[0]~korean[std_Num-1]까지 입력받는 구문
			System.out.print("영어성적을 입력하세요: ");												//영어성적을 입력하라는 출력문 
			english[index] = scan.nextInt();																//영어성적에 english[0]~english[std_Num-1]까지 입력받는 구문
			System.out.print("수학성적을 입력하세요: ");												//수학성적을 입력하라는 출력문 
			math[index] = scan.nextInt();																	//수학성적에 math[0]~math[std_Num-1]까지 입력받는 구문
			
			System.out.println();																				//구분을 위한 개행 
			
			sum(korean[index],english[index],math[index]);									//한 학생의 성적들을 sum으로 보
			average[index] = average(sum);																//평균 배열에 평균 계산된 값을 집어넣음 
		}																													//계산을 위한 반복문 종료 
		
		for(int i = 0; i <= std_Num-1;i++){																//평균 출력을 위한 반복문 
			System.out.print(name[i]+"의 평균성적: ");												//성적을 출력하기 위한 구문 
			System.out.println(average[i]);																//성적을 출력하는 구문 
		}																													//평균출력 반복문 종료 
	}																														//printResult 멤버메소드 종료 
}																															//클래스 종료 


public class Practice_1 {																					
	public static void main(String[] args) {															
		students std = new students();																	//printResult()메소드를 부르기 위해 선언한 객체 
		std.printResult();																							//std멤버변수의 주소값에서 가지고있는 메소드인
																															//printResult()메소드를 출력 
	}
}
