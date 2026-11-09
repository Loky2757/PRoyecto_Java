import java.util.Scanner;
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = entrada.nextInt();
        System.out.print("Tiene identidad (1=Sí, 0=No): ");
        int id = entrada.nextInt();
        boolean acceso = (edad >= 18) && (id == 1);
        System.out.println("¿Puede entrar? " + acceso);
        entrada.close();
    }
}
