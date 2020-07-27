
package ClasesYObjetos;

public class Persona {
    String nombre;
    int edad;
    String dni;
    
    //metodo constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrar (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public Persona(String dni) {
        this.dni = dni;
    }
     
    public void correr(){
        System.out.println("Soy " + nombre + ", tengo " + edad+" y corro una maraton");
    }
    
    public void correr (int km){
        System.out.println("He corrido "+ km+ " km");
    }
    
}
