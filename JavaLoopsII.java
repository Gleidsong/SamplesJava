import java.util.ArrayList;

public class JavaLoopsII {
	public static void main(String args[]) {
		
		int a = 0;
		int b = 2;
		int n = 10;
				
		for(int i = a; i < n; i++){
			a +=  b;
			System.out.print(a + " ");
			b *= 2;
			
		}
	}
}
