package stringFunctions;

public class String_Matches //Checking given string ends with l or not
{
	public static void main(String[] args) 
	{
		String a="School";
		boolean a1=a.matches("(.*)l");
		System.out.println(a1);
	}
}
