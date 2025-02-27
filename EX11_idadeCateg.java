import java.util.Scanner;

public class EX11_idadeCateg {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        /*
         * Faça um algoritmo que receba a idade de um nadador e
         * imprima a sua categoria seguindo as regras:
         * 
         * Categoria Idade
         * infantilA 5 - 7 anos
         * infantilB 8 - 10 anos
         * juvenilA 11-13 anos
         * juvenilB 14-17 anos
         * Sênior 18 anos ou mais
         */

        System.out.println("Vamos descobrir sua categoria de nadador!");
        System.out.println("");
        System.out.print("Digite sua idade: ");
        int idade = entradaDados.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Sua idade é: " + idade + ", e sua categoria é infantilA");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Sua idade é: " + idade + ", e sua categoria é infantilB");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Sua idade é: " + idade + ", e sua categoria é juvenilA");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Sua idade é: " + idade + ", e sua categoria é juvenilB");
        } else if (idade >= 18) {
            System.out.println("Sua idade é: " + idade + ", e sua categoria é Sênior");
        }
        entradaDados.close();
    }
}
