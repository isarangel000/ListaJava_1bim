import java.util.Scanner;

class exercicio3 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("insira um valor de aquisicao do produto: ");
        double valorAquisicao = entradaDados.nextDouble();

        double valorVenda;

        if (valorAquisicao < 50) {
            valorVenda = valorAquisicao * 1.45;
        } else {
            valorVenda = valorAquisicao * 1.30;
        }

        System.out.println("o valor de venda é: " + valorVenda);

        entradaDados.close();
    }
}