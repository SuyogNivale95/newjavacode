package stringFunctions;

public class Matches  //Checking given string starts with l or not
{
	public static void main(String[] args) 
	{
		String a="School";
		boolean s1=a.matches("l(.*)");
		System.out.println(s1);
	}
}
