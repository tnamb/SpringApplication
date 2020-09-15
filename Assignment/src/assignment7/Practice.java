package assignment7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Practice 
{
	public static void main(String[] args)
	{
	List<String> myList = new ArrayList<>();
	int count = 0;
	
	myList.add("Oasis");
	myList.add("");
	myList.add("The Beatles");
	myList.add("Pink Floyd");
	myList.add("");
	myList.add("Led Zeppelin");
	myList.add("");

	
	//length greater than 5

	for (int i=0; i<myList.size(); i++)
		{
			if (myList.get(i).length() > 5)
				System.out.println(myList.get(i));
		}
	
	//empty strings
	for (int i=0; i<myList.size(); i++)
		{
			if (myList.get(i).length() == 0)
				System.out.println("String object at index " + i + " is empty ");
		}
	
	//number of empty strings
	
	for (int i=0; i<myList.size(); i++)
	{
		if (myList.get(i).length() == 0)
			count++;
	}
	
	System.out.println("\n Number of empty strings are: " + count);
	
	//for storing empty strings using stream API
	List<String> emptyStrings = myList.stream().filter(s->s.isEmpty()).collect(Collectors.toList());
	//System.out.println(emptyStrings);
	
	}
}
