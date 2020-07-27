
import java.util.Scanner;


public class main {
    public static double areaMayor(trianguloIsoceles triangulos[]){
        double area;
        area = triangulos[0].area();
        for (int i = 1; i<triangulos.length;i++){
            if (triangulos[i].area()>area){
                area = triangulos[i].area();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double base, lado;
        int n;
        System.out.println("Numero de triangulos");
        n = s.nextInt();
        trianguloIsoceles triangulos[] = new trianguloIsoceles[n];
        for (int i=0;i<triangulos.length;i++){
            s.nextLine();
            System.out.println("\t TRIANGULO "+(i+1));
            System.out.print("Base: ");
            base = s.nextDouble();
            System.out.print("Lado: ");
            lado = s.nextDouble();
            triangulos[i]= new trianguloIsoceles(base,lado);
            
            System.out.println("El perimetro es: "+triangulos[i].perimetro());
            System.out.println("El area es: "+triangulos[i].area());
        }
        
        System.out.println("\n");
        System.out.println("El area mayor es: "+ areaMayor(triangulos));
    }
    
    
    
}
