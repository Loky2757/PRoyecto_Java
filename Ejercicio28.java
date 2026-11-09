import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        int n = entrada.nextInt();
        System.out.println("¿No es par? " + (n % 2 != 0));
        entrada.close();
    }
}
