


public class ImprimeFatorial {
	public static void main(String[] args) {
		
		int x = 1;
		int y = -1;
		
		for(int i = 1; i <= 10; i++) {
			x *= i;
			y++;
			if(y == 0) {
				System.out.println("O Fatorial de " + y + " é 1" );
			}
			System.out.println("O Fatorial de " + i + " é " + "(" + y + "!)*" + i  + " = " + x);
		}
	}
}
