package Airline_Booking;

public interface Bilet {
    int getBiletId();
    void setBiletId(int biletId);
    
    int getBiletNo();
    void setBiletNo(int biletNo);
    
    int getBiletFiyat();
    void setBiletFiyat(int biletFiyat);
    
    String getBiletTarih();
    void setBiletTarih(String biletTarih);
    
    int getBiletKoltukNo();
    void setBiletKoltukNo(int biletKoltukNo);
    
    void Bilet_guncelle();
    void Bilet_olustur();
    void Bilet_sil();
    
    
}