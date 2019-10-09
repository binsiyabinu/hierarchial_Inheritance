package roomBooking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import customer.Customer;

public class RoomBooking {
	Customer customers=new Customer();
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 protected int persons;
	 protected int totalDays;
	 protected double tariff;
	 protected String roomType;
	public void input(int persons, int totalDays, String roomType, double tariff) throws NumberFormatException, IOException
	{
		customers.setPersons(persons);
		customers.setTotalDays(totalDays);
		customers.setRoomType(roomType);
		customers.setTariff(tariff);
		//this.roomBooking(persons,totalDays,tariff,roomType);
	}
	public double roomBooking(int persons, int totalDays, double tariff, String roomType)
	{
		double totalTariff=customers.getPersons()*customers.getTotalDays()*customers.getTariff();
		//System.out.println(totalTariff);
		return totalTariff;
		
		
	}
}
