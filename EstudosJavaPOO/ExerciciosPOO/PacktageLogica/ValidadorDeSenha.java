package LogicaJava.PacktageLogica;

import java.util.Scanner;

public class ValidadorDeSenha {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Sua Senha: ");
        String senha = sc.nextLine();

        System.out.println("Sua Senha tem tamanho: " + senha.length());

        if (senha.length() < 6 || senha.length() > 12) {
            System.out.println("Senha invalida");


        }else {
            System.out.println("Tamanho OK!!");


            boolean TemMaiscula  = false;
            for(int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);
                if (Character.isUpperCase(c)) {
                    TemMaiscula = true;
                    break;

                }

            }

            if (TemMaiscula) {
                System.out.println("❌ Precisa maiúscula (A-Z)!");


                boolean temNumero = false;
                for(int i = 0; i < senha.length(); i++) {
                    char c = senha.charAt(i);
                    if(Character.isDigit(c)) {  // 0-9
                        temNumero = true;
                        break;
                    }
                }

                if(!temNumero) {
                    System.out.println("❌ Precisa número (0-9)!");
                }

                if (senha.contains("")) {
                    System.out.println("❌ Sem espaços!");
                }


            }






        }











        sc.close();






    }
}
