package Airline_Booking;

/**
 * Ekonomi sınıfı, Bilet arayuzunu uygulayan bir sınıftır.
 * Ekonomi sınıfı, bilet olusturma, guncelleme ve silme islemleri yapabilir.
 */
public class Ekonomi implements Bilet {

    /**
     * Ekonomi sınıfı icin ozellikler
     */
	/**
	 * Ekonomik ekstra bagaj tutarını tutar.
	 */
	private String Ekonomik_ekstrabagaj;

	/**
	 * Biletin ID numarasını tutar.
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
	 * Biletin satın alındıgı tarihi tutar.
	 */
	private String biletTarih;

	/**
	 * Biletin koltuk numarasını tutar.
	 */
	private int biletKoltukNo;
	/**
	 * Ekonomi sınıfının yapıcı metodu, Ekonomi seyahat sınıfı biletlerinin ekstra bagaj ozelligini ayarlar.
	 *
	 * @param ekstrabagaj Ekonomi seyahat sınıfının ekstra bagaj ozelligi
	 */

   
    public Ekonomi(String ekstrabagaj) {
        this.Ekonomik_ekstrabagaj = ekstrabagaj;
    }
    
    /**
     * Bilet_guncelle metodu, Bilet arayuzunden uygulanır
     * Ekonomi sınıfı icin ozel bir uygulama yapar.
     */
    @Override
    public void Bilet_guncelle() {
        // Ekonomi sınıfına ozel Bilet_guncelle uygulaması
    }

    /**
     * Bilet_olustur metodu, Bilet arayuzunden uygulanır
     * Ekonomi sınıfı icin ozel bir uygulama yapar.
     */
    @Override
    public void Bilet_olustur() {
    	
    	 Ekonomi ekonomiBilet = new Ekonomi("10kg");
         ekonomiBilet.setBiletId(1);
         ekonomiBilet.setBiletNo(1234);
         ekonomiBilet.setBiletFiyat(500);
         ekonomiBilet.setBiletTarih("2023-05-10");
         ekonomiBilet.setBiletKoltukNo(15);
         
         System.out.println("**************************Ekonomi Bilet:********************************");
         System.out.println("Bilet ID: " + ekonomiBilet.getBiletId());
         System.out.println("Bilet No: " + ekonomiBilet.getBiletNo());
         System.out.println("Bilet Fiyat: " + ekonomiBilet.getBiletFiyat());
         System.out.println("Bilet Tarih: " + ekonomiBilet.getBiletTarih());
         System.out.println("Bilet Koltuk No: " + ekonomiBilet.getBiletKoltukNo());
         System.out.println("**************************Ekonomi Bilet:********************************");
         System.out.println("");
    }

    /**
     * Bilet_sil metodu, Bilet arayuzunden uygulanır
     * Ekonomi sınıfı icin ozel bir uygulama yapar.
     */
    @Override
    public void Bilet_sil() {
        // Ekonomi sınıfına ozel Bilet_sil uygulaması
    }

    /**
     * Getter ve Setter metodları
     */
    /**
     * Biletin ID'sini getirir.
     * @return Biletin ID'si.
     */
    @Override
    public int getBiletId() {
        return biletId;
    }

    /**
     * Biletin ID'sini ayarlar.
     * @param biletId Biletin ID'si.
     */
    @Override
    public void setBiletId(int biletId) {
        this.biletId = biletId;
    }

    /**
     * Bilet numarasını getirir.
     * @return Bilet numarası.
     */
    @Override
    public int getBiletNo() {
        return biletNo;
    }

    /**
     * Bilet numarasını ayarlar.
     * @param biletNo Bilet numarası.
     */
    @Override
    public void setBiletNo(int biletNo) {
        this.biletNo = biletNo;
    }

    /**
     * Bilet fiyatını getirir.
     * @return Bilet fiyatı.
     */
    @Override
    public int getBiletFiyat() {
        return biletFiyat;
    }

    /**
     * Bilet fiyatını ayarlar.
     * @param biletFiyat Bilet fiyatı.
     */
    @Override
    public void setBiletFiyat(int biletFiyat) {
        this.biletFiyat = biletFiyat;
    }

    /**
     * Biletin tarihini getirir.
     * @return Biletin tarihi.
     */
    @Override
    public String getBiletTarih() {
        return biletTarih;
    }

    /**
     * Biletin tarihini ayarlar.
     * @param biletTarih Biletin tarihi.
     */
    @Override
    public void setBiletTarih(String biletTarih) {
        this.biletTarih = biletTarih;
    }

    /**
     * Biletin koltuk numarasını getirir.
     * @return Biletin koltuk numarası.
     */
    @Override
    public int getBiletKoltukNo() {
        return biletKoltukNo;
    }

    /**
     * Biletin koltuk numarasını ayarlar.
     * @param biletKoltukNo Biletin koltuk numarası.
     */
    @Override
    public void setBiletKoltukNo(int biletKoltukNo) {
        this.biletKoltukNo = biletKoltukNo;
    }
}