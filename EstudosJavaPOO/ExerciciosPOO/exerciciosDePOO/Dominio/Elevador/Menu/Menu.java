package LogicaJava.exerciciosDePOO.Dominio.Elevador.Menu;

import LogicaJava.exerciciosDePOO.Dominio.Elevador.Dominio.Elevador;

import java.util.Scanner;
import java.util.Set;

import static java.lang.Thread.sleep;

public class Menu {
    private Elevador elevador = new Elevador();

    Scanner input = new Scanner(System.in);

    public void iniciarMenu() throws InterruptedException {
        boolean continuar = true;


        do {
            System.out.println("----------Elevador----------");
            System.out.println("1. Entrar");
            System.out.println("2. Sair");
            System.out.println("3. Subir andar");
            System.out.println("4. Descer andar");
            System.out.println("5. SAIR");
            int opcao = input.nextInt();


            switch (opcao) {

                case 1:
                    System.out.println("Quantas pessoas irão entrar?");
                    int pessoas = input.nextInt();
                    elevador.entrarPessoa(pessoas);
                    break;


                case 2:
                    System.out.println("Quantas pessoas sair ?");
                    int pessoasSair = input.nextInt();
                    elevador.removerPessoa(pessoasSair);
                    break;


                case 3:
                    System.out.println("Qual andar deseja ir ?");
                    int andar = input.nextInt();

                    if (elevador.subirAndar(andar)) {
                        System.out.println("Subindo...");
                        Thread.sleep(3000);
                        System.out.println("Chegou ao seu andar!!");
                    }
                    break;


                case 4:
                    System.out.println("Descer para qual andar ?");
                    int descerAndar = input.nextInt();

                    if (elevador.subirAndar(descerAndar)) {
                        System.out.println("Descendo...");
                        Thread.sleep(3000);
                        System.out.println("Chegou ao seu andar!!");
                    }
                    break;
                case 5:
                    continuar = false;
                    break;
            }
        } while (continuar);
    }
}








