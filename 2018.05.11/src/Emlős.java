//Hozza l�tre az eml�s oszt�lyt
public class Eml�s {
	//adattagok:
	int labak_szama;
	boolean szorzet_van_e;
	double suly;
	//setter met�dussal tudom be�ll�tani az egyes adattagokat
	public void setLabak_szama(int labak_szama) {
		this.labak_szama = labak_szama;
	}
	public void setSzorzet_van_e(boolean szorzet_van_e) {
		this.szorzet_van_e = szorzet_van_e;
	}
	public void setSuly(double suly) {
		this.suly = suly;
	}
	
	//ha egy eml�s tipus� objectrumot hozn�k l�tre ezeket az adatokat k�rn�:
	public Eml�s(int labak_szama, boolean szorzet_van_e, double suly) {
		super();
		this.labak_szama = labak_szama;
		this.szorzet_van_e = szorzet_van_e;
		this.suly = suly;
	}
	
	
}
