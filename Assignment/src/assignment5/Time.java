package assignment5;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Time 
{
	public static void main (String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        
        System.out.println("Enter the month");
		String month = sc.next();
		
		
		 if (month.equalsIgnoreCase("january")) 
			 month = "february";
		 
		 else if (month.equalsIgnoreCase("february")) 
			 month = "march";
		 
		 else if (month.equalsIgnoreCase("march")) 
			 month = "april";
		 
		 else if (month.equalsIgnoreCase("april")) 
			 month = "may";
		 
		 else if (month.equalsIgnoreCase("may")) 
			 month = "june";
		 
		 else if (month.equalsIgnoreCase("june")) 
			 month = "july";
		 
		 else if (month.equalsIgnoreCase("july")) 
			 month = "august";
		 
		 else if (month.equalsIgnoreCase("august")) 
			 month = "September";
		 
		 else if (month.equalsIgnoreCase("September")) 
			 month = "October";
		 
		 else if (month.equalsIgnoreCase("October")) 
			 month = "November";
		 
		 else if (month.equalsIgnoreCase("November")) 
			 month = "December";
		 
		 else if (month.equalsIgnoreCase("December")) 
			 month = "January";
		 
		 else
			 System.out.println("invalid month");
		 
		month = month.toUpperCase();
		
        LocalDate d = LocalDate.of(year, Month.valueOf(month), 1);
        LocalDate d2 = d.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
        //System.out.println(d);   
        System.out.println(d2);
        

    }
}
