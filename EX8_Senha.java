import java.util.Scanner;

public class EX8_Senha {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        /*
            Faça um algoritmo que verifique a validade de uma senha
            fornecida pelo usuário.
            – sabendo que a senhaé R10p5:
            ¨ imprimir mensagem de “acesso concedido” ou “acesso negado”.
            • Para comparar duas Strings utilizar o método equals();
            – ele retorna um valor booleano!
            – Exemplo:
            ¨ if(senha.equals("R10p5"))
         */

        String senhaCorreta = "R10p5";

        System.out.print("Digite a senha: ");
        String senhaUsuario = entradaDados.nextLine();

        if (senhaUsuario.equals(senhaCorreta)) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }
        entradaDados.close();
    }
}
