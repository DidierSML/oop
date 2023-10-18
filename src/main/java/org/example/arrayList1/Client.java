package org.example.arrayList1;

import java.util.ArrayList;

public class Client {

    private int id;
    private String name;
    private String phone;

    private ArrayList<Account> accounts;//null - se relaciona la lista como tipo (Clase Account)

    public Client(int id, String name, String phone) { //Metodo Constructor con parámetros se usara cuando se cree un cliente
        this.id = id;
        this.name = name;
        this.phone = phone;

        accounts = new ArrayList<>();//se relaciona el objeto como una nueva lista -deja de ser null
    }

    public boolean addAccount (Account account){//este Met.relaciona la (clase Account) y se le llamará (account)
        accounts.add(account);//añadame a mi lista accounts. una cuenta nueva (account)
        return true;
    }

    public boolean removeAccount(int accountId){//Metodo para eliminar una cuenta (account) a traves del Id
        for (Account account : accounts) //para la cuenta (account) dentro de la lista (accounts)
            if (account.getId() == accountId) {//si encuentra el Id buscado, conincide con alguna cuenta (account)
                accounts.remove(account);//remueva la cuenta (account) de la lista (accounts).
                return true;
            }

        return false;// si no encontramos el Id el retorno será falso

    }
    public String toString(){ //cadena de caracteres que muestra los atributos del cliente
        String s = this.id + " " + this.name + " " + this.phone + "\n";

        for (Account account : accounts)
            s += account.toString() + "\n";//Concatenará esta info con la de los Atrib. de la clase Account

        return s; //returna los atributos de la Clase Client + Atrib. Clase Account
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


