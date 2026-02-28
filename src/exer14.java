import java.util.Scanner;

class exer14 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entradaDados.nextInt();

        int fatorial = 1;
        String conta = "";

        for (int i = numero; i >= 1; i = i - 1) {

            fatorial = fatorial * i;

            conta = conta + i;

            if (i > 1) {
                conta = conta + " x ";
            }
        }

        System.out.println(numero + "! = " + conta);
        System.out.println("Resultado: " + fatorial);

        entradaDados.close();
    }
}