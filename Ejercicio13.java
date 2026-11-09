import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        int n = entrada.nextInt();
        System.out.println("¿Termina en 0? " + (n % 10 == 0));
        entrada.close();
    }
}
