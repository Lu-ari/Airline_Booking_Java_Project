package Airline_Booking;

public class Nakit extends OdemeYontemi {
    private int Nakit_tutar;
    private String Nakit_tipi;

    public Nakit(int tutar, String tipi) {
        this.Nakit_tutar = tutar;
        this.Nakit_tipi = tipi;
    }

    public void Nakit_al() {
        // implementation for getting cash details
    	Nakit Nakit = new Nakit(Nakit_tutar,Nakit_tipi );
      
    	
    	System.out.println("**************************Nakit Bilgileri****************************************");
        System.out.println("Ödenen Tutar: " + getNakit_tutar());
        System.out.println("Ödenen Para Cinsi: " + getNakit_tipi() );
        System.out.println("**************************Nakit Bilgileri****************************************");
        System.out.println("");
    }

    public int getNakit_tutar() {
        return Nakit_tutar;
    }

    public void setNakit_tutar(int nakit_tutar) {
        Nakit_tutar = nakit_tutar;
    }

    public String getNakit_tipi() {
        return Nakit_tipi;
    }

    public void setNakit_tipi(String nakit_tipi) {
        Nakit_tipi = nakit_tipi;
    }
}