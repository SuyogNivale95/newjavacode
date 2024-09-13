package throw_throws;

public class FinallyKeyword 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=1/0;
			System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("We handled exception here");
		}
		finally   //finally block will always execute in the case of exception handling
		{
			System.out.println("Welcome to GMT");
		}
	}
}
