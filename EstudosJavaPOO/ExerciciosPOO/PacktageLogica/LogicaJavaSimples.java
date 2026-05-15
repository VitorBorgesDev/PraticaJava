package LogicaJava.PacktageLogica;

import java.sql.SQLOutput;
import java.util.Scanner;

// receba um valor produto
// desconte o valor caso > 50 = 5%
// > 100  desconto 10%

public class LogicaJavaSimples {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o valor do seu item:");

        double valorItem = sc.nextDouble();
        double Desconto = 0;

        if (valorItem < 50) {
            Desconto = 0;
            System.out.println("Nao atingiu valor para desconto...");


        } else if(valorItem <= 100) {
                 Desconto = Desconto = 0.5;
            System.out.println("5% de desconto...");

        } else {
            Desconto = Desconto = 0.10;
            System.out.println("10% de desconto...");

        }

        double Final = valorItem - Desconto;
        System.out.printf("Original: R$%.2f\nDesconto: R$%.2f\nFinal: R$%.2f\n", valorItem, Desconto, Final);

        sc.close();


        }
    }



