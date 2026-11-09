import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Hora (0-23): ");
        int h = entrada.nextInt();
        System.out.println("¿Hora válida? " + (h >= 0 && h <= 23));
        entrada.close();
    }
}
