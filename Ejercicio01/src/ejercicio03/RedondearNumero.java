import java.util.Scanner;

public class RedondearNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número decimal para redondear: ");
        double numero = scanner.nextDouble();
        
        long redondeado = Math.round(numero);
        
        System.out.println("El número " + numero + " redondeado es: " + redondeado);
    }
}
