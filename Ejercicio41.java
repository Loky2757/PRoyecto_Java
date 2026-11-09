import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("a: "); int a = entrada.nextInt();
        System.out.print("b: "); int b = entrada.nextInt();
        System.out.print("c: "); int c = entrada.nextInt();
        boolean orden = (a < b) && (b < c);
        System.out.println("¿Estrictamente creciente? " + orden);
        entrada.close();
    }
}
