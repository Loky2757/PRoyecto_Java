import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        int n = entrada.nextInt();
        System.out.println("¿Impar negativo? " + (n < 0 && n%2 != 0));
        entrada.close();
    }
}
