import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

        String produto = "Arroz";
        double precoUnitario = 25.50;
        int quantidade = 2;
        double total;

        total = precoUnitario * quantidade;

        System.out.println("===== DADOS DO PRODUTO =====");
        System.out.println("Produto: " + produto);
        System.out.println("Preço unitário: R$ " + precoUnitario);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$ " + total);
        System.out.println("============================");
    }
}
