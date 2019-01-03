import javax.swing.text.StringContent;

public class StringsIntroduction {
	public static void main(String args[]) {
		
		String a = "hello";
		String b = "java";
		int count = 0;
		
		//1- Sum the lengths A of B and .
		count = a.length() + b.length();
		System.out.println(count);
		
		//2- Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
		int c = a.compareTo(b);
		
		if(c < 0) {
			System.out.println("No");
		}else if(c == 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
		System.out.println(a.substring(0,1).toUpperCase() + a.substring(1,(a.length()))
						  + " " + b.substring(0,1).toUpperCase() + b.substring(1,(b.length())));
		
		
		
		
		//Capitalize the first letter in A and B and print them on a single line, separated by a space.
		
	}
}
