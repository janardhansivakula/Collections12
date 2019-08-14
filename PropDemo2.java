//write a java programme which will retrieve property names and property values from any property file.
//PropDemo2.java
import java.io.*;
import java.util.*;
class PropEx2
{
	Properties readData()
	{
		Properties p=null;
		try
		{
          Scanner sc = new Scanner(System.in);
		  System.out.println("Enter your prop file name");
		  String fname=sc.nextLine();
		  FileInputStream fis = new FileInputStream(fname);
		  p=new Properties();
		  p.load(fis);
		  fis.close();
		}
		catch (FileNotFoundException fne)
		{
			System.err.println("File Does not Exists");
		}catch(Exception e)
		{
			System.err.println(e);
		}
		return p;
   } 
   void dispPropData(Properties x)
	{
	   System.out.println("=============================");
	   Enumeration en =x.keys();
	   while(en.hasMoreElements())
	   {
		   Object kobj=en.nextElement();
		   Object vobj=x.get(kobj);
		   System.out.println(kobj+"\t"+vobj);
	   }
	   System.out.println("=============================");
	}
}//PropEx2
class PropDemo2
{
	public static void main(String args[])
	{
		PropEx2 p2=new PropEx2();
		Properties p=p2.readData();
		//p2.dispPropData();
	}
}