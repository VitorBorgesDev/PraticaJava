package LogicaJava.PacktageLogica;

import java.util.Scanner;

public class LogicaMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3, media;

        System.out.println("PRIMEIRA NOTA:");
            num1 = input.nextDouble();
        System.out.println("SEGUNDA NOTA:");
            num2 = input.nextDouble();
        System.out.println("TERCEIRA NOTA:"); 
            num3 = input.nextDouble();

         double soma = num1 + num2 + num3;
         media = soma / 3;



         System.out.printf("Média: %.2f\n", media);


        if (media > 8.0)  {
            System.out.println(" A-APROVADO");
        }

            else if (media > 6.0){
                System.out.println("B-APROVADO");

            }

            else if (media > 5.0){
                System.out.println("C-APROVADO");
            }

            else {
                System.out.println("D-REPROVADO");
        }











    }
}
