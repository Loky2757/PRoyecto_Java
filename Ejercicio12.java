import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Precio 1: $"); double a = entrada.nextDouble();
        System.out.print("Precio 2: $"); double b = entrada.nextDouble();
        System.out.print("Precio 3: $"); double c = entrada.nextDouble();
        System.out.print("Dinero disponible: $"); double d = entrada.nextDouble();
        System.out.println("¿Alcanza? " + ((a+b+c) <= d));
        entrada.close();
    }
}
