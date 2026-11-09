import java.util.Scanner;
public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Coordenada x: "); double x = entrada.nextDouble();
        System.out.print("Coordenada y: "); double y = entrada.nextDouble();
        boolean cuadrante1 = (x > 0) && (y > 0);
        System.out.println("¿Primer cuadrante? " + cuadrante1);
        entrada.close();
    }
}
