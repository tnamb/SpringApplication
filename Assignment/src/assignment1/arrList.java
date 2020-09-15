package assignment1;

import java.util.*;

public class arrList 
{
	public static void main(String[] args) throws Exception
	{
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(1, "Mohan","Bhusawal", 4000));
	    list.add(new Employee(2, "David","Bombay", 5000));
	    list.add(new Employee(3, "Pogba","Manchester", 6000));
	   
	    list.forEach(s->System.out.println(s));
	    
		/*
		 * for (Employee s : list) {System.out.println(s.getID() + " " + s.getName() +
		 * " " + s.getAddress() + " " + s.getSalary());}
		 */
	}
}
