import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[30];
        double[] alturas = new double[30];
        double somaAlturas = 0;
        int contador = 0;
        
        System.out.println("Digite as idades e alturas de 30 alunos:");
        for (int i = 0; i < 30; i++) {
            System.out.print("Aluno " + (i + 1) + " - Idade: ");
            idades[i] = scanner.nextInt();
            System.out.print("Aluno " + (i + 1) + " - Altura: ");
            alturas[i] = scanner.nextDouble();
            somaAlturas += alturas[i];
        }
        
        double mediaAlturas = somaAlturas / 30;
        
        for (int i = 0; i < 30; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAlturas) {
                contador++;
            }
        }
        
        System.out.println("\nMédia das alturas: " + mediaAlturas);
        System.out.println("Alunos com mais de 13 anos e altura inferior à média: " + contador);
        
        scanner.close();
    }
}
