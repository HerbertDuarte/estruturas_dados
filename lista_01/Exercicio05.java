import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        ArrayList<Integer> vetorPar = new ArrayList<>();
        ArrayList<Integer> vetorImpar = new ArrayList<>();
        
        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            
            if (vetor[i] % 2 == 0) {
                vetorPar.add(vetor[i]);
            } else {
                vetorImpar.add(vetor[i]);
            }
        }
        
        System.out.println("\nVetor original:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        System.out.println("\n\nVetor PAR:");
        for (int num : vetorPar) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n\nVetor ÍMPAR:");
        for (int num : vetorImpar) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
