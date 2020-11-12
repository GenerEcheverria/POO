/*
    Gener Alejandro Echeverria Chi
 */
package Vista;

import Modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        int opcion = 0;
        int figura = 0;
        do {
            System.out.println("Elige la figura que deseas: \n\t1. Trapecio\n\t2. Cuadrado\n\t3. Rectangulo\n\t4. Romboide");
            figura = Integer.parseInt(scanner.nextLine());
            Punto punto[] = new Punto[4];
            Cuadrilatero cuadrilatero;
            do {
                char letra = 'A';
                System.out.println("Escribe los puntos en sentido horario");
                for (int i=0;i<=3;i++){
                    System.out.print("Escribe la X del punto " + (letra) + ": ");
                    float x = Float.parseFloat(scanner.nextLine());
                    System.out.print("Escribe la Y del punto " + (letra)+ ": ");
                    float y = Float.parseFloat(scanner.nextLine());
                    punto[i]= new Punto(x,y);
                    letra++;
                }
                cuadrilatero = new Cuadrilatero(punto[0],punto[1],punto[2],punto[3]);
            }while (!cuadrilatero.validarPuntos());
            switch (figura){
                case 1:
                    Trapecio trapecio = new Trapecio(punto[0], punto[1],punto[2],punto[3]);//trapecio
                    System.out.println(trapecio.toString());
                    lista.add(trapecio);
                    break;
                case 2:
                    Cuadrado cuadrado = new Cuadrado(punto[0], punto[1],punto[2],punto[3]);
                    System.out.println(cuadrado.toString());
                    lista.add(cuadrado);
                    break;
                case 3:
                    Rectangulo rectangulo = new Rectangulo(punto[0], punto[1],punto[2],punto[3]);
                    System.out.println(rectangulo.toString());
                    lista.add(rectangulo);
                    break;
                case 4:
                    Romboide romboide = new Romboide(punto[0], punto[1],punto[2],punto[3]);
                    System.out.println(romboide.toString());
                    lista.add(romboide);
                    break;
                default:
                    System.out.println("OPCION INVALIDA!!!!!");
            }

            System.out.println("Escribe 1 si quieres otra figura, 0 para salir");
            opcion=Integer.parseInt(scanner.nextLine());
        }while (opcion==1);
        System.out.println("\n\t\t\t\t\t----AREAS----");
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).toString());
        }
    }
    
}
