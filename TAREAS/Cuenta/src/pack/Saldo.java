
package pack;


public class Saldo {
    private int saldo;
    private int numeroCuenta;
    private String descripcion;

    public Saldo(int saldo, int numeroCuenta, String descripcion) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta
        this.descripcion = descripcion;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void abonar(int abono){
        this.saldo+=abono;
    }

    @Override
    public String toString() {
        return "Saldo{" + "saldo=" + getSaldo() + ", numeroCuenta=" + getNumeroCuenta() + ", descripcion=" + getDescripcion() + '}';
    }
    
    
}
