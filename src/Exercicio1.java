import java.util.Scanner;

class exercicio1 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("digite uma temperatura em Celsius: ");
        double celsius = entradaDados.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("a temperatura em fahrenheit é: " + fahrenheit);

        entradaDados.close();
    }
}
