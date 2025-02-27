import java.util.Scanner;

public class EX7_valorBonus {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);
        /*
        A empresa XSoftware concedeu um bônus de 20%do valor do salário a
        todos os funcionários com tempos de trabalho na empresa igual ou
        superior a cinco anos e de 10% aos demais funcionários.
        • Faça um algoritmo que leia o salário e a quantidade de anos de cada
        funcionário, calcule e imprima o valor do bônus.
        */

       
        System.out.print("Digite o salário do funcionário: ");
        double salario = entradaDados.nextDouble();

        System.out.print("Digite o número de anos de trabalho na empresa: ");
        int anosTrabalho = entradaDados.nextInt();


        double bonus;
        if (anosTrabalho >= 5) {
            bonus = salario * 0.20;
        } else {
            bonus = salario * 0.10; 
        }

        System.out.println("O valor do bônus é: R$ " + bonus);

        entradaDados.close();

    }
}
