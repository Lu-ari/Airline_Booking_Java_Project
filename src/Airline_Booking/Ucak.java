package Airline_Booking;

/**

Ucak sınıfı, uçak bilgilerini tutar ve uçak nesneleri oluşturur.
*/
public class Ucak  {
	/** Uçak ID'si */
	private int ucak_id;

	/** Uçuş Numarası */
	private String ucak_kuyrukkod;

	/** Uçak Adı */
	private String ucak_marka;

	/** Hedef */
	private String ucak_model;

	/** Uçak gövde tipi */
	private String ucak_govdetipi;

	/** Uçak koltuk sayısı */
	private int ucak_koltuksayisi;

	/**

	Uçak sınıfının varsayılan yapıcı metodu.
	
*/
    public Ucak() {
     
    }
	/**

	Yeni bir uçak nesnesi oluşturur.
	@param ucak_id Uçak ID'si
	@param ucak_kuyrukkod Uçuş Numarası
	@param ucak_marka Uçak Adı
	@param ucak_model Hedef
	@param ucak_govdetipi Uçak gövde tipi
	@param ucak_koltuksayisi Uçak koltuk sayısı
	@return Yeni oluşturulan uçak nesnesi
	*/
    public static Ucak ucakOlustur(int ucak_id, String ucak_kuyrukkod, String ucak_marka, String ucak_model, String ucak_govdetipi, int ucak_koltuksayisi) {
    	 Ucak ucak = new Ucak(ucak_id, ucak_kuyrukkod, ucak_marka, ucak_model, ucak_govdetipi, ucak_koltuksayisi);
        return ucak;
    }
    
    /**

    Uçak bilgilerini yazdırır.
    @param ucak Yazdırılacak uçak nesnesi
    */
    public void ucakYazdir(Ucak ucak) {
    	 Ucak ucak1 = new Ucak(ucak_id, ucak_kuyrukkod, ucak_marka, ucak_model, ucak_govdetipi, ucak_koltuksayisi);
    	System.out.println("*****************************Uçak Bilgisi************************");
     	System.out.println("Uçak ID'si: " + getUcak_id());
     	System.out.println("Uçuş Numarası: " + getUcak_kuyrukkod());
     	System.out.println("Uçak Adı: " + getUcak_marka());
     	System.out.println("Hedef: " + getUcak_model());
     	System.out.println("Uçak Kodu: " + getUcak_koltuksayisi());
         System.out.println("*****************************Uçak Bilgisi************************");
         System.out.println("");
    }
    /**
     * Yeni bir uçak nesnesi oluşturur.
     * @param ucak_id Uçak ID'si
     * @param ucak_kuyrukkod Uçuş Numarası
     * @param ucak_marka Uçak Adı
     * @param ucak_model Hedef 
     * @param ucak_govdetipi Uçağın gövde tipi
     * @param ucak_koltuksayisi Uçağın koltuk sayısı
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

    Uçak nesnesinin kopyasını oluşturur.
    @return Uçak nesnesinin kopyası.
    */
    @Override
    public Ucak clone() {
    return new Ucak(this.ucak_id, this.ucak_kuyrukkod, this.ucak_marka, this.ucak_model, this.ucak_govdetipi, this.ucak_koltuksayisi);
    }
    /**

    Uçağın uçuş numarasını döndürür.
    @return Uçuş numarası.
    */
    public Object getUcak_kuyrukkod() {
    return ucak_kuyrukkod;
    }
    /**

    Uçağın ID'sini ayarlar.
    @param ucak_id Uçak ID'si.
    */
    public void setUcak_id(int ucak_id) {
    this.ucak_id = ucak_id;
    }
    /**

    Uçağın uçuş numarasını ayarlar.
    @param ucak_kuyrukkod Uçuş numarası.
    */
    public void setUcak_kuyrukkod(String ucak_kuyrukkod) {
    this.ucak_kuyrukkod = ucak_kuyrukkod;
    }
    /**

    Uçağın markasını ayarlar.
    @param ucak_marka Uçak markası.
    */
    public void setUcak_marka(String ucak_marka) {
    this.ucak_marka = ucak_marka;
    }
    /**

    Uçağın modelini ayarlar.
    @param ucak_model Uçak modeli.
    */
    public void setUcak_model(String ucak_model) {
    this.ucak_model = ucak_model;
    }
    /**

    Uçağın gövde tipini ayarlar.
    @param ucak_govdetipi Uçak gövde tipi.
    */
    public void setUcak_govdetipi(String ucak_govdetipi) {
    this.ucak_govdetipi = ucak_govdetipi;
    }
    /**

    Uçağın koltuk sayısını ayarlar.
    @param ucak_koltuksayisi Uçak koltuk sayısı.
    */
    public void setUcak_koltuksayisi(int ucak_koltuksayisi) {
    this.ucak_koltuksayisi = ucak_koltuksayisi;
    }
    /**

    Uçağın ID'sini döndürür.
    @return Uçak ID'si.
    */
    public int getUcak_id() {
    return ucak_id;
    }
    /**

    Uçağın markasını döndürür.
    @return Uçak markası.
    */
    public String getUcak_marka() {
    return ucak_marka;
    }
    /**

    Uçağın modelini döndürür.
    @return Uçak modeli.
    */
    public String getUcak_model() {
    return ucak_model;
    }
    /**

    Uçağın gövde tipini döndürür.
    @return Uçak gövde tipi.
    */
    public String getUcak_govdetipi() {
    return ucak_govdetipi;
    }
    /**

    Uçağın koltuk sayısını döndürür.
    @return Uçak koltuk sayısı.
    */
    public int getUcak_koltuksayisi() {
    return ucak_koltuksayisi;
    }
	
}