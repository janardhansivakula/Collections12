//write a java programe which will displays the system date
//DispDateDemo.java
import java.util.*;
/*class DisDate
{
	void DateDisp()
	{
        Date d = new Date();
		System.out.println("==================");
		System.out.println("The date is="+d);
		System.out.println("Minutes="+d.hours());
		System.out.println("==================");
	}
}*/
class DispDateDemo
{
	public static void main(String args[])
	{
	    Date d = new Date();
		System.out.println("-------------------------------------");
		System.out.println("Date is="+d);
		System.out.println("Hours="+d.hours());
		System.out.println("");
		System.out.println("-------------------------------------");
	}
}