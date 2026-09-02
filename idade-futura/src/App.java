import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

        String nome = "Bernardo";
        int idadeAtual = 19;
        int idadeFutura;

        idadeFutura = idadeAtual + 5;

        System.out.println("===== IDADE FUTURA =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade atual: " + idadeAtual);
        System.out.println("Idade daqui a 5 anos: " + idadeFutura);
        System.out.println("========================");
    }
}