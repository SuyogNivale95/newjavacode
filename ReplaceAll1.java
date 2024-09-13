package stringFunctions;

public class ReplaceAll1   //remove all numeric values
{
	public static void main(String[] args) 
	{
		String nameofsinger="50 cente";
		String d1=nameofsinger.replaceAll("[0-9]", "");
		System.out.println(d1);
	}
}
