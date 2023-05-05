package Airline_Booking;

/**
 * Factory sinifi, farkli odeme yontemlerini olusturmak icin kullanilir.
 */
public class Factory {
    
    /**
     * Verilen parametreye gore uygun bir odeme yontemi nesnesi olusturur ve dondurur.
     * 
     * @param type Odeme yontemi tipi. Su anda desteklenen tipler: "KrediKarti", "Nakit"
     * @return Olusturulan odeme yontemi nesnesi. Verilen tip desteklenmiyorsa null dondurur.
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
