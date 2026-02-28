import java.util.Scanner;

class exer10 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        double nota;
        double soma = 0;

        System.out.print("insira uma nota (-1 para encerrar): ");
        nota = entradaDados.nextDouble();

        while (nota != -1) {
            soma = soma + nota;

            System.out.print("insira uma nota (-1 para encerrar): ");
            nota = entradaDados.nextDouble();
        }

        System.out.println("soma das notas: " + soma);

        entradaDados.close();
    }
}