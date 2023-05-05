package Airline_Booking;

/**
 * Soyut fabrika sınıfı, bilet ve ödeme yöntemi nesnelerinin yaratılması için arayüz sağlar.
 */
public abstract class AbstractFactory {
    
    /**
     * Belirtilen türde bir bilet nesnesi yaratır.
     *
     * @param type Bilet türü
     * @return Belirtilen türde bir bilet nesnesi
     */
    public abstract Bilet createBilet(String type);
    
    /**
     * Belirtilen türde bir ödeme yöntemi nesnesi yaratır.
     *
     * @param type Ödeme yöntemi türü
     * @return Belirtilen türde bir ödeme yöntemi nesnesi
     */
    public abstract OdemeYontemi createOdemeYontemi(String type);
}