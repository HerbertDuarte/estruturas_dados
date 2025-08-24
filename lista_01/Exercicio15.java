import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double valor;
        double soma = 0;
        
        System.out.println("Digite as notas (digite -1 para encerrar):");
        
        while (true) {
            System.out.print("Nota: ");
            valor = scanner.nextDouble();
            
            if (valor == -1) {
                break;
            }
            
            notas.add(valor);
            soma += valor;
        }
        
        int quantidade = notas.size();
        double media = soma / quantidade;
        
        int acimaDaMedia = 0;
        int abaixoDeSete = 0;
        
        for (double nota : notas) {
            if (nota > media) {
                acimaDaMedia++;
            }
            if (nota < 7) {
                abaixoDeSete++;
            }
        }
        
        System.out.println("\nQuantidade de valores lidos: " + quantidade);
        
        System.out.print("Valores na ordem informada: ");
        for (int i = 0; i < notas.size(); i++) {
            System.out.print(notas.get(i));
            if (i < notas.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        System.out.println("Valores na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }
        
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);
        System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoDeSete);
        
        System.out.println("Programa encerrado.");
        
        scanner.close();
    }
}
