import java.util.Scanner;

class exer6 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        double salario = entradaDados.nextDouble();

        double desconto;

        if (salario <= 600) {
            desconto = 0;
        } else if (salario <= 1200) {
            desconto = salario * 0.20;
        } else if (salario <= 2000) {
            desconto = salario * 0.25;
        } else {
            desconto = salario * 0.30;
        }

        System.out.println("Desconto do INSS: " + desconto);

        entradaDados.close();
    }
}
