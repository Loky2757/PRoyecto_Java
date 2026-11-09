import java.util.Scanner;
public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número de tres cifras: ");
        int n = entrada.nextInt();
        int centenas = n / 100;
        int decenas = (n / 10) % 10;
        int unidades = n % 10;
        int suma = centenas + decenas + unidades;
        System.out.println("Suma de dígitos: " + suma);
        entrada.close();
    }
}
