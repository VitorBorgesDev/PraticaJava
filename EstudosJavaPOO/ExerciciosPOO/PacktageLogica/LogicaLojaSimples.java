package LogicaJava.PacktageLogica;

import java.util.Scanner;

public class LogicaSeila {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] produtos = {"", "Produto A",  "Produto B", "Produto C",};
        double[] precos = {0, 20, 50, 10};
        int[] qntds = {0, 100, 75, 200};

        double[] faturamento = new double[4];
        for (int i = 0; i <= 3; i++) {
            faturamento[i] = precos[i] * qntds[i];
        }
             int MaiorIdx= 1;
        for(int i = 2; i <= 3; i++) {
            if(faturamento[i] > faturamento[MaiorIdx]) {
                MaiorIdx = i;
            }
        }

        System.out.println("🏪 FATURAMENTO LOJA");
        System.out.println("A: R$" + faturamento[1]);
        System.out.println("B: R$" + faturamento[2]);
        System.out.println("C: R$" + faturamento[3]);
        System.out.printf("\n MAIOR: %s R$%.2f\n",
                 produtos[MaiorIdx], faturamento[MaiorIdx]);


        sc.close();

    }
}
