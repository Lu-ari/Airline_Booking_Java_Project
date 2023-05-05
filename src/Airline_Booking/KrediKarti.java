package Airline_Booking;

/**
 * Kredi kartı ödeme yöntemini temsil eden sınıf.
 */
public class KrediKarti extends OdemeYontemi {

    /**
     * Kredi kartı numarasını tutan değişken.
     */
    private int KrediKarti_no;

    /**
     * Kredi kartı tipini tutan değişken.
     */
    private String KrediKarti_tipi;

    /**
     * Kredi kartı tutarını tutan değişken.
     */
    private int KrediKarti_tutar;

    /**
     * KrediKarti sınıfı için parametreli yapıcı metod.
     *
     * @param no    Kredi kartı numarası.
     * @param tipi  Kredi kartı tipi.
     * @param tutar Kredi kartı tutarı.
     */
    public KrediKarti(int no, String tipi, int tutar) {
        this.KrediKarti_no = no;
        this.KrediKarti_tipi = tipi;
        this.KrediKarti_tutar = tutar;
    }

    /**
     * Kredi kartı numarasını döndüren metod.
     *
     * @return Kredi kartı numarası.
     */
    public int getKrediKarti_no() {
        return KrediKarti_no;
    }

    /**
     * Kredi kartı numarasını ayarlayan metod.
     *
     * @param krediKarti_no Kredi kartı numarası.
     */
    public void setKrediKarti_no(int krediKarti_no) {
        this.KrediKarti_no = krediKarti_no;
    }

    /**
     * Kredi kartı tipini döndüren metod.
     *
     * @return Kredi kartı tipi.
     */
    public String getKrediKarti_tipi() {
        return KrediKarti_tipi;
    }

    /**
     * Kredi kartı tipini ayarlayan metod.
     *
     * @param krediKarti_tipi Kredi kartı tipi.
     */
    public void setKrediKarti_tipi(String krediKarti_tipi) {
        this.KrediKarti_tipi = krediKarti_tipi;
    }

    /**
     * Kredi kartı tutarını döndüren metod.
     *
     * @return Kredi kartı tutarı.
     */
    public int getKrediKarti_tutar() {
        return KrediKarti_tutar;
    }

    /**
     * Kredi kartı tutarını ayarlayan metod.
     *
     * @param krediKarti_tutar Kredi kartı tutarı.
     */
    public void setKrediKarti_tutar(int krediKarti_tutar) {
        this.KrediKarti_tutar = krediKarti_tutar;
    }

    /**
     * Kredi kartı bilgilerini alarak ekrana yazdıran metod.
     */

    public void KrediKarti_al() {
        // implementation for getting credit card details
    	
    	  KrediKarti krediKarti = new KrediKarti(KrediKarti_no, KrediKarti_tipi, KrediKarti_tutar);
          
    	System.out.println("**************************Kredi Kartı Bilgileri:****************************************");
        System.out.println("Kredi Kartı No: " + getKrediKarti_no());
        System.out.println("Kredi Kartı Tipi: " + getKrediKarti_tipi());
        System.out.println("Kredi Kartı Tutar: " + getKrediKarti_tutar());
        System.out.println("**************************Kredi Kartı Bilgileri:****************************************");
        System.out.println("");
    }
}