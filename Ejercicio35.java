import java.util.Scanner;
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número entero: ");
        int n = entrada.nextInt();
        boolean positivoPar = (n > 0) && (n % 2 == 0);
        System.out.println("¿Positivo y par? " + positivoPar);
        entrada.close();
    }
}
