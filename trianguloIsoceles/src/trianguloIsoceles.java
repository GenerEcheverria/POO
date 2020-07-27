
public class trianguloIsoceles {
    private double base;
    private double lado;

    public trianguloIsoceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    public double perimetro (){
        double perimetro = (2*lado)+base;
        return perimetro;
    }
    
    public double area (){
        double area = (base*Math.sqrt((lado*lado) - ((base*base)/4)))/2;
        return area;
    }
    
    public String mostrarDatos (){
        return "Base: " + base + "\nlado: " + lado + "\nPerimetro: " + perimetro()+ "\nArea: "+ area()+"\n";
    }
}
