package Modelo;


public class EmpleadoPorComision {
    private String primerNombre;
    private String apellidoPaterno;
    private String seguroSocial;
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String seguroSocial, double ventasBrutas, double tarifaComision) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.seguroSocial = seguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }
   
   
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getSeguroSocial() {
        return seguroSocial;
    }

    public void setSeguroSocial(String seguroSocial) {
        this.seguroSocial = seguroSocial;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }
    
    
    public double sueldo(){
        return getVentasBrutas()*getTarifaComision();
    }

    @Override
    public String toString() {
        return  getPrimerNombre() + ", " + getApellidoPaterno() + ", " + getSeguroSocial() + ", " + getVentasBrutas() + ", " + getTarifaComision();
    }
    
    
}
