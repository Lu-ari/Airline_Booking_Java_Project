package Airline_Booking;

/**
 * Bu sınıf, ödemelerin oluşturulması ve ödeme işlemlerinin yapılması için kullanılır.
 * Odeme sınıfı, bir Factory nesnesi alarak ödeme işlemlerinde kullanılacak ödeme yöntemlerini oluşturmak için kullanılır.
 */
public class Odeme {
	/**
	 * Odeme sınıfında ödeme işlemleri için kullanılan ödeme ID'si.
	 */
	private int Odeme_id;

	/**
	 * Ödeme tutarı.
	 */
	private int Odeme_tutar;

	/**
	 * Ödeme tarihi.
	 */
	private String Odeme_tarih;

	/**
	 * Factory nesnesi, farklı ödeme türleri için ödeme yapısı oluşturmak için kullanılır.
	 */
	private Factory factory;

    /**
     * Odeme sınıfı kurucu fonksiyonu, Factory nesnesi alır.
     * @param factory ödeme işlemlerinde kullanılacak ödeme yöntemlerini oluşturmak için kullanılacak Factory nesnesi.
     */
    public Odeme(Factory factory) {
        this.factory = factory;
    }
    
    /**
     * Kredi kartı ile ödeme yapmak için kullanılan fonksiyon.
     * @param yontem ödeme yöntemi olarak kullanılacak string değeri alır.
     */
    public void Odeme_kredikartihesapla(String yontem) {
        OdemeYontemi odemeYontemi = factory.createOdemeYontemi(yontem);
        // Odeme objesi ile bilet hesaplanıyor
        Ekonomi ekonomi =new Ekonomi("10kg");
        ekonomi.Bilet_olustur();
        KrediKarti krediKarti = new KrediKarti(123456789, "Visa", 500);
        krediKarti.KrediKarti_al();
    }
    
    /**
     * Nakit para ile ödeme yapmak için kullanılan fonksiyon.
     * @param yontem ödeme yöntemi olarak kullanılacak string değeri alır.
     */
    public void Odeme_nakithesapla(String yontem) {
        OdemeYontemi odemeYontemi = factory.createOdemeYontemi(yontem);
        // Odeme objesi ile bilet hesaplanıyor
        Business business =new Business("30 kg");
        business.Bilet_olustur();
        Nakit Nakit = new Nakit(600, "TL");
        Nakit.Nakit_al();
    }
    
    /**
     * Ödeme ID'sini döndüren getter fonksiyonu.
     * @return ödeme işlemine ait ID değeri.
     */
    public int getOdeme_id() {
        return Odeme_id;
    }

    /**
     * Ödeme ID'sini set eden setter fonksiyonu.
     * @param Odeme_id ödeme işlemine ait ID değeri.
     */
    public void setOdeme_id(int Odeme_id) {
        this.Odeme_id = Odeme_id;
    }

    /**
     *  Odeme_tutar Ödeme tutarını döndüren getter fonksiyonu.
     * @return ödeme işlemine ait tutar değeri.
     */
    public int getOdeme_tutar() {
        return Odeme_tutar;
    }

    /**
    @param Odeme_tutar ödeme işlemine ait tutarı temsil eden int değeri alır.
    */
    public void setOdeme_tutar(int Odeme_tutar) {
    this.Odeme_tutar = Odeme_tutar;
    }
    

    /**
     * Ödeme tarihini getiren getter fonksiyonu.
     * @return ödeme işlemi gerçekleştirilen tarih değerini temsil eden String değerini döndürür.
     */
    public String getOdeme_tarih() {
        return Odeme_tarih;
    }

    /**
     * Ödeme tarihini set eden setter fonksiyonu.
     * @param Odeme_tarih ödeme işlemine ait tarihi temsil eden String değeri alır.
     */
    public void setOdeme_tarih(String Odeme_tarih) {
        this.Odeme_tarih = Odeme_tarih;
    }
    
    
}
