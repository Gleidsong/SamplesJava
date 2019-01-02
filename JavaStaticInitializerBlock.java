import java.util.Scanner;

public class JavaStaticInitializerBlock {
	static Scanner scan = new Scanner(System.in);
	
	static boolean flag = true;
	static int B = scan.nextInt();
	static int H = scan.nextInt();
	
	static {
		try {
			if(B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("Breadth and heigth must be positive");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String args[]) {
		
		if(flag) {
			int area = B*H;
			System.out.println(area);
		}
		
	}
}
