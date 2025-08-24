import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] medias = new double[10];
        int alunosAprovados = 0;
        
        for (int i = 0; i < 10; i++) {
            double soma = 0;
            System.out.println("Aluno " + (i + 1) + ":");
            
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                soma += scanner.nextDouble();
            }
            
            medias[i] = soma / 4;
            
            if (medias[i] >= 7.0) {
                alunosAprovados++;
            }
        }
        
        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + medias[i]);
        }
        
        System.out.println("\nNúmero de alunos com média >= 7.0: " + alunosAprovados);
        
        scanner.close();
    }
}
