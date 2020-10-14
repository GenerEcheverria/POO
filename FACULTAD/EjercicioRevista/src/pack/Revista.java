
package pack;

public class Revista {
    private String nombre;
    private int ISSN;
    private int anio;
    private String editorial;
    
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public void setISSN (int ISSN){
        this.ISSN=ISSN;
    }
    public void setAnio (int anio){
        this.anio=anio;
    }
    public void setEditorial (String editorial){
        this.editorial=editorial;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getISSN(){
        return ISSN;
    }
    public int getAnio(){
        return anio;
    }
    public String getEditorial(){
        return editorial;
    }
    
    public String imprimir(){
        return "Nombre: "+getNombre()+"\n"+"ISSN:"+getISSN()+"\n"+"Anio:"+getAnio()+"\n"+"Editorial"+getEditorial();
    }

    @Override
    public String toString() {
        return "Revista{" + "nombre=" + getNombre() + ", ISSN=" + getISSN() + ", anio=" + getAnio() + ", editorial=" + getEditorial() + '}';
    }
    
    
}
