//write a java programme which will read the data of properties class by using properties class object.
//PropEx1Demo.java.
//step-1 before compiling and executing we have create a properties file.
import java.util.*;
import java.io.*;
class PropEx1
{
    void readData()
	{
        try
        {
			//step-2
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your file name");
            String fname=sc.nextLine();
			FileInputStream fis=new FileInputStream(fname);
			//step-3
			Properties p = new Properties();
			//step-4
			p.load(fis);
			//step-5
			String mid=p.getProperty("myid");
			String mname=p.getProperty("myname");
			String mmarks=p.getProperty("mymarks");
			String mcollege=p.getProperty("mycollege");
			String mcourse=p.getProperty("mycourse");
			String mpercentage=p.getProperty("mypercentage");
			System.out.println("======================================");
			System.out.println("My Educational Details");
			System.out.println("======================================");
			System.out.println("My ID is="  +mid);
			System.out.println("My name is="  +mname);
			System.out.println("My marks is="  +mmarks);
			System.out.println("My college is="  +mcollege);
			System.out.println("My course is ="+mcourse);
			System.out.println("My percentage is="  +mpercentage);
			System.out.println("======================================");
			//step-6
			fis.close();
		}
        catch (FileNotFoundException fne)
        {
			System.err.println("--------------------------------------");
			System.err.println("File Does not exists ");
			System.err.println("--------------------------------------");
        }
		catch(Exception fne)
		{
			System.err.println("**********************************");
			System.err.println(fne);
			System.err.println("**********************************");
		}
	}
}//PropEx1
class PropEx1Demo
{
	public static void main(String args[])
	{
        PropEx1 pp = new PropEx1();
		pp.readData();
	}//main()
}//PropEx1Demo