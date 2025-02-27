import java.util.Scanner;

public class EX5_numeroEntre {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        /*
        Faça um algoritmo para ler um número inteiro.
        – verifique se o número está no intervalo entre 50 (inclusive) e 100(inclusive);
        – se estiver:
        ¨ imprimir “Pertence ao intervalo”;
        – senão:
        ¨ imprimir “Não pertenceao intervalo”
        */

       System.out.print("Digite um número inteiro: ");
       int numero = entradaDados.nextInt();

       if (numero >= 50 && numero <= 100) {
           System.out.println("Pertence ao intervalo");
       } else {
           System.out.println("Não pertence ao intervalo");
       }

       entradaDados.close();
    }
}
