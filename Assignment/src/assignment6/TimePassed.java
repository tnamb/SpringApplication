package assignment6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TimePassed 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the year of joining \n");
		int year = sc.nextInt();
		System.out.println("Enter the month of joining \n");
		int month = sc.nextInt();
		System.out.println("Enter the day of joining \n");
		int dayOfMonth = sc.nextInt();
		sc.close();
		LocalDate joinDate = LocalDate.of(year, month, dayOfMonth);
		LocalDate today = LocalDate.now();
		
		if (joinDate.isAfter(today))
			System.out.println("Invalid");
		else
			{
			Period exp = Period.between(joinDate, today);
			//System.out.println("Experience: " + exp);
			year = exp.getYears();
			month = exp.getMonths();
			dayOfMonth = exp.getDays();
			
			System.out.println(year + " years " + month + " months " + dayOfMonth + " days");
			}
		

	}
}
