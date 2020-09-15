package assignment2;

public class Music 
{
	public static void main(String[] args)
	{
		Guitar x1;
		Piano x2;
		
		x1 = new Instrument();
		x2 = new Instrument();
		
		System.out.println("Guitar");
		x1.play();
		System.out.println("Piano");
		x2.play();
	}
}
