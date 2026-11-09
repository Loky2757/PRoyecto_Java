import java.util.Scanner;
public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Primer número: "); int n1 = entrada.nextInt();
        System.out.print("Segundo número: "); int n2 = entrada.nextInt();
        boolean mismoSigno = (n1 > 0 && n2 > 0) || (n1 < 0 && n2 < 0);
        System.out.println("¿Mismo signo? " + mismoSigno);
        entrada.close();
    }
}
