import java.util.Scanner;

public class EX4_numeroDecrescente{
    public static void main(String[] args) {
        /*
        Ler dois números (ponto flutuante) e apresentá-los em ordem
        decrescente.
        – supor que não sejam iguais
        */
       Scanner entradaDados = new Scanner(System.in);

       System.out.print("Digite o primeiro número: ");
       double numero1 = entradaDados.nextDouble();

       System.out.print("Digite o segundo número: ");
       double numero2 = entradaDados.nextDouble();

       // Verificar e imprimir em ordem decrescente
       if (numero1 > numero2) {
           System.out.println("Ordem decrescente: " + numero1 + " e " + numero2);
       } else {
           System.out.println("Ordem decrescente: " + numero2 + " e " + numero1);
       }

       entradaDados.close();
    }
}
