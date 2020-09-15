package assignment3;

import java.util.Scanner;
import java.util.StringTokenizer;

@FunctionalInterface
interface WordCount
	{int count(String str);}

public class MyClassWithLambda 
{
	static int count = 0;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any line \n");
		String abc = sc.nextLine();
		sc.close();
		
		WordCount obj = str->
		{
			StringTokenizer st = new StringTokenizer(str);
			count = st.countTokens();
			
			return count;
		};
		
		System.out.println(obj.count(abc));
	}
}
