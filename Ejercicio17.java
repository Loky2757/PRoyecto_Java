import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double LIM = 110.0;
        System.out.print("Velocidad (km/h): ");
        double v = entrada.nextDouble();
        System.out.println("¿Excede límite? " + (v > LIM));
        entrada.close();
    }
}
