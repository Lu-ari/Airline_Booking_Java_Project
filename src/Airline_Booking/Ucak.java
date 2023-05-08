package Airline_Booking;

/**

Ucak sınıfı, ucak bilgilerini tutar ve ucak nesneleri olusturur.
*/
public class Ucak  {
	/** Ucak ID'si */
	private int ucak_id;

	/** Ucus Numarası */
	private String ucak_kuyrukkod;

	/** Ucak Adı */
	private String ucak_marka;

	/** Hedef */
	private String ucak_model;

	/** Ucak govde tipi */
	private String ucak_govdetipi;

	/** Ucak koltuk sayısı */
	private int ucak_koltuksayisi;

	/**

	Ucak sınıfının varsayılan yapıcı metodu.
	
*/
    public Ucak() {
     
    }
	/**

	Yeni bir ucak nesnesi olusturur.
	@param ucak_id Ucak ID'si
	@param ucak_kuyrukkod Ucus Numarası
	@param ucak_marka Ucak Adı
	@param ucak_model Hedef
	@param ucak_govdetipi Ucak govde tipi
	@param ucak_koltuksayisi Ucak koltuk sayısı
	@return Yeni olusturulan ucak nesnesi
	*/
    public static Ucak ucakOlustur(int ucak_id, String ucak_kuyrukkod, String ucak_marka, String ucak_model, String ucak_govdetipi, int ucak_koltuksayisi) {
    	 Ucak ucak = new Ucak(ucak_id, ucak_kuyrukkod, ucak_marka, ucak_model, ucak_govdetipi, ucak_koltuksayisi);
        return ucak;
    }
    
    /**

    Ucak bilgilerini yazdırır.
    @param ucak Yazdırılacak ucak nesnesi
    */
    public void ucakYazdir(Ucak ucak) {
    	 Ucak ucak1 = new Ucak(ucak_id, ucak_kuyrukkod, ucak_marka, ucak_model, ucak_govdetipi, ucak_koltuksayisi);
    	System.out.println("*****************************Ucak Bilgisi************************");
     	System.out.println("Ucak ID'si: " + getUcak_id());
     	System.out.println("Ucus Numarası: " + getUcak_kuyrukkod());
     	System.out.println("Ucak Adı: " + getUcak_marka());
     	System.out.println("Uçak Model: " + getUcak_model());
     	System.out.println("Ucak Kodu: " + getUcak_koltuksayisi());
         System.out.println("*****************************Ucak Bilgisi************************");
         System.out.println("");
    }
    /**
     * Yeni bir ucak nesnesi olusturur.
     * @param ucak_id Ucak ID'si
     * @param ucak_kuyrukkod Ucus Numarası
     * @param ucak_marka Ucak Adı
     * @param ucak_model Hedef 
     * @param ucak_govdetipi Ucagın govde tipi
     * @param ucak_koltuksayisi Ucagın koltuk sayısı
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

    Ucak nesnesinin kopyasını olusturur.
    @return Ucak nesnesinin kopyası.
    */
    @Override
    public Ucak clone() {
    return new Ucak(this.ucak_id, this.ucak_kuyrukkod, this.ucak_marka, this.ucak_model, this.ucak_govdetipi, this.ucak_koltuksayisi);
    }
    /**

    Ucagın ucus numarasını dondurur.
    @return Ucus numarası.
    */
    public Object getUcak_kuyrukkod() {
    return ucak_kuyrukkod;
    }
    /**

    Ucagın ID'sini ayarlar.
    @param ucak_id Ucak ID'si.
    */
    public void setUcak_id(int ucak_id) {
    this.ucak_id = ucak_id;
    }
    /**

    Ucagın ucus numarasını ayarlar.
    @param ucak_kuyrukkod Ucus numarası.
    */
    public void setUcak_kuyrukkod(String ucak_kuyrukkod) {
    this.ucak_kuyrukkod = ucak_kuyrukkod;
    }
    /**

    Ucagın markasını ayarlar.
    @param ucak_marka Ucak markası.
    */
    public void setUcak_marka(String ucak_marka) {
    this.ucak_marka = ucak_marka;
    }
    /**

    Ucagın modelini ayarlar.
    @param ucak_model Ucak modeli.
    */
    public void setUcak_model(String ucak_model) {
    this.ucak_model = ucak_model;
    }
    /**

    Ucagın govde tipini ayarlar.
    @param ucak_govdetipi Ucak govde tipi.
    */
    public void setUcak_govdetipi(String ucak_govdetipi) {
    this.ucak_govdetipi = ucak_govdetipi;
    }
    /**

    Ucagın koltuk sayısını ayarlar.
    @param ucak_koltuksayisi Ucak koltuk sayısı.
    */
    public void setUcak_koltuksayisi(int ucak_koltuksayisi) {
    this.ucak_koltuksayisi = ucak_koltuksayisi;
    }
    /**

    Ucagın ID'sini dondurur.
    @return Ucak ID'si.
    */
    public int getUcak_id() {
    return ucak_id;
    }
    /**

    Ucagın markasını dondurur.
    @return Ucak markası.
    */
    public String getUcak_marka() {
    return ucak_marka;
    }
    /**

    Ucagın modelini dondurur.
    @return Ucak modeli.
    */
    public String getUcak_model() {
    return ucak_model;
    }
    /**

    Ucagın govde tipini dondurur.
    @return Ucak govde tipi.
    */
    public String getUcak_govdetipi() {
    return ucak_govdetipi;
    }
    /**

    Ucagın koltuk sayısını dondurur.
    @return Ucak koltuk sayısı.
    */
    public int getUcak_koltuksayisi() {
    return ucak_koltuksayisi;
    }
	
}