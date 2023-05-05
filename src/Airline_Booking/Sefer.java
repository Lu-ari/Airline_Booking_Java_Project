package Airline_Booking;

/**

Sefer sınıfı, havayolu sirketinin ucuslarına iliskin bilgileri tutar ve bu bilgileri yonetir.
*/
public class Sefer {
	/**
	 * Sefer ID'si.
	 */
	private int sefer_id;

	/**
	 * Sefer numarası.
	 */
	private int sefer_no;

	/**
	 * Seferin adı.
	 */
	private String sefer_adi;

	/**
	 * Seferin destinasyonu.
	 */
	private String sefer_destinasyon;

	/**
	 * Seferin ucus kodu.
	 */
	private String sefer_ucuskodu;

/**

Bos kurucu method.
*/
public Sefer() {
}
/**

Sefer bilgilerini tutan objeyi olusturur.
@param sefer_id Seferin ID'si
@param sefer_no Sefer numarası
@param sefer_adi Sefer adı
@param sefer_destinasyon Seferin hedef destinasyonu
@param sefer_ucuskodu Ucagın kodu
*/
public Sefer(int sefer_id, int sefer_no, String sefer_adi, String sefer_destinasyon, String sefer_ucuskodu) {
this.sefer_id = sefer_id;
this.sefer_no = sefer_no;
this.sefer_adi = sefer_adi;
this.sefer_destinasyon = sefer_destinasyon;
this.sefer_ucuskodu = sefer_ucuskodu;
}
/**

Sefer bilgilerini yazdırır.
@param sefer Sefer objesi
*/
public void seferYazdir(Sefer sefer) {
Sefer sefer1 = new Sefer(sefer_id, sefer_no, sefer_adi, sefer_destinasyon, sefer_ucuskodu);
System.out.println("*******************************Ucus Bilgisi*********************************************");
System.out.println("ID: " + getSeferAdi());
System.out.println("Ucus Numarası: " + getSeferNo());
System.out.println("Ucus Adı: " + getSeferAdi());
System.out.println("Hedef: " + getSeferDestinasyon());
System.out.println("Ucak Kodu: " + getSeferUcuskodu());
System.out.println("*******************************Ucus Bilgisi*********************************************");
System.out.println("");
}
/**

Verilen Ucak objesinin klonunu olusturur.
@param ucak Ucak objesi
@return Klonlanmıs Ucak objesi
*/
public Ucak ucakKlonla(Ucak ucak) {
Ucak clonedUcak = ucak.clone(); // clone the Ucak object
return clonedUcak;
}
/**

Var olan ucusları sorgulamak icin observer tasarım deseni uygular.
*/
public void sorgulaSefer() {
	// Var olan ucusları sorgulamak icin gozlemci tasarım deseni uygulanır.
}
/**

Var olan ucusları guncellemek icin observer tasarım deseni uygular.
*/
public void guncelleSefer() {
	// Guncelleme islemi icin gozlemci tasarım deseni uygulanır.
}

/**

Sefer sınıfının sefer ID'sini donduren metodu.
@return Seferin ID'si.
*/
public int getSeferId() {
return sefer_id;
}
/**

Sefer sınıfının sefer ID'sini ayarlayan metodu.
@param sefer_id Seferin ID'si.
*/
public void setSeferId(int sefer_id) {
this.sefer_id = sefer_id;
}
/**

Sefer sınıfının sefer numarasını donduren metodu.
@return Seferin numarası.
*/
public int getSeferNo() {
return sefer_no;
}
/**

Sefer sınıfının sefer numarasını ayarlayan metodu.
@param sefer_no Seferin numarası.
*/
public void setSeferNo(int sefer_no) {
this.sefer_no = sefer_no;
}
/**

Sefer sınıfının sefer adını donduren metodu.
@return Seferin adı.
*/
public String getSeferAdi() {
return sefer_adi;
}
/**

Sefer sınıfının sefer adını ayarlayan metodu.
@param sefer_adi Seferin adı.
*/
public void setSeferAdi(String sefer_adi) {
this.sefer_adi = sefer_adi;
}
/**

Sefer sınıfının hedef destinasyonunu donduren metodu.
@return Seferin hedef destinasyonu.
*/
public String getSeferDestinasyon() {
return sefer_destinasyon;
}
/**

Sefer sınıfının hedef destinasyonunu ayarlayan metodu.
@param sefer_destinasyon Seferin hedef destinasyonu.
*/
public void setSeferDestinasyon(String sefer_destinasyon) {
this.sefer_destinasyon = sefer_destinasyon;
}
/**

Sefer sınıfının ucak kodunu donduren metodu.
@return Seferin ucak kodu.
*/
public String getSeferUcuskodu() {
return sefer_ucuskodu;
}
/**

Sefer sınıfının ucak kodunu ayarlayan metodu.
@param sefer_ucuskodu Seferin ucak kodu.
*/
public void setSeferUcuskodu(String sefer_ucuskodu) {
this.sefer_ucuskodu = sefer_ucuskodu;
}
}