package Airline_Booking;

import java.util.ArrayList;

/*
 * @author Mehmet Akif ozdemir
 * 
 * */
import java.util.Scanner;

/**
 * Musteri sinifi, musteri bilgilerini tutmak icin kullanilir.*/
public class Musteri {
	
	
	   /**
     * Musterinin ID'si.
     */
    private int musteri_id;

    /**
     * Musterinin adı.
     */
    private String musteri_adi;

    /**
     * Musterinin kullanıcı adı.
     */
    private String musteri_kulladi;

    /**
     * Musterinin sifresi.
     */
    private String musteri_sifre;

    /**
     * Musterinin e-posta adresi.
     */
    private String musteri_mail;

    /**
     * Musterinin adresi.
     */
    private String musteri_adres;

    /**
     * Musterinin telefon numarası.
     */
    private int musteri_tel;

    /**
     * Musterinin yemek tercihi.
     */
    private String musteri_yemektercihi;

    /**
     * Musterinin VIP kodu.
     */
    private int musteri_vipkod;

    /**

    Musteri sınıfı, musteri bilgilerini tutmak icin kullanılır.
    */
    public static ArrayList<Musteri> customers = new ArrayList<>();
    
    /**
     * Builder tasarım deseninde kullanılan constructor.
     * Musteri nesnesi olusturur ve builder nesnesinden gelen verileri kullanarak degiskenlerini ayarlar.
     *
     * @param builder Musteri nesnesi olusturmak icin kullanılan builder nesnesi.
     */
   
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
    
    /**
     * Builder tasarım deseni kullanılarak Musteri nesnesi olusturmak icin kullanılan Builder sınıfı.
     */
    public static class Builder {
        /**
         * Musteri ID'si
         */
        private int musteri_id;

        /**
         * Musteri adı
         */
        private String musteri_adi;

        /**
         * Musteri kullanıcı adı
         */
        private String musteri_kulladi;

        /**
         * Musteri sifresi
         */
        private String musteri_sifre;

        /**
         * Musteri e-posta adresi
         */
        private String musteri_mail;

        /**
         * Musteri adresi
         */
        private String musteri_adres;

        /**
         * Musteri telefon numarası
         */
        private int musteri_tel;

        /**
         * Musteri yemek tercihi
         */
        private String musteri_yemektercihi;

        /**
         * Musteri VIP kodu
         */
        private int musteri_vipkod;

        /**
         * Musteri ID degerini ayarlar.
         * @param musteri_id Musteri ID degeri.
         * @return Builder nesnesi.
         */
        public Builder musteri_id(int musteri_id) {
            this.musteri_id = musteri_id;
            return this;
        }
        /**
         * Musteri adını ayarlar.
         * @param musteri_adi Musteri adı.
         * @return Builder nesnesi.
         */
        public Builder musteri_adi(String musteri_adi) {
            this.musteri_adi = musteri_adi;
            return this;
        }
        /**
         * Musteri kullanıcı adını ayarlar.
         * @param musteri_kulladi Musteri kullanıcı adı.
         * @return Builder nesnesi.
         */
        public Builder musteri_kulladi(String musteri_kulladi) {
            this.musteri_kulladi = musteri_kulladi;
            return this;
        }
        /**
         * Musteri sifresini ayarlar.
         * @param musteri_sifre Musteri sifresi.
         * @return Builder nesnesi.
         */

        public Builder musteri_sifre(String musteri_sifre) {
            this.musteri_sifre = musteri_sifre;
            return this;
        }
        /**
         * Musteri e-posta adresini ayarlar.
         * @param musteri_mail Musteri e-posta adresi.
         * @return Builder nesnesi.
         */


        public Builder musteri_mail(String musteri_mail) {
            this.musteri_mail = musteri_mail;
            return this;
        }
        /**
         * Musteri adresini ayarlar.
         * @param musteri_adres Musteri adresi.
         * @return Builder nesnesi.
         */

