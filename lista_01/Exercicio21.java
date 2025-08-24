import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] modelos = new String[5];
        double[] consumos = new double[5];
        double precoGasolina = 2.25;
        
        System.out.println("Comparativo de Consumo de Combustível");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Veículo " + (i + 1));
            System.out.print("Nome: ");
            modelos[i] = scanner.nextLine();
            System.out.print("Km por litro: ");
            consumos[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        
        int maisEconomico = 0;
        for (int i = 1; i < 5; i++) {
            if (consumos[i] > consumos[maisEconomico]) {
                maisEconomico = i;
            }
        }
        
        System.out.println("\nRelatório Final");
        for (int i = 0; i < 5; i++) {
            double litrosNecessarios = 1000.0 / consumos[i];
            double custo = litrosNecessarios * precoGasolina;
            
            System.out.printf("%d - %-15s - %6.1f - %6.1f litros - R$ %.2f\n", 
                             (i + 1), modelos[i], consumos[i], litrosNecessarios, custo);
        }
        
        System.out.println("O menor consumo é do " + modelos[maisEconomico] + ".");
        
        scanner.close();
    }
}
