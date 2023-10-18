package org.example.arrayList1;

import java.util.ArrayList;

class TransactionsMain {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        Client client = new Client(100, "Flanders", "12345678");

        accounts.add(new Account(8,1000, 1.5,client));
        accounts.add(new Account(9,2000, 2.0,client));

        accounts.get(0).withdraw(500);
        accounts.get(0).withdraw(1500);//No posible. over the balance
        accounts.get(0).deposit(2500);
        accounts.get(0).deposit(4500);

        accounts.get(1).withdraw(500);
        accounts.get(1).withdraw(1500);//No posible. over the balance
        accounts.get(1).deposit(2500);
        accounts.get(1).deposit(4500);

        /*for (Account account : accounts) { //Por cada cuenta dentro de la lista (accounts)
            System.out.println("Account " + account.getId() + ":");
            System.out.println("W:" + account.countTransactions('W'));
            System.out.println("D:" + account.countTransactions('D'));
        }
        */

        System.out.println(accounts.get(0)); //imprime la info de la cta despues de dctos.
    }
}
