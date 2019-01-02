import java.util.Calendar;

public class DateAndTime {	
	public static void main(String args[]) {
		
		int day = 5;
		int month = 8;
		int year = 2015;
		
		System.out.println(findDay(month, day, year));

				
	}
	
	public static String findDay(int month, int day, int year) {

		Calendar cal = Calendar.getInstance(); 
		cal.set(year, month-1, day); 
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); 
		
		String days[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"}; 
		
		return(days[dayOfWeek-1]);
		
	}

}
