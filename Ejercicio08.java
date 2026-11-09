import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Kilómetros recorridos: ");
        double km = entrada.nextDouble();
        System.out.print("Litros consumidos: ");
        double lts = entrada.nextDouble();
        System.out.printf("Rendimiento: %.2f km/l%n", km/lts);
        entrada.close();
    }
}
