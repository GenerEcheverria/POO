
import java.util.Scanner;


public class main {

    public static Scanner s= new Scanner (System.in);
    public static void main(String[] args) {
       String modelo = "", nombreMecanico = "";
       int nivelMecanico = 0, opcion = 0, tipoViaje = 0;
        System.out.println("Ingresa el modelo del avion");
        modelo = s.nextLine();
        Avion a = new Avion();
        a.setModelo(modelo);
        System.out.println("Ingresa el nombre del mecanico");
        nombreMecanico=s.nextLine();
        do {
            System.out.println("Ingrese el nivel del mecanico (1 o 2)");
            nivelMecanico = Integer.parseInt(s.nextLine());
        }while (nivelMecanico!=1 && nivelMecanico!=2);
        Mecanico m = new Mecanico();
        m.setNombre(nombreMecanico);
        m.setNivel(nivelMecanico);
        a.setMecanico(m);
        System.out.println("Avion y su mecanico creados");
        System.out.println("MENU");
        do {
            System.out.println("1. Realizar vuelo \n2. Cargar combustible\n3. Realizar mantencion \n4. Ver cantidad de vuelos \n5. Ver cantidad de mantenciones \n6. Ver kilometraje \n7. Ver nivel de combustible\n8. Salir");
            opcion = Integer.parseInt(s.nextLine());
            switch(opcion){
                case 1: do {
                    System.out.println("Tipo de viaje: 1.Nacional / 2.Internacional ");
                    tipoViaje = Integer.parseInt(s.nextLine());
                    a.realizarVuelo(tipoViaje);
                    break;
               
                }while (tipoViaje < 1  || tipoViaje>2);
                case 2: a.actualizarCombustible(m.cargarCombustible());
                    break;
                case 3: a.realizarMantencion(m.realizarMantencion());
                    break;
                case 4: System.out.println("La cantidad de vuelos es " + a.getCantidadVuelos());
                    break;
                case 5: System.out.println("La cantidad de mantenciones es " + a.getCantidadMantenciones());
                    break;
                case 6: System.out.println("El kilometraje actual es " + a.getKilometraje() + "km");
                    break;
                case 7: System.out.println("El nivel de combustible es de" + a.getCombustible());
                    break;
            }
        }while(opcion!=8);
        System.out.println("FIN");
    }
    
}
