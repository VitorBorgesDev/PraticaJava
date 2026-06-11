package LogicaJava.PacktageLogica;

import java.util.Scanner;

public class validadorDeSenha {
    static void main(String[] args) {
        Scanner senha = new Scanner(System.in);

        boolean acessoPermitida = false;
        int tentativas = 3;
        for (tentativas = 3; tentativas > 0; tentativas--) {

            System.out.println("------------------");
            System.out.println("Digite seu senha: ");
            int numero = senha.nextInt();


            if (numero == 12345) {
                System.out.println("Acesso Permitido");
                break;

            } else {
                System.out.println("-----------------");

                System.out.println("Senha incorreta");
                System.out.println(" ");
                System.out.println("Digite novamente");
                System.out.println(tentativas - 1 + " tentativas restantes");

            }
        }
        if (!acessoPermitida) {
            System.out.println(" ");
            System.out.println("Conta Bloqueada");

        }

    }

}



