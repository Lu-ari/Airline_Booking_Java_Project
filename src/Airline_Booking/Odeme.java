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
