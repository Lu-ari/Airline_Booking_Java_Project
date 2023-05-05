package Airline_Booking;

import java.util.ArrayList;
/**

Musteri sınıfı, müşteri bilgilerini tutmak için kullanılır.

@param musteri_id müşteri ID'si

@param musteri_adi müşteri adı

@param musteri_kulladi müşteri kullanıcı adı

@param musteri_sifre müşteri şifresi

@param musteri_mail müşteri e-posta adresi

@param musteri_adres müşteri adresi

@param musteri_tel müşteri telefon numarası

@param musteri_yemektercihi müşteri yemek tercihi

@param musteri_vipkod müşteri VIP kodu

@return Musteri objesi
*/

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

 // Müşterileri saklamak için bir ArrayList oluşturun
    public static ArrayList<Musteri> customers = new ArrayList<>();
    /**

    Musteri sınıfı, müşteri bilgilerini tutmak için kullanılır.
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
     * Builder tasarım deseni kullanarak Musteri nesneleri oluşturmak için bir yardımcı sınıf.
     */
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
        /**
         * Musteri ID değerini ayarlar.
         * @param musteri_id Musteri ID değeri.
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
         * Musteri şifresini ayarlar.
         * @param musteri_sifre Musteri şifresi.
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
         * Musteri yemek tercihini ayarlar.
         * @param Musteri yemek tercihini ayarlar.
         * @param musteri_yemektercihi 
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
         * Builder nesnesinin özelliklerine dayanarak yeni bir Musteri nesnesi oluşturur.
         * @return Yeni oluşturulan Musteri nesnesi.
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
        System.out.println("****************Müsteri Bilgileri************");
        System.out.println("Musteri Adi: " + customer.musteri_adi + " (ID: " + customer.musteri_id + ")");
        System.out.println("Musteri Kullanici Adı: " + customer.musteri_kulladi + " (Mail Adresi: " + customer.musteri_mail + ")");
        System.out.println("****************Müsteri Bilgileri************");
        System.out.println("");
        
    }
    /**

    Verilen musteri ID'sine gore musteri bilgilerini siler.
    */
    public void Musteri_sil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Müşteri ID'si giriniz: ");
        int customerId = scanner.nextInt();
        for (Musteri customer : customers) {
            if (customer.musteri_id == customerId) {
                customers.remove(customer);
                System.out.println("Müşteri Silindi: " + customer.musteri_adi + " (ID: " + customer.musteri_id + ")");
                return;
            }
        }
        System.out.println("Müşteri ID'si " + customerId + " not found.");
    }
    /**

    Verilen musteri ID'sine gore musteri bilgilerini bulur ve ekrana yazdirir.
    @param musteri_id Bulunacak musteri ID'si.
    */

    public void Musteri_bul(int musteri_id) {
        for (Musteri customer : customers) {
            if (customer.musteri_id == musteri_id) {
                System.out.println("Müşteri bulundu: " + customer.musteri_adi);
                return;
            }
        }
        System.out.println("Müşteri ID ile bulunamadı: " + musteri_id);
    }
    /**

    Verilen musteri ID'sine gore musteri bilgilerini gunceller.
    */
    public void Musteri_duzenle() {
    	Scanner input = new Scanner(System.in);
        System.out.print("Müşteri ID'si giriniz: ");
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
            System.out.println("Müşteri bulunamadı.");
            return;
        }
        
        System.out.print("Yeni müşterinin adını girim: ");
        String newName = input.next();
        customer.musteri_adi = newName;
        System.out.println("");
        System.out.println("*****************************************************");
        System.out.println("Müşteri Güncellendi: " + customer.musteri_adi + " (ID: " + customer.musteri_id + ")");
    }
    
    public static void main(String[] args) {
        //1. Müşteriyi oluştur.
    	
    	
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
    	Sefer sefer = new Sefer(1, 8844, "Istanbul-Paris", "Paris", "2755");
    	sefer.seferYazdir(sefer);
    	
        Ucak ucak = new Ucak(1, "TK1233", "Boeing", "737-800", "Dar Gövde", 156);
        Ucak ucak2 = ucak.clone();  //*****2.Uçak klonlandı 
    
     ucak.ucakYazdir(ucak);
   
     
       
        
        if (ucak == null) {System.out.println("Uçak Bulunamadı....");
        }
        else {
        	
        	//Singelton class datası yazdırılıyor
        	Havalimani istanbulAirport = Havalimani.getInstance();
        	   istanbulAirport.setHavalimaniKodu("IST");
        	   System.out.println("********************************************************");
        	   System.out.println("Havalimanı kodu  Istanbul Havalimanı için: " + istanbulAirport.getirHavalimaniKodu());
        	   System.out.println("********************************************************");
        	
        // Uçuş Kontrol Mediator Class ile kontrol sağlanıyor
        Ucuskontrol ucuskontrol = new Ucuskontrol();
        ucuskontrol.kontrolUcus(ucak, sefer);}

        // Print flight information
        
        //Odeme ve Ödeme yötemi ve bilet'in alınmıştır
        Factory factory = new Factory();
        Odeme odeme = new Odeme(factory);
        odeme.Odeme_kredikartihesapla("kredi_karti");
        
        
        
        //Odeme yapıldı ise rezervasyonu gösterme
        if (odeme.equals(factory)==true) {
       
        Rezervasyon rezervasyon = new Rezervasyon(1, 123, "2023-05-04", 12);
        rezervasyon.Rezervasyon_olustur();
        }
        
        //2.Müşteriyi oluştur.
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
        
      // 2.Sefer oluşturuldu
    	Sefer sefer2 = new Sefer(2, 2233, "Istanbul-Berlin", "Berlin", "8857");
    	sefer2.seferYazdir(sefer2);
       
        
        //*****2.Uçak klonlandı ve id ile koltuk sayısı değerleri güncellendi***
        
        
       
        ucak2.setUcak_id(2);
        ucak2.setUcak_koltuksayisi(200);
        ucak2.ucakYazdir(ucak2);
        
        if (ucak2 == null) {System.out.println("Uçak Bulunamadı....");
        }
        else {
        	
        	//Singelton class datası yazdırılıyor
        	Havalimani istanbulAirport = Havalimani.getInstance();
     	   istanbulAirport.setHavalimaniKodu("JFK");
     	   System.out.println("********************************************************");
     	   System.out.println("Havalimanı kodu  John F KENEDY Havalimanı için: " + istanbulAirport.getirHavalimaniKodu());
     	   System.out.println("********************************************************");
     	
        // Uçuş Kontrol Mediator Class ile kontrol sağlanıyor
        Ucuskontrol ucuskontrol2 = new Ucuskontrol();
        ucuskontrol2.kontrolUcus(ucak2, sefer2);}

   
        
        //Odeme ve Ödeme yötemi ve biletalınmıştır
        Factory factory1 = new Factory();
        Odeme odeme1 = new Odeme(factory1);
        odeme1.Odeme_nakithesapla("Nakit");
        
        
      //Odeme yapıldı ise rezervasyonu gösterme
        if (odeme.equals(factory)==true) {
       
        Rezervasyon rezervasyon = new Rezervasyon(3, 123, "2023-05-03", 1);
        rezervasyon.Rezervasyon_olustur();
        }
       
        
        
        }
        
        
}


