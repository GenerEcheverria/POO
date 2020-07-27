
public class Avion {
    private String modelo;
    private int combustible = 100;
    private int kilometraje;
    private int cantidadVuelos;
    private int cantidadMantenciones;
    private boolean mantencion = true;
    private Mecanico mecanico;
    
    public void realizarMantencion (int realizacion){
        if (realizacion == 1){
            this.mantencion = true;
            System.out.println("El mecanico "+this.mecanico.getNombre()+" pudo realizar la manutencion");
            this.cantidadMantenciones++;
        }else {
            System.out.println("El mecanico "+this.mecanico.getNombre()+" no pudo realizar la manutencion");
        }
        this.combustible+=20;
        System.out.println("Se agrego 20 puntos de combustible");
        if (this.combustible>100){
            this.combustible = 100;
        }
        
    }
    
    private void recibirMantencion (){
        int restoMantencion = 0;
        restoMantencion = this.cantidadVuelos%5;
        if (restoMantencion ==0 && this.kilometraje!=0){
            this.mantencion=false;
        }else {
            this.mantencion=true;
        }
    }
    
    public void realizarVuelo(int tipoViaje){
        if (this.mantencion==false){
            System.out.println("No se puede realizar el vuelo porque se debe realizar mantencion del avion "+this.modelo);
        }else {
            if (this.combustible < 50){
                System.out.println("No se puede realizar el vuelo por falta de combustible");
            }else {
                
                if (tipoViaje==1){
                    this.kilometraje +=500;
                    this.combustible -=50;
                    System.out.println("Se hizo un viaje nacional");
                    this.cantidadVuelos++;
                    recibirMantencion();
                }else {
                    this.kilometraje +=800;
                    this.combustible -=80;
                    System.out.println("Se hizo un viaje internacional");
                    this.cantidadVuelos++;
                    recibirMantencion();
                }
            }
        }
    }
    
    public void actualizarCombustible (int tipo){
        switch (tipo){
            case 1 : this.combustible+=100;
                break;
            case 2 : this.combustible+=50;
                break;
        }
        if (this.combustible>100){
            this.combustible=100;
        }
        System.out.println("Carga de combustible realizada por el mecanico " + this.mecanico.getNombre());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getCantidadVuelos() {
        return cantidadVuelos;
    }

    public void setCantidadVuelos(int cantidadVuelos) {
        this.cantidadVuelos = cantidadVuelos;
    }

    public int getCantidadMantenciones() {
        return cantidadMantenciones;
    }

    public void setCantidadMantenciones(int cantidadMantenciones) {
        this.cantidadMantenciones = cantidadMantenciones;
    }

    public boolean isMantencion() {
        return mantencion;
    }

    public void setMantencion(boolean mantencion) {
        this.mantencion = mantencion;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    
    
}
