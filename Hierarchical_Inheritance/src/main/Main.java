package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import roomBooking.RoomBooking;

import seasonBooking.LeanSeasonBooking;
import seasonBooking.PeakSeasonBooking;



public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		RoomBooking r1=new RoomBooking();
		  int persons;
		  int totalDays;
		 double tariff;
		 String roomType;
		 int month = 0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Booking:");
		System.out.println("\nEnter the number of persons");
	 persons=Integer.parseInt(br.readLine());
		System.out.println("\nEnter number of days");
	 totalDays=Integer.parseInt(br.readLine());
		System.out.println("\nEnter the roomtype");
		 roomType=br.readLine();
		 System.out.println("Enter month");
		 month=Integer.parseInt(br.readLine());
		 if(month==4 ||month==5 || month==6 || month==9 || month==11 || month==12)
				 {
			 System.out.println("Enter charge:");
				int charge=Integer.parseInt(br.readLine());
				System.out.println("\nEnter the tariff for single person");
				 tariff=Integer.parseInt(br.readLine());
				PeakSeasonBooking room=new PeakSeasonBooking();
				room.roomBooking( persons, totalDays, tariff, roomType,month,charge);
			 
				 }
		 else
		 {
			 System.out.println("Enter discount:");
				int charge=Integer.parseInt(br.readLine());
				System.out.println("\nEnter the tariff for single person");
				 tariff=Integer.parseInt(br.readLine());
				 LeanSeasonBooking l1=new LeanSeasonBooking();
				l1.roomBooking( persons, totalDays, tariff, roomType,charge);
		 }
		
		
		//r1.input(persons,totalDays,roomType,tariff);
		
		
	}

}
