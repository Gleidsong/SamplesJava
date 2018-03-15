
public class Fibonacci{
	
	static long fibo(int x) {
	static long fibo(int n) {
		
		int f = 0;
		int ant = 0;
		
		for(int i = 1; i <= x; i++) {
		for(int i = 1; i <= n; i++) {
			if(i == 1) {
				f = 1;
				ant = 0;
			}else {
				f += ant;
				ant = f-ant;
			}
			
				ant = f - ant;
			}			
		}
		return f;
		return f;		
	}
	
}