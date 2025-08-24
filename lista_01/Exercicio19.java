import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] votos = new int[7];
        String[] sistemas = {"", "Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro"};
        int totalVotos = 0;
        int opcao;
        
        System.out.println("Qual o melhor Sistema Operacional para uso em servidores?");
        System.out.println("1- Windows Server");
        System.out.println("2- Unix");
        System.out.println("3- Linux");
        System.out.println("4- Netware");
        System.out.println("5- Mac OS");
        System.out.println("6- Outro");
        System.out.println("0- Encerrar votação");
        
        while (true) {
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();
            
            if (opcao == 0) {
                break;
            }
            
            if (opcao < 1 || opcao > 6) {
                System.out.println("Opção inválida! Digite um valor entre 1 e 6 ou 0 para sair.");
                continue;
            }
            
            votos[opcao]++;
            totalVotos++;
        }
        
        System.out.println("\nSistema Operacional     Votos   %");
        System.out.println("-------------------     -----   ---");
        
        int maisVotado = 1;
        int maisVotos = votos[1];
        
        for (int i = 1; i <= 6; i++) {
            int percentual = (totalVotos > 0) ? (votos[i] * 100 / totalVotos) : 0;
            System.out.printf("%-20s %8d %4d%%\n", sistemas[i], votos[i], percentual);
            
            if (votos[i] > maisVotos) {
                maisVotos = votos[i];
                maisVotado = i;
            }
        }
        
        System.out.println("-------------------     -----");
        System.out.printf("Total %26d\n", totalVotos);
        
        int percentualMaisVotado = (totalVotos > 0) ? (maisVotos * 100 / totalVotos) : 0;
        System.out.println("\nO Sistema Operacional mais votado foi o " + sistemas[maisVotado] + 
                          ", com " + maisVotos + " votos, correspondendo a " + 
                          percentualMaisVotado + "% dos votos.");
        
        scanner.close();
    }
}
