//sz�rmaztasson bel�le macska oszt�lyt
public class Macska extends Eml�s {
	
	//ha macska tipus� objectumot hozn�k l�tre ezeket az adatokat k�rn�:
	public Macska(int labak_szama, String szorzet_van_e, double suly) {
		super(labak_szama, szorzet_van_e, suly);
		// TODO Auto-generated constructor stub
	}
	//b�v�tse:
	String szorzet_szine;
	String jellemzo_hangok;
	
	//setter met�dussal tudom be�ll�tani az egyes adattagokat
	public void setSzorzet_szine(String szorzet_szine) {
		this.szorzet_szine = szorzet_szine;
	}
	public void setJellemzo_hangok(String jellemzo_hangok) {
		this.jellemzo_hangok = jellemzo_hangok;
	}
	public Macska(int labak_szama, String szorzet_van_e, double suly, String szorzet_szine, String jellemzo_hangok) {
		super(labak_szama, szorzet_van_e, suly);
		this.szorzet_szine = szorzet_szine;
		this.jellemzo_hangok = jellemzo_hangok;
	}
	
	
	
	
}
