package Airline_Booking;
/**
 * Bilet arayüzü, bir bilet nesnesinin sahip olması gereken özellikleri ve davranışları tanımlar.
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
     * Bilet numarasını getirir.
     *
     * @return Bilet numarası
     */
    int getBiletNo();
    
    /**
     * Bilet numarasını ayarlar.
     *
     * @param biletNo Yeni bilet numarası
     */
    void setBiletNo(int biletNo);
    
    /**
     * Bilet fiyatını getirir.
     *
     * @return Bilet fiyatı
     */
    int getBiletFiyat();
    
    /**
     * Bilet fiyatını ayarlar.
     *
     * @param biletFiyat Yeni bilet fiyatı
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
     * Bilet koltuk numarasını getirir.
     *
     * @return Bilet koltuk numarası
     */
    int getBiletKoltukNo();
    
    /**
     * Bilet koltuk numarasını ayarlar.
     *
     * @param biletKoltukNo Yeni bilet koltuk numarası
     */
    void setBiletKoltukNo(int biletKoltukNo);
    
    /**
     * Bileti günceller.
     */
    void Bilet_guncelle();
    
    /**
     * Yeni bir bilet oluşturur.
     */
    void Bilet_olustur();
    
    /**
     * Mevcut bir bilet nesnesini siler.
     */
    void Bilet_sil();
       
}
