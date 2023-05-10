package Airline_Booking;

/**
 * Nakit odeme yontemini temsil eden sinif.
 */
public class Nakit extends OdemeYontemi {
    
    /** Nakit odemenin tutari */
    private int Nakit_tutar;
    
    /** Nakit odemenin para birimi tipi */
    private String Nakit_tipi;

    /**
     * Nakit odeme nesnesi olusturma constructor'i.
     * @param tutar odeme tutari
     * @param tipi para birimi tipi
     */
    public Nakit(int tutar, String tipi) {
        this.Nakit_tutar = tutar;
        this.Nakit_tipi = tipi;
    }

    /**
     * Nakit odeme detaylarini alir ve ekrana basar.
     */
    public void Nakit_al() {
        // implementation for getting cash details
    	Nakit Nakit = new Nakit(Nakit_tutar, Nakit_tipi);
      
    	System.out.println("**************************Nakit Bilgileri****************************************");
        System.out.println("odenen Tutar: " + getNakit_tutar());
        System.out.println("odenen Para Cinsi: " + getNakit_tipi());
        System.out.println("**************************Nakit Bilgileri****************************************");
        System.out.println("");
    }

    /**
     * Nakit odemenin tutarini dondurur.
     * @return odeme tutari
     */
    public int getNakit_tutar() {
        return Nakit_tutar;
    }

    /**
     * Nakit odemenin tutarini ayarlar.
     * @param nakit_tutar odeme tutari
     */
    public void setNakit_tutar(int nakit_tutar) {
        Nakit_tutar = nakit_tutar;
    }

    /**
     * Nakit odemenin para birimi tipini dondurur.
     * @return para birimi tipi
     */
    public String getNakit_tipi() {
        return Nakit_tipi;
    }

    /**
     * Nakit odemenin para birimi tipini ayarlar.
     * @param nakit_tipi para birimi tipi
     */
    public void setNakit_tipi(String nakit_tipi) {
        Nakit_tipi = nakit_tipi;
    }
}
