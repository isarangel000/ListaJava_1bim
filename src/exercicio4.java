import java.util.Scanner;

class exer4 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("insira a quantidade de livros comprados: ");
        int livros = entradaDados.nextInt();

        int pontos;

        if (livros == 0) {
            pontos = 0;
        } else if (livros == 1) {
            pontos = 5;
        } else if (livros == 2) {
            pontos = 15;
        } else if (livros == 3) {
            pontos = 30;
        } else {
            pontos = 60;
        }

        System.out.println("Pontos ganhos: " + pontos);

        entradaDados.close();
    }
}
