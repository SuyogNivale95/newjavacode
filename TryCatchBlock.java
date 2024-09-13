package throw_throws;

import java.util.InputMismatchException;

public class TryCatchBlock 
{
	public static void main(String[] args) 
	{
		try //in single try we can have multiple catch block
		{
			int a=1/0;
			System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Sorry there was a blocker but we handled it 1");
		}
		catch(InputMismatchException s1)
		{
			System.out.println("Sorry there was a blocker but we handled it 2");
		}
		catch(NullPointerException b1)
		{
			System.out.println("Sorry there was a blocker but we handled it 3");
		}
		catch(ArrayIndexOutOfBoundsException c1)
		{
			System.out.println("Sorry there was a blocker but we handled it 4");
		}
		catch(ClassCastException q1)
		{
			System.out.println("Sorry there was a blocker but we handled it 5");
		}
	}
}
