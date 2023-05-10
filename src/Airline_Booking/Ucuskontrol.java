package Airline_Booking;

import java.util.ArrayList;
import java.util.List;
import Airline_Booking.Sefer;
/**

Ucak seferlerinin kontrolunu saglayan sinif.

Bu sinif, ucuslarin gerceklestirilmesi sirasinda medyator tasarim desenini kullanir.

Havalimani nesnesi, tek ornegi olusturulabilen bir siniftir ve bu sinifin ornegi,

havalimani kodunu icerir.

Bu sinif, ucuslari kontrol etmek icin havalimani kodlarini kullanir.

İstanbul Havalimani kodu "IST" ve New York Havalimani kodu "JFK" olarak ayarlanir.

@see Havalimani

@see Ucak

@see Sefer
*/
public class Ucuskontrol {

	/**
	 * Havalimani nesnesi olusturmak icin kullanilan Singleton sinifi.
	 */
private Havalimani havalimani = Havalimani.getInstance();

/**

Verilen ucak ve sefer parametrelerine gore ucuslari kontrol eder.

@param ucak Ucak nesnesi

@param sefer Sefer nesnesi
*/
public void kontrolUcus(Ucak ucak, Sefer sefer) {
// Ucuslari kontrol etmek icin medyator tasarim deseninin uygulanmasi

// Havalimani kodu burada kullanilarak ucuslarin kontrolu saglanir
String havalimaniKodu = havalimani.getirHavalimaniKodu();

// İstanbul Havalimani kodu "IST" olarak ayarlanir
Havalimani istanbulAirport = Havalimani.getInstance();
istanbulAirport.setHavalimaniKodu("IST");

// New York Havalimani kodu "JFK" olarak ayarlanir
Havalimani newYorkAirport = Havalimani.getInstance();
newYorkAirport.setHavalimaniKodu("JFK");

// Havalimani bilgisi basilacak (burada implementasyon yok)
}
}