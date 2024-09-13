package stringFunctions;

public class ReplaceAll3  //remove all space between string
{
	public static void main(String[] args) 
	{
		String name="Suyog Nivale";
		String s1=name.replaceAll("[ ]", "");
		System.out.println(s1);
	}
}
