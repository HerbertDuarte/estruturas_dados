import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[5];
        double[] alturas = new double[5];
        
        System.out.println("Digite a idade e altura de 5 pessoas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Pessoa " + (i + 1) + " - Idade: ");
            idades[i] = scanner.nextInt();
            System.out.print("Pessoa " + (i + 1) + " - Altura: ");
            alturas[i] = scanner.nextDouble();
        }
        
        System.out.println("\nIdades e alturas na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Pessoa " + (i + 1) + " - Idade: " + idades[i] + ", Altura: " + alturas[i]);
        }
        
        scanner.close();
    }
}
