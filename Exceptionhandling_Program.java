package throw_throws;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling_Program 
{
	public static void main(String[] args) 
	{
		try
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter your age ");
		int age=s1.nextInt();
		}
		catch(InputMismatchException s1)
		{
			System.out.println("Sorry but this doesnot seems your age, please try again ");
			Scanner s2=new Scanner(System.in);
			System.out.println("Please enter your age ");
			int age1=s2.nextInt();
		}
	}
}
