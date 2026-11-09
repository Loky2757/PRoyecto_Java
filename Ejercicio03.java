import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("x1: "); double x1 = entrada.nextDouble();
        System.out.print("y1: "); double y1 = entrada.nextDouble();
        System.out.print("x2: "); double x2 = entrada.nextDouble();
        System.out.print("y2: "); double y2 = entrada.nextDouble();
        double dx = x2 - x1;
        double dy = y2 - y1;
        System.out.println("Cuadrado distancia: " + (dx*dx + dy*dy));
        entrada.close();
    }
}
