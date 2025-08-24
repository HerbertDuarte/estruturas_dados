import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int somaQuadrados = 0;
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
            somaQuadrados += vetorA[i] * vetorA[i];
        }
        
        System.out.println("\nVetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println("\nSoma dos quadrados: " + somaQuadrados);
        
        scanner.close();
    }
}
