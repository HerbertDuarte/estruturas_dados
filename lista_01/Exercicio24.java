import java.util.Random;

public class Exercicio24 {
    public static void main(String[] args) {
        int[] contadores = new int[7];
        
        System.out.println("Simulando 100 lançamentos de dados...");
        
        for (int i = 0; i < 100; i++) {
            int valorDado = gerarNumeroAleatorio();
            contadores[valorDado]++;
        }
        
        System.out.println("\nResultados:");
        System.out.println("Face do dado | Quantidade de vezes");
        System.out.println("-------------|-------------------");
        
        for (int i = 1; i <= 6; i++) {
            System.out.printf("     %d       |        %d\n", i, contadores[i]);
        }
    }
    
    public static int gerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
