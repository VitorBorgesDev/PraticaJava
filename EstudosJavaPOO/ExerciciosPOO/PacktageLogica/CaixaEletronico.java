package LogicaJava.PacktageLogica;

import java.util.Scanner;

public class CaixaEletronico {
//    Exercício: Caixa Eletrônico
//    Crie a lógica de um programa que simula um caixa eletrônico.
//    O usuário informa um valor que deseja sacar.
//    O programa deve dizer quantas notas de cada tipo serão entregues
//    usando o menor número possível de notas.


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite valor que deve ser sacado: ");

        int valorUsuario = sc.nextInt();
        // exemplo
        // 286 / 100 =     (2)**notas de 100
        // 86 % 100 =      (0)**nao cabem notas de 100 em 86




            int notas100 = valorUsuario / 100;
            int restante = valorUsuario % 100;

            int notas50 = restante / 50;
            int restante1 = restante % 50;

            int notas20 = restante1 / 20;
            int restante2 = restante1 % 20;

            int notas10 = restante2 / 10;
            int restante3 = restante2 % 10;

            int notar5 = restante3 / 5;
            int restante4 = restante3 % 5;

            int notas2 = restante4 / 2;
            int restante5 = restante4 % 2;

            int notas1 = restante5 / 1;
            int restante6 = restante5 % 1;






        // peciso terminar a logica disso


        }



}







