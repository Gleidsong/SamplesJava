import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyFormatter {
	public static void main(String args[]) {
		
		double val = 12324.134;
		
		NumberFormat informatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		NumberFormat chformatter = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
		NumberFormat frformatter = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));
		NumberFormat usformatter = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		
		//US Currency
		String usSymbol = usformatter.format(val);
		System.out.println("US: " + " " + usSymbol);
		
		//India Currency
		String inSymbol = informatter.format(val);
		System.out.println("India: " + " " + inSymbol);
		
		//China currency
		String chSymbol = chformatter.format(val);
		System.out.println("China: " + " " + chSymbol);
		
		//French currency
		String frSymbol = frformatter.format(val);
		System.out.println("India: " + " " + frSymbol);
		
	}
}
