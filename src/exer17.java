import java.util.Scanner;

class exer7 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = entradaDados.nextInt();

        if (idade > 65) {
            System.out.println("Maior de 65 anos");
        } else if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        entradaDados.close();
    }
}