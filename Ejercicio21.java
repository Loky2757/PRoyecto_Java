import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor x: ");
        double x = entrada.nextDouble();
        System.out.println("¿En (15,85)? " + (x > 15 && x < 85));
        entrada.close();
    }
}
