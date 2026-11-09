import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        double n = entrada.nextDouble();
        System.out.println("¿Es negativo? " + (n < 0));
        entrada.close();
    }
}
