//DispDateDemo.java
import java.util.*;
import java.io.*;
class DispDateDemo
{
	public static void main(String args[])
	{
	    Date d = new Date();
		System.out.println("-------------------------------------");
		System.out.println("Date is="+d);
		System.out.println("Hours="+d.getHours());
		System.out.println("Minutes="+d.getMinutes());
		System.out.println("seconds="+d.getSeconds());
		System.out.println("-------------------------------------");
	}
}