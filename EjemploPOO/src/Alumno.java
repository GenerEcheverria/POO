public class Alumno {
    private String nombre;
    private int conocimiento = 0;
    
    public String getNombre(){
        return this.nombre; 
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getConocimiento(){
        return this.conocimiento;
    }
    public void estudiar (){
        this.conocimiento++;
    }
}
