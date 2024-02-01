package org.example.dataStructures.maps.enterpriseExcercise;

import java.util.*;

/**
 * Applicación que permitirá:
 *  - Registrar Empresas
 *  - Agregar Empleados a Empresas Existentes
 *  - Imprimir Los Datos de X Empresa y sus Empleados
 *  - Salir
 */
public class EnterpriseApp {

    //Map que Contendrá como <Key> (Empresa) y como <Value> (Empleados)
    private Map < Enterprise, List < Employee> > enterprises;
    private Scanner input;

    //Constructor Inicializando el Map como tipo HashMap y el Scanner
    public EnterpriseApp(){
        enterprises = new HashMap<>();
        input = new Scanner(System.in);
    }

    //Método con Menú Básico para mostrar las opciones por consola
    public void initMenu(){

        int chooseOption;

        do{
            System.out.println("\n\n\t\t\t\t Menú");
            System.out.println("---------------Empleados---------------");
            System.out.println("1. - Registrar Empresa en el Sistema: ");
            System.out.println("2. - Registrar Empleado en una Empresa: ");
            System.out.println("3. - Imprimir Información de la Empresa: ");
            System.out.println("4. - Salir: ");

            System.out.println("\nSeleccione la opción deseada: ");

            //Reciba la Opción por Teclado
            chooseOption = input.nextInt();

            switch (chooseOption)
            {
                case 1:
                    newEnterprise(); //Registre una Empresa a la App
                    break;
                case 2:
                    newEmployee();//Registre un Empleado en un Empresa
                    break;
                case 3:
                    printInfoEnterprises();//Imprima info de las Empresas
                    break;
            }

        }while (chooseOption != 4);// Mientras no se elija la opción 4 continue en el menú

    }

    //Método para Registrar una Empresa
    private void newEnterprise() {

        System.out.println("Proporciona el -ID- de la Empresa: ");
        //Recibiendo id de la Empresa
        int idEmpresa = input.nextInt();

        System.out.println("Proporciona el -Nombre- de la Empresa: ");
        //Recibiendo Nombre de la Empresa
        String nombreEmpresa = input.next();

        System.out.println("Proporciona el -Sector- al que pertenece Empresa: ");
        //Recibiendo Sector de la Empresa
        String sectorEmpresa = input.next();

        //Creando nueva Empresa con los datos Captados
        Enterprise newEnterprise = new Enterprise(idEmpresa,nombreEmpresa,sectorEmpresa);

        //Agregando la Empresa Creada al Mapa llamado -enterprises-
        enterprises.put(newEnterprise, new LinkedList <Employee>());
        //Como la Lista es Nueva, pasamos como segundo argumento una Lista Vacía de Empleados

    }

    //Método para Registrar un Empleado
    private void newEmployee() {

        System.out.println("Ingrese el -ID- del Empleado: ");
        //Recibiendo el -ID- del Empleado
        int idEmpleado = input.nextInt();

        System.out.println("Ingrese el -Nombre- del Empleado: ");
        //Recibiendo el -Nombre- del Empleado
        String nombreEmpleado = input.next();

        //Consumir el caracter de nueva linea pendiente
        input.nextLine();

        System.out.println("Ingrese el -ss- del Empleado: ");
        //Recibiendo el -ss- del Empleado (ss=numero seguridad social)
        String ssEmpleado = input.next();

        System.out.println("Ingrese la Empresa donde trabaja el Empleado: ");
        //Recibiendo Empresa donde trabaja el Empleado
        String empresaEmpleado = input.next();

        //Creando Nuevo Empleado con los datos recibidos menos el nombre de la Empresa
        Employee newEmployee = new Employee(idEmpleado,nombreEmpleado,ssEmpleado,empresaEmpleado);

        //Creando Objeto Empresa recibiendo x Constructor unicamente el nombre de la Empresa
        Enterprise newEnterprise = new Enterprise(empresaEmpleado);


        //Consultamos si nuestro Mapa contiene la Empresa, de ser así asigna al empleado a ella, sino no aplica el cambio
        if(enterprises.containsKey(newEnterprise)){
            //Si existe la Empresa(Key) obtenemos su (Value) que es una Lista de Empleados
            //y accedemos al Met. add de dicha Lista para agregar el empleado recien creado (newEmployee)
            enterprises.get(newEnterprise).add(newEmployee);
        }else{//Si no existe, le paso la -nuevaEmpresa- y una Lista Enlazada como (Value)
            enterprises.put(newEnterprise,new LinkedList<Employee>());
            //Y agrego el nuevoEmpleado a la Lista asociada a la Nueva empresa
            enterprises.get(newEnterprise).add(newEmployee);
        }
    }

    //Método para Imprimir la Info de las Empresas
    private void printInfoEnterprises() {
        System.out.println("\n");

        //Iteramos sobre el Mapa usando el entry.Set
        for (Map.Entry <Enterprise, List <Employee>> print: enterprises.entrySet()){
            //Obtenga la (Key) y el (Value) del map
            Enterprise enterprise = print.getKey();
            List <Employee> employeeList = print.getValue();

            System.out.println("------------------------------------");

            //Imprima el nombre de la Empresa
            System.out.println("Empresa: " + enterprise.getName());

            //Al ser (Value) una -Lista-, debo Iterar sobre este también
            for (Employee printing: employeeList){
                System.out.println("Empleados: " + "\t"+ printing);
            }

            System.out.println("------------------------------------");

            //Espaciado entre las empresas
            System.out.println("\n");
        }
    }

    //Método Ejecutable que inicializa un Objeto de esta Clase dando inicio al Menú
    public static void main(String[] args) {
        EnterpriseApp app = new EnterpriseApp();
        app.initMenu();
    }


}
