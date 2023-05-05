package Airline_Booking;

/**
 * Factory sınıfı, farklı ödeme yöntemlerini oluşturmak için kullanılır.
 */
public class Factory {
    
    /**
     * Verilen parametreye göre uygun bir ödeme yöntemi nesnesi oluşturur ve döndürür.
     * 
     * @param type Ödeme yöntemi tipi. Şu anda desteklenen tipler: "KrediKarti", "Nakit"
     * @return Oluşturulan ödeme yöntemi nesnesi. Verilen tip desteklenmiyorsa null döndürür.
     */
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
