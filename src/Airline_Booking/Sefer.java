package Airline_Booking;

/**

Sefer sinifi, havayolu sirketinin ucuslarina iliskin bilgileri tutar ve bu bilgileri yonetir.
*/
public class Sefer {
	/**
	 * Sefer ID'si.
	 */
	private int sefer_id;

	/**
	 * Sefer numarasi.
	 */
	private int sefer_no;

	/**
	 * Seferin adi.
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
@param sefer_no Sefer numarasi
@param sefer_adi Sefer adi
@param sefer_destinasyon Seferin hedef destinasyonu
@param sefer_ucuskodu Ucagin kodu
*/
public Sefer(int sefer_id, int sefer_no, String sefer_adi, String sefer_destinasyon, String sefer_ucuskodu) {
this.sefer_id = sefer_id;
this.sefer_no = sefer_no;
this.sefer_adi = sefer_adi;
this.sefer_destinasyon = sefer_destinasyon;
this.sefer_ucuskodu = sefer_ucuskodu;
}
/**

Sefer bilgilerini yazdirir.
@param sefer Sefer objesi
*/
public void seferYazdir(Sefer sefer) {
Sefer sefer1 = new Sefer(sefer_id, sefer_no, sefer_adi, sefer_destinasyon, sefer_ucuskodu);
System.out.println("*******************************Ucus Bilgisi*********************************************");
System.out.println("ID: " + getSeferAdi());
System.out.println("Ucus Numarasi: " + getSeferNo());
System.out.println("Ucus Adi: " + getSeferAdi());
System.out.println("Hedef: " + getSeferDestinasyon());
System.out.println("Ucus Kodu: " + getSeferUcuskodu());
System.out.println("*******************************Ucus Bilgisi*********************************************");
System.out.println("");
}
/**

Verilen Ucak objesinin klonunu olusturur.
@param ucak Ucak objesi
@return Klonlanmis Ucak objesi
*/
public Ucak ucakKlonla(Ucak ucak) {
Ucak clonedUcak = ucak.clone(); // clone the Ucak object
return clonedUcak;
}
/**

Var olan ucuslari sorgulamak icin observer tasarim deseni uygular.
*/
public void sorgulaSefer() {
	// Var olan ucuslari sorgulamak icin gozlemci tasarim deseni uygulanir.
}
/**

Var olan ucuslari guncellemek icin observer tasarim deseni uygular.
*/
public void guncelleSefer() {
	// Guncelleme islemi icin gozlemci tasarim deseni uygulanir.
}

/**

Sefer sinifinin sefer ID'sini donduren metodu.
@return Seferin ID'si.
*/
public int getSeferId() {
return sefer_id;
}
/**

Sefer sinifinin sefer ID'sini ayarlayan metodu.
@param sefer_id Seferin ID'si.
*/
public void setSeferId(int sefer_id) {
this.sefer_id = sefer_id;
}
/**

Sefer sinifinin sefer numarasini donduren metodu.
@return Seferin numarasi.
*/
public int getSeferNo() {
return sefer_no;
}
/**

Sefer sinifinin sefer numarasini ayarlayan metodu.
@param sefer_no Seferin numarasi.
*/
public void setSeferNo(int sefer_no) {
this.sefer_no = sefer_no;
}
/**

Sefer sinifinin sefer adini donduren metodu.
@return Seferin adi.
*/
public String getSeferAdi() {
return sefer_adi;
}
/**

Sefer sinifinin sefer adini ayarlayan metodu.
@param sefer_adi Seferin adi.
*/
public void setSeferAdi(String sefer_adi) {
this.sefer_adi = sefer_adi;
}
/**

Sefer sinifinin hedef destinasyonunu donduren metodu.
@return Seferin hedef destinasyonu.
*/
public String getSeferDestinasyon() {
return sefer_destinasyon;
}
/**

Sefer sinifinin hedef destinasyonunu ayarlayan metodu.
@param sefer_destinasyon Seferin hedef destinasyonu.
*/
public void setSeferDestinasyon(String sefer_destinasyon) {
this.sefer_destinasyon = sefer_destinasyon;
}
/**

Sefer sinifinin ucak kodunu donduren metodu.
@return Seferin ucak kodu.
*/
public String getSeferUcuskodu() {
return sefer_ucuskodu;
}
/**

Sefer sinifinin ucak kodunu ayarlayan metodu.
@param sefer_ucuskodu Seferin ucak kodu.
*/
public void setSeferUcuskodu(String sefer_ucuskodu) {
this.sefer_ucuskodu = sefer_ucuskodu;
}
}