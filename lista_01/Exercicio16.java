import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] contadores = new int[9];
        double vendas;
        
        System.out.println("Digite as vendas brutas dos vendedores (digite -1 para encerrar):");
        
        while (true) {
            System.out.print("Vendas brutas: $");
            vendas = scanner.nextDouble();
            
            if (vendas == -1) {
                break;
            }
            
            double salario = 200 + (vendas * 0.09);
            int indice = calcularIndice(salario);
            
            if (indice >= 0 && indice < 9) {
                contadores[indice]++;
            }
        }
        
        String[] faixas = {
            "$200 - $299",
            "$300 - $399", 
            "$400 - $499",
            "$500 - $599",
            "$600 - $699",
            "$700 - $799",
            "$800 - $899",
            "$900 - $999",
            "$1000 em diante"
        };
        
        System.out.println("\nDistribuição de salários:");
        for (int i = 0; i < 9; i++) {
            System.out.println(faixas[i] + ": " + contadores[i] + " vendedores");
        }
        
        scanner.close();
    }
    
    public static int calcularIndice(double salario) {
        if (salario >= 1000) {
            return 8;
        }
        return (int)((salario - 200) / 100);
    }
}
