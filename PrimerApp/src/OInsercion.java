
import java.util.Scanner;
import javax.swing.JOptionPane;


public class OInsercion {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int arreglo [],n,pos,aux;
        n = Integer.parseInt(JOptionPane.showInputDialog("Numero de elementos"));
        arreglo = new int [n];
        for (int i = 0;i<n;i++){
            System.out.print("Escribe el numero "+(i+1)+": ");
            arreglo[i]=s.nextInt();
        }
        
        for (int i=0;i<n;i++){
            pos=i;
            aux=arreglo[i];
            while((pos>0)&&(arreglo[pos-1]>aux)){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        for (int i=0;i<n;i++){
            System.out.print(arreglo[i]+"-");
            
        }
    }
}
