package stringFunctions;

public class ReplaceAll2 //remove all capital letters from string
{
	public static void main(String[] args) 
	{
		String name="Suyog Nivale";
		String s1=name.replaceAll("[A-Z]", "");
		System.out.println(s1);
	}
}
