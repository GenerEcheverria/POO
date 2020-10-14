
package pack;


public class main {

   
    public static void main(String[] args) {
        Revista revista1 = new Revista();
        revista1.setNombre("Random");
        revista1.setISSN(923134512);
        revista1.setAnio(2000);
        revista1.setEditorial("Nombre generico");
        System.out.println(revista1.imprimir());
    }
    
}
