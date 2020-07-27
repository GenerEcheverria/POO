 
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita otro numero"));
    }
    public void sumar (){
        suma = numero1+numero2;
    }
    public void resta(){
        resta = numero1-numero2;
    }
    public void multiplicar (){
        multiplicacion = numero1*numero2;
    }
    public void dividir (){
        division = numero1/numero2;
    }
    public void mostrar (){
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La division es " +division);
        System.out.println("La multiplicacion es "+ multiplicacion);
    }
}
