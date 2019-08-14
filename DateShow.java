//DateShow.java
import java.util.*;
class DateShow
{
	public static void main(String args[])
	{
		Date dt=new Date();
		System.out.println("========================");
		System.out.println("The system Current Date is=" +dt);
		System.out.println("The System Hours is="  +dt.getHours());
		System.out.println("The System Minutes is="  +dt.getMinutes());
		System.out.println("The System Seconds is="  +dt.getSeconds());
		System.out.println("========================");
	}
}