import java.util.Scanner;
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Minutos de estacionamiento: ");
        int m = entrada.nextInt();
        int horas = (m + 59) / 60;
        System.out.println("Horas cobradas: " + horas + " Total: $" + (horas*25.0));
        entrada.close();
    }
}
