import java.util.Scanner;
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor: ");
        double v = entrada.nextDouble();
        boolean rango = (v >= 0 && v <= 100);
        System.out.println("¿Entre 0 y 100? " + rango);
        entrada.close();
    }
}
