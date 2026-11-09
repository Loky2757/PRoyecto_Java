import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("a: "); int a = entrada.nextInt();
        System.out.print("b: "); int b = entrada.nextInt();
        System.out.print("c: "); int c = entrada.nextInt();
        System.out.println("¿Todos iguales? " + (a == b && b == c));
        entrada.close();
    }
}
