package Airline_Booking;

import java.util.ArrayList;
import java.util.List;
import Airline_Booking.Sefer;
/**

Ucak seferlerinin kontrolunu saglayan sınıf.

Bu sınıf, ucusların gerceklestirilmesi sırasında medyator tasarım desenini kullanır.

Havalimanı nesnesi, tek ornegi olusturulabilen bir sınıftır ve bu sınıfın ornegi,

havalimanı kodunu icerir.

Bu sınıf, ucusları kontrol etmek icin havalimanı kodlarını kullanır.

İstanbul Havalimanı kodu "IST" ve New York Havalimanı kodu "JFK" olarak ayarlanır.

@see Havalimani

@see Ucak

@see Sefer
*/
public class Ucuskontrol {

	/**
	 * Havalimanı nesnesi olusturmak icin kullanılan Singleton sınıfı.
	 */
private Havalimani havalimani = Havalimani.getInstance();

/**

Verilen ucak ve sefer parametrelerine gore ucusları kontrol eder.

@param ucak Ucak nesnesi

@param sefer Sefer nesnesi
*/
public void kontrolUcus(Ucak ucak, Sefer sefer) {
// Ucusları kontrol etmek icin medyator tasarım deseninin uygulanması

// Havalimani kodu burada kullanılarak ucusların kontrolu saglanır
String havalimaniKodu = havalimani.getirHavalimaniKodu();

// İstanbul Havalimanı kodu "IST" olarak ayarlanır
Havalimani istanbulAirport = Havalimani.getInstance();
istanbulAirport.setHavalimaniKodu("IST");

// New York Havalimanı kodu "JFK" olarak ayarlanır
Havalimani newYorkAirport = Havalimani.getInstance();
newYorkAirport.setHavalimaniKodu("JFK");

// Havalimanı bilgisi basılacak (burada implementasyon yok)
}
}