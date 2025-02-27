import java.util.Scanner;

public class EX9_emprestimo {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        /*
         * A prefeitura do Rio de Janeiro abriu uma linha de crédito para
         * os funcionários estatuários.
         * – o valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
         * – fazer um algoritmo que leia o salário bruto e o valor da prestação e
         * informar se o
         * empréstimo pode ou não ser concedido.
         * 
         * • Exemplo:
         * – Salário bruto: 1200,00
         * – Valor da prestação: 400,00
         * – Empréstimo não pode ser concedido!
         */

        System.out.println("Bem vindo! Vamos calcular o seu emprestimo.");
        System.out.println("");
        System.out.print("Digite o salário bruto: ");
        double salarioBruto = entradaDados.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = entradaDados.nextDouble();

        double limitePrestacao = salarioBruto * 0.30;

        if (valorPrestacao <= limitePrestacao) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }
        entradaDados.close();
    }
}
