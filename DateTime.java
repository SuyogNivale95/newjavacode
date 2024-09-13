package stringFunctions;

import java.util.Date;

public class DateTime //current time
{
	public static void main(String[] args)
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		//epoch converter
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
	}
}
