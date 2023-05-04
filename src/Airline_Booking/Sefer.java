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
	 // Clone the prototype to create a new airplane object
   
	Sefer sefer = new Sefer();
    sefer.setSeferId(456);
    sefer.setSeferNo(789);
    sefer.setSeferAdi("Istanbul - Paris");
    sefer.setSeferDestinasyon("Paris");
    sefer.setSeferUcuskodu("TK123");
 // Constructor implementation
	
 	Ucak ucak1 = new Ucak();
 	ucak1.setUcak_id(1);
 	ucak1.setUcak_kuyrukkod("TK123");
 	ucak1.setUcak_marka("Boeing");
 	ucak1.setUcak_model("737");
 	ucak1.setUcak_govdetipi("Dar gövde");
 	ucak1.setUcak_koltuksayisi(200);

 	// Clone the ucak1 object
 	Ucak ucak2 = ucak1.clone();
    
    System.out.println("Flight Information:");
    System.out.println("ID: " + sefer.getSeferAdi());
    System.out.println("Flight Number: " + sefer.getSeferNo());
    System.out.println("Flight Name: " + sefer.getSeferAdi());
    System.out.println("Destination: " + sefer.getSeferDestinasyon());
    System.out.println("Airplane Code: " + sefer.getSeferUcuskodu());
    
   
  
    if (ucak2 != null) {
        System.out.println("Airplane Model: " + ucak2.getUcak_model());
        System.out.println("Airplane Seat Count: " + ucak2.getUcak_koltuksayisi());
    } else {
        System.out.println("No airplane information available.");
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