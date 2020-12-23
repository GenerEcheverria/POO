
package Modelo;

import java.util.Arrays;
import java.util.List;

public class EsNumero {
    public boolean isNumeric(String cadena, int k){

	try {
		if (cadena.charAt(0)>47 && cadena.charAt(0)<58){
			for (int i= 1 ; i<cadena.length(); i++){
				if (!(cadena.charAt(i)>47 && cadena.charAt(i)<58)){
					System.out.println("Error en la linea " + k  + ": "+ cadena+" no es un  número válido");
					System.exit(0);
				}
			}
		}

		if (cadena.contains("9")||cadena.contains("8")){
			System.out.println("Error en la linea " + k  + ": No es un número octal");
			System.exit(0);
			return false;
		}else {
			Integer.parseInt(cadena);
			return true;
		}

	}
	catch (NumberFormatException nfe){
		return false;
	}
	catch (StringIndexOutOfBoundsException e1){

	}
		return false;
    }
}
