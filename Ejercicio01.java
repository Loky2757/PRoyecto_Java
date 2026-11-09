import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double PI = 3.14159;
        System.out.print("Radio del cilindro: ");
        double r = entrada.nextDouble();
        System.out.print("Altura del cilindro: ");
        double h = entrada.nextDouble();
        double vol = PI * r * r * h;
        System.out.println("Volumen: " + vol);
        entrada.close();
    }
}
