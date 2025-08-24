import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };
        
        int respostasPositivas = 0;
        
        System.out.println("Responda com 's' para SIM ou 'n' para NÃO:");
        
        for (int i = 0; i < 5; i++) {
            System.out.print(perguntas[i] + " ");
            char resposta = scanner.next().toLowerCase().charAt(0);
            
            if (resposta == 's') {
                respostasPositivas++;
            }
        }
        
        String classificacao;
        if (respostasPositivas == 2) {
            classificacao = "Suspeita";
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            classificacao = "Cúmplice";
        } else if (respostasPositivas == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }
        
        System.out.println("\nClassificação: " + classificacao);
        
        scanner.close();
    }
}
