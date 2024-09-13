package stringFunctions;

public class StringProgram 
{
	public static void main(String[] args) 
	{
		String name="SUyog";
		System.out.println(name.substring(0, 4));
		int size=name.length();
		System.out.println(name);
		System.out.println(size);
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		String s1="  I am Suyog";
		System.out.println(s1);
		System.out.println(s1.trim());  //trim will remove extra space from beginning of string and ending of string but not middle of string
		
		String s2="    I am Suyog     ";
		System.out.println(s2);
		System.out.println(s2.trim());
		
		String s3="I am Suyog";
		System.out.println(s3.substring(2));  
		
		String s4="I am Suyog";
		System.out.println(s4.substring(1, 4));
	}
}
