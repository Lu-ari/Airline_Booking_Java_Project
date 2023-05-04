package Airline_Booking;

public class Rezervasyon {
    private int rezervasyon_id;
    private int rezervasyon_no;
    private String rezervasyon_tarih;
    private int rezervasyon_koltukno;

    public Rezervasyon(int rezervasyon_id, int rezervasyon_no, String rezervasyon_tarih, int rezervasyon_koltukno) {
        this.rezervasyon_id = rezervasyon_id;
        this.rezervasyon_no = rezervasyon_no;
        this.rezervasyon_tarih = rezervasyon_tarih;
        this.rezervasyon_koltukno = rezervasyon_koltukno;
    }

    public void Rezervasyon_guncelle() {
        // update reservation in database
    }

    public void Rezervasyon_olustur() {
        // create new reservation 
    	
    	 
    	
         
         Rezervasyon r1 = new Rezervasyon(rezervasyon_id,rezervasyon_no,rezervasyon_tarih,rezervasyon_koltukno);
         System.out.println("Rezervasyon ID: " + r1.getRezervasyon_id());
         System.out.println("Rezervasyon No: " + r1.getRezervasyon_no());
         System.out.println("Rezervasyon Tarih: " + r1.getRezervasyon_tarih());
         System.out.println("Rezervasyon Koltuk No: " + r1.getRezervasyon_koltukno());
    }

    public void Rezervasyon_bul() {
        // find reservation in database
    }

    public void Rezervasyon_sil() {
        // delete reservation from database
    }

    // getters and setters
    public int getRezervasyon_id() {
        return rezervasyon_id;
    }

    public void setRezervasyon_id(int rezervasyon_id) {
        this.rezervasyon_id = rezervasyon_id;
    }

    public int getRezervasyon_no() {
        return rezervasyon_no;
    }

    public void setRezervasyon_no(int rezervasyon_no) {
        this.rezervasyon_no = rezervasyon_no;
    }

    public String getRezervasyon_tarih() {
        return rezervasyon_tarih;
    }

    public void setRezervasyon_tarih(String rezervasyon_tarih) {
        this.rezervasyon_tarih = rezervasyon_tarih;
    }

    public int getRezervasyon_koltukno() {
        return rezervasyon_koltukno;
    }

    public void setRezervasyon_koltukno(int rezervasyon_koltukno) {
        this.rezervasyon_koltukno = rezervasyon_koltukno;
    }
}
