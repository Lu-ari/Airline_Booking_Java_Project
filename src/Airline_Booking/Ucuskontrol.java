package Airline_Booking;

import java.util.ArrayList;
import java.util.List;
import Airline_Booking.Sefer;
//UcusKontrol Class
public class Ucuskontrol {
	private Havalimani havalimani = Havalimani.getInstance();
	

    
  
public void kontrolUcus(Ucak ucak, Sefer sefer) {
   // Implementation of mediator design pattern for controlling flights
	
	 // Implementation of mediator design pattern for controlling flights
    String havalimaniKodu = havalimani.getirHavalimaniKodu();
    // Use the havalimaniKodu here for controlling the flight
    
    Havalimani istanbulAirport = Havalimani.getInstance();
    istanbulAirport.setHavalimaniKodu("IST");

    Havalimani newYorkAirport = Havalimani.getInstance();
    newYorkAirport.setHavalimaniKodu("JFK");
    
  
    
  
    
}
}