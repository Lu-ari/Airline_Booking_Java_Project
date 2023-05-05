package Airline_Booking;
/**
 * Bilet arayuzu, bir bilet nesnesinin sahip olmasi gereken ozellikleri ve davranısları tanimlar.
 */
public interface Bilet {
    
    /**
     * Bilet ID'sini getirir.
     *
     * @return Bilet ID'si
     */
    int getBiletId();
    
    /**
     * Bilet ID'sini ayarlar.
     *
     * @param biletId Yeni Bilet ID'si
     */
    void setBiletId(int biletId);
    
    /**
     * Bilet numarasini getirir.
     *
     * @return Bilet numarasi
     */
    int getBiletNo();
    
    /**
     * Bilet numarasini ayarlar.
     *
     * @param biletNo Yeni bilet numarasi
     */
    void setBiletNo(int biletNo);
    
    /**
     * Bilet fiyatını getirir.
     *
     * @return Bilet fiyati
     */
    int getBiletFiyat();
    
    /**
     * Bilet fiyatini ayarlar.
     *
     * @param biletFiyat Yeni bilet fiyati
     */
    void setBiletFiyat(int biletFiyat);
    
    /**
     * Bilet tarihini getirir.
     *
     * @return Bilet tarihi
     */
    String getBiletTarih();
    
    /**
     * Bilet tarihini ayarlar.
     *
     * @param biletTarih Yeni bilet tarihi
     */
    void setBiletTarih(String biletTarih);
    
    /**
     * Bilet koltuk numarasini getirir.
     *
     * @return Bilet koltuk numarasi
     */
    int getBiletKoltukNo();
    
    /**
     * Bilet koltuk numarasini ayarlar.
     *
     * @param biletKoltukNo Yeni bilet koltuk numarasi
     */
    void setBiletKoltukNo(int biletKoltukNo);
    
    /**
     * Bileti gunceller.
     */
    void Bilet_guncelle();
    
    /**
     * Yeni bir bilet olusturur.
     */
    void Bilet_olustur();
    
    /**
     * Mevcut bir bilet nesnesini siler.
     */
    void Bilet_sil();
       
}
