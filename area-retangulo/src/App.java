import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

        double largura = 5;
        double altura = 3;

        double area = largura * altura;
        double perimetro = 2 * (largura + altura);

        System.out.println("===== AREA DO RETANGULO =====");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("=============================");
    }
}
    