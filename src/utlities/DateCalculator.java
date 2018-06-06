package utlities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalculator {




	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	public static void main(String[] args) throws Exception {

		Date currentDate = new Date();
		
		
		
		 String s = "09/22/2019";
		 SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
		 Date date1 = sd.parse(s);
		
		
		
		System.out.println(dateFormat.format(date1));

		// convert date to calendar
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.setTime(date1 );

		// manipulate date
		//  c.add(Calendar.YEAR, 1);
		// c.add(Calendar.MONTH, 1);
		c.add(Calendar.DATE, 1); //same with c.add(Calendar.DAY_OF_MONTH, 1);
		// c.add(Calendar.HOUR, 1);
		// c.add(Calendar.MINUTE, 1);
		//  c.add(Calendar.SECOND, 1);

		// convert calendar to date
		Date currentDatePlusOne = c.getTime();

		System.out.println(dateFormat.format(currentDatePlusOne));
		//System.out.println(dateFormat.);
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String dateWithoutTime = sdf.format(currentDatePlusOne);
		System.out.println(dateWithoutTime);
		

	}

}

