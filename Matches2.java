package stringFunctions;

public class Matches2  ////Checking in given string a is present or not
{
	public static void main(String[] args) 
	{
		String a="Suyog";
		boolean s=a.matches("(.*)a(.*)");
		System.out.println(s);
	}
}
