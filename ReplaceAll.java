package stringFunctions;

public class ReplaceAll   //remove all alphabets in string
{
	public static void main(String[] args)
	{
		String name="kv no 2 pune";
		String s2=name.replaceAll("[a-z]", "");
		System.out.println(s2);
	}
}
