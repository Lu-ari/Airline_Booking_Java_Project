package Airline_Booking;

/**
 * Soyut fabrika sinifi, bilet ve odeme yontemi nesnelerinin yaratilmas icin arayuz saglar.
 */
public abstract class AbstractFactory {
    
    /**
     * Belirtilen turde bir bilet nesnesi yaratir.
     *
     * @param type Bilet turu
     * @return Belirtilen turde bir bilet nesnesi
     */
    public abstract Bilet createBilet(String type);
    
    /**
     * Belirtilen turde bir odeme yontemi nesnesi yaratir.
     *
     * @param type Odeme yontemi turu
     * @return Belirtilen turde bir odeme yontemi nesnesi
     */
    public abstract OdemeYontemi createOdemeYontemi(String type);
}