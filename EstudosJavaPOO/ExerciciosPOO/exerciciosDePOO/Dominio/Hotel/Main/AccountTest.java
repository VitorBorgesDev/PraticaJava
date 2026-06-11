package LogicaJava.exerciciosDePOO.Dominio.Hotel.Main;

import LogicaJava.exerciciosDePOO.Dominio.Hotel.Dominio.Account;

public class AccountTest {
   public static void main(String[] args) {
        Account account1 = new Account("12340009", 1000.00);

        System.out.println("Account 1 number: " + account1.accountNumber);
        System.out.println("Account 1 number: " + account1.balance);


        Account account2 = new Account("1234323", 100.00);
       Account account3 = new Account("1230000873", -200.00);


    }



}
