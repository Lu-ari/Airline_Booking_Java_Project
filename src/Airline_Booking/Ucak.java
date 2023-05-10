package Airline_Booking;

/**

Ucak sinifi, ucak bilgilerini tutar ve ucak nesneleri olusturur.
*/
public class Ucak  {
	/** Ucak ID'si */
	private int ucak_id;

	/** Ucus Numarasi */
	private String ucak_kuyrukkod;

	/** Ucak Adi */
	private String ucak_marka;

	/** Hedef */
	private String ucak_model;

	/** Ucak govde tipi */
	private String ucak_govdetipi;

	/** Ucak koltuk sayisi */
	private int ucak_koltuksayisi;

	/**

	Ucak sinifinin varsayilan yapici metodu.
	
*/
    public Ucak() {
     
    }
	/**

	Yeni bir ucak nesnesi olusturur.
	@param ucak_id Ucak ID'si
	@param ucak_kuyrukkod Ucus Numarasi
	@param ucak_marka Ucak Adi
	@param ucak_model Hedef
	@param ucak_govdetipi Ucak govde tipi
	@param ucak_koltuksayisi Ucak koltuk sayisi
	@return Yeni olusturulan ucak nesnesi
	*/
    public static Ucak ucakOlustur(int ucak_id, String ucak_kuyrukkod, String ucak_marka, String ucak_model, String ucak_govdetipi, int ucak_koltuksayisi) {
    	 Ucak ucak = new Ucak(ucak_id, ucak_kuyrukkod, ucak_marka, ucak_model, ucak_govdetipi, ucak_koltuksayisi);
        return ucak;
    }
    
    /**

    Ucak bilgilerini yazdirir.
    @param ucak Yazdirilacak ucak nesnesi
    */
    public void ucakYazdir(Ucak ucak) {
    	 Ucak ucak1 = new Ucak(ucak_id, ucak_kuyrukkod, ucak_marka, ucak_model, ucak_govdetipi, ucak_koltuksayisi);
    	System.out.println("*****************************Ucak Bilgisi************************");
     	System.out.println("Ucak ID'si: " + getUcak_id());
     	System.out.println("Ucus Numarasi: " + getUcak_kuyrukkod());
     	System.out.println("Ucak Adi: " + getUcak_marka());
     	System.out.println("Uçak Model: " + getUcak_model());
     	System.out.println("Ucak Kodu: " + getUcak_koltuksayisi());
         System.out.println("*****************************Ucak Bilgisi************************");
         System.out.println("");
    }
    /**
     * Yeni bir ucak nesnesi olusturur.
     * @param ucak_id Ucak ID'si
     * @param ucak_kuyrukkod Ucus Numarasi
     * @param ucak_marka Ucak Adi
     * @param ucak_model Hedef 
     * @param ucak_govdetipi Ucagin govde tipi
     * @param ucak_koltuksayisi Ucagin koltuk sayisi
	*/
    public Ucak(int ucak_id, String ucak_kuyrukkod, String ucak_marka, String ucak_model, String ucak_govdetipi, int ucak_koltuksayisi) {
        this.ucak_id = ucak_id;
        this.ucak_kuyrukkod = ucak_kuyrukkod;
        this.ucak_marka = ucak_marka;
        this.ucak_model = ucak_model;
        this.ucak_govdetipi = ucak_govdetipi;
        this.ucak_koltuksayisi = ucak_koltuksayisi;
    }
    
    /**

    Ucak nesnesinin kopyasini olusturur.
    @return Ucak nesnesinin kopyasi.
    */
    @Override
    public Ucak clone() {
    return new Ucak(this.ucak_id, this.ucak_kuyrukkod, this.ucak_marka, this.ucak_model, this.ucak_govdetipi, this.ucak_koltuksayisi);
    }
    /**

    Ucagin ucus numarasini dondurur.
    @return Ucus numarasi.
    */
    public Object getUcak_kuyrukkod() {
    return ucak_kuyrukkod;
    }
    /**

    Ucagin ID'sini ayarlar.
    @param ucak_id Ucak ID'si.
    */
    public void setUcak_id(int ucak_id) {
    this.ucak_id = ucak_id;
    }
    /**

    Ucagin ucus numarasini ayarlar.
    @param ucak_kuyrukkod Ucus numarasi.
    */
    public void setUcak_kuyrukkod(String ucak_kuyrukkod) {
    this.ucak_kuyrukkod = ucak_kuyrukkod;
    }
    /**

    Ucagin markasini ayarlar.
    @param ucak_marka Ucak markasi.
    */
    public void setUcak_marka(String ucak_marka) {
    this.ucak_marka = ucak_marka;
    }
    /**

    Ucagin modelini ayarlar.
    @param ucak_model Ucak modeli.
    */
    public void setUcak_model(String ucak_model) {
    this.ucak_model = ucak_model;
    }
    /**

    Ucagin govde tipini ayarlar.
    @param ucak_govdetipi Ucak govde tipi.
    */
    public void setUcak_govdetipi(String ucak_govdetipi) {
    this.ucak_govdetipi = ucak_govdetipi;
    }
    /**

    Ucagin koltuk sayisini ayarlar.
    @param ucak_koltuksayisi Ucak koltuk sayisi.
    */
    public void setUcak_koltuksayisi(int ucak_koltuksayisi) {
    this.ucak_koltuksayisi = ucak_koltuksayisi;
    }
    /**

    Ucagin ID'sini dondurur.
    @return Ucak ID'si.
    */
    public int getUcak_id() {
    return ucak_id;
    }
    /**

    Ucagin markasini dondurur.
    @return Ucak markasi.
    */
    public String getUcak_marka() {
    return ucak_marka;
    }
    /**

    Ucagin modelini dondurur.
    @return Ucak modeli.
    */
    public String getUcak_model() {
    return ucak_model;
    }
    /**

    Ucagin govde tipini dondurur.
    @return Ucak govde tipi.
    */
    public String getUcak_govdetipi() {
    return ucak_govdetipi;
    }
    /**

    Ucagin koltuk sayisini dondurur.
    @return Ucak koltuk sayisi.
    */
    public int getUcak_koltuksayisi() {
    return ucak_koltuksayisi;
    }
	
}