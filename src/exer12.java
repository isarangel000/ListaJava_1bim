import java.util.Scanner;

class exer12 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = entradaDados.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = entradaDados.nextInt();

        int resultado = 0;
        String soma = "";

        for (int i = 0; i < num1; i = i + 1) {
            resultado = resultado + num2;

            soma = soma + num2;

            if (i < num1 - 1) {
                soma = soma + " + ";
            }
        }

        System.out.println("M = " + soma);
        System.out.println("Resultado: " + resultado);

        entradaDados.close();
    }
}