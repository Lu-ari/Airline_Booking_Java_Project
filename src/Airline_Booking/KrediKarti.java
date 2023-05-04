package Airline_Booking;

public class KrediKarti extends OdemeYontemi {
    private int KrediKarti_no;
    private String KrediKarti_tipi;
    private int KrediKarti_tutar;

    public KrediKarti(int no, String tipi, int tutar) {
        this.KrediKarti_no = no;
        this.KrediKarti_tipi = tipi;
        this.KrediKarti_tutar = tutar;
    }

    public int getKrediKarti_no() {
        return KrediKarti_no;
    }

    public void setKrediKarti_no(int krediKarti_no) {
        this.KrediKarti_no = krediKarti_no;
    }

    public String getKrediKarti_tipi() {
        return KrediKarti_tipi;
    }

    public void setKrediKarti_tipi(String krediKarti_tipi) {
        this.KrediKarti_tipi = krediKarti_tipi;
    }

    public int getKrediKarti_tutar() {
        return KrediKarti_tutar;
    }

    public void setKrediKarti_tutar(int krediKarti_tutar) {
        this.KrediKarti_tutar = krediKarti_tutar;
    }

    public void KrediKarti_al() {
        // implementation for getting credit card details
    }
}