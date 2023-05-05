package Airline_Booking;

/**

Sefer sınıfı, havayolu şirketinin uçuşlarına ilişkin bilgileri tutar ve bu bilgileri yönetir.
*/
public class Sefer {
private int sefer_id;
private int sefer_no;
private String sefer_adi;
private String sefer_destinasyon;
private String sefer_ucuskodu;

/**

Boş kurucu method.
*/
public Sefer() {
}
/**

Sefer bilgilerini tutan objeyi oluşturur.
@param sefer_id Seferin ID'si
@param sefer_no Sefer numarası
@param sefer_adi Sefer adı
@param sefer_destinasyon Seferin hedef destinasyonu
@param sefer_ucuskodu Uçağın kodu
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
System.out.println("*******************************Uçuş Bilgisi*********************************************");
System.out.println("ID: " + getSeferAdi());
System.out.println("Uçuş Numarası: " + getSeferNo());
System.out.println("Uçuş Adı: " + getSeferAdi());
System.out.println("Hedef: " + getSeferDestinasyon());
System.out.println("Uçak Kodu: " + getSeferUcuskodu());
System.out.println("*******************************Uçuş Bilgisi*********************************************");
System.out.println("");
}
/**

Verilen Ucak objesinin klonunu oluşturur.
@param ucak Uçak objesi
@return Klonlanmış Ucak objesi
*/
public Ucak ucakKlonla(Ucak ucak) {
Ucak clonedUcak = ucak.clone(); // clone the Ucak object
return clonedUcak;
}
/**

Var olan uçuşları sorgulamak için observer tasarım deseni uygular.
*/
public void sorgulaSefer() {
	// Var olan uçuşları sorgulamak için gözlemci tasarım deseni uygulanır.
}
/**

Var olan uçuşları güncellemek için observer tasarım deseni uygular.
*/
public void guncelleSefer() {
	// Güncelleme işlemi için gözlemci tasarım deseni uygulanır.
}

/**

Sefer sınıfının sefer ID'sini döndüren metodu.
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

Sefer sınıfının sefer numarasını döndüren metodu.
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

Sefer sınıfının sefer adını döndüren metodu.
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

Sefer sınıfının hedef destinasyonunu döndüren metodu.
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

Sefer sınıfının uçak kodunu döndüren metodu.
@return Seferin uçak kodu.
*/
public String getSeferUcuskodu() {
return sefer_ucuskodu;
}
/**

Sefer sınıfının uçak kodunu ayarlayan metodu.
@param sefer_ucuskodu Seferin uçak kodu.
*/
public void setSeferUcuskodu(String sefer_ucuskodu) {
this.sefer_ucuskodu = sefer_ucuskodu;
}
}