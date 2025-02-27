import java.util.Scanner;

public class EXChallenge {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        /*
        Desenvolver um algoritmo para definir se uma pessoa está apta
        a votar no Brasil.
        Pesquise: Quais são as regras para se votar no Brasil?
        Identifique quais os dados de entrada necessários para resolver o problema.
        Identifique quais regras devem ser satisfeitas para definir que uma pessoa está apta
        a votar
        Faça um programa que pede as informações necessáriase verifica se
        uma pessoa está apta a votar.
         */

         System.out.println("Vamos verificar se você está apto a votar no Brasil! Primerio responda as perguntas");
        
        System.out.print("Quantos anos você tem? "); 
        int idade = entradaDados.nextInt();
        if(idade < 16){
            System.out.println("Você não tem idade o suficiente para votar!");
            System.exit(0);
        } else{
            System.out.println("Otimo! Você tem idade o suficiente para votar");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Você é Brasileiro nato ou naturalizado? ");
        
        entradaDados.nextLine();
        String nacionalidade = entradaDados.nextLine();

        if ((nacionalidade.equals("sim") || nacionalidade.equals("Sim")) || nacionalidade.equals("SIM")) {
            System.out.println("Otimo! Você também é brasileiro nato/naturalizado");
        } else{
            System.out.println("Hmmm, que pena. Você não é brasileiro naturalizado então não pode votar :( ");
            System.out.println("");
            return;
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Você possui o titulo de eleitor regular ou está sem pendencias na justiça eleitoral? ");

        String tituloEleitor = entradaDados.nextLine();

        if ((tituloEleitor.equals("sim") || tituloEleitor.equals("Sim")) || tituloEleitor.equals("SIM")) {
            System.out.println("Otimo! Você também tem os documentos em dia com a justiça eleitoral!");
        } else{
            System.out.println("Hmmm, que pena. Você então não pode votar :( ");
            System.out.println("");
            return;
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Você está inelegivel para votar judicialmente? ");

        String elegivelJud = entradaDados.nextLine();

        if ((elegivelJud.equals("sim") || elegivelJud.equals("Sim")) || elegivelJud.equals("SIM")) {
            System.out.println("Otimo! Você também é elegivel");
        } else{
            System.out.println("Hmmm, que pena. Você então não pode votar :( ");
            System.out.println("");
            return;
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Concluindo as perguntas então você pode votar!");

        entradaDados.close();
    }
}
