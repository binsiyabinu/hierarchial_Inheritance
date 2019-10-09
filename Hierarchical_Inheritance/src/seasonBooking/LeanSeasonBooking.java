package seasonBooking;

import java.io.IOException;

import roomBooking.RoomBooking;

public class LeanSeasonBooking extends RoomBooking
{
	
public void roomBooking(int persons, int totalDays, double tariff, String roomType,int discount) throws NumberFormatException, IOException{
			super.input(persons, totalDays,roomType, tariff);
			
			
			
			 double totalTariff = super.roomBooking(persons,totalDays, tariff, roomType);
			double  totalTariff1=(totalTariff*discount)/100;
			 double actualrate=totalTariff-totalTariff1;
			System.out.println("Total tariff:"+actualrate+"/-");
	}
}
