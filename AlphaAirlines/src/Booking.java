//Alpha Airlines is one of the oldest and largest airlines in U.S. The airline transports more than 90 percent 
//of all U.S. airlines passenger and cargo traffic thus flourishing the economic growth internationally. 
//Currently, the airline operates only on the London route.
//The CEO of Alpha Airlines has now planned to expand the routes upto Singapore and Tokyo. 
//The earlier automated software could book tickets only for London, but after the addition of two more destinations,
//that is, Singapore and Tokyo, the existing ticket booking software have to be upgraded. To accomplish this, 
//a team of experts have been chosen by the Airline company to provide a solution for the same. Consider yourself
//to be a part of the team that implements the solution for designing the application. Create an application using 
//object-oriented features to implement the software. 
//The application should perform the following: 
//	1. Design a class named Booking for booking the airline tickets. 
//	2. Modify the class to store the following details:
//
//		  > bookingID
//        > departureDate
//        > numberOfTickets
//		  > price
//        > cabinType
//        > totalPrice
//        > destination
//	3. Add appropriate constructors in the class to instantiate an object of the Booking class. 
//	   The constructor initializes the field bookingID, departure/date, numberOfTickets, price, destination, 
//	   and cabinType respectively. 
//	4. Apply encapsulation feature to achieve data hiding for the Booking class.
//	5. Create a method named totalPrice() to compute the total price of tickets booked.
//	6. Create a method ticketConformation() to display all the information about the tickets booked. 
//	   Also, create a test class that creates the different instances of Booking class and initialize them 
//	   with appropriate constructor. Finally, the respective method should be invoked to display the
//	   complete ticket information in proper format.

public class Booking {
	//instance variable
	//encapsulation applyed
	private int bookingId;
	private String departureDate;
	private short numberOfTickets;
	private float price;
	private String cabinType;
	private float totalPrice;
	private String destination;
	//local variable
	//here n0w 2 variables are there one at instance and other at local--so jvm give preference to
	//local variable--so we need to make jvm to understand that both that local and instance a
	//are diffrent and not to conside that local variable as class so we are using this keyword
	//by this kerword jvm comes to know that both are diffrent and it treat local as local ana instace as instace
	//This:: refer to current object of classs
	public Booking(int bookingId,String departureDate,short numberOfTickets,float price,String destination,	String cabinType) {
		this.bookingId=bookingId;
		this.departureDate=departureDate;
		this.numberOfTickets=numberOfTickets;
		this.price=price;
		this.cabinType=cabinType;
		this.destination=destination;
		}
	public void TotalPrice() {
	totalPrice=numberOfTickets * price;
	}
	public void ticketConformation() {
		System.out.println("Ticket conformation details: ");
		System.out.println("Booking id : "+bookingId);
		System.out.println("Depature date : "+departureDate);
		System.out.println("Number of tickets: "+numberOfTickets);
		System.out.println("Price per ticket : "+price);
		System.out.println("Cabin type : "+cabinType);
		System.out.println("Destination : "+destination);
	}
	
	
}
