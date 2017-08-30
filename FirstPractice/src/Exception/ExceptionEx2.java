package Exception;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionEx2 {
	public static void main(String[] args) {
		System.out.println(1);
		try{
			System.out.println(2);
			
			if(2 > 3){
				System.out.println(3);
				throw new IOException();
			}
			
			if(2 < 3){
				System.out.println(5);
				throw new SQLException();
			}
		} catch(IOException e){
			System.out.println(7);
		} catch(SQLException e){
			System.out.println(8);
//		} catch (Exception e){
//			System.out.println(7);
		} finally {
			System.out.println(9);
		}
		System.out.println(10);
	}
}
