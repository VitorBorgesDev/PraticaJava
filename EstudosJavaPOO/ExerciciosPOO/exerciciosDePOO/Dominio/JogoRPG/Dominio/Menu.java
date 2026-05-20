package LogicaJava.exerciciosDePOO.Dominio.JogoRPG.Dominio;

import java.util.Scanner;

public class Menu {
    Scanner Entrada = new Scanner(System.in);
    Personagem personagem = new Personagem();

    public void MontarPersonagem() {
        boolean Escolha = true;
        System.out.println("insira o seu nome: ");
        String nome = Entrada.next();

        do {
            int EscolhaPersonagem = 0;
            System.out.println("Escolha um personagem: ");
            System.out.println("1 - Guerreiro ");
            System.out.println("2 - Mago ");
            System.out.println("3 - Arqueiro ");
            EscolhaPersonagem = Entrada.nextInt();
            if (EscolhaPersonagem == 1) {
                System.out.println("Bem vindo aos Barbaros ");
                personagem = new Guerreiro(nome);

            } else if (EscolhaPersonagem == 2) {
                System.out.println("Bem vindo aos Magos ");
                personagem = new Mago(nome);
                Escolha = false;

            } else if (EscolhaPersonagem == 3) {
                System.out.println("Bem vindo aos Arqueiros ");
                personagem = new Arqueiro(nome);
                Escolha = false;
            } else if(EscolhaPersonagem >= 4){
                System.out.println("Insira um valor valido! ");
            }

        } while (Escolha);
        System.out.println("BORA JOGAR!! " + personagem.getNome());
        Jogar();


    }

    public void Jogar() {
        int op = 0;
        do {
            System.out.println("(\n-----------------Menu de Ações-------------------");
            System.out.println("1 - Atacar ");
            System.out.println("2 - Receber Dano ");
            System.out.println("3 - Curar ");
            System.out.println("4 - Ver Status ");
             System.out.println("5 - Sair ");
            op = Entrada.nextInt();

            switch (op) {

                case 1:
                    personagem.atacar();
                    break;

                case 2:
                    System.out.println("Dano: ");
                    personagem.ReceberDano(Entrada.nextInt());
                    if (personagem.getVida() <= 0){
                        op = 5;
                    }
                    break;
                case 3:
                    System.out.println("curar: ");
                    personagem.CurarVida(Entrada.nextInt());

                case 4:
                    System.out.println("Ver status: ");
                    personagem.VerificarStatus();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;
                    default:
                        System.out.println("insira um valor valido! ");

            }



        } while(op != 5);




    }


}
