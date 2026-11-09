import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Radio 1: "); double r1 = entrada.nextDouble();
        System.out.print("Radio 2: "); double r2 = entrada.nextDouble();
        System.out.println("¿El primero es mayor? " + (r1*r1 > r2*r2));
        entrada.close();
    }
}
