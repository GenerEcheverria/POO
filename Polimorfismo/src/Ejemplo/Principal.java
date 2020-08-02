
package Ejemplo;


public class Principal {
    public static void main (String[] args){
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo ("GH67","Ferrar", "A89");
        //polimorfismo
        misVehiculos[1] = new VehiculoTurismo(4,"78HJ","Audi","P14");
        misVehiculos[2] = new VehiculoDeportivo(500,"55GH","Toyota","KJ8");
        misVehiculos[3] = new VehiculoFurgoneta(2000, "J18", "Toyota","J9");
        
        for(Vehiculo vehiculo:misVehiculos){
            System.out.println(vehiculo.mostrarDatos());
            System.out.println("");
        }
    }
}
