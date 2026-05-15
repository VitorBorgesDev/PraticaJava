package LogicaJava.PacktageLogica;

import java.util.Scanner;

public class LogicaBlack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1º numero: ");
        int primeiro = sc.nextInt();
        int maior = primeiro;
        int menor = primeiro;


        for (int i = 2; i <=10 ; i++) {
            System.out.println(i + "º numero: ");
            int numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;


            }
            if (numero < menor) {
                menor = numero;
            }
            System.out.println("maior: " + maior);
            System.out.println("menor: " + menor);
        }
    }
}