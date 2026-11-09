import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double g = 9.81;
        System.out.print("Tiempo en segundos: ");
        double t = entrada.nextDouble();
        double d = 0.5 * g * t * t;
        System.out.println("Distancia: " + d + " m");
        entrada.close();
    }
}
