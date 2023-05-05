package Airline_Booking;

/**

Rezervasyon sınıfı, bir rezervasyonun ozelliklerini tanımlar ve yonetir.
*/

public class Rezervasyon {
	/**
	 * Rezervasyonun benzersiz kimligi.
	 * */
	private int rezervasyon_id;
	/**

	Rezervasyon numarası.
	*/
	private int rezervasyon_no;
	/**

	Rezervasyonun yapıldıgı tarih.
	*/
	private String rezervasyon_tarih;
	/**

	Rezervasyonun yapıldıgı koltuk numarası.
	*/
	private int rezervasyon_koltukno;
	/**Rezervasyon nesnesinin ozelliklerini belirten yapıcı metot.
	@param rezervasyon_id Rezervasyonun benzersiz kimligi.
	@param rezervasyon_no Rezervasyon numarası.
	@param rezervasyon_tarih Rezervasyonun yapıldıgı tarih.
	@param rezervasyon_koltukno Rezervasyonun yapıldıgı koltuk numarası.
	*/
    public Rezervasyon(int rezervasyon_id, int rezervasyon_no, String rezervasyon_tarih, int rezervasyon_koltukno) {
        this.rezervasyon_id = rezervasyon_id;
        this.rezervasyon_no = rezervasyon_no;
        this.rezervasyon_tarih = rezervasyon_tarih;
        this.rezervasyon_koltukno = rezervasyon_koltukno;
    }
    
    /**

	Rezervasyonu gunceller.
	*/
    public void Rezervasyon_guncelle() {
    	
    }
    /**

    Yeni bir rezervasyon olusturur ve bilgilerini ekrana yazdırır.
    */
    public void Rezervasyon_olustur() {
         Rezervasyon r1 = new Rezervasyon(rezervasyon_id,rezervasyon_no,rezervasyon_tarih,rezervasyon_koltukno);
         System.out.println("Rezervasyon ID: " + r1.getRezervasyon_id());
         System.out.println("Rezervasyon No: " + r1.getRezervasyon_no());
         System.out.println("Rezervasyon Tarih: " + r1.getRezervasyon_tarih());
         System.out.println("Rezervasyon Koltuk No: " + r1.getRezervasyon_koltukno());
    }
    
    /**

    Verilen rezervasyon kimligine gore, rezervasyonu veritabanından bulur.
    */

    public void Rezervasyon_bul() {
    	// veritabanında rezervasyonu bul
    }
    /**

    Verilen rezervasyon kimligine gore, rezervasyonu veritabanından siler.
    */
    public void Rezervasyon_sil() {
    	// veritabanından rezervasyonu sil
    }

    /**
     * Rezervasyonun ID'sini getirir.
     *
     * @return Rezervasyonun ID'si.
     */
    public int getRezervasyon_id() {
        return rezervasyon_id;
    }
    /**
    * Rezervasyonun ID'sini set eder.
    *
    * @param rezervasyon_id Rezervasyonun yeni ID'si.
    */
    public void setRezervasyon_id(int rezervasyon_id) {
        this.rezervasyon_id = rezervasyon_id;
    }
    /**
     * Rezervasyonun numarasını getirir.
     *
     * @return Rezervasyonun numarası.
     */

    public int getRezervasyon_no() {
        return rezervasyon_no;
    }
    /**
     * Rezervasyonun numarasını set eder.
     *
     * @param rezervasyon_no Rezervasyonun yeni numarası.
     */
    public void setRezervasyon_no(int rezervasyon_no) {
        this.rezervasyon_no = rezervasyon_no;
    }
    
    /**
     * Rezervasyonun tarihini getirir.
     *
     * @return Rezervasyonun tarihi.
     */

    public String getRezervasyon_tarih() {
        return rezervasyon_tarih;
    }
    /**
     * Rezervasyonun tarihini set eder.
     *
     * @param rezervasyon_tarih Rezervasyonun yeni tarihi.
     */

    public void setRezervasyon_tarih(String rezervasyon_tarih) {
        this.rezervasyon_tarih = rezervasyon_tarih;
    }
    /**
     * Rezervasyonun koltuk numarasını getirir.
     *
     * @return Rezervasyonun koltuk numarası.
     */

    public int getRezervasyon_koltukno() {
        return rezervasyon_koltukno;
    }
    /**
     * Rezervasyonun koltuk numarasını set eder.
     *
     * @param rezervasyon_koltukno Rezervasyonun yeni koltuk numarası.
     */
    public void setRezervasyon_koltukno(int rezervasyon_koltukno) {
        this.rezervasyon_koltukno = rezervasyon_koltukno;
    }
}
