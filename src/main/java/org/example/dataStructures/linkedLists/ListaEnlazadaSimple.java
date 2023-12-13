package org.example.dataStructures.linkedLists;

/**
 * Esta clase va a representar en sí la ListaEnlazada
 */
public class ListaEnlazadaSimple {

    //Referencia al primer nodo de la lista enlazada
    private Node first;

    //Constructor con el primer valor inicializado como null, ya que la lista actualmente esta vacia
    public ListaEnlazadaSimple() {
        this.first = null;
    }

    //Método que nos permita insertar el -1er nodo- en la Lista enlazada
    public void push(Object obj){
        //Nuevo nodo creado
        Node newNode = new Node(obj);
        //Ahora el nuevo nodo apunta al -1er elemento- de la lista
        newNode.setNext(this.first);
        this.first = newNode;
    }

    //Sacar el -nodo- más reciente
    public Node pop(){

        //Guarda la referencia al 1er nodo en la variable -temp-.
        Node temp = this.first;
        this.first = this.first.next();

        return temp; //Lo que eliminemos de la lista enlazada lo vamos a quitar y lo vamos a establecer como el sgte nodo

    }

    //Eliminar uno de los nodos en relacion a su -Valor-

    public Node delete (Object val){

        //Nodo actual
        Node currentNode = this.first;
        //Nodo previo
        Node previousNode = this.first;

        while(!currentNode.value().equals(val)){
            if (currentNode.next() == null){
                return null;
            }else{
                previousNode = currentNode;
                currentNode = currentNode.next();
            }
        }

        //Si el nodo actual- corresponde con el 1er nodo, el 1er nodo se va a convertir en el sgte de este (2)
        if (currentNode == this.first){
            this.first = this.first.next();
        }else {
            previousNode.setNext(currentNode.next());
        }
        return currentNode;

    }

    //El método va a -Itererar - entre los nodos de la lista enlazada y además usaremos el met. showContent
    public void printContent(){

        Node currentNode = first;

        System.out.println("Mostrar elementos de la Lista Enlazada: ");
        while (currentNode != null){
            currentNode.showContent();
            currentNode = currentNode.next();
        }//Mientras sea diferente de null va a seguir iterando dentro del ciclo while

    }

    //Método para saber si la lista enlazada esta vacia
    public boolean isEmpty(){
        return  (this.first == null);
    }

    //Consultando valor, si existe, nos va a regresar el nodo donde tenemos este valor
    public Node contains (Object val){
        Node currentNode = this.first;

        //Vamos a iterar mientras no se encuentre el valor del -nodo-
        while (!currentNode.value().equals(val)) {
            if (currentNode.next() == null){ //Si se llega al nodo null (ultimo) retorna n(ull)
                return null;
            }else{
            currentNode = currentNode.next(); //Sigue iterando al siguiente nodo
            }
        }
        return currentNode; //Retornando nodo encontrado si lo encuentra
    }

    //Insertar un valor en la lista Enlazada en un punto intermedio
    public Node insert (Object value, Object newValue){
        Node newNode = new Node (newValue);
        Node currentNode = this.first;

        while (currentNode != null && !currentNode.value().equals(value)){
            currentNode = currentNode.next();
        }

        if (currentNode == null){
            System.out.println("El valor " + value + " no se encontró en la lista.");
            return null;
        }


        newNode.setNext(currentNode.next());//El (newNode) apuntará al nodo actual,
        currentNode.setNext(newNode); //Ahora dejara de apuntar al actual y apuntara al (newNode) esto concluira la insercion

        return newNode;
    }

}
