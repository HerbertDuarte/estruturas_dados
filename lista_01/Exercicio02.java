import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[10];
        
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }
        
        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
        
        scanner.close();
    }
}
