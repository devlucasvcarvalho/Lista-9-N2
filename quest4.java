// Soma2.java
import java.util.Scanner;

public class Soma2 {
    public static int somatoria(int numero1, int numero2) {
        return numero1 + numero2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

       int resultado = somatoria(numero1, numero2);
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + resultado);
    }
}
