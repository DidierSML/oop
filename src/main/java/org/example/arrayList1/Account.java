package org.example.arrayList1;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private int id; //A1
    private double balance; //A2
    private double annualInterestRate; //A3
    private Date dataCreated; //C4 Inhalterble - no se asigno setter
    private Client client;// ----Add para el EX. TRANSACTIONS
    private ArrayList<Transaction> transactions;// ---Add para el EX. TRANSACTIONS -null

    public Account(int id, double balance, double annualInterestRate, Client client) { //Constructor con 3 parámetros
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.client = client; //---Add para el Ex. TRANSACTIONS - Ahora es editable deja de ser null

        this.transactions = new ArrayList<>();//---Add para el EX. TRANSACTIONS
        dataCreated = new Date();//una vez ejecutado contendra el dia actual
    }
    public boolean withdraw (double amount){ //Metodo de descuento
        if (balance > amount){
            balance -= amount;

            this.transactions.add(new Transaction('W',amount,this.balance, "Withdrawn"+ amount));//---EX.TRANS
            // Se add una nueva tranasacción con sus atrib. indicando que es un Descuento.

            System.out.println("Withdrad Succesful");
            return true;   //Si el balance es mayor a la cantidad el balance será = a la diferencia de la cantidad
        }
        System.out.println("Withdrad Not Succesful");
        return false;  //si no, retornará falso
    }

    public void deposit (double amount){ //método de abono a la cuenta
        balance += amount;  //el balance será igual a la sumatoria de la cantidad al balance

        this.transactions.add(new Transaction('D',amount,this.balance, "Deposited"+amount));//---EX.TRANSACT
        //// Se add una nueva tranasacción con sus atrib. indicando que es un Deposito.
        System.out.println("Deposit Succesful");
    }

    public int countTransactions(char type){//---EX. TRANSACTIONS

        int count = 0;//Contador de transacciones en 0
        for (Transaction transaction : transactions)//Por cada transacion dentro de la lista transactions
            if (transaction.getType() == type)
                count++;//sume por cada aparicion de los caracteres de deposito y descuento

        return count;
    }

    public int getId() { // getter id
        return id;
    }

    public void setId(int id) { //setter id
        this.id = id;
    }

    public double getBalance() { //getter balance
        return balance;
    }

    public void setBalance(double balance) {//setter balance
        this.balance = balance;
    }

    public double getAnnualInterestRate() { // getter rata anual de interes
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) { // setter rata anual de interes
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDataCreated() { //Getter Fecha de creación, no se usa setter
        return dataCreated;
    }

    public Client getClient() {//---EX.TRANSACTIONS
        return client;
    }

    public void setClient(Client client) {//---EX.TRANSACTIONS
        this.client = client;
    }

    @Override
    public String toString() {//Met. creado que concatenará esta info con la de la Clase Client
        return this.id + " " + this.balance + " " + this.annualInterestRate +" " + this.dataCreated + "\n" + transactions;
    }
}

