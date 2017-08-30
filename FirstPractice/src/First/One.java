package First;

public class One {

	public static void main(String[] args) {
		int count = 1;
		for(int i = 1;count < 10; i++){
			if(i >= 10){
				i = 0;
				count++;
				System.out.println();
			}
			else{
				System.out.print("*");
			}
			
		}
	}
}
