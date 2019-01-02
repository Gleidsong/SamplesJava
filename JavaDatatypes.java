
public class JavaDatatypes {
	public static void main(String args[]) {
		
		int x = -150;
		
		System.out.println(x + " can be fitted in:");
         
		 if(x>=-128 && x<=127)System.out.println("* byte");
         //Complete the code
         if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
             System.out.println("* short");
         if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
             System.out.println("* int");
         if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
             System.out.println("* long");
		else
			System.out.println(x + " can't be fitted anywhere.");
     }		
}
