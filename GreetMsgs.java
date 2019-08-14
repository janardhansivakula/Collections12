//write a java programme which will welcome the user with an appropriate greeting message depends on system date.
//GreetMsgs.java
import java.util.*;
class GreetMsgs
{
	public static void main(String args[])
	{
       Scanner sc = new Scanner(System.in);
	   System.out.println("========================");
	   System.out.println(" Plz Enter any name");
	   System.out.println("========================");
	   String name=sc.nextLine();
	   System.out.println(name+":");
	   Date d =new Date();
	   int hr=d.getHours();
	   System.out.println("The System hours is="+hr);
	   if((hr>=0)&&(hr<13))
	   {
		   System.out.println("GOOD MORNING");
	   }
	   if((hr>=13)&&(hr<16))
	   {
	      System.out.println("GOOD AFTERNOON");
	    }
		if((hr>=16)&&(hr<20))
		{
		  System.out.println("GOOD EVENING");
		}
		if((hr>=20)&&(hr<23))
		{
			System.out.println("GOOD NIGHT");
		}
	}
}