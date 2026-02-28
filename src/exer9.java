import java.util.Scanner;

class exer9 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = entradaDados.nextLine();

        System.out.print("Digite a idade: ");
        int idade = entradaDados.nextInt();

        double valor;

        if (idade <= 10) {
            valor = 30.00;
        } else if (idade <= 29) {
            valor = 60.00;
        } else if (idade <= 45) {
            valor = 120.00;
        } else if (idade <= 59) {
            valor = 150.00;
        } else if (idade <= 65) {
            valor = 250.00;
        } else {
            valor = 400.00;
        }

        System.out.println("Nome: " + nome);
        System.out.println("Valor a pagar: R$ " + valor);

        entradaDados.close();
    }
}