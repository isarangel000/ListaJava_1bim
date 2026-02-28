import java.util.Scanner;

class exercicio2 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("insira um salário bruto: ");
        double salarioB = entradaDados.nextDouble();

        double descontoINSS = salarioB* 0.085;
        double salarioCDescontoINSS = salarioB- descontoINSS;

        double descontoIR = salarioCDescontoINSS * 0.266;
        double salarioL = salarioCDescontoINSS - descontoIR;

        System.out.println("Salario Bruto: " + salarioB);
        System.out.println("Salario Liquido: " + salarioL);

        entradaDados.close();
    }
}
