package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	int numero,random = 0 , intentos =0;
	int band =1;
	


	 do {	
		 
		 numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero "));

		 	
		 	if (numero > 0) {
		    random += numero;
		    intentos ++;
		 	}
		 	
		 	if (numero < 0) {
				band = 0;
			}
		 	
				
				
		} while (band != 0);
		
		
		JOptionPane.showMessageDialog(null, "El promedio es " + random/intentos);
	}
}
