import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Edad: ");
        int e = entrada.nextInt();
        System.out.println("¿Mayor de edad? " + (e >= 18));
        entrada.close();
    }
}
