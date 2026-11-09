import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad unidades: "); int c = entrada.nextInt();
        System.out.print("Precio unitario: $"); double p = entrada.nextDouble();
        double total = c * p;
        System.out.println("¿Descuento? " + (c > 50 && total > 5000));
        entrada.close();
    }
}
