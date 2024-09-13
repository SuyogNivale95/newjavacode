package throw_throws;

public class Finally_Program
{
	public static void main(String[] args) 
	{
		try
		{
			int a=1/1;
			System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("We handeled exception here");
		}
		finally
		{
			System.out.println("Welcome to GMT");
		}
	}
}
