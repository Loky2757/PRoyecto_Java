import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        int n = entrada.nextInt();
        System.out.println("¿Múltiplo de 3? " + (n % 3 == 0));
        entrada.close();
    }
}
