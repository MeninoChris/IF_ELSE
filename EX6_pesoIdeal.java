import java.util.Scanner;

public class EX6_pesoIdeal {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        /*
        Faça um algoritmo que leia a altura e o sexo de uma pessoa:
        – calcule e mostre seu peso ideal.
        – usar as formulas a seguir para calcular o peso ideal:
        ¨ para o sexo masculino: p72,7 * alturaq - 58 
        ¨ para o sexo feminino: p62,1 * alturaq - 44, 7
         */


        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = entradaDados.nextDouble();

        System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino): ");
        char sexo = entradaDados.next().charAt(0);


        double pesoIdeal;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58; 
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7; 
        } else {
            System.out.println("Sexo inválido!");
            entradaDados.close();
            return;
        }


        System.out.println("O seu peso ideal é: " + pesoIdeal);

        entradaDados.close();
    }
}
