
public abstract class Poligono {
    protected int numeroLados;
    
    public Poligono (int numeroLados){
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Numero de lados: " + numeroLados;
    }
    
    //area es abstracto por lo que la clase Poligono tambien
    public abstract double area();
}

