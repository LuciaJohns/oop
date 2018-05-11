import java.util.Scanner;



//létrehozza a kutya és macska egyedeket tároló vektorokat
//mit ért vektor alatt? vektor = tömb??
public class Futtatható {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//létre hozok egy macska tipusú objectumot:
		Scanner scanner = new Scanner(System.in); //beolvasás
		System.out.println("Adja meg az állatok számát:");
		int meret = scanner.nextInt(); //bekérem a mértete felhasználótól:
		
		Macska macskatomb[] = new Macska[meret];
		
		
		
//bekérem felhasználótól az 5 macska adatát:
		for (int i = 0; i < macskatomb.length; i++) {
			System.out.println("Adja meg a "+  (i + 1) + ".macskát");
			int labak_szama = Integer.parseInt(scanner.nextLine());
			boolean szorzet_van_e = Integer.parse(scanner.nextLine());//nemtudom hogy kell booleant bekérni
			double suly = Integer.parseInt(scanner.nextLine());
			String szorzet_szine =  scanner.nextLine();
			String jellemzo_hangok = scanner.nextLine();
			macskatomb[i] = new Macska(labak_szama, szorzet_van_e, suly, szorzet_szine, jellemzo_hangok);
		
	}
		//kiiratom a macskák adatait
		for(Macska x : macskatomb) {
			System.out.println(x);
			}
		
		//most jönnek a kutyák:
		Kutya kutyatomb[] = new Kutya[meret];
		
		//bekérem felhasználótól az 5 macska adatát:
				for (int i = 0; i < kutyatomb.length; i++) {
					System.out.println("Adja meg a "+  (i + 1) + ".kutyát");
					int labak_szama = Integer.parseInt(scanner.nextLine());
					boolean szorzet_van_e = Integer.parseInt(scanner.nextLine());//nemtudom hogy kell booleant bekérni
					double suly = Integer.parseInt(scanner.nextLine());
					String szorzet_szine =  scanner.nextLine();
					String jellemzo_hangok = scanner.nextLine();
					double marmagassag =  Integer.parseInt(scanner.nextLine());
					boolean vakvezeto = Integer.parseInt(scanner.nextLine());
					kutyatomb[i] = new Kutya(labak_szama, szorzet_van_e, suly,  marmagassag, vakvezeto);
				
			}
				//kiiratom a macskák adatait
				for(Kutya y : kutyatomb) {
					System.out.println(y);
					}
				
				//fekete szín macskák kiválogatása???
				
				//vakvezetésre alkalmas kutyák súlya???
				
				
		

}
}