import java.util.Scanner;
public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Punto x: "); double x = entrada.nextDouble();
        System.out.print("Punto y: "); double y = entrada.nextDouble();
        System.out.print("Radio r: "); double r = entrada.nextDouble();
        double dist = x*x + y*y;
        double r2 = r*r;
        boolean dentro = dist <= r2;
        System.out.println("¿Dentro o en la circunferencia? " + dentro);
        entrada.close();
    }
}
