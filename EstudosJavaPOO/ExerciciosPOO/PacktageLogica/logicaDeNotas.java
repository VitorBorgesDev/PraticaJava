package LogicaJava.PacktageLogica;

import java.util.Scanner;

public class logicaDeNotas {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("quanto tirou esse bimestre?");


        double notas = input.nextDouble();


        if (notas < 6){
            System.out.println(" humm que pena, Reprovado");
        } else if (notas < 8) {
            System.out.println(" UaU parabens, Aprovado");


        } else if (notas < 10) {
            System.out.println("BOM");

       } else {
           System.out.println("Perfeito");

        }



    }
}
