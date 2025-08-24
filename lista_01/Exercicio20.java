import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salarios = new ArrayList<>();
        ArrayList<Double> abonos = new ArrayList<>();
        double salario;
        double totalAbonos = 0;
        int funcionariosMinimo = 0;
        double maiorAbono = 0;
        
        System.out.println("Projeção de Gastos com Abono");
        System.out.println("============================");
        
        while (true) {
            System.out.print("Salário: ");
            salario = scanner.nextDouble();
            
            if (salario == 0) {
                break;
            }
            
            double abono = salario * 0.20;
            if (abono < 100) {
                abono = 100;
                funcionariosMinimo++;
            }
            
            salarios.add(salario);
            abonos.add(abono);
            totalAbonos += abono;
            
            if (abono > maiorAbono) {
                maiorAbono = abono;
            }
        }
        
        System.out.println("\nSalário    - Abono");
        for (int i = 0; i < salarios.size(); i++) {
            System.out.printf("R$ %7.2f - R$ %7.2f\n", salarios.get(i), abonos.get(i));
        }
        
        System.out.println("\nForam processados " + salarios.size() + " colaboradores");
        System.out.printf("Total gasto com abonos: R$ %.2f\n", totalAbonos);
        System.out.println("Valor mínimo pago a " + funcionariosMinimo + " colaboradores");
        System.out.printf("Maior valor de abono pago: R$ %.2f\n", maiorAbono);
        
        scanner.close();
    }
}
