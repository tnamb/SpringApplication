package assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList 
{
	public static void main(String[] args)
	{
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(1, "Mohan","Bhusawal", 4000));
	    list.add(new Employee(2, "David","Bombay", 5000));
	    list.add(new Employee(3, "Pogba","Manchester", 2000));
	    list.add(new Employee(4, "Havertz","Chelsea", 100000));
	    list.add(new Employee(5, "Allison","Liverpool", 200000));
	    list.add(new Employee(6, "Auba","Arsenal", 1000));
        Collections.sort(list, Employee::compareBySal);
	   
	    list.forEach(s -> System.out.println(s));
        
		/*
		 * for (Employee s : list) {System.out.println(s.getID() + " " + s.getName() +
		 * " " + s.getAddress() + " " + s.getSalary());}
		 */
	        

	}
}
