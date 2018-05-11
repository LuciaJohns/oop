//származtasson kutya osztályt
public class Kutya extends Emlõs {
	
	//ha kutya tipusú objectumot hoznék létre ezeket az adatokat kérné:
 public Kutya(int labak_szama, String szorzet_van_e, double suly) {
		super(labak_szama, szorzet_van_e, suly);
		// TODO Auto-generated constructor stub
	}
	//egészítse ki:
	double marmagassag;
	String vakvezeto;

	
	//setter metódussal tudom beállítani az egyes adattagokat
	public void setMarmagassag(double marmagassag) {
		this.marmagassag = marmagassag;
	}
	public void setVakvezeto(String vakvezeto) {
		this.vakvezeto = vakvezeto;
	}
	public Kutya(int labak_szama, String szorzet_van_e, double suly, double marmagassag, String vakvezeto) {
		super(labak_szama, szorzet_van_e, suly);
		this.marmagassag = marmagassag;
		this.vakvezeto = vakvezeto;
	}
	
	
}
