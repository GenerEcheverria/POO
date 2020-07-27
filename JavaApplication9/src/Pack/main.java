
package Pack;

import java.util.Scanner;


public class main {
    public static int indice(Vehiculo coches[]){
        float precio;
        int indice = 0;
        precio = coches[0].getPrecio();
        for(int i =0;i<coches.length;i++){
            if (coches[i].getPrecio()<precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        String marca;
        String modelo;
        float precio;
        int n;
        int indiceBarato;
        System.out.print("Numero de vehiculos: ");
        n = s.nextInt();
        Vehiculo coches[] = new Vehiculo[n];
        for (int i = 0; i<coches.length; i++){
            s.nextLine();
            System.out.println("\tCOCHE "+(i+1));
            System.out.print("Marca: ");
            marca = s.nextLine();
            System.out.print("Modelo: ");
            modelo = s.nextLine();
            System.out.print("Precio: ");
            precio = Float.parseFloat(s.nextLine());
            coches[i]=new Vehiculo(marca,modelo,precio);
        }
        indiceBarato = indice(coches);
        System.out.println("\n");
        System.out.println("El coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
        
    }
}
