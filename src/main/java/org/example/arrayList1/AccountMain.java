package org.example.arrayList1;

public class AccountMain {
    public static void main(String[] args) {

        //Creacion de una cuenta con los siguientes datos
        Account testAccount = new Account(1124, 20000,4.5,new Client(10, "Peter", "444561"));
        //Ahora la Cuenta contiene más datos debido a los ajustes

        testAccount.withdraw(2500);//descuento
        testAccount.deposit(3000);//deposito

        System.out.println("The information of the Account is: ");
        System.out.println("Id Account: "+ testAccount.getId());
        System.out.println("Annual Interest Rate : "+ testAccount.getAnnualInterestRate());
        System.out.println("Final Balance of Account After Movements: "+ testAccount.getBalance());
        System.out.println("Date: "+ testAccount.getDataCreated());

    }
}