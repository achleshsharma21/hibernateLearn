package com.nagarro.learning.FlightsHibernate;

import java.io.File;
import java.io.IOException;

public class Resolver implements Runnable{

	public void fileReader() throws IOException
	{
		File file = new File("./files");
		String arr[] = file.list();
		for(int i=0;i<arr.length;i++)
		{
			FlightController.addData(arr[i]);
		}
	}
	
	@Override
public void run() {
	// TODO Auto-generated method stub
	try {
		fileReader();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
