import java.util.Scanner;

public class IntToString {
	public static void main(String args[]) {
		
		try {
		
		int n = 100;
		
		//3 ways to convert from int to String
		
		//String s = new Integer(n).toString(); 
		//String s = String.valueOf(n);
		String s = Integer.toString(n);
		
		
		if(n == Integer.parseInt(s)){
			System.out.println("Good Job!");
		}else {
			System.out.println("Wrong Answer!");
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
