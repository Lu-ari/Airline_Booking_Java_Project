package Airline_Booking;

/**
 * Business sınıfı, Bilet arayüzünü uygular ve Business seyahat sınıfı biletlerinin ozelliklerini tutar.
 */
public class Business implements Bilet {
	
	   /**
     * Business seyahat sınıfının VIP ozelligini tutar.
     */
    private String Business_vip;

    /**
     * Biletin ID'sini tutar.
     */
    private int biletId;

    /**
     * Bilet numarasını tutar.
     */
    private int biletNo;

    /**
     * Biletin fiyatını tutar.
     */
    private int biletFiyat;

    /**
     * Biletin tarihini tutar.
     */
    private String biletTarih;

    /**
     * Biletin koltuk numarasını tutar.
     */
    private int biletKoltukNo;
	
	
    /**
     * Business sınıfının yapıcı metodu, Business seyahat sınıfı biletlerinin VIP ozelligini ayarlar.
     *
     * @param vip Business seyahat sınıfının VIP ozelligi
     */
	
    public Business(String vip) {
        this.Business_vip = vip;
    }

    /**
     * Bilet_guncelle metodu, Bilet arayüzünden uygulanır.
     * Bu sınıfta henüz bir güncelleme islemi yapılmamaktadır.
     * 
     *
     */
    @Override
    public void Bilet_guncelle() {
        // Business sınıfı icin Bilet_guncelle metodunun uygulaması
        // henüz yapılmamıstır.
    }

    /**
     * Bilet_olustur metodu, Bilet arayüzünden uygulanır.
     * Bu sınıfta yeni bir Business bilet olusturulur ve ozellikleri set edilir.
     */
    @Override
    public void Bilet_olustur() {
        Business newBilet = new Business("Business");
        // Yeni bilet nesnesinin ozellikleri set edilir
        newBilet.setBiletId(2);
        newBilet.setBiletNo(1);
        newBilet.setBiletFiyat(6000);
        newBilet.setBiletTarih("2023-05-01");
        newBilet.setBiletKoltukNo(14);
        System.out.println("**************************Business Bilet:********************************");
        System.out.println("Bilet ID: " + newBilet.getBiletId());
        System.out.println("Bilet No: " + newBilet.getBiletNo());
        System.out.println("Bilet Fiyat: " +newBilet. getBiletFiyat());
        System.out.println("Bilet Tarih: " + newBilet.getBiletTarih());
        System.out.println("Bilet Koltuk No: " + newBilet.getBiletKoltukNo());
        System.out.println("**************************Business Bilet:********************************");
        System.out.println("");
    }

    /**
     * Bilet_sil metodu, Bilet arayüzünden uygulanır.
     * Bu sınıfta henüz bir silme islemi yapılmamaktadır.
     */
    @Override
    public void Bilet_sil() {
        // Business sınıfı icin Bilet_sil metodunun uygulaması
        // henüz yapılmamıstır.
    }

    /**
     * Bilet ID'sini donduren get metodu.
     * @return Bilet ID'si
     */
    @Override
    public int getBiletId() {
        return biletId;
    }

    /**
     * Bilet ID'sini set eden set metodu.
     * @param biletId Bilet ID'si
     */
    @Override
    public void setBiletId(int biletId) {
        this.biletId = biletId;
        		}
        	    /**
        	     * Bilet ID'sini getirir.
        	     *
        	     * @return Bilet ID'si
        	     */
        	    
        	    @Override
        	    public int getBiletNo() {
        	        return biletNo;
        	    }

        	    /**
        	     * Bilet numarasını ayarlar.
        	     *
        	     * @param biletNo Yeni Bilet numarası
        	     */
        	    @Override
        	    public void setBiletNo(int biletNo) {
        	        this.biletNo = biletNo;
        	    }

        	    /**
        	     * Bilet fiyatını getirir.
        	     *
        	     * @return Bilet fiyatı
        	     */
        	    @Override
        	    public int getBiletFiyat() {
        	        return biletFiyat;
        	    }

        	    /**
        	     * Bilet fiyatını ayarlar.
        	     *
        	     * @param biletFiyat Yeni Bilet fiyatı
        	     */
        	    @Override
        	    public void setBiletFiyat(int biletFiyat) {
        	        this.biletFiyat = biletFiyat;
        	    }

        	    /**
        	     * Bilet tarihini getirir.
        	     *
        	     * @return Bilet tarihi
        	     */
        	    @Override
        	    public String getBiletTarih() {
        	        return biletTarih;
        	    }

        	    /**
        	     * Bilet tarihini ayarlar.
        	     *
        	     * @param biletTarih Yeni Bilet tarihi
        	     */
        	    @Override
        	    public void setBiletTarih(String biletTarih) {
        	        this.biletTarih = biletTarih;
        	    }

        	    /**
        	     * Bilet koltuk numarasını getirir.
        	     *
        	     * @return Bilet koltuk numarası
        	     */
        	    @Override
        	    public int getBiletKoltukNo() {
        	        return biletKoltukNo;
        	    }

        	    /**
        	     * Bilet koltuk numarasını ayarlar.
        	     *
        	     * @param biletKoltukNo Yeni Bilet koltuk numarası
        	     */
        	    @Override
        	    public void setBiletKoltukNo(int biletKoltukNo) {
        	        this.biletKoltukNo = biletKoltukNo;
        	    }
        	}