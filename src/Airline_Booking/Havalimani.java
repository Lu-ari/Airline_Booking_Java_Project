package Airline_Booking;

/**
 * `Havalimani` sınıfı, havayolu işletmeleri tarafından kullanılan havalimanlarının temsili için kullanılır.
 */
public class Havalimani {
    
    /**
     * Tek örneklik tasarım deseni uygulamak için kullanılan sınıf örneği.
     */
    private static Havalimani instance = new Havalimani();
    
    /**
     * Havalimanının kodunu tutar.
     */
    private String havalimani_kodu;

    /**
     * `Havalimani` sınıfının yapıcı metodu.
     * Bu metod, yalnızca bu sınıf içerisinde çağrılabilir.
     */
    private Havalimani() {
       // Yapıcı metodun uygulaması
    }

    /**
     * Tek örneklik tasarım deseni uygulamak için kullanılan sınıf örneğini döndürür.
     * @return `Havalimani` sınıfının örneği
     */
    public static Havalimani getInstance() {
       // Singleton tasarım deseni için örnek alma metodunun uygulaması
       return instance;
    }

    /**
     * Havalimanı kodunu döndürür.
     * @return Havalimanı kodu
     */
    public String getirHavalimaniKodu() {
       // Singleton tasarım deseni için havalimanı kodunu alma metodunun uygulaması
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
     * Havalimanı kodunu döndürür.
     * @return Havalimanı kodu
     */
    public String getHavalimaniKodu() {
        return havalimani_kodu;
    }
} 