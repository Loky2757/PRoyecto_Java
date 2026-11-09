import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Examen 1: "); int e1 = entrada.nextInt();
        System.out.print("Examen 2: "); int e2 = entrada.nextInt();
        System.out.println("¿Aprobó? " + (e1 >= 80 || e2 >= 80));
        entrada.close();
    }
}
