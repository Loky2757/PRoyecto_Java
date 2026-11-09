import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad en pesos: $");
        int monto = entrada.nextInt();
        int d10 = monto / 10;
        int d1 = monto % 10;
        System.out.println("Monedas de $10: " + d10);
        System.out.println("Monedas de $1: " + d1);
        entrada.close();
    }
}
