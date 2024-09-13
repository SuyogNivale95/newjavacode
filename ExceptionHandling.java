package throw_throws;

public class ExceptionHandling 
{
	public static void main(String[] args)   //there is exception in try block so catch block will execute
	{
		try
		{
			int a=1/0;
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Sorry but there was a blocker but we handled it");
		}
	}
}