        public Builder musteri_adres(String musteri_adres) {
            this.musteri_adres = musteri_adres;
            return this;
        }
        /**
         * Musteri telefon numarasını ayarlar.
         * @param musteri_tel Musteri telefon numarası.
         * @return Builder nesnesi.
         */
        public Builder musteri_tel(int musteri_tel) {
            this.musteri_tel = musteri_tel;
            return this;
        }
        /**
         * @param musteri_yemektercihi ayarlar.
         * @return Builder nesnesi.
         */
        public Builder musteri_yemektercihi(String musteri_yemektercihi) {
            this.musteri_yemektercihi = musteri_yemektercihi;
            return this;
        }
        /**
         * Musteri VIP kodunu ayarlar.
         * @param musteri_vipkod Musteri VIP kodu.
         * @return Builder nesnesi.
         */
        public Builder musteri_vipkod(int musteri_vipkod) {
            this.musteri_vipkod = musteri_vipkod;
            return this;
        }
        /**
         * Builder nesnesinin ozelliklerine dayanarak yeni bir Musteri nesnesi olusturur.
         * @return Yeni olusturulan Musteri nesnesi.
         */
        public Musteri build() {
            return new Musteri(this);
        }
    }
    /**

    Musteri ekleme islemini yapar ve bilgileri ekrana yazdirir.
    @param customer Musteri nesnesi.
    */
    public static void Musteri_ekle(Musteri customer) {
   
    	customers.add(customer);
        System.out.println("");
        System.out.println("****************Musteri Bilgileri************");
        System.out.println("Musteri Adi: " + customer.musteri_adi + " (ID: " + customer.musteri_id + ")");
        System.out.println("Musteri Kullanici Adı: " + customer.musteri_kulladi + " (Mail Adresi: " + customer.musteri_mail + ")");
        System.out.println("****************Musteri Bilgileri************");
        System.out.println("");
        
    }
    /**

    Verilen musteri ID'sine gore musteri bilgilerini siler.
    */
    public void Musteri_sil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Musteri ID'si giriniz: ");
        int customerId = scanner.nextInt();
        for (Musteri customer : customers) {
            if (customer.musteri_id == customerId) {
                customers.remove(customer);
                System.out.println("Musteri Silindi: " + customer.musteri_adi + " (ID: " + customer.musteri_id + ")");
                return;
            }
        }
        System.out.println("Musteri ID'si " + customerId + " not found.");
    }
    /**

    Verilen musteri ID'sine gore musteri bilgilerini bulur ve ekrana yazdirir.
    @param musteri_id Bulunacak musteri ID'si.
    */

    public void Musteri_bul(int musteri_id) {
        for (Musteri customer : customers) {
            if (customer.musteri_id == musteri_id) {
                System.out.println("Musteri bulundu: " + customer.musteri_adi);
                return;
            }
        }
        System.out.println("Musteri ID ile bulunamadı: " + musteri_id);
    }
    /**

    Verilen musteri ID'sine gore musteri bilgilerini gunceller.
    */
    public void Musteri_duzenle() {
    	Scanner input = new Scanner(System.in);
        System.out.print("Musteri ID'si giriniz: ");
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
            System.out.println("Musteri bulunamadı.");
            return;
        }
        
        System.out.print("Yeni musterinin adını girim: ");
        String newName = input.next();
        customer.musteri_adi = newName;
        System.out.println("");
        System.out.println("*****************************************************");
        System.out.println("Musteri Guncellendi: " + customer.musteri_adi + " (ID: " + customer.musteri_id + ")");
    }
    
    /**
     * Bu sınıf, Airline Booking System'da musteri bilgilerini yonetmek icin kullanılır.
     * Main metodu, uygulamayı baslatır ve kullanıcıya gerekli secenekleri sunar.
     * 
     * @param args Komut satırından gecilen argumanlar.
     */
   
    public static void main(String[] args) {
    	
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
        
        

        // Sefer olusturuldu
    	Sefer sefer = new Sefer(1, 8844, "Istanbul-Paris", "Paris", "2755");
    	sefer.seferYazdir(sefer);
    	
        Ucak ucak = new Ucak(1, "TK1233", "Boeing", "737-800", "Dar Govde", 156);
        Ucak ucak2 = ucak.clone();  //*****2.Ucak klonlandı 
    
     ucak.ucakYazdir(ucak);
   
     
       
        
        if (ucak == null) {System.out.println("Ucak Bulunamadı....");
        }
        else {
        	
        	//Singelton class datası yazdırılıyor
        	Havalimani istanbulAirport = Havalimani.getInstance();
        	   istanbulAirport.setHavalimaniKodu("IST");
        	   System.out.println("********************************************************");
        	   System.out.println("Havalimanı kodu  Istanbul Havalimanı icin: " + istanbulAirport.getirHavalimaniKodu());
        	   System.out.println("********************************************************");
        	
        // Ucus Kontrol Mediator Class ile kontrol saglanıyor
        Ucuskontrol ucuskontrol = new Ucuskontrol();
        ucuskontrol.kontrolUcus(ucak, sefer);}

        // Print flight information
        
        //Odeme ve odeme yotemi ve bilet'in alınmıstır
        Factory factory = new Factory();
        Odeme odeme = new Odeme(factory);
        odeme.Odeme_kredikartihesapla("kredi_karti");
        
        
        
        //Odeme yapıldı ise rezervasyonu gosterme
        if (odeme.equals(factory)==true) {
       
        Rezervasyon rezervasyon = new Rezervasyon(1, 123, "2023-05-04", 12);
        rezervasyon.Rezervasyon_olustur();
        }
        
        //2.Musteriyi olustur.
        Musteri customer1 = new Musteri.Builder()
                .musteri_id(2)
                .musteri_adi("Smith Lue")
                .musteri_kulladi("simlue")
                .musteri_sifre("sword")
                .musteri_mail("simlue@example.com")
                .musteri_adres("100 Host St")
                .musteri_tel(5551234)
                .musteri_yemektercihi("Carnivar")
                .musteri_vipkod(123)
                .build();
        customer1.Musteri_ekle(customer1);
        
      // 2.Sefer olusturuldu
    	Sefer sefer2 = new Sefer(2, 2233, "Istanbul-Berlin", "Berlin", "8857");
    	sefer2.seferYazdir(sefer2);
       
        
        //*****2.Ucak klonlandı ve id ile koltuk sayısı degerleri guncellendi***
        
        
       
        ucak2.setUcak_id(2);
        ucak2.setUcak_koltuksayisi(200);
        ucak2.ucakYazdir(ucak2);
        
        if (ucak2 == null) {System.out.println("Ucak Bulunamadı....");
        }
        else {
        	
        	//Singelton class datası yazdırılıyor
        	Havalimani istanbulAirport = Havalimani.getInstance();
     	   istanbulAirport.setHavalimaniKodu("JFK");
     	   System.out.println("********************************************************");
     	   System.out.println("Havalimanı kodu  John F KENEDY Havalimanı icin: " + istanbulAirport.getirHavalimaniKodu());
     	   System.out.println("********************************************************");
     	
        // Ucus Kontrol Mediator Class ile kontrol saglanıyor
        Ucuskontrol ucuskontrol2 = new Ucuskontrol();
        ucuskontrol2.kontrolUcus(ucak2, sefer2);}

   
        
        //Odeme ve odeme yotemi ve biletalınmıstır
        Factory factory1 = new Factory();
        Odeme odeme1 = new Odeme(factory1);
        odeme1.Odeme_nakithesapla("Nakit");
        
        
      //Odeme yapıldı ise rezervasyonu gosterme
        if (odeme.equals(factory)==true) {
       
        Rezervasyon rezervasyon = new Rezervasyon(3, 123, "2023-05-03", 1);
        rezervasyon.Rezervasyon_olustur();
        }
       
        
        
        }
        
        
}


