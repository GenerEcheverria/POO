
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Matrices {
    public static void main (String[] args){
        int matriz [][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        int matriz2[][], n,m;
        n=Integer.parseInt(JOptionPane.showInputDialog("Numero de filas"));
        m=Integer.parseInt(JOptionPane.showInputDialog("Numero de columnas"));
        Scanner s = new Scanner(System.in);
        matriz2 = new int [n][m];
        boolean simetrica = true;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print("Escribe el numero ["+ i+"]["+j+"]:");
                matriz2[i][j]= s.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matriz2[i][j]);
            }
            System.out.println("");
        }
        if (n==m){
            int i = 0,j=0;
            while (i<n && simetrica ==true){
                while (j<i && simetrica==true){
                    if (matriz2[i][j]!=matriz2[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica==true){
                JOptionPane.showMessageDialog(null, "La matriz es simetrica");
            } else {
                JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
        }
    }
}
