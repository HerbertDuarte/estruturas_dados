import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];
        int[] vetorFinal = new int[30];
        
        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }
        
        System.out.println("Digite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }
        
        System.out.println("Digite 10 números para o terceiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor3[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            vetorFinal[i * 3] = vetor1[i];
            vetorFinal[i * 3 + 1] = vetor2[i];
            vetorFinal[i * 3 + 2] = vetor3[i];
        }
        
        System.out.println("\nVetor final (intercalado):");
        for (int i = 0; i < 30; i++) {
            System.out.print(vetorFinal[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
