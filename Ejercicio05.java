import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Horas trabajadas: ");
        double h = entrada.nextDouble();
        System.out.print("Pago por hora: $");
        double p = entrada.nextDouble();
        double bruto = h * p;
        double ret = bruto * 0.12;
        final double SEG = 150.0;
        System.out.println("Salario neto: $" + (bruto - ret - SEG));
        entrada.close();
    }
}
