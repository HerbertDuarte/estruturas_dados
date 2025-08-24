import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        
        while (true) {
            System.out.print("Digite o nome do atleta (ou Enter para sair): ");
            nome = scanner.nextLine().trim();
            
            if (nome.isEmpty()) {
                break;
            }
            
            double[] saltos = new double[5];
            String[] ordens = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};
            double soma = 0;
            
            for (int i = 0; i < 5; i++) {
                System.out.print(ordens[i] + " salto: ");
                saltos[i] = scanner.nextDouble();
                soma += saltos[i];
            }
            scanner.nextLine();
            
            double media = soma / 5;
            
            System.out.println("\nAtleta: " + nome);
            System.out.println();
            for (int i = 0; i < 5; i++) {
                System.out.println(ordens[i] + " Salto: " + saltos[i] + " m");
            }
            
            System.out.println("\nResultado final:");
            System.out.println("Atleta: " + nome);
            System.out.print("Saltos: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(saltos[i]);
                if (i < 4) {
                    System.out.print(" - ");
                }
            }
            System.out.println();
            System.out.println("Média dos saltos: " + media + " m");
            System.out.println();
        }
        
        scanner.close();
    }
}
