import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Largo: "); double a = entrada.nextDouble();
        System.out.print("Ancho: "); double b = entrada.nextDouble();
        System.out.print("Alto: "); double c = entrada.nextDouble();
        double area = 2 * (a*b + a*c + b*c);
        System.out.println("Área superficial: " + area);
        entrada.close();
    }
}
