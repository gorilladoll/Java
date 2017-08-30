package First;

import java.util.Scanner;

class studentArray{
	String 	name;
	int 		korean = 0;
	int		english = 0;
	int		math = 0;
	int		sum = 0;
	double		average = 0;
	
	public int  sumPoints(){
		sum = korean+english+math;
		return sum;
	}
	public double avgPoints(){
		average = sum/3.0d;
		return average;
	}
	public void printAvgPoints(){
		System.out.print(name+"의 점수: ");
		System.out.println(average);
	}
}

public class Practice_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		System.out.print("학생 수를 입력 하세요: ");
		input= scan.nextInt();
		
		studentArray[] stdarr = new studentArray[input];
		
		for(int i=0;i<=stdarr.length;i++){
			stdarr[i]  = new studentArray();
			
			System.out.print("이름을 입력하세요: ");
			stdarr[i].name = scan.next();
			System.out.print("국어 점수를 입력하세요: ");
			stdarr[i].korean = scan.nextInt();

			System.out.print("수학 점수를 입력하세요: ");
			stdarr[i].math = scan.nextInt();

			System.out.print("영어 점수를 입력하세요: ");
			stdarr[i].english = scan.nextInt();
			System.out.println();
			
			stdarr[i].sumPoints();
			stdarr[i].avgPoints();
			stdarr[i].printAvgPoints();
		}
	}
}
