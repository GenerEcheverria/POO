
package Modelo;


public class EmpleadobaseMasComision {
    private String primerNombre;
    private String apellidoPaterno;
    private String seguroSocial;
    private double ventasBrutas;
    private double tarifaComision;
    private double sueldoBase;

    public EmpleadobaseMasComision(String primerNombre, String apellidoPaterno, String seguroSocial, double ventasBrutas, double tarifaComision, double sueldoBase) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.seguroSocial = seguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        this.sueldoBase = sueldoBase;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getSeguroSocial() {
        return seguroSocial;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setSeguroSocial(String seguroSocial) {
        this.seguroSocial = seguroSocial;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    //Calcular sueldo
    public double sueldo(){
        return getSueldoBase()+ getVentasBrutas()*getTarifaComision();
    }

    @Override
    public String toString() {
        return getPrimerNombre() + "," + getApellidoPaterno() + ", " + getSeguroSocial() + ", " + getVentasBrutas() + ", " + getTarifaComision() + ", " + getSueldoBase() + '}';
    }
    
    
}
