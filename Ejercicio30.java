import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Año: ");
        int a = entrada.nextInt();
        boolean bis = (a%4==0 && a%100!=0) || (a%400==0);
        System.out.println("¿Bisiesto? " + bis);
        entrada.close();
    }
}
