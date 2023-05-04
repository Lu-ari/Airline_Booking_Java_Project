package Airline_Booking;

public class Business implements Bilet {
    private String Business_vip;
    private int biletId;
    private int biletNo;
    private int biletFiyat;
    private String biletTarih;
    private int biletKoltukNo;
   
    public Business(String vip) {
        this.Business_vip = vip;
    }

    @Override
    public void Bilet_guncelle() {
        // Implementation of Bilet_guncelle for Business class
    }

    @Override
    public void Bilet_olustur() {
        // Implementation of Bilet_olustur for Business class
    	
    	Business newBilet = new Business("Business");

        // Then, set the properties of the new Bilet object
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
    

    @Override
    public void Bilet_sil() {
        // Implementation of Bilet_sil for Business class
    }

    @Override
    public int getBiletId() {
        return biletId;
    }

    @Override
    public void setBiletId(int biletId) {
        this.biletId = biletId;
    }

    @Override
    public int getBiletNo() {
        return biletNo;
    }

    @Override
    public void setBiletNo(int biletNo) {
        this.biletNo = biletNo;
    }

    @Override
    public int getBiletFiyat() {
        return biletFiyat;
    }

    @Override
    public void setBiletFiyat(int biletFiyat) {
        this.biletFiyat = biletFiyat;
    }

    @Override
    public String getBiletTarih() {
        return biletTarih;
    }

    @Override
    public void setBiletTarih(String biletTarih) {
        this.biletTarih = biletTarih;
    }

    @Override
    public int getBiletKoltukNo() {
        return biletKoltukNo;
    }

    @Override
    public void setBiletKoltukNo(int biletKoltukNo) {
        this.biletKoltukNo = biletKoltukNo;
    }
}