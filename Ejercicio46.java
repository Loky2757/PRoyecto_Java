import java.util.Scanner;
public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Día: "); int dia = entrada.nextInt();
        System.out.print("Mes: "); int mes = entrada.nextInt();
        boolean valido = (mes >= 1 && mes <= 12) && (dia >= 1 && dia <= 31);
        System.out.println("¿Fecha válida? " + valido);
        entrada.close();
    }
}
