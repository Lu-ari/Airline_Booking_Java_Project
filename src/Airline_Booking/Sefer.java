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

public void olusturSefer( Ucak ucak) {
	
   
	Sefer sefer = new Sefer();
    sefer.setSeferId(456);
    sefer.setSeferNo(789);
    sefer.setSeferAdi("Istanbul - Paris");
    sefer.setSeferDestinasyon("Paris");
    sefer.setSeferUcuskodu("TK123");
 // Yapılandırıcı implemantasyonu
	
 	Ucak ucak1 = new Ucak();
 	ucak1.setUcak_id(1);
 	ucak1.setUcak_kuyrukkod("TK123");
 	ucak1.setUcak_marka("Boeing");
 	ucak1.setUcak_model("737");
 	ucak1.setUcak_govdetipi("Dar gövde");
 	ucak1.setUcak_koltuksayisi(200);

 	// ucak1 objesini klonla
 	Ucak ucak2 = ucak1.clone();
 	ucak2.setUcak_id(2);
 	ucak2.setUcak_koltuksayisi(183);
 	
 	System.out.println("*****************************Klonlanan Uçak Bilgisi************************");
 	System.out.println("Uçak ID'si: " + ucak2.getUcak_id());
 	System.out.println("Uçuş Numarası: " + ucak2.getUcak_kuyrukkod());
 	System.out.println("Uçak Adı: " + ucak2.getUcak_marka());
 	System.out.println("Hedef: " + ucak2.getUcak_model());
 	System.out.println("Uçak Kodu: " + ucak2.getUcak_koltuksayisi());
     System.out.println("*****************************Klonlanan Uçak Bilgisi************************");
     System.out.println("");
     
 	if (ucak2 != null) {//Klonlanmış uçakla seyahet bilgisi basılmıştır.
    	 
    System.out.println("*****************************Flight Information:************************");
    System.out.println("ID: " + sefer.getSeferAdi());
    System.out.println("Uçuş Numarası: " + sefer.getSeferNo());
    System.out.println("Uçuş Adı: " + sefer.getSeferAdi());
    System.out.println("Hedef: " + sefer.getSeferDestinasyon());
    System.out.println("Uçak Kodu: " + sefer.getSeferUcuskodu());
    System.out.println("*****************************Flight Information:************************");
    System.out.println("");
   
  
    
        
    } else {
        System.out.println("Uçak bilgisi bulunanamaştır");//Observer class gereği Eğer uçak yoksa bilet basılamamaktadır. 
    }
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