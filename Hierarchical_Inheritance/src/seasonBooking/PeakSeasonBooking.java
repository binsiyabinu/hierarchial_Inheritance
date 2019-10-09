package seasonBooking;

import java.io.IOException;

import roomBooking.RoomBooking;


public class PeakSeasonBooking extends RoomBooking
{
	
	public void roomBooking(int persons, int totalDays, double tariff, String roomType,int month,int peakcharge) throws NumberFormatException, IOException{
		super.input(persons, totalDays,roomType, tariff);
		//System.out.println(persons);
		 double totalTariff = super.roomBooking(persons,totalDays, tariff, roomType);
		double  totalTariff1=totalTariff*peakcharge;
		 
		System.out.println("Total tariff:"+totalTariff1+"/-");
	}

}
