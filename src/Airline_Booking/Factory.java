package Airline_Booking;

public class Factory {
    public OdemeYontemi createOdemeYontemi(String type) {
        if (type.equals("KrediKarti")) {
            return new KrediKarti(0, "", 0);
        } else if (type.equals("Nakit")) {
            return new Nakit(0, "");
        } else {
            return null;
        }
    }
}