class exer13 {
    public static void main(String[] args) {

        int soma = 0;

        for (int i = 1; i < 200; i = i + 1) {

            if (i % 4 == 0) {
                soma = soma + i;
            }
        }

        System.out.println("Soma dos numeros divisiveis por 4 menores que 200: " + soma);
    }
}