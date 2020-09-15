package assignment4;

import java.util.Comparator;

public class Employee implements Comparator<Employee>
{
	int id;
	String Name, Address;
	int Salary;

	public Employee(int id, String Name, String Address, int Salary) 
	{
		super();
		this.id = id;
		this.Name = Name;
		this.Address = Address;
		this.Salary = Salary;
	}

	public int getId() 
		{return id;}


	public void setId(int id) 
		{this.id = id;}


	public String getName() 
		{return Name;}


	public void setName(String name) 
		{Name = name;}


	public String getAddress() 
		{return Address;}


	public void setAddress(String address) 
		{Address = address;}


	public int getSalary() 
		{return Salary;}


	public void setSalary(int salary)
		{Salary = salary;}
	
	@Override
	public String toString()
		{return "ID = "+ id + " Name: " + Name + " Address: " + Address + " Salary: " + Salary;}

	public static int compareBySal(Employee e1, Employee e2)
		{return e1.getSalary()-e2.getSalary();}

	@Override
	public int compare(Employee a1, Employee a2) 
	{
		// TODO Auto-generated method stub
		return a1.getSalary()-a2.getSalary();
	}

}