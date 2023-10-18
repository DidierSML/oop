package org.example.arrayList1;

import java.util.Date;

public class Transaction {

    private char type; //W or D
    private double amount;
    private double balance;
    private String description;
    private Date date;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;

        date = new Date();//inicializamos la fecha dentro del método
    }

    public char getType() {//Método
        return type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}

