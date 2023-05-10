package Airline_Booking;

/**
 * Business sinifi, Bilet arayuzunu uygular ve Business seyahat sinifi biletlerinin ozelliklerini tutar.
 */
public class Business implements Bilet {
	
	   /**
     * Business seyahat sinifinin VIP ozelligini tutar.
     */
    private String Business_vip;

    /**
     * Biletin ID'sini tutar.
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
     * Biletin tarihini tutar.
     */
    private String biletTarih;

    /**
     * Biletin koltuk numarasini tutar.
     */
    private int biletKoltukNo;
	
	
    /**
     * Business sinifinin yapici metodu, Business seyahat sinifi biletlerinin VIP ozelligini ayarlar.
     *
     * @param vip Business seyahat sinifinin VIP ozelligi
     */
	
    public Business(String vip) {
        this.Business_vip = vip;
    }

    /**
     * Bilet_guncelle metodu, Bilet arayuzunden uygulanir.
     * Bu sinifta henuz bir guncelleme islemi yapilmamaktadir.
     * 
     *
     */
    @Override
    public void Bilet_guncelle() {
        // Business sinifi icin Bilet_guncelle metodunun uygulamasi
        // henuz yapilmamistir.
    }

    /**
     * Bilet_olustur metodu, Bilet arayuzunden uygulanir.
     * Bu sinifta yeni bir Business bilet olusturulur ve ozellikleri set edilir.
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
     * Bilet_sil metodu, Bilet arayuzunden uygulanir.
     * Bu sinifta henuz bir silme islemi yapilmamaktadir.
     */
    @Override
    public void Bilet_sil() {
        // Business sinifi icin Bilet_sil metodunun uygulamasi
        // henuz yapilmamistir.
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
        	     * Bilet numarasini ayarlar.
        	     *
        	     * @param biletNo Yeni Bilet numarasi
        	     */
        	    @Override
        	    public void setBiletNo(int biletNo) {
        	        this.biletNo = biletNo;
        	    }

        	    /**
        	     * Bilet fiyatini getirir.
        	     *
        	     * @return Bilet fiyati
        	     */
        	    @Override
        	    public int getBiletFiyat() {
        	        return biletFiyat;
        	    }

        	    /**
        	     * Bilet fiyatini ayarlar.
        	     *
        	     * @param biletFiyat Yeni Bilet fiyati
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
        	     * Bilet koltuk numarasini getirir.
        	     *
        	     * @return Bilet koltuk numarasi
        	     */
        	    @Override
        	    public int getBiletKoltukNo() {
        	        return biletKoltukNo;
        	    }

        	    /**
        	     * Bilet koltuk numarasini ayarlar.
        	     *
        	     * @param biletKoltukNo Yeni Bilet koltuk numarasi
        	     */
        	    @Override
        	    public void setBiletKoltukNo(int biletKoltukNo) {
        	        this.biletKoltukNo = biletKoltukNo;
        	    }
        	}