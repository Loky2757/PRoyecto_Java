import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        int n = entrada.nextInt();
        System.out.println("¿Múltiplo de 4 y 6? " + (n%4==0 && n%6==0));
        entrada.close();
    }
}
