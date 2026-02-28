import java.util.Scanner;

class exer15 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite a posicao desejada: ");
        int n = entradaDados.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo = 1;

        if (n == 1 || n == 2) {
            System.out.println("Valor: 1");
        } else {

            for (int i = 3; i <= n; i = i + 1) {
                proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }

            System.out.println("Valor: " + proximo);
        }

        entradaDados.close();
    }
}