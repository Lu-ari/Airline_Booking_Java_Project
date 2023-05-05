package Airline_Booking;

/**
 * Nakit ödeme yontemini temsil eden sınıf.
 */
public class Nakit extends OdemeYontemi {
    
    /** Nakit ödemenin tutarı */
    private int Nakit_tutar;
    
    /** Nakit ödemenin para birimi tipi */
    private String Nakit_tipi;

    /**
     * Nakit ödeme nesnesi oluşturma constructor'ı.
     * @param tutar ödeme tutarı
     * @param tipi para birimi tipi
     */
    public Nakit(int tutar, String tipi) {
        this.Nakit_tutar = tutar;
        this.Nakit_tipi = tipi;
    }

    /**
     * Nakit ödeme detaylarını alır ve ekrana basar.
     */
    public void Nakit_al() {
        // implementation for getting cash details
    	Nakit Nakit = new Nakit(Nakit_tutar, Nakit_tipi);
      
    	System.out.println("**************************Nakit Bilgileri****************************************");
        System.out.println("Ödenen Tutar: " + getNakit_tutar());
        System.out.println("Ödenen Para Cinsi: " + getNakit_tipi());
        System.out.println("**************************Nakit Bilgileri****************************************");
        System.out.println("");
    }

    /**
     * Nakit ödemenin tutarını döndürür.
     * @return ödeme tutarı
     */
    public int getNakit_tutar() {
        return Nakit_tutar;
    }

    /**
     * Nakit ödemenin tutarını ayarlar.
     * @param nakit_tutar ödeme tutarı
     */
    public void setNakit_tutar(int nakit_tutar) {
        Nakit_tutar = nakit_tutar;
    }

    /**
     * Nakit ödemenin para birimi tipini döndürür.
     * @return para birimi tipi
     */
    public String getNakit_tipi() {
        return Nakit_tipi;
    }

    /**
     * Nakit ödemenin para birimi tipini ayarlar.
     * @param nakit_tipi para birimi tipi
     */
    public void setNakit_tipi(String nakit_tipi) {
        Nakit_tipi = nakit_tipi;
    }
}
