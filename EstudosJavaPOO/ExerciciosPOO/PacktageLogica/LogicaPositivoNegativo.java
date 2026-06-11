package LogicaJava.PacktageLogica;

import java.util.Scanner;

public class LogicaPositivoNegativo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // "N", "P", "0"
        int n = sc.nextInt();
        if (n > 0 ){
            System.out.println("POSITIVO");
        } else if (n < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("0");
        }


        sc.close();


    }
}
