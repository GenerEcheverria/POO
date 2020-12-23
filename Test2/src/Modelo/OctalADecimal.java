package Modelo;

public class OctalADecimal {
    public static int Decimal(String octal) {
        int decimal = 0;
        int potencia = 0;
        for (int x = octal.length() - 1; x >= 0; x--) {
            int valorActual = Character.getNumericValue(octal.charAt(x));
            int elevado = (int) (Math.pow(8, potencia) * valorActual);
            decimal += elevado;
            potencia++;
        }
        return decimal;
    }
}
