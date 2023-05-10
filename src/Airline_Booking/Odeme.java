package Airline_Booking;

/**
 * Bu sinif, odemelerin olusturulmasi ve odeme islemlerinin yapilmasi icin kullanilir.
 * Odeme sinifi, bir Factory nesnesi alarak odeme islemlerinde kullanilacak odeme yontemlerini olusturmak icin kullanilir.
 */
public class Odeme {
	/**
	 * Odeme sinifinda odeme islemleri icin kullanilan odeme ID'si.
	 */
	private int Odeme_id;

	/**
	 * odeme tutari.
	 */
	private int Odeme_tutar;

	/**
	 * odeme tarihi.
	 */
	private String Odeme_tarih;

	/**
	 * Factory nesnesi, farkli odeme turleri icin odeme yapisi olusturmak icin kullanilir.
	 */
	private Factory factory;

    /**
     * Odeme sinifi kurucu fonksiyonu, Factory nesnesi alir.
     * @param factory odeme islemlerinde kullanilacak odeme yontemlerini olusturmak icin kullanilacak Factory nesnesi.
     */
    public Odeme(Factory factory) {
        this.factory = factory;
    }
    
    /**
     * Kredi karti ile odeme yapmak icin kullanilan fonksiyon.
     * @param yontem odeme yontemi olarak kullanilacak string degeri alir.
     */
    public void Odeme_kredikartihesapla(String yontem) {
        OdemeYontemi odemeYontemi = factory.createOdemeYontemi(yontem);
        // Odeme objesi ile bilet hesaplaniyor
        Ekonomi ekonomi =new Ekonomi("10kg");
        ekonomi.Bilet_olustur();
        KrediKarti krediKarti = new KrediKarti(123456789, "Visa", 500);
        krediKarti.KrediKarti_al();
    }
    
    /**
     * Nakit para ile odeme yapmak icin kullanilan fonksiyon.
     * @param yontem odeme yontemi olarak kullanilacak string degeri alir.
     */
    public void Odeme_nakithesapla(String yontem) {
        OdemeYontemi odemeYontemi = factory.createOdemeYontemi(yontem);
        // Odeme objesi ile bilet hesaplaniyor
        Business business =new Business("30 kg");
        business.Bilet_olustur();
        Nakit Nakit = new Nakit(6000, "TL");
        Nakit.Nakit_al();
    }
    
    /**
     * odeme ID'sini donduren getter fonksiyonu.
     * @return odeme islemine ait ID degeri.
     */
    public int getOdeme_id() {
        return Odeme_id;
    }

    /**
     * odeme ID'sini set eden setter fonksiyonu.
     * @param Odeme_id odeme islemine ait ID degeri.
     */
    public void setOdeme_id(int Odeme_id) {
        this.Odeme_id = Odeme_id;
    }

    /**
     *  Odeme_tutar odeme tutarini donduren getter fonksiyonu.
     * @return odeme islemine ait tutar degeri.
     */
    public int getOdeme_tutar() {
        return Odeme_tutar;
    }

    /**
    @param Odeme_tutar odeme islemine ait tutari temsil eden int degeri alir.
    */
    public void setOdeme_tutar(int Odeme_tutar) {
    this.Odeme_tutar = Odeme_tutar;
    }
    

    /**
     * odeme tarihini getiren getter fonksiyonu.
     * @return odeme islemi gerceklestirilen tarih degerini temsil eden String degerini dondurur.
     */
    public String getOdeme_tarih() {
        return Odeme_tarih;
    }

    /**
     * odeme tarihini set eden setter fonksiyonu.
     * @param Odeme_tarih odeme islemine ait tarihi temsil eden String degeri alir.
     */
    public void setOdeme_tarih(String Odeme_tarih) {
        this.Odeme_tarih = Odeme_tarih;
    }
    
    
}
