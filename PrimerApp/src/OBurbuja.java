
import java.util.Scanner;
import javax.swing.JOptionPane;


public class OBurbuja {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int arreglo[], nElementos, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad de elementos del arreglo"));
        arreglo = new int [nElementos];
        
        for (int i=0;i<nElementos;i++){
            System.out.print("Escribe el elemento " + (i+1) + ": ");
            arreglo[i] = s.nextInt();
            
        }
        
        for (int i=0;i<(nElementos-1);i++){
            for (int j=0;j<(nElementos-1);j++){
                if (arreglo[j]>arreglo[j+1]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        for (int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+"-");
        }
        System.out.println("\n");
        for (int i=0;i<(nElementos-1);i++){
            for (int j=0;j<(nElementos-1);j++){
                if (arreglo[j]<arreglo[j+1]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                    
                }
            }
        }
        for (int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+"-");
            
        }
        
        
        
    }
}
