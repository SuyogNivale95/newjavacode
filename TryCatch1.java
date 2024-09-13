package throw_throws;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch1 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Please enter your age");
			int d1=s1.nextInt();
			s1.close();
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Sorry it doesnot seems your age, Please try again ");
			Scanner s2=new Scanner(System.in);
			System.out.println("Please enter your age ");
			int f2=s2.nextInt();
			s2.close();
		}
	}
}
