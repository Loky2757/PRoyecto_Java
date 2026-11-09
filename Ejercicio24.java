import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        int n = entrada.nextInt();
        boolean ok = (n>=1 && n<=10) || (n>=50 && n<=60);
        System.out.println("¿En rango? " + ok);
        entrada.close();
    }
}
