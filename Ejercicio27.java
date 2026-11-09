import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Edad: "); int e = entrada.nextInt();
        System.out.print("VIP (1=Sí, 0=No): "); int v = entrada.nextInt();
        System.out.println("¿Acceso preferencial? " + (e < 12 || v == 1));
        entrada.close();
    }
}
