import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

        String funcionario = "Bernardo";
        double valorHora = 20.00;
        int horasTrabalhadas = 160;
        double salarioBruto;

        salarioBruto = valorHora * horasTrabalhadas;

        System.out.println("===== SALÁRIO MENSAL =====");
        System.out.println("Funcionário: " + funcionario);
        System.out.println("Valor da hora: R$ " + valorHora);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("==========================");
    }
}
