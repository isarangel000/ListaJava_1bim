import java.util.Scanner;

class exer16 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        String nome;
        double nota1, nota2, media;
        double maiorMedia = 0;
        String nomeMaiorMedia = "";
        int contador = 0;

        System.out.print("Digite o nome do aluno (fim para encerrar): ");
        nome = entradaDados.nextLine();

        while (!nome.equals("fim")) {

            System.out.print("Digite a primeira nota: ");
            nota1 = entradaDados.nextDouble();

            System.out.print("Digite a segunda nota: ");
            nota2 = entradaDados.nextDouble();
            entradaDados.nextLine();

            media = (nota1 + nota2) / 2;

            if (contador == 0 || media > maiorMedia) {
                maiorMedia = media;
                nomeMaiorMedia = nome;
            }

            contador = contador + 1;

            System.out.print("Digite o nome do aluno (fim para encerrar): ");
            nome = entradaDados.nextLine();
        }

        if (contador > 0) {
            System.out.println("Maior media: " + maiorMedia);
            System.out.println("Aluno com maior media: " + nomeMaiorMedia);
        } else {
            System.out.println("Nenhum aluno informado.");
        }

        entradaDados.close();
    }
}