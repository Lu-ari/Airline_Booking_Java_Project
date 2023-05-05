package Airline_Booking;

import java.util.ArrayList;
import java.util.List;
import Airline_Booking.Sefer;
/**

Uçak seferlerinin kontrolünü sağlayan sınıf.

Bu sınıf, uçuşların gerçekleştirilmesi sırasında medyatör tasarım desenini kullanır.

Havalimanı nesnesi, tek örneği oluşturulabilen bir sınıftır ve bu sınıfın örneği,

havalimanı kodunu içerir.

Bu sınıf, uçuşları kontrol etmek için havalimanı kodlarını kullanır.

İstanbul Havalimanı kodu "IST" ve New York Havalimanı kodu "JFK" olarak ayarlanır.

@see Havalimani

@see Ucak

@see Sefer
*/
public class Ucuskontrol {

	/**
	 * Havalimanı nesnesi oluşturmak için kullanılan Singleton sınıfı.
	 */
private Havalimani havalimani = Havalimani.getInstance();

/**

Verilen uçak ve sefer parametrelerine göre uçuşları kontrol eder.

@param ucak Uçak nesnesi

@param sefer Sefer nesnesi
*/
public void kontrolUcus(Ucak ucak, Sefer sefer) {
// Uçuşları kontrol etmek için medyatör tasarım deseninin uygulanması

// Havalimani kodu burada kullanılarak uçuşların kontrolü sağlanır
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