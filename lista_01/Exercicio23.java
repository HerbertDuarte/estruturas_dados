import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Exercicio23 {
    public static void main(String[] args) {
        try {
            BufferedReader arquivo = new BufferedReader(new FileReader("usuarios.txt"));
            String linha;
            String[] usuarios = new String[100];
            long[] espacos = new long[100];
            int contador = 0;
            long espacoTotal = 0;
            
            while ((linha = arquivo.readLine()) != null && contador < 100) {
                String usuario = linha.substring(0, 15).trim();
                long espaco = Long.parseLong(linha.substring(16).trim());
                
                usuarios[contador] = usuario;
                espacos[contador] = espaco;
                espacoTotal += espaco;
                contador++;
            }
            arquivo.close();
            
            FileWriter relatorio = new FileWriter("relatorio.txt");
            relatorio.write("ACME Inc.               Uso do espaço em disco pelos usuários\n");
            relatorio.write("------------------------------------------------------------------------\n");
            relatorio.write("Nr.  Usuário        Espaço utilizado     % do uso\n\n");
            
            for (int i = 0; i < contador; i++) {
                double espacoMB = bytesParaMB(espacos[i]);
                double percentual = calcularPercentual(espacos[i], espacoTotal);
                
                relatorio.write(String.format("%d    %-15s %8.2f MB %15.2f%%\n", 
                               (i + 1), usuarios[i], espacoMB, percentual));
            }
            
            double espacoTotalMB = bytesParaMB(espacoTotal);
            double espacoMedioMB = espacoTotalMB / contador;
            
            relatorio.write(String.format("\nEspaço total ocupado: %.2f MB\n", espacoTotalMB));
            relatorio.write(String.format("Espaço médio ocupado: %.2f MB\n", espacoMedioMB));
            
            relatorio.close();
            
            System.out.println("Relatório gerado com sucesso em 'relatorio.txt'");
            
        } catch (IOException e) {
            System.out.println("Erro ao processar arquivo: " + e.getMessage());
        }
    }
    
    public static double bytesParaMB(long bytes) {
        return bytes / (1024.0 * 1024.0);
    }
    
    public static double calcularPercentual(long espacoUsuario, long espacoTotal) {
        return (double) espacoUsuario * 100 / espacoTotal;
    }
}
