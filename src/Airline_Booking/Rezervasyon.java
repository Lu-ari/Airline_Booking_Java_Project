package Airline_Booking;

/**

Rezervasyon sinifi, bir rezervasyonun ozelliklerini tanimlar ve yonetir.
*/

public class Rezervasyon {
	/**
	 * Rezervasyonun benzersiz kimligi.
	 * */
	private int rezervasyon_id;
	/**

	Rezervasyon numarasi.
	*/
	private int rezervasyon_no;
	/**

	Rezervasyonun yapildigi tarih.
	*/
	private String rezervasyon_tarih;
	/**

	Rezervasyonun yapildigi koltuk numarasi.
	*/
	private int rezervasyon_koltukno;
	/**Rezervasyon nesnesinin ozelliklerini belirten yapici metot.
	@param rezervasyon_id Rezervasyonun benzersiz kimligi.
	@param rezervasyon_no Rezervasyon numarasi.
	@param rezervasyon_tarih Rezervasyonun yapildigi tarih.
	@param rezervasyon_koltukno Rezervasyonun yapildigi koltuk numarasi.
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

    Yeni bir rezervasyon olusturur ve bilgilerini ekrana yazdirir.
    */
    public void Rezervasyon_olustur() {
         Rezervasyon r1 = new Rezervasyon(rezervasyon_id,rezervasyon_no,rezervasyon_tarih,rezervasyon_koltukno);
         System.out.println("Rezervasyon ID: " + r1.getRezervasyon_id());
         System.out.println("Rezervasyon No: " + r1.getRezervasyon_no());
         System.out.println("Rezervasyon Tarih: " + r1.getRezervasyon_tarih());
         System.out.println("Rezervasyon Koltuk No: " + r1.getRezervasyon_koltukno());
    }
    
    /**

    Verilen rezervasyon kimligine gore, rezervasyonu veritabanindan bulur.
    */

    public void Rezervasyon_bul() {
    	// veritabaninda rezervasyonu bul
    }
    /**

    Verilen rezervasyon kimligine gore, rezervasyonu veritabanindan siler.
    */
    public void Rezervasyon_sil() {
    	// veritabanindan rezervasyonu sil
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
     * Rezervasyonun numarasini getirir.
     *
     * @return Rezervasyonun numarasi.
     */

    public int getRezervasyon_no() {
        return rezervasyon_no;
    }
    /**
     * Rezervasyonun numarasini set eder.
     *
     * @param rezervasyon_no Rezervasyonun yeni numarasi.
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
     * Rezervasyonun koltuk numarasini getirir.
     *
     * @return Rezervasyonun koltuk numarasi.
     */

    public int getRezervasyon_koltukno() {
        return rezervasyon_koltukno;
    }
    /**
     * Rezervasyonun koltuk numarasini set eder.
     *
     * @param rezervasyon_koltukno Rezervasyonun yeni koltuk numarasi.
     */
    public void setRezervasyon_koltukno(int rezervasyon_koltukno) {
        this.rezervasyon_koltukno = rezervasyon_koltukno;
    }
}
