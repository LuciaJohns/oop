import static java.lang.System.out; 

class �tv�lt�s{

public static void main(String args[]) {
	int teljes = 248; 
	int �tvenes = teljes / 50;
	int amiMaradt = teljes % 50; 
	int t�zes = amiMaradt / 10; 
	amiMaradt = amiMaradt % 10;
	int �t�s = amiMaradt / 5; 
	amiMaradt = amiMaradt % 5; 
	int egyes = amiMaradt;

	out.println("Ami a " + teljes + " forintodb�l lett"); 
	out.println(�tvenes + " �tvenes");
	out.println(t�zes + " t�zes");
	out.println(�t�s + " �t�s"); 
	out.println(egyes + " egyes"); 
	}
}
