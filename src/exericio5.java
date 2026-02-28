import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opcao: ");

            opcao = entradaDados.nextInt();

            if (opcao >= 1 && opcao <= 4) {

                System.out.print("Digite o primeiro numero: ");
                double num1 = entradaDados.nextDouble();

                System.out.print("Digite o segundo numero: ");
                double num2 = entradaDados.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;

                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;

                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;

                    case 4:
                        System.out.println("Resultado: " + (num1 / num2));
                        break;
                }
            }

        } while (opcao != 0);

        entradaDados.close();
    }
}