package throw_throws;

public class Exceptionhandle 
{
	public static void main(String[] args) //if there is no exception in the try block then try block will execute if exception in try block catch block will execute
	{
		try 
		{
			int a=1/1;
			System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Sorry there was an exception but we handled it");
		}
	}
}
