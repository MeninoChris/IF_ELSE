import java.util.Scanner;

public class EX10_numeroMaior {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        /*
         * Faça um algoritmo para encontrar o maior número entre 3
         * números inteiros.
         * – O algoritmo deve ler três inteiros;
         * – se forem todos iguais, imprimir: “os números são iguais”;
         * – caso contrário, imprimir o maior dos 3 números.
         */

        System.out.print("Bem vindo! Vamos digitar 3 numeros inteiros, primeiro digite o primeiro algarismo: ");
        int Numero1 = entradaDados.nextInt();
        System.out.println("");

        System.out.print("Digite o segundo: ");
        int Numero2 = entradaDados.nextInt();
        System.out.println("");

        System.out.print("Digite o terceiro: ");
        int Numero3 = entradaDados.nextInt();
        System.out.println("");

        int NumeroMaior = Numero1;

        if (Numero2 > NumeroMaior) {
            NumeroMaior = Numero2;
        }
        if (Numero3 > NumeroMaior) {
            NumeroMaior = Numero3;
        }
        System.out.println("O maior número é: " + NumeroMaior);
    }
}
