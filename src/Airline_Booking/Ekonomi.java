package Airline_Booking;

public class Ekonomi implements Bilet {
    // fields
    private String Ekonomik_ekstrabagaj;
    private int biletId;
    private int biletNo;
    private int biletFiyat;
    private String biletTarih;
    private int biletKoltukNo;
    
    // constructor
    public Ekonomi(String ekstrabagaj) {
        this.Ekonomik_ekstrabagaj = ekstrabagaj;
    }
    
    // methods
    @Override
    public void Bilet_guncelle() {
        // Implementation of Bilet_guncelle for Economy class
    }

    @Override
    public void Bilet_olustur() {
    	Bilet newBilet = new Ekonomi(Ekonomik_ekstrabagaj);

        // Then, set the properties of the new Bilet object
        newBilet.setBiletId(biletId);
        newBilet.setBiletNo(biletNo);
        newBilet.setBiletFiyat(biletFiyat);
        newBilet.setBiletTarih(biletTarih);
        newBilet.setBiletKoltukNo(biletKoltukNo);
    }

    @Override
    public void Bilet_sil() {
        // Implementation of Bilet_sil for Economy class
    }

    // getter and setter methods
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