
public class App {
    public static void main(String[] args) {

        String nomeProduto = "Camiseta";
        double precoUnitario = 59.99;
        int quantidadeEstoque = 3;
        boolean disponibilidade = true;

        System.out.println("===== FICHA DO PRODUTO =====");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço unitário: R$ " + precoUnitario);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("Disponível: " + disponibilidade);
        System.out.println("============================");
    }
}
