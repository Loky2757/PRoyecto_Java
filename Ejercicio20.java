import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingreso mensual: $");
        double ing = entrada.nextDouble();
        System.out.print("Pago tarjeta: $");
        double pag = entrada.nextDouble();
        System.out.println("¿Supera 30%? " + (pag > ing*0.30));
        entrada.close();
    }
}
