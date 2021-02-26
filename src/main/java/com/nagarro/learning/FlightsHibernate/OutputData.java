package com.nagarro.learning.FlightsHibernate;

public class OutputData {
public static void dataOutput(FlightModel obj)
{
	System.out.println("**********-----***********");
	System.out.println("Flight Detail :");
	System.out.println("Flight Number :" +obj.getFlightNum());
	System.out.println("Departure Location :" +obj.getDepLocation());
	System.out.println("Arrival Location :"+obj.getArrLocation());
	System.out.println("Valid date :"+obj.getValidDate());
	System.out.println("Flight Time :"+obj.getFlightTime());
	System.out.println("Flight Fare :"+obj.getFlightFare());
	System.out.println("Seat Availability :"+obj.getSeatAvail());
	System.out.println("Flight Duration :"+obj.getFlightDuration());
	System.out.println("Class Type :"+obj.getClassType());
	System.out.println("**********-----***********");
}
}
