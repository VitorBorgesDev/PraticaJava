package LogicaJava.PacktageLogica;

import java.util.Scanner;

public class calculadorSimples {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a operação (+, -, *, /): ");
        String operacao = scanner.next();

        double resultado;
        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case  "-":
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case  "/":
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
                break;

        }

        scanner.close();
    }
}
