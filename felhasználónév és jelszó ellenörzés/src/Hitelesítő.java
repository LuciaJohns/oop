import javax.swing.JOptionPane; 

class Hiteles�t� {
	

public static void main(String args[]) {
	
	String felhaszn�l�n�v =
			JOptionPane.showInputDialog("Felhaszn�l�n�v: "); 
	String jelsz� =
			JOptionPane.showInputDialog("Jelsz�: ");
	if ( felhaszn�l�n�v != null &&
			jelsz� != null &&
			( 
					(felhaszn�l�n�v.equals("f�li") && 
							jelsz�.equals("kardhal")) ||
					(felhaszn�l�n�v.equals ("laci") && 
							jelsz�.equals("pajzs"))
			) 
	)
	{ 
		JOptionPane.showMessageDialog (null, "Bent vagy.");
	}
else { 
		JOptionPane.showMessageDialog (null, "Gyan�s vagy.");
		} 
	}
}

