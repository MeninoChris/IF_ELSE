import java.util.Scanner;

public class EX1_maiorOUmetade{
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia um número inteiro.
        – Seo número for maior que 20...
        – calcular e imprimir a metade dele
        */
        Scanner entradaDados = new Scanner(System.in);


       System.out.print("Digite um número inteiro: ");
       int numero = entradaDados.nextInt();

       // Verificar se o número é maior que 20
       if (numero > 20) {
           double metade = numero / 2.0; // Calcula a metade
           System.out.println("A metade do número é: " + metade);
       } else {
           System.out.println("O número não é maior que 20.");
       }

       entradaDados.close();
    }
}
