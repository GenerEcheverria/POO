
public class Arreglos {
    public static void main (String[] args){
        int [] numeros = new int [3];
        //int [] numeros = {7,10,13};
        numeros[0]=7;
        numeros[1]= 10;
        numeros[2]=13;
        for (int i=0;i<3;i++){
            System.out.println(numeros[i]);
        }
        
        String [] nombres= {"Gener", "Monica", "Alex", "Lety"};
        for (int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }
        System.out.println("\n");
        
        //for each        
        for(String i:nombres){
            System.out.println(i);
        }
    }
}
