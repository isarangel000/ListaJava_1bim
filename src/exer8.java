import java.util.Scanner;

class exer8 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = entradaDados.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = entradaDados.nextInt();

        if (anoNascimento >= anoAtual) {
            System.out.println("Ano de nascimento invalido.");
        } else {

            int idade = anoAtual - anoNascimento;

            System.out.println("Idade: " + idade);

            if (idade < 16) {
                System.out.println("Nao eleitor");
            } else if (idade >= 18 && idade <= 65) {
                System.out.println("Eleitor obrigatorio");
            } else {
                System.out.println("Eleitor facultativo");
            }
        }

        entradaDados.close();
    }
}