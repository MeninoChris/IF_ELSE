17import java.util.Scanner;

public class EX12_Salario {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        /*
         * Ler o salário de uma pessoa e calcular e imprimir o desconto do
         * INSS (calculado‼) de acordo com a tabela a seguir:
         * 
         * <= R$ 600,00 Isento
         * > R$600,00 e <= R$ 1200,00 20%
         * > R$1200,00 e <= R$ 2000,00 25%
         * <= R$2000,00 30%
         */

        System.out.println("");
        System.out.println("Bem vindo caro usuario! Vamos calcular o desconto do INSS no seu salario");
        System.out.println("Primeiro digite o seu salario: (Exemplo: R$ 1200,00)");
        double salario = entradaDados.nextDouble();

        System.out.println("Certo. seu salario é de: " + salario);

        System.out.println("");
        if (salario <= 600.0) {
            System.out.println(
                    "Você é isento do desconto do INSS, logo seu salario com o desconto será de: R$" + salario);
            System.out.println("");

        } else if (salario > 600 && salario <= 1200) {

            System.out.println("Seu salario é de: R$" + salario + " logo será uma taxa de 20%");
            double taxa = 0.2;
            double INSS = salario * taxa;
            salario = salario - INSS;
            System.out.println("A taxa será de: R$" + INSS + " então seu salario sobre o INSS será de: R$" + salario);
            System.out.println("");

        } else if (salario > 1200 && salario <= 2000) {

            System.out.println("Seu salario é de: R$" + salario + " logo será uma taxa de 25%");
            double taxa = 0.25;
            double INSS = salario * taxa;
            salario = salario - INSS;
            System.out.println("A taxa será de: R$" + INSS + " então seu salario sobre o INSS será de: R$" + salario);
            System.out.println("");

        } else if (salario >= 2500) {

            System.out.println("Seu salario é de: R$" + salario + " logo será uma taxa de 30%");
            double taxa = 0.3;
            double INSS = salario * taxa;
            salario = salario - INSS;
            System.out.println("A taxa será de: R$" + INSS + " então seu salario sobre o INSS será de: R$" + salario);
            System.out.println("");

        }
    }
}
