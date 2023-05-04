package Airline_Booking;

//Havalimani Class
public class Havalimani {
private static Havalimani instance = new Havalimani();
private String havalimani_kodu;

private Havalimani() {
   // Constructor implementation
}

public static Havalimani getInstance() {
   // Implementation of singleton design pattern for getting the instance of airport object
   return instance;
}

public String getirHavalimaniKodu() {
   // Implementation of singleton design pattern for getting airport code
   return havalimani_kodu;
}
public void setHavalimaniKodu(String kod) {
    havalimani_kodu = kod;
}

public String getHavalimaniKodu() {
    return havalimani_kodu;
}
}
