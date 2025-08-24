import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] votos = new int[24];
        int totalVotos = 0;
        int numeroJogador;
        
        System.out.println("Enquete: Quem foi o melhor jogador?");
        
        while (true) {
            System.out.print("Número do jogador (0=fim): ");
            numeroJogador = scanner.nextInt();
            
            if (numeroJogador == 0) {
                break;
            }
            
            if (numeroJogador < 1 || numeroJogador > 23) {
                System.out.println("Informe um valor entre 1 e 23 ou 0 para sair!");
                continue;
            }
            
            votos[numeroJogador]++;
            totalVotos++;
        }
        
        System.out.println("\nResultado da votação:");
        System.out.println("\nForam computados " + totalVotos + " votos.\n");
        
        System.out.println("Jogador\t\tVotos\t\t%");
        
        int melhorJogador = 0;
        int maisVotos = 0;
        
        for (int i = 1; i <= 23; i++) {
            if (votos[i] > 0) {
                double percentual = calcularPercentual(votos[i], totalVotos);
                System.out.println(i + "\t\t" + votos[i] + "\t\t" + String.format("%.1f", percentual) + "%");
                
                if (votos[i] > maisVotos) {
                    maisVotos = votos[i];
                    melhorJogador = i;
                }
            }
        }
        
        double percentualMelhor = calcularPercentual(maisVotos, totalVotos);
        System.out.println("\nO melhor jogador foi o número " + melhorJogador + 
                          ", com " + maisVotos + " votos, correspondendo a " + 
                          String.format("%.1f", percentualMelhor) + "% do total de votos.");
        
        try {
            FileWriter arquivo = new FileWriter("resultado_votacao.txt");
            arquivo.write("Resultado da votação:\n\n");
            arquivo.write("Foram computados " + totalVotos + " votos.\n\n");
            arquivo.write("Jogador\t\tVotos\t\t%\n");
            
            for (int i = 1; i <= 23; i++) {
                if (votos[i] > 0) {
                    double percentual = calcularPercentual(votos[i], totalVotos);
                    arquivo.write(i + "\t\t" + votos[i] + "\t\t" + String.format("%.1f", percentual) + "%\n");
                }
            }
            
            arquivo.write("\nO melhor jogador foi o número " + melhorJogador + 
                         ", com " + maisVotos + " votos, correspondendo a " + 
                         String.format("%.1f", percentualMelhor) + "% do total de votos.\n");
            arquivo.close();
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    public static double calcularPercentual(int votosJogador, int totalVotos) {
        return (double) votosJogador * 100 / totalVotos;
    }
}
