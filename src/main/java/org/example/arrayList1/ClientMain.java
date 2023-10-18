package org.example.arrayList1;

public class ClientMain {

    public static void main(String[] args) {

        Client[] clients = new Client[2];//null, null  -Lista creada de 2 clientes con base en la clase Client-

        clients[0] = new Client(1, "Ana","5874743");//Cliente 2
        /*clients[0].addAccount(new Account(12,200000,Client clients);*/

        clients[1] = new Client(2, "Yeremy", "343555");

        System.out.println("Information of the Client= "+ clients[0].toString());//Impresion info Cliente 1
        System.out.println("Information of the Client= "+ clients[1].toString());//Impresion info Cliente 2

        /*clients[1].removeAccount(4); //remoción de la cuenta con id 4

        System.out.println("Information of the Client= "+ clients[1].toString());//Impresion info Cliente 2;
        */
    }
}
//Java identifica los metodos de cadena creados, si son implementados, asi no se invoquen
//en el print, la impresion mostrará su contenido de cadena (Strings methods), de lo contrario
//mostrará la direccion donde esta alojada la info de cada cliente
