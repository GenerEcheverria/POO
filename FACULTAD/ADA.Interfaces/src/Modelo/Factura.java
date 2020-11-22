/**
 * ADA2 Interfaces
 * Gener Alejandro Echeverria Chi
 */
package Modelo;

public class Factura implements PorPagar{
    private String numeroPiezas;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPiezas, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPiezas = numeroPiezas;
        this.descripcionPieza = descripcionPieza;
        setCantidad(cantidad);
        setPrecioPorArticulo(precioPorArticulo);
    }

    public String getNumeroPiezas() {
        return numeroPiezas;
    }

    public void setNumeroPiezas(String numeroPiezas) {
        this.numeroPiezas = numeroPiezas;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad<0){
            this.cantidad=0;
        }else{
            this.cantidad = cantidad;
        }

    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        if(precioPorArticulo<0){
            this.precioPorArticulo=0;
        }else {
            this.precioPorArticulo = precioPorArticulo;
        }
    }

    @Override
    public double obtenerMontoPago() {
        return getCantidad()*getPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return "Numero de piezas: " + getNumeroPiezas() +"\nDescripcion: " + getDescripcionPieza() +
                "\nCantidad: " + getCantidad() +"\nPrecio por articulo: " + getPrecioPorArticulo() ;
    }
}
