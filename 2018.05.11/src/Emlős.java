//Hozza létre az emlõs osztályt
public class Emlõs {
	//adattagok:
	int labak_szama;
	boolean szorzet_van_e;
	double suly;
	//setter metódussal tudom beállítani az egyes adattagokat
	public void setLabak_szama(int labak_szama) {
		this.labak_szama = labak_szama;
	}
	public void setSzorzet_van_e(boolean szorzet_van_e) {
		this.szorzet_van_e = szorzet_van_e;
	}
	public void setSuly(double suly) {
		this.suly = suly;
	}
	
	//ha egy emlõs tipusú objectrumot hoznék létre ezeket az adatokat kérné:
	public Emlõs(int labak_szama, boolean szorzet_van_e, double suly) {
		super();
		this.labak_szama = labak_szama;
		this.szorzet_van_e = szorzet_van_e;
		this.suly = suly;
	}
	
	
}
