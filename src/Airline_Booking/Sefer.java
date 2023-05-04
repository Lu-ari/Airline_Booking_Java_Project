package Airline_Booking;

//Sefer Class
public class Sefer {
private int sefer_id;
private int sefer_no;
private String sefer_adi;
private String sefer_destinasyon;
private String sefer_ucuskodu;

public Sefer() {
   

}


public Sefer(int sefer_id, int sefer_no, String sefer_adi,String sefer_destinasyon, String sefer_ucuskodu) {
    this.sefer_id = sefer_id;
    this.sefer_no = sefer_no;
    this.sefer_adi = sefer_adi;
    this.sefer_destinasyon = sefer_destinasyon;
    this.sefer_ucuskodu = sefer_ucuskodu;
}


public void seferYazdir(Sefer sefer) {
	Sefer sefer1 = new Sefer (sefer_id,sefer_no,sefer_adi,sefer_destinasyon,sefer_ucuskodu);
	System.out.println("*****************************Uçuş Bilgisi************************");
    System.out.println("ID: " + getSeferAdi());
    System.out.println("Uçuş Numarası: " + getSeferNo());
    System.out.println("Uçuş Adı: " + getSeferAdi());
    System.out.println("Hedef: " + getSeferDestinasyon());
    System.out.println("Uçak Kodu: " + getSeferUcuskodu());
    System.out.println("*****************************Uçuş Bilgisi************************");
    System.out.println("");
   
    }

public Ucak ucakKlonla(Ucak ucak) {
    Ucak clonedUcak = ucak.clone(); // clone the Ucak object
    return clonedUcak;
}

public void sorgulaSefer() {
   // Implementation of observer design pattern for querying existing flights
}

public void guncelleSefer() {
   // Implementation of observer design pattern for updating existing flights

}



public int getSeferId() {
    return sefer_id;
}

public void setSeferId(int sefer_id) {
    this.sefer_id = sefer_id;
}

public int getSeferNo() {
    return sefer_no;
}

public void setSeferNo(int sefer_no) {
    this.sefer_no = sefer_no;
}

public String getSeferAdi() {
    return sefer_adi;
}

public void setSeferAdi(String sefer_adi) {
    this.sefer_adi = sefer_adi;
}

public String getSeferDestinasyon() {
    return sefer_destinasyon;
}

public void setSeferDestinasyon(String sefer_destinasyon) {
    this.sefer_destinasyon = sefer_destinasyon;
}

public String getSeferUcuskodu() {
    return sefer_ucuskodu;
}

public void setSeferUcuskodu(String sefer_ucuskodu) {
    this.sefer_ucuskodu = sefer_ucuskodu;
}
}