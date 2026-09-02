import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

        String nome = "Bernardo";
        String classeg1 = "Guerreiro de 2ª classe";
        String classeg2 = "Guerreiro de 1ª classe";
        String estado = "Ativo";
        int nivel = 10;
        double pontosVida = 100;
        int moedas = 50;
        

        System.out.println("===== Estado inicial =====");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classeg1);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de vida: " + pontosVida);
        System.out.println("Moedas: " + moedas);
        System.out.println("Estado: " + estado);
        System.out.println("==========================");

        moedas = moedas + 29;
        pontosVida = pontosVida - 38;
        nivel = nivel + 5;

        System.out.println("===== Estado final =====");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classeg2);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de vida: " + pontosVida);
        System.out.println("Moedas: " + moedas);
        System.out.println("Estado: " + estado);
        System.out.println("========================");
    }
}




