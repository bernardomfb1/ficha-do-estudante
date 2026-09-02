import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

        double celsius = 30;
        double fahrenheit;

        fahrenheit = celsius * 9.0 / 5.0 + 32;
       
        System.out.println("===== CONVERSOR DE TEMPERATURA =====");
        System.out.println("Temperatura em Graus Celsius: " + celsius);
        System.out.println("Temperatura em Graus Fahrenheit: " + fahrenheit);
        System.out.println("====================================");
    }
}
