import java.util.Scanner;
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Promedio: "); double prom = entrada.nextDouble();
        System.out.print("Ingreso mensual: $"); double ing = entrada.nextDouble();
        System.out.print("Hermanos estudiantes: "); int h = entrada.nextInt();
        boolean beca = (prom >= 9.5) || (ing < 8000 && h > 2);
        System.out.println("¿Se otorga beca? " + beca);
        entrada.close();
    }
}
