import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Temperatura en °C: ");
        double t = entrada.nextDouble();
        System.out.println("¿Congela? " + (t <= 0));
        entrada.close();
    }
}
