package Airline_Booking;

public class Odeme {
    private int Odeme_id;
    private int Odeme_tutar;
    private String Odeme_tarih;
    private Factory factory;

    public Odeme(Factory factory) {
        this.factory = factory;
    }
    
    public void Odeme_hesapla(String yontem) {
        OdemeYontemi odemeYontemi = factory.createOdemeYontemi(yontem);
        // Perform calculations with OdemeYontemi object
        Ekonomi ekonomiBilet = new Ekonomi("10kg");
        ekonomiBilet.setBiletId(1);
        ekonomiBilet.setBiletNo(1234);
        ekonomiBilet.setBiletFiyat(500);
        ekonomiBilet.setBiletTarih("2023-05-10");
        ekonomiBilet.setBiletKoltukNo(15);
        
        System.out.println("Ekonomi Bilet:");
        System.out.println("Bilet ID: " + ekonomiBilet.getBiletId());
        System.out.println("Bilet No: " + ekonomiBilet.getBiletNo());
        System.out.println("Bilet Fiyat: " + ekonomiBilet.getBiletFiyat());
        System.out.println("Bilet Tarih: " + ekonomiBilet.getBiletTarih());
        System.out.println("Bilet Koltuk No: " + ekonomiBilet.getBiletKoltukNo());
        
        KrediKarti krediKarti = new KrediKarti(123456789, "Visa", 500);
        krediKarti.KrediKarti_al();
        
        System.out.println("Kredi Kartı:");
        System.out.println("Kredi Kartı No: " + krediKarti.getKrediKarti_no());
        System.out.println("Kredi Kartı Tipi: " + krediKarti.getKrediKarti_tipi());
        System.out.println("Kredi Kartı Tutar: " + krediKarti.getKrediKarti_tutar());
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
