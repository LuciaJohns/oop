import java.util.Scanner;



//létrehozza a kutya és macska egyedeket tároló vektorokat
//mit ért vektor alatt? vektor = tömb??
public class Futtatható {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//létre hozok egy macska tipusú objectumot:
		
		Scanner scanner = new Scanner(System.in); //beolvasás
		
		//System.out.println("Adja meg az állatok számát:");
		
		
		int meret = 2;
		
		Macska macskatomb[] = new Macska[meret];
		
		
		
//bekérem felhasználótól az 5 macska adatát:
		for (int i = 0; i < macskatomb.length; i++) {
			System.out.println("Adja meg a "+  (i + 1) + ".macskát");
			System.out.println("Adja meg a lábak számát");
			int labak_szama = Integer.parseInt(scanner.nextLine());
			System.out.println("van e szöre?");
			String szorzet_van_e = scanner.nextLine();
			System.out.println("Adja meg a súlyt");
			double suly = Integer.parseInt(scanner.nextLine());
			System.out.println("adja meg a szörzet színét");
			String szorzet_szine =  scanner.nextLine();
			System.out.println("adja meg a jallamzõ hangot");
			String jellemzo_hangok = scanner.nextLine();
			macskatomb[i] = new Macska(labak_szama, szorzet_van_e, suly, szorzet_szine, jellemzo_hangok);
		
	}
		/*//kiiratom a macskák adatait:
		for(Macska x : macskatomb) {
			System.out.println(x);
			}*/
		
		//most jönnek a kutyák:
		Kutya kutyatomb[] = new Kutya[meret];
		
		//bekérem felhasználótól az 5 macska adatát:
				for (int i = 0; i < kutyatomb.length; i++) {
					System.out.println("Adja meg a "+  (i + 1) + ".kutyát");
					System.out.println("Adja meg a lábak számát");
					int labak_szama = Integer.parseInt(scanner.nextLine());
					System.out.println("van e szöre?");
					String szorzet_van_e = scanner.nextLine();
					System.out.println("Adja meg a súlyt");
					double suly = Integer.parseInt(scanner.nextLine());
					System.out.println("Adja meg a marmagasságot");
					double marmagassag =  Integer.parseInt(scanner.nextLine());
					System.out.println("Adja meg hogy vakvezetõ-e");
					String vakvezeto = scanner.nextLine();
					kutyatomb[i] = new Kutya(labak_szama, szorzet_van_e, suly,  marmagassag, vakvezeto);
				
			}
				/*//kiiratom a macskák adatait
				for(Kutya y : kutyatomb) {
					System.out.println(y);
					}
					*/
				
				//fekete szín macskák kiválogatása???
				
				//vakvezetésre alkalmas kutyák súlya???
				
				
		

}
}