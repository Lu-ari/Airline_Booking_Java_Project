package Airline_Booking;

/**
 * `Havalimani` sınıfı, havayolu isletmeleri tarafından kullanılan havalimanlarının temsili icin kullanılır.
 */
public class Havalimani {
    
    /**
     * Tek orneklik tasarım deseni uygulamak icin kullanılan sınıf ornegi.
     */
    private static Havalimani instance = new Havalimani();
    
    /**
     * Havalimanının kodunu tutar.
     */
    private String havalimani_kodu;

    /**
     * `Havalimani` sınıfının yapıcı metodu.
     * Bu metod, yalnızca bu sınıf icerisinde cagrılabilir.
     */
    private Havalimani() {
       // Yapıcı metodun uygulaması
    }

    /**
     * Tek orneklik tasarım deseni uygulamak icin kullanılan sınıf ornegini dondurur.
     * @return `Havalimani` sınıfının ornegi
     */
    public static Havalimani getInstance() {
       // Singleton tasarım deseni icin ornek alma metodunun uygulaması
       return instance;
    }

    /**
     * Havalimanı kodunu dondurur.
     * @return Havalimanı kodu
     */
    public String getirHavalimaniKodu() {
       // Singleton tasarım deseni icin havalimanı kodunu alma metodunun uygulaması
       return havalimani_kodu;
    }
    
    /**
     * Havalimanı kodunu ayarlar.
     * @param kod Havalimanı kodu
     */
    public void setHavalimaniKodu(String kod) {
        havalimani_kodu = kod;
    }

    /**
     * Havalimanı kodunu dondurur.
     * @return Havalimanı kodu
     */
    public String getHavalimaniKodu() {
        return havalimani_kodu;
    }
} 