import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Peso (kg): "); double p = entrada.nextDouble();
        System.out.print("Estatura (m): "); double e = entrada.nextDouble();
        double imc = p / (e*e);
        System.out.println("IMC: " + imc + " ¿Sobrepeso? " + (imc >= 25));
        entrada.close();
    }
}
