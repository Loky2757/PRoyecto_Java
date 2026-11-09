import java.util.Scanner;
public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Calificación: ");
        int nota = entrada.nextInt();
        boolean aprobado = nota >= 60;
        System.out.println("¿Aprobado? " + aprobado);
        entrada.close();
    }
}
