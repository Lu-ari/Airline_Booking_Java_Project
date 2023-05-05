package Airline_Booking;

/**
 * Bilet arayüzünü uygulayan Business sınıfı.
 */
public class Business implements Bilet {
	/**
	 * İşletme VIP durumunu belirten değişken.
	 */
	private String Business_vip;

	/**
	 * Biletin kimlik numarasını belirten değişken.
	 */
	private int biletId;

	/**
	 * Bilet numarasını belirten değişken.
	 */
	private int biletNo;

	/**
	 * Bilet numarasını belirten değişken.
	 */
	private int biletFiyat;

	/**
	 * Biletin tarihini belirten değişken.
	 */
	private String biletTarih;

	/**
	 * Biletin koltuk numarasını belirten değişken.
	 */
	private int biletKoltukNo;
   
    /**
     * Business sınıfının yapıcı metodu, VIP parametresi alır.
     * @param vip VIP parametresi
     */
    public Business(String vip) {
        this.Business_vip = vip;
    }

    /**
     * Bilet_guncelle metodu, Bilet arayüzünden uygulanır.
     * Bu sınıfta henüz bir güncelleme işlemi yapılmamaktadır.
     * 
     * @param vip Business VIP durumu.

	*@param biletId Biletin kimlik numarası.

	*@param biletNo Bilet numarası.

	*@param biletFiyat Biletin fiyatı.

	*@param biletTarih Biletin tarihi.

	*@param biletKoltukNo Biletin koltuk numarası.
     * 
     */
    @Override
    public void Bilet_guncelle() {
        // Business sınıfı için Bilet_guncelle metodunun uygulaması
        // henüz yapılmamıştır.
    }

    /**
     * Bilet_olustur metodu, Bilet arayüzünden uygulanır.
     * Bu sınıfta yeni bir Business bilet oluşturulur ve özellikleri set edilir.
     */
    @Override
    public void Bilet_olustur() {
        Business newBilet = new Business("Business");
        // Yeni bilet nesnesinin özellikleri set edilir
        newBilet.setBiletId(2);
        newBilet.setBiletNo(1);
        newBilet.setBiletFiyat(5000);
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
     * Bu sınıfta henüz bir silme işlemi yapılmamaktadır.
     */
    @Override
    public void Bilet_sil() {
        // Business sınıfı için Bilet_sil metodunun uygulaması
        // henüz yapılmamıştır.
    }

    /**
     * Bilet ID'sini döndüren get metodu.
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

