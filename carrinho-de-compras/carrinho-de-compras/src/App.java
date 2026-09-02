import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

        String NomeProduto = "Camiseta";
        int quantidade = 3;
        double PreçoUnitario = 59.99;
        double total = quantidade * PreçoUnitario;

        System.out.println("===== CARRINHO DE COMPRAS =====");
        System.out.println("Produto: " + NomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: R$ " + PreçoUnitario);
        System.out.println("Total: R$ " + total);
        System.out.println("================================");
    }
}
