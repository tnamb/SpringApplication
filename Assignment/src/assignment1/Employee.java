package assignment1;

public class Employee 
{
	int id;
	String Name, Address;
	float Salary;
	
	public Employee(int id, String Name, String Address, float Salary)
	{
		super();
		this.id = id;
		this.Name= Name;
		this.Address = Address;
		this.Salary = Salary;
		
	}
	
	public int getID()
		{return id;}
	
	public String getName()
		{return Name;}
	
	public String getAddress()
		{return Address;}
	
	public float getSalary()
		{return Salary;}

	@Override
	public String toString()
	{
		return "Employee id = "+ id + " Name: " + Name + " Address: " + Address + " Salary: " + Salary;
	}

}
