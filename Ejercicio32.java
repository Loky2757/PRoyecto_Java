import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ventas mensuales: $");
        double v = entrada.nextDouble();
        System.out.println("¿Bono especial? " + (v >= 20000));
        entrada.close();
    }
}
