import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] vetor = new char[10];
        int contadorConsoantes = 0;
        
        System.out.println("Digite 10 caracteres:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");
            vetor[i] = scanner.next().toLowerCase().charAt(0);
        }
        
        System.out.println("\nConsoantes encontradas:");
        for (int i = 0; i < 10; i++) {
            char c = vetor[i];
            if (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                System.out.println(c);
                contadorConsoantes++;
            }
        }
        
        System.out.println("Total de consoantes: " + contadorConsoantes);
        
        scanner.close();
    }
}
