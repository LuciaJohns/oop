import java.util.Scanner;

/**
 * 
 */

/**
 * @author janosi3
 * bek�rni 3 sz�mot
 * a gy�k alatt nem lehet negat�v sz�m
 * b-4ac a gy�k alatt = D
 * d= diszkrimin�ns
 * me= els� megold�s
 * mk=m�sodik megold�s
 * m=megold�s ha csak egy van
 *2018.02.28
 *
 */
public class m�sodfok� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner bemenet = new Scanner(System.in);
		
		System.out.println("Kerem adja meg az elso sz�mot:");
		System.out.print("a:");
		double a = bemenet.nextDouble();
		
		System.out.println("Kerem adja meg az m�sodik sz�mot:");
		System.out.print("b:");
		double b = bemenet.nextDouble();
		
		System.out.println("Kerem adja meg az harmadk sz�mot:");
		System.out.print("c:");
		double c = bemenet.nextDouble();
		

		double d = b*b-4.0*a*c; //d = diszkrimin�ns
		Math.sqrt(d);
		
		if(d<0){
			System.out.println("Nincs megold�s");
		}
		
		else if(d==0){
			double m = (-b)/(2.0*a);
			System.out.println("Az egyetlen megold�s:  "+m); //m= megold�s
		}
		
		else if(d>0){
			double me = (-b+d)/(2.0*a);
			double mk = (-b-d)/(2.0*a);
			System.out.println("A k�t megold�s:"+me + " " +mk); //me= els� megold�s, mk= m�sodik megold�s
		}
		
		bemenet.close();
	}

}
