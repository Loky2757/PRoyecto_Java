import java.util.Scanner;
public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Año: ");
        int anio = entrada.nextInt();
        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        System.out.println("¿Es bisiesto? " + bisiesto);
        entrada.close();
    }
}
