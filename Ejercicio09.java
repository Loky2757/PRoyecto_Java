import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Total horas: ");
        int total = entrada.nextInt();
        System.out.println("Días: " + (total/24));
        System.out.println("Horas restantes: " + (total%24));
        entrada.close();
    }
}
