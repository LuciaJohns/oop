import static java.lang.System.out; 
import java.util.Scanner; 
import java.util.Random;

class sz�mkital�l� {
	
public static void main(String args[]) { 
	Scanner billenty�zet = new Scanner(System.in);

	out.println("�rj be egy eg�szet 1 �s 10 k�z�tt: ");
	int bek�rtSz�m = billenty�zet.nextInt();
	int v�letlenSz�m = new Random().nextInt(10) + 1;
	if (bek�rtSz�m == v�letlenSz�m){ 
		out.println ("**********");
		out.println("*Nyert�l.*");
		out.println ("**********");
		}
	else {
		out.println("Vesztett�l.");
		out.println("A v�letlen sz�m ez volt: "); 
		out.println (v�letlenSz�m);
		out.println("K�sz�n�m a j�t�kot.");
		}  
	
	billenty�zet.close();
	
	}
}