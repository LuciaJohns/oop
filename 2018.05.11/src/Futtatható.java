import java.util.Scanner;



//l�trehozza a kutya �s macska egyedeket t�rol� vektorokat
//mit �rt vektor alatt? vektor = t�mb??
public class Futtathat� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//l�tre hozok egy macska tipus� objectumot:
		
		Scanner scanner = new Scanner(System.in); //beolvas�s
		
		//System.out.println("Adja meg az �llatok sz�m�t:");
		
		
		int meret = 2;
		
		Macska macskatomb[] = new Macska[meret];
		
		
		
//bek�rem felhaszn�l�t�l az 5 macska adat�t:
		for (int i = 0; i < macskatomb.length; i++) {
			System.out.println("Adja meg a "+  (i + 1) + ".macsk�t");
			System.out.println("Adja meg a l�bak sz�m�t");
			int labak_szama = Integer.parseInt(scanner.nextLine());
			System.out.println("van e sz�re?");
			String szorzet_van_e = scanner.nextLine();
			System.out.println("Adja meg a s�lyt");
			double suly = Integer.parseInt(scanner.nextLine());
			System.out.println("adja meg a sz�rzet sz�n�t");
			String szorzet_szine =  scanner.nextLine();
			System.out.println("adja meg a jallamz� hangot");
			String jellemzo_hangok = scanner.nextLine();
			macskatomb[i] = new Macska(labak_szama, szorzet_van_e, suly, szorzet_szine, jellemzo_hangok);
		
	}
		/*//kiiratom a macsk�k adatait:
		for(Macska x : macskatomb) {
			System.out.println(x);
			}*/
		
		//most j�nnek a kuty�k:
		Kutya kutyatomb[] = new Kutya[meret];
		
		//bek�rem felhaszn�l�t�l az 5 macska adat�t:
				for (int i = 0; i < kutyatomb.length; i++) {
					System.out.println("Adja meg a "+  (i + 1) + ".kuty�t");
					System.out.println("Adja meg a l�bak sz�m�t");
					int labak_szama = Integer.parseInt(scanner.nextLine());
					System.out.println("van e sz�re?");
					String szorzet_van_e = scanner.nextLine();
					System.out.println("Adja meg a s�lyt");
					double suly = Integer.parseInt(scanner.nextLine());
					System.out.println("Adja meg a marmagass�got");
					double marmagassag =  Integer.parseInt(scanner.nextLine());
					System.out.println("Adja meg hogy vakvezet�-e");
					String vakvezeto = scanner.nextLine();
					kutyatomb[i] = new Kutya(labak_szama, szorzet_van_e, suly,  marmagassag, vakvezeto);
				
			}
				/*//kiiratom a macsk�k adatait
				for(Kutya y : kutyatomb) {
					System.out.println(y);
					}
					*/
				
				//fekete sz�n macsk�k kiv�logat�sa???
				
				//vakvezet�sre alkalmas kuty�k s�lya???
				
				
		

}
}