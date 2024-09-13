package stringFunctions;

public class Palindrome22 
{
	public static void main(String[] args) 
	{
		String input="madam";
		System.out.println("My input is = "+input);
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
		}
		System.out.println("My output is = "+output);
		if(input.equals(output)==true)
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}
	}

}
