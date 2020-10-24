//Gener Alejandro Echeverria Chi
//ADA1 POO
//LIS
package Paquete;

public class Empleado {
    private int claveEmpleado;
    private String nombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private Fecha nacimiento;
    private Fecha ingreso;
    private Departamento departamento;
    private Horario horarioLV;
    private Horario horarioS;
    private Horario horarioD;

    public Empleado(int claveEmpleado, String nombre, String apellidoMaterno, String apellidoPaterno, Fecha nacimiento, Fecha ingreso, Departamento departamento, Horario horarioLV, Horario horarioS, Horario horarioD) {
        this.claveEmpleado = claveEmpleado;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.nacimiento = nacimiento;
        this.ingreso = ingreso;
        this.departamento = departamento;
        this.horarioLV = horarioLV;
        this.horarioS = horarioS;
        this.horarioD = horarioD;
    }

    public int getClaveEmpleado() {
        return claveEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public Fecha getIngreso() {
        return ingreso;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Horario getHorarioLV() {
        return horarioLV;
    }

    public Horario getHorarioS() {
        return horarioS;
    }

    public Horario getHorarioD() {
        return horarioD;
    }

    public void setClaveEmpleado(int claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setIngreso(Fecha ingreso) {
        this.ingreso = ingreso;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setHorarioLV(Horario horarioLV) {
        this.horarioLV = horarioLV;
    }

    public void setHorarioS(Horario horarioS) {
        this.horarioS = horarioS;
    }

    public void setHorarioD(Horario horarioD) {
        this.horarioD = horarioD;
    }

    @Override
    public String toString() {
        return  getClaveEmpleado() + " " + getNombre() + " " + getApellidoPaterno() + " " + getApellidoMaterno() + " Nacimiento:" + getNacimiento() + " Ingreso:" +
                getIngreso() + " Departamento:" + getDepartamento() + "  Horarios: L-V:" + getHorarioLV() + " Sabado:" + getHorarioS() + " Domingo:" + getHorarioD();
    }
}
