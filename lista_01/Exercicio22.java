import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] defeitos = new int[5];
        String[] situacoes = {"", "necessita da esfera", "necessita de limpeza", 
                             "necessita troca do cabo ou conector", "quebrado ou inutilizado"};
        int totalMouses = 0;
        int identificacao;
        
        System.out.println("Levantamento de mouses:");
        System.out.println("1 - necessita da esfera");
        System.out.println("2 - necessita de limpeza");
        System.out.println("3 - necessita troca do cabo ou conector");
        System.out.println("4 - quebrado ou inutilizado");
        System.out.println("0 - encerrar");
        
        while (true) {
            System.out.print("Identificação do mouse (0 para sair): ");
            identificacao = scanner.nextInt();
            
            if (identificacao == 0) {
                break;
            }
            
            System.out.print("Tipo de defeito (1-4): ");
            int tipoDefeito = scanner.nextInt();
            
            if (tipoDefeito >= 1 && tipoDefeito <= 4) {
                defeitos[tipoDefeito]++;
                totalMouses++;
            }
        }
        
        System.out.println("\nQuantidade de mouses: " + totalMouses);
        System.out.println("\nSituação                        Quantidade              Percentual");
        
        for (int i = 1; i <= 4; i++) {
            int percentual = (totalMouses > 0) ? (defeitos[i] * 100 / totalMouses) : 0;
            System.out.printf("%d- %-30s %10d %18d%%\n", i, situacoes[i], defeitos[i], percentual);
        }
        
        scanner.close();
    }
}
