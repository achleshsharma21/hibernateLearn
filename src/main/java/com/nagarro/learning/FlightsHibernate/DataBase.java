package com.nagarro.learning.FlightsHibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataBase {
	private static DataBase singleInstance;
	static Configuration configuration = new Configuration().addAnnotatedClass(FlightModel.class).configure();
	static SessionFactory sf = configuration.buildSessionFactory();
	static Session session = sf.openSession();
	public static DataBase getInstance()
	{
		if(singleInstance==null)
		{
			singleInstance=new DataBase();
		}
		return singleInstance;
	}
	public static void insertIntoDB(FlightModel obj)
	{
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
	}
	public static List<FlightModel> getFlightAccordingToUSer(InputData fsi) {
		 session.getTransaction().begin();
		
		 String orderby = fsi.getOutputPreference().equalsIgnoreCase("F") ? "FLIGHT_FARE" : "FLIGHT_FARE, FLIGHT_DUR";
		
		 Query query = session.createQuery("select fd from FlightModel fd where SEAT_AVAIL = 'Y' and "
		 + "FLIGHT_CLASS like '%" + fsi.getFlightClass() + "%' and " + "DEP_LOC = :depLoc and "
		 + "ARR_LOC = :arrLoc and "
		 + "STR_TO_DATE(VALID_TILL,'%d-%m-%Y')>= STR_TO_DATE( :date ,'%d-%m-%Y') " + "order by " + orderby);
		 query.setParameter("depLoc", fsi.getDepartureLocation());
		 query.setParameter("arrLoc", fsi.getArrivalLocation());
		 query.setParameter("date", fsi.getFlightDate());
		@SuppressWarnings("unchecked")
		List<FlightModel> result = query.list();
		 session.getTransaction().commit();
		return result;
		}
}
