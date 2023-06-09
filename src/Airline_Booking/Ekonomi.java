package Airline_Booking;

/**
 * Ekonomi sinifi, Bilet arayuzunu uygulayan bir siniftir.
 * Ekonomi sinifi, bilet olusturma, guncelleme ve silme islemleri yapabilir.
 */
public class Ekonomi implements Bilet {

    /**
     * Ekonomi sinifi icin ozellikler
     */
	/**
	 * Ekonomik ekstra bagaj tutarini tutar.
	 */
	private String Ekonomik_ekstrabagaj;

	/**
	 * Biletin ID numarasini tutar.
	 */
	private int biletId;

	/**
	 * Bilet numarasini tutar.
	 */
	private int biletNo;

	/**
	 * Biletin fiyatini tutar.
	 */
	private int biletFiyat;

	/**
	 * Biletin satin alindigi tarihi tutar.
	 */
	private String biletTarih;

	/**
	 * Biletin koltuk numarasini tutar.
	 */
	private int biletKoltukNo;
	/**
	 * Ekonomi sinifinin yapici metodu, Ekonomi seyahat sinifi biletlerinin ekstra bagaj ozelligini ayarlar.
	 *
	 * @param ekstrabagaj Ekonomi seyahat sinifinin ekstra bagaj ozelligi
	 */

   
    public Ekonomi(String ekstrabagaj) {
        this.Ekonomik_ekstrabagaj = ekstrabagaj;
    }
    
    /**
     * Bilet_guncelle metodu, Bilet arayuzunden uygulanir
     * Ekonomi sinifi icin ozel bir uygulama yapar.
     */
    @Override
    public void Bilet_guncelle() {
        // Ekonomi sinifina ozel Bilet_guncelle uygulamasi
    }

    /**
     * Bilet_olustur metodu, Bilet arayuzunden uygulanir
     * Ekonomi sinifi icin ozel bir uygulama yapar.
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
     * Bilet_sil metodu, Bilet arayuzunden uygulanir
     * Ekonomi sinifi icin ozel bir uygulama yapar.
     */
    @Override
    public void Bilet_sil() {
        // Ekonomi sinifina ozel Bilet_sil uygulamasi
    }

    /**
     * Getter ve Setter metodlari
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
     * Bilet numarasini getirir.
     * @return Bilet numarasi.
     */
    @Override
    public int getBiletNo() {
        return biletNo;
    }

    /**
     * Bilet numarasini ayarlar.
     * @param biletNo Bilet numarasi.
     */
    @Override
    public void setBiletNo(int biletNo) {
        this.biletNo = biletNo;
    }

    /**
     * Bilet fiyatini getirir.
     * @return Bilet fiyati.
     */
    @Override
    public int getBiletFiyat() {
        return biletFiyat;
    }

    /**
     * Bilet fiyatini ayarlar.
     * @param biletFiyat Bilet fiyati.
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
     * Biletin koltuk numarasini getirir.
     * @return Biletin koltuk numarasi.
     */
    @Override
    public int getBiletKoltukNo() {
        return biletKoltukNo;
    }

    /**
     * Biletin koltuk numarasini ayarlar.
     * @param biletKoltukNo Biletin koltuk numarasi.
     */
    @Override
    public void setBiletKoltukNo(int biletKoltukNo) {
        this.biletKoltukNo = biletKoltukNo;
    }
}