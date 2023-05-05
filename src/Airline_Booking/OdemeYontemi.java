package Airline_Booking;


/**

Bu sınıf, ödeme yöntemlerinin temel özelliklerini içerir.
Ödeme yöntemi adını saklar.
*/

public abstract class  OdemeYontemi {
	protected String OdemeYontemi;
	/**

	Ödeme yöntemi bilgisini almak için kullanılır.
	@return ödeme yöntemi adı
	*/

    public void OdemeYontemi_al() {
    	// ödeme yöntemi alınır
    }
    /**

    Ödeme yöntemini göndermek için kullanılır.
    */

    public void OdemeYontemi_gonder() {
    	// ödeme yöntemi gönderilir
    }
}


