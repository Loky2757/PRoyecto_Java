import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota exámenes: "); double e = entrada.nextDouble();
        System.out.print("Nota tareas: "); double t = entrada.nextDouble();
        System.out.print("Nota proyecto: "); double p = entrada.nextDouble();
        double prom = e*0.4 + t*0.3 + p*0.3;
        System.out.printf("Promedio: %.2f%n", prom);
        entrada.close();
    }
}
