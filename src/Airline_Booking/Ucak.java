package Airline_Booking;

//Ucak Class
public class Ucak  {
    private int ucak_id;
    private String ucak_kuyrukkod;
    private String ucak_marka;
    private String ucak_model;
    private String ucak_govdetipi;
    private int ucak_koltuksayisi;

    public Ucak() {
        // Constructor implementation
    }

    public Ucak(int ucak_id, String ucak_kuyrukkod, String ucak_marka, String ucak_model, String ucak_govdetipi, int ucak_koltuksayisi) {
        this.ucak_id = ucak_id;
        this.ucak_kuyrukkod = ucak_kuyrukkod;
        this.ucak_marka = ucak_marka;
        this.ucak_model = ucak_model;
        this.ucak_govdetipi = ucak_govdetipi;
        this.ucak_koltuksayisi = ucak_koltuksayisi;
    }
    
    @Override
    public Ucak clone() {
        return new Ucak(this.ucak_id, this.ucak_kuyrukkod, this.ucak_marka, this.ucak_model, this.ucak_govdetipi, this.ucak_koltuksayisi);
    }

    public Object getUcak_kuyrukkod() {
        return ucak_kuyrukkod;
    }
	
	public void setUcak_id(int ucak_id) {
	    this.ucak_id = ucak_id;
	}

	public void setUcak_kuyrukkod(String ucak_kuyrukkod) {
	    this.ucak_kuyrukkod = ucak_kuyrukkod;
	}

	public void setUcak_marka(String ucak_marka) {
	    this.ucak_marka = ucak_marka;
	}

	public void setUcak_model(String ucak_model) {
	    this.ucak_model = ucak_model;
	}

	public void setUcak_govdetipi(String ucak_govdetipi) {
	    this.ucak_govdetipi = ucak_govdetipi;
	}

	public void setUcak_koltuksayisi(int ucak_koltuksayisi) {
	    this.ucak_koltuksayisi = ucak_koltuksayisi;
	}
	
		
	public int getUcak_id() {
	    return ucak_id;
	}

	

	public String getUcak_marka() {
	    return ucak_marka;
	}

	public String getUcak_model() {
	    return ucak_model;
	}

	public String getUcak_govdetipi() {
	    return ucak_govdetipi;
	}

	public int getUcak_koltuksayisi() {
	    return ucak_koltuksayisi;
	}
	
}