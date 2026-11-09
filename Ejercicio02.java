import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad en dólares: $");
        double usd = entrada.nextDouble();
        System.out.print("Tipo de cambio: ");
        double tasa = entrada.nextDouble();
        System.out.print("Comisión (%): ");
        double com = entrada.nextDouble();
        double conv = usd * tasa;
        double desc = conv * (com / 100);
        System.out.println("Total neto: $" + (conv - desc));
        entrada.close();
    }
}
