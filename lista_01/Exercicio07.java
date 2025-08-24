import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma = 0;
        int multiplicacao = 1;
        
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
            multiplicacao *= vetor[i];
        }
        
        System.out.println("\nNúmeros:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
        
        scanner.close();
    }
}
