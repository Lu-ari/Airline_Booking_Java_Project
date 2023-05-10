package Airline_Booking;

/**
 * `Havalimani` sinifi, havayolu isletmeleri tarafindan kullanilan havalimanlarinin temsili icin kullanilir.
 */
public class Havalimani {
    
    /**
     * Tek orneklik tasarim deseni uygulamak icin kullanilan sinif ornegi.
     */
    private static Havalimani instance = new Havalimani();
    
    /**
     * Havalimaninin kodunu tutar.
     */
    private String havalimani_kodu;

    /**
     * `Havalimani` sinifinin yapici metodu.
     * Bu metod, yalnizca bu sinif icerisinde cagrilabilir.
     */
    private Havalimani() {
       // Yapici metodun uygulamasi
    }

    /**
     * Tek orneklik tasarim deseni uygulamak icin kullanilan sinif ornegini dondurur.
     * @return `Havalimani` sinifinin ornegi
     */
    public static Havalimani getInstance() {
       // Singleton tasarim deseni icin ornek alma metodunun uygulamasi
       return instance;
    }

    /**
     * Havalimani kodunu dondurur.
     * @return Havalimani kodu
     */
    public String getirHavalimaniKodu() {
       // Singleton tasarim deseni icin havalimani kodunu alma metodunun uygulamasi
       return havalimani_kodu;
    }
    
    /**
     * Havalimani kodunu ayarlar.
     * @param kod Havalimani kodu
     */
    public void setHavalimaniKodu(String kod) {
        havalimani_kodu = kod;
    }

    /**
     * Havalimani kodunu dondurur.
     * @return Havalimani kodu
     */
    public String getHavalimaniKodu() {
        return havalimani_kodu;
    }
} 