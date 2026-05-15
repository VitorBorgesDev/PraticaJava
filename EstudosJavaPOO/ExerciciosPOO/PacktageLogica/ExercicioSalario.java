package LogicaJava.PacktageLogica;

import java.util.Scanner;

public class ExercicioSalario {
    static void main(String[] args) {
        Scanner Salario = new Scanner(System.in);
        System.out.println("Digite seu salario bruto: ");

        double salario =  Salario.nextDouble();
        double imposto = 0;
        double valeTranporte = salario * 0.6;

            if (salario < 2000) {
                imposto = salario - valeTranporte * 0;

            } else if (salario <= 3000) {
                imposto = salario - valeTranporte * 0.10;


            } else if (salario <= 5000) {
                imposto = salario - valeTranporte * 0.20;


            }  else if (salario <= 6000) {
                imposto = salario - valeTranporte * 0.275;
            }

            double liquido = salario - imposto;

        System.out.printf("Bruto: R$%.2f\nImposto: R$%.2f\nvaleTransporte: R$%.2f\nLíquido: R$%.2f", salario, imposto, liquido, valeTranporte);



    }

}
