package Exception;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		MainClass main = new MainClass();
		
		System.out.println("입력값 : " + main.getInputValue());
	}
	int getInputValue() throws InvalidInputValue{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input : ");
		int inputValue = scan.nextInt();
		
		if(inputValue < 0)
			throw new InvalidInputValue(18);
		else if(inputValue > 100)
			throw new InvalidInputValue(218);
		
		return inputValue;
	}

}
