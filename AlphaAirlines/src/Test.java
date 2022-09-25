//below code for last constraint
//for short explicit casting must be done as it is short
import java.util.Scanner;
public class Test {
public static void main(String args[]) {
	Booking bookingObj=null;

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your destination (Tokyo/Singapore):");
	
	String dest=sc.next();
	
	if(dest.equalsIgnoreCase("Tokyo")) 
		bookingObj=new Booking(1001,"30-Oct-2022",(short)2,25000f,"Ac","Tokyo");
	else if(dest.equalsIgnoreCase("Singapore"))
		bookingObj=new Booking(1002,"28-Nov-2022",(short)2,25000f,"Ac","Singapore");
	else {
		System.out.println("Incorrect destination...Try again!");
		System.exit(0);
	}
	bookingObj.TotalPrice();
	bookingObj.ticketConformation();
	
}
}

