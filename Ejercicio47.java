import java.util.Scanner;
public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número 1: "); int n1 = entrada.nextInt();
        System.out.print("Número 2: "); int n2 = entrada.nextInt();
        System.out.print("Número 3: "); int n3 = entrada.nextInt();
        boolean hayPar = (n1 % 2 == 0) || (n2 % 2 == 0) || (n3 % 2 == 0);
        System.out.println("¿Al menos uno es par? " + hayPar);
        entrada.close();
    }
}
