import java.util.ArrayList;
import java.util.Collections;

public class SubstringComparisons {
	public static void main(String args[]) {

		String smallest="";
		String largest="";
		String s = "welcometojava";
		int k = 3;
		ArrayList<String> list = new ArrayList<>();

		for(int i = 0; i < s.length()-2; i++) {
				list.add(s.substring(i,(i+k)));
				Collections.sort(list);
		}
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		
	}
}