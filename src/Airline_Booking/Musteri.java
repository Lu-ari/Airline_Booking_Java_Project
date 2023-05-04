package Airline_Booking;

import java.util.ArrayList;

import java.util.Scanner;
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
        System.out.println("");
        System.out.println("****************Müsteri Bilgileri************");
        System.out.println("Musteri Adi: " + customer.musteri_adi + " (ID: " + customer.musteri_id + ")");
        System.out.println("Musteri Kullanici Adı: " + customer.musteri_kulladi + " (Mail Adresi: " + customer.musteri_mail + ")");
        System.out.println("****************Müsteri Bilgileri************");
        System.out.println("");
    }

    public void Musteri_sil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();
        for (Musteri customer : customers) {
            if (customer.musteri_id == customerId) {
                customers.remove(customer);
                System.out.println("Customer deleted: " + customer.musteri_adi + " (ID: " + customer.musteri_id + ")");
                return;
            }
        }
        System.out.println("Customer with ID " + customerId + " not found.");
    }

    public void Musteri_bul(int musteri_id) {
        for (Musteri customer : customers) {
            if (customer.musteri_id == musteri_id) {
                System.out.println("Customer found: " + customer.musteri_adi);
                return;
            }
        }
        System.out.println("Customer not found with ID: " + musteri_id);
    }

    public void Musteri_duzenle() {
    	Scanner input = new Scanner(System.in);
        System.out.print("Enter customer ID: ");
        int customerId = input.nextInt();
        
        // Find the customer with the given ID
        Musteri customer = null;
        for (Musteri c : customers) {
            if (c.musteri_id == customerId) {
                customer = c;
                break;
            }
        }
        
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }
        
        System.out.print("Enter new customer name: ");
        String newName = input.next();
        customer.musteri_adi = newName;
        System.out.println("Customer updated: " + customer.musteri_adi + " (ID: " + customer.musteri_id + ")");
    }
    
    public static void main(String[] args) {
        // Müşteri oluştur.
    	
    	
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
        

        // Sefer oluşturuldu
    	Sefer sefer = new Sefer();
        Ucak ucak = new Ucak();
        
     
   
        sefer.olusturSefer(ucak);
        
        if (ucak == null) {System.out.println("Uçak Bulunamadı....");
        }
        else {
        	
        // Uçuş Kontrol Mediator Class ile kontrol sağlanıyor
        Ucuskontrol ucuskontrol = new Ucuskontrol();
        ucuskontrol.kontrolUcus(ucak, sefer);

        // Print flight information
        
        //Odeme ve Ödeme yötemi ve bilet'in alınmıştır
        Factory factory = new Factory();
        Odeme odeme = new Odeme(factory);
        odeme.Odeme_hesapla("kredi_karti");
        
        //Odeme yapıldı ise rezervasyonu gösterme
        if (odeme.equals(factory)==true) {
       
        Rezervasyon rezervasyon = new Rezervasyon(1, 123, "2023-05-04", 12);
        rezervasyon.Rezervasyon_olustur();
        
        }
        
        
        }
        
        
}
}

