import java.util.Scanner;

public class EX2_maimenIdade{
    public static void main(String[] args) {
        /*
        Faça um algoritmo que:
        – receba a idade de uma pessoa;
        – se for maior de idade imprima: “maior de idade”;
        – senão imprima: “menor de idade”.
        */

        Scanner entradaDados = new Scanner(System.in);

       System.out.print("Digite a idade da pessoa: ");
       int idade = entradaDados.nextInt();

       // Verificar se é maior ou menor de idade
       if (idade >= 18) {
           System.out.println("Maior de idade");
       } else {
           System.out.println("Menor de idade");
       }

       entradaDados.close();
    }
}
