
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
   static  ArrayList<Poligono> poligono = new ArrayList<Poligono>(); //arreglo dinamico
   static Scanner s = new Scanner(System.in);
   public static void main (String[] args) {
       
       llenarPoligono();
       
       mostrarResultados();
   }
   
   public static void llenarPoligono(){
       int opcion;
       char respuesta;
       do {
           do {
             System.out.println("Digite que poligono desea: ");
             System.out.println("1.Triangulo");
             System.out.println("2.Rectangulo");
             System.out.println("Opcion: ");
           opcion = s.nextInt();  
           }while(opcion<1 || opcion>2);
           switch (opcion){
               case 1: llenarTriangulo();
                   break;
               case 2: llenarRectangulo();
                   break;
           }
           System.out.print("Desea introducir otro poligono? (s/n)");
           respuesta = s.next().charAt(0);
           System.out.println("");
       }while(respuesta=='s'||respuesta=='S');
   }
   
   public static void llenarTriangulo (){
       double lado1, lado2, lado3;
       System.out.print("Lado 1:");
       lado1 = s.nextDouble();
       System.out.print("Lado 2:");
       lado2 = s.nextDouble();
       System.out.print("Lado 3:");
       lado3 = s.nextDouble();
       
       Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
       
       poligono.add(triangulo); //almacenar el triangulo en el arreglo de poligonos
   }
   
   public static void llenarRectangulo (){
       double lado1, lado2;
       System.out.print("Lado 1:");
       lado1 = s.nextDouble();
       System.out.print("Lado 2:");
       lado2 = s.nextDouble();
       
       Rectangulo rectangulo = new Rectangulo(lado1,lado2);
       
       poligono.add(rectangulo); //almacenar el triangulo en el arreglo de poligonos
   }
   
   public static void mostrarResultados (){
       for(Poligono poli: poligono){
           System.out.println(poli.toString());
           System.out.println("Area: "+poli.area());
           System.out.println("");
                   
       }
   }
}
