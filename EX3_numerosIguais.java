import java.util.Scanner;

public class EX3_numerosIguais{
    public static void main(String[] args) {
        /*
        Ler dois valores inteiros:
        – e se forem iguais, mostrar “Números iguais”;
        – caso contrário, apresentar a diferença do maior pelo menor.
        */
        Scanner entradaDados = new Scanner(System.in);

       System.out.print("Digite o primeiro número: ");
       int numero1 = entradaDados.nextInt();

       System.out.print("Digite o segundo número: ");
       int numero2 = entradaDados.nextInt();


       if (numero1 == numero2) {
           System.out.println("Números iguais");
       } else {

           int diferenca = Math.abs(numero1 - numero2);
           System.out.println("Diferença: " + diferenca);
       }

       entradaDados.close();
    }
}
