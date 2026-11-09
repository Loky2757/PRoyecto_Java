import java.util.Scanner;
public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Sensor 1 (1=encendido, 0=apagado): "); int s1 = entrada.nextInt();
        System.out.print("Sensor 2: "); int s2 = entrada.nextInt();
        System.out.print("Sensor 3: "); int s3 = entrada.nextInt();
        boolean todos = (s1 == 1) && (s2 == 1) && (s3 == 1);
        System.out.println("¿Todos encendidos? " + todos);
        entrada.close();
    }
}
