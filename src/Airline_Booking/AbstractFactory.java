package Airline_Booking;

public abstract class AbstractFactory {
    public abstract Bilet createBilet(String type);
    public abstract OdemeYontemi createOdemeYontemi(String type);
}