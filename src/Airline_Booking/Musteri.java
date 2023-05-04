package Airline_Booking;

import java.util.ArrayList;


public class Musteri {
    private int musteri_id;
    private String musteri_adi;
    private String musteri_kulladi;
    private String musteri_sifre;
    private String musteri_mail;
    private String musteri_adres;
    private int musteri_tel;
    private String musteri_yemektercihi;
    private int musteri_vipkod;

    // Create an ArrayList to store the customers
    public static ArrayList<Musteri> customers = new ArrayList<>();

   
    private Musteri(Builder builder) {
        this.musteri_id = builder.musteri_id;
        this.musteri_adi = builder.musteri_adi;
        this.musteri_kulladi = builder.musteri_kulladi;
        this.musteri_sifre = builder.musteri_sifre;
        this.musteri_mail = builder.musteri_mail;
        this.musteri_adres = builder.musteri_adres;
        this.musteri_tel = builder.musteri_tel;
        this.musteri_yemektercihi = builder.musteri_yemektercihi;
        this.musteri_vipkod = builder.musteri_vipkod;
    }

    public static class Builder {
        private int musteri_id;
        private String musteri_adi;
        private String musteri_kulladi;
        private String musteri_sifre;
        private String musteri_mail;
        private String musteri_adres;
        private int musteri_tel;
        private String musteri_yemektercihi;
        private int musteri_vipkod;

        public Builder musteri_id(int musteri_id) {
            this.musteri_id = musteri_id;
            return this;
        }

        public Builder musteri_adi(String musteri_adi) {
            this.musteri_adi = musteri_adi;
            return this;
        }

        public Builder musteri_kulladi(String musteri_kulladi) {
            this.musteri_kulladi = musteri_kulladi;
            return this;
        }

        public Builder musteri_sifre(String musteri_sifre) {
            this.musteri_sifre = musteri_sifre;
            return this;
        }

        public Builder musteri_mail(String musteri_mail) {
            this.musteri_mail = musteri_mail;
            return this;
        }

        public Builder musteri_adres(String musteri_adres) {
            this.musteri_adres = musteri_adres;
            return this;
        }

        public Builder musteri_tel(int musteri_tel) {
            this.musteri_tel = musteri_tel;
            return this;
        }

        public Builder musteri_yemektercihi(String musteri_yemektercihi) {
            this.musteri_yemektercihi = musteri_yemektercihi;
            return this;
        }

        public Builder musteri_vipkod(int musteri_vipkod) {
            this.musteri_vipkod = musteri_vipkod;
            return this;
        }

        public Musteri build() {
            return new Musteri(this);
        }
    }

    // Add a new customer to the ArrayList
    public static void Musteri_ekle(Musteri customer) {
        customers.add(customer);
        System.out.println("Customer added: " + customer.musteri_adi + " (ID: " + customer.musteri_id + ")");
    }

    public void Musteri_sil() {
        // delete customer 
    	}

    public void Musteri_bul() {
        // find customer 
    }

    public void Musteri_duzenle() {
        // update customer
    }
    
    public static void main(String[] args) {
        // Create a new customer
        Musteri customer = new Musteri.Builder()
                .musteri_id(1)
                .musteri_adi("John Doe")
                .musteri_kulladi("johndoe")
                .musteri_sifre("password")
                .musteri_mail("johndoe@example.com")
                .musteri_adres("123 Main St")
                .musteri_tel(5551234)
                .musteri_yemektercihi("Vegetarian")
                .musteri_vipkod(123)
                .build();
        customer.Musteri_ekle(customer);
        
        

        // Create a new ticket
        Bilet ticket = new Business("VIP");
        ticket.setBiletId(1);
        ticket.setBiletNo(12345);
        ticket.setBiletFiyat(1000);
        ticket.setBiletTarih("2022-01-01");
        ticket.setBiletKoltukNo(1);

       
        
    	Sefer sefer = new Sefer();
        Ucak ucak = new Ucak();
        
     
     // Sefer oluşturuldu
        sefer.olusturSefer(ucak);
        
        if (ucak == null) {System.out.println("No airplane information available.");
        }
        else {
        // Create Ucuskontrol object and call kontrolUcus method, passing in Sefer and Ucak objects
        Ucuskontrol ucuskontrol = new Ucuskontrol();
        ucuskontrol.kontrolUcus(ucak, sefer);

        // Print flight information
        
        Rezervasyon rezervasyon = new Rezervasyon(1, 123, "2023-05-04", 12);
        rezervasyon.Rezervasyon_olustur();
        
        //Odeme ve Ödeme yötemi
        Factory factory = new Factory();
        Odeme odeme = new Odeme(factory);
        odeme.Odeme_hesapla("kredi_karti");
        
        
        }
        
        
}
}

