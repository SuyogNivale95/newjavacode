package throw_throws;

import java.util.InputMismatchException;

public class Throws_Keyword 
{
	public static void main(String[] args) throws NullPointerException,InputMismatchException
	{
		if(1==11)
		{
			throw new NullPointerException("Sorry your cell is empty");
		}
		else
		{
			throw new InputMismatchException("Sorry check your input before entering");
		}

	}

}
