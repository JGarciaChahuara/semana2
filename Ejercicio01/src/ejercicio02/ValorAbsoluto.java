import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número para calcular su valor absoluto: ");
        int numero = scanner.nextInt();
        
        int valorAbsoluto = Math.abs(numero);
        
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
    }
}
