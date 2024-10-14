import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número para calcular su raíz cuadrada: ");
        double numero = scanner.nextDouble();
        
        double raizCuadrada = Math.sqrt(numero);
        
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
    }
}
