package com.nagarro.learning.FlightsHibernate;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws IOException, InterruptedException {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		Thread thread=new Thread(new Resolver());
		thread.setDaemon(true);
		thread.start();
		Thread.sleep(3000);
		InputData ip=new InputData();
		System.out.println("Enter the DEPARTURE Location.");
		ip.setDepartureLocation(sc.next().toUpperCase());
		System.out.println("Enter the ARRIVAL Location.");
		ip.setArrivalLocation(sc.next().toUpperCase());
		System.out.println("Enter the Date of Flight in dd-MM-yyyy format.");
		ip.setFlightDate(sc.next());
		System.out.println("Enter the Flight Class");
		ip.setFlightClass(sc.next().toUpperCase());
		System.out.println("Enter the output preference:");
		System.out.println("Enter 'F' to Sort by Fare and 'B' for Sort by both fare and duration.");
		ip.setOutputPreference(sc.next());
		List<FlightModel> mainList = DataBase.getFlightAccordingToUSer(ip);
		for(FlightModel obj:mainList)
		{
			OutputData.dataOutput(obj);
		}
	}
}
