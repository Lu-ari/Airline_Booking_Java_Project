package Airline_Booking;

public class Odeme {
    private int Odeme_id;
    private int Odeme_tutar;
    private String Odeme_tarih;
    private Factory factory;

    public Odeme(Factory factory) {
        this.factory = factory;
    }
    
    public void Odeme_kredikartihesapla(String yontem) {
        OdemeYontemi odemeYontemi = factory.createOdemeYontemi(yontem);
        // Odeme objesi ile bilet hesaplanıyor
       
        Ekonomi ekonomi =new Ekonomi("10kg");
        ekonomi.Bilet_olustur();
       
        
        KrediKarti krediKarti = new KrediKarti(123456789, "Visa", 500);
        krediKarti.KrediKarti_al();
        
      
        
        
       
    }
    
    public void Odeme_nakithesapla(String yontem) {
        OdemeYontemi odemeYontemi = factory.createOdemeYontemi(yontem);
        // Odeme objesi ile bilet hesaplanıyor
       
        Business business =new Business("30 kg");
        business.Bilet_olustur();
        
      
        Nakit Nakit = new Nakit(600, "TL");
        Nakit.Nakit_al();
        
       
    }
    public int getOdeme_id() {
        return Odeme_id;
    }

    public void setOdeme_id(int Odeme_id) {
        this.Odeme_id = Odeme_id;
    }

    public int getOdeme_tutar() {
        return Odeme_tutar;
    }

    public void setOdeme_tutar(int Odeme_tutar) {
        this.Odeme_tutar = Odeme_tutar;
    }

    public String getOdeme_tarih() {
        return Odeme_tarih;
    }

    public void setOdeme_tarih(String Odeme_tarih) {
        this.Odeme_tarih = Odeme_tarih;
    }
    
    
}
