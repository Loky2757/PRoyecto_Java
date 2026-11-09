import java.util.Scanner;
public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Lado a: "); double a = entrada.nextDouble();
        System.out.print("Lado b: "); double b = entrada.nextDouble();
        System.out.print("Lado c: "); double c = entrada.nextDouble();
        boolean triangulo = (a + b > c) && (a + c > b) && (b + c > a);
        System.out.println("¿Forman triángulo? " + triangulo);
        entrada.close();
    }
}
