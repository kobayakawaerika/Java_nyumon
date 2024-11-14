import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Chapter3_1 {
	public static void main(String[] args) throws Exception {
		LocalDate d = LocalDate.now().withDayOfMonth(1);
		int lastday = d.lengthOfMonth(); //最後の日
		
		for(int i = 0; i <= lastday; i++) {
			
			DayOfWeek w = d.getDayOfWeek();
			String wstr = w.getDisplayName(TextStyle.SHORT, Locale.getDefault());
			
			System.out.print(d.getDayOfMonth() + "(" + wstr + ")");
			
			if(w == DayOfWeek.SATURDAY) {
				System.out.println();
			}
			
			d = d.plusDays(1);
		}

	}

}
