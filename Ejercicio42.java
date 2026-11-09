import java.util.Scanner;
public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número de dos cifras (10-99): ");
        int n = entrada.nextInt();
        int decenas = n / 10;
        int unidades = n % 10;
        boolean iguales = decenas == unidades;
        System.out.println("Decenas: " + decenas + " Unidades: " + unidades);
        System.out.println("¿Dígitos iguales? " + iguales);
        entrada.close();
    }
}
