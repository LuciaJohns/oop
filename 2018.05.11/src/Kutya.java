//sz�rmaztasson kutya oszt�lyt
public class Kutya extends Eml�s {
	
	//ha kutya tipus� objectumot hozn�k l�tre ezeket az adatokat k�rn�:
 public Kutya(int labak_szama, String szorzet_van_e, double suly) {
		super(labak_szama, szorzet_van_e, suly);
		// TODO Auto-generated constructor stub
	}
	//eg�sz�tse ki:
	double marmagassag;
	String vakvezeto;

	
	//setter met�dussal tudom be�ll�tani az egyes adattagokat
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
