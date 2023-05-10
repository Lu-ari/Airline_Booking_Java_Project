package Airline_Booking;

/**
 * Kredi karti odeme yontemini temsil eden sinif.
 */
public class KrediKarti extends OdemeYontemi {

    /**
     * Kredi karti numarasini tutan degisken.
     */
    private int KrediKarti_no;

    /**
     * Kredi karti tipini tutan degisken.
     */
    private String KrediKarti_tipi;

    /**
     * Kredi karti tutarini tutan degisken.
     */
    private int KrediKarti_tutar;

    /**
     * KrediKarti sinifi icin parametreli yapici metod.
     *
     * @param no    Kredi karti numarasi.
     * @param tipi  Kredi karti tipi.
     * @param tutar Kredi karti tutari.
     */
    public KrediKarti(int no, String tipi, int tutar) {
        this.KrediKarti_no = no;
        this.KrediKarti_tipi = tipi;
        this.KrediKarti_tutar = tutar;
    }

    /**
     * Kredi karti numarasini donduren metod.
     *
     * @return Kredi karti numarasi.
     */
    public int getKrediKarti_no() {
        return KrediKarti_no;
    }

    /**
     * Kredi karti numarasini ayarlayan metod.
     *
     * @param krediKarti_no Kredi karti numarasi.
     */
    public void setKrediKarti_no(int krediKarti_no) {
        this.KrediKarti_no = krediKarti_no;
    }

    /**
     * Kredi karti tipini donduren metod.
     *
     * @return Kredi karti tipi.
     */
    public String getKrediKarti_tipi() {
        return KrediKarti_tipi;
    }

    /**
     * Kredi karti tipini ayarlayan metod.
     *
     * @param krediKarti_tipi Kredi karti tipi.
     */
    public void setKrediKarti_tipi(String krediKarti_tipi) {
        this.KrediKarti_tipi = krediKarti_tipi;
    }

    /**
     * Kredi karti tutarini donduren metod.
     *
     * @return Kredi karti tutari.
     */
    public int getKrediKarti_tutar() {
        return KrediKarti_tutar;
    }

    /**
     * Kredi karti tutarini ayarlayan metod.
     *
     * @param krediKarti_tutar Kredi karti tutari.
     */
    public void setKrediKarti_tutar(int krediKarti_tutar) {
        this.KrediKarti_tutar = krediKarti_tutar;
    }

    /**
     * Kredi karti bilgilerini alarak ekrana yazdiran metod.
     */

    public void KrediKarti_al() {
        // implementation for getting credit card details
    	
    	  KrediKarti krediKarti = new KrediKarti(KrediKarti_no, KrediKarti_tipi, KrediKarti_tutar);
          
    	System.out.println("**************************Kredi Karti Bilgileri:****************************************");
        System.out.println("Kredi Karti No: " + getKrediKarti_no());
        System.out.println("Kredi Karti Tipi: " + getKrediKarti_tipi());
        System.out.println("Kredi Karti Tutar: " + getKrediKarti_tutar());
        System.out.println("**************************Kredi Karti Bilgileri:****************************************");
        System.out.println("");
    }
}