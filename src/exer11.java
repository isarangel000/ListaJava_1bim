import java.util.Scanner;

class exer11 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entradaDados.nextInt();

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        entradaDados.close();
    }
}