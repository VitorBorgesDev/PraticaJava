package LogicaJava.PacktageLogica;

import java.sql.SQLOutput;
import java.util.Scanner;

         public class LogicaCPF{
             public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);

                 System.out.println("Digite seu CPF deve conter 11 digitos: ");
                 String cpf = sc.nextLine();

                 System.out.println("voçê digitou:" + cpf);
                 System.out.println("tamanho "+ cpf.length());

                 if (cpf.length() == 11) {
                     System.out.println(" CPF tem tamanho CORRETO!");
                 } else {
                     System.out.println(" CPF deve ter EXATAMENTE 11 dígitos!");
                     sc.close();
                     return;
                 }

                 boolean TemLetra = false;
                 for (int i = 0; i < cpf.length(); i++) {  // ← < !

                     char letra = cpf.charAt(i);

                     if (letra < '0'  || letra > '9') {
                         TemLetra = true;
                     }
                 }

                 if(TemLetra) {
                     System.out.println(" CPF só pode ter NÚMEROS!");
                 } else {
                     System.out.println(" CPF 100% válido!");
                 }
                 sc.close();
             }
         }


