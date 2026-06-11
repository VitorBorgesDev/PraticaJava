package LogicaJava.PacktageLogica;

import java.util.Scanner;

public class ImparOuPar {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um nuemro inteiro: ");

        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("par");

        }else {
            System.out.println("impar");
        }


    }
}