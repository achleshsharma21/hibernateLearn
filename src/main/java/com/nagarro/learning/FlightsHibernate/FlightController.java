package com.nagarro.learning.FlightsHibernate;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class FlightController {
	public static DataBase dbObject=DataBase.getInstance();
public static void addData(String path) throws IOException
{		
		FlightModel detailsObject;
		BufferedReader br = Files.newBufferedReader(Paths.get(path));
		Iterable<CSVRecord> records = CSVFormat.EXCEL.withDelimiter('|').withFirstRecordAsHeader().parse(br);
		for (CSVRecord record : records) {
			detailsObject = new FlightModel();
			detailsObject.setFlightNum(record.get("FLIGHT_NO"));
			detailsObject.setDepLocation(record.get("DEP_LOC"));
			detailsObject.setArrLocation(record.get("ARR_LOC"));
			detailsObject.setFlightDuration(record.get("FLIGHT_DUR"));
			detailsObject.setFlightTime(record.get("FLIGHT_TIME"));
			detailsObject.setFlightFare(record.get("FARE"));
			detailsObject.setSeatAvail(record.get("SEAT_AVAILABILITY"));
			detailsObject.setValidDate(record.get("VALID_TILL"));
			detailsObject.setClassType(record.get("CLASS"));
			DataBase.insertIntoDB(detailsObject);

		}
}

}
