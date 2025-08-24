import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[12];
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                         "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        double somaTemperaturas = 0;
        
        System.out.println("Digite a temperatura média de cada mês:");
        for (int i = 0; i < 12; i++) {
            System.out.print(meses[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
            somaTemperaturas += temperaturas[i];
        }
        
        double mediaAnual = somaTemperaturas / 12;
        
        System.out.println("\nMédia anual: " + mediaAnual + "°C");
        System.out.println("\nMeses com temperatura acima da média:");
        
        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > mediaAnual) {
                System.out.println((i + 1) + " - " + meses[i] + ": " + temperaturas[i] + "°C");
            }
        }
        
        scanner.close();
    }
}
