package org.example.dataStructures.set.teamAndStudentsApp;

import java.util.*;

/**
 *  El equipo de (futbol-sala) del 3er grado esta formado por:
 *  (Pedro, Diego, Hugo, Carlos, Roberto, Rolando y Edgar).

 *  El equipo de (Olimpiadas-Matemáticas) del 3er grado está formado por:
 *  (Andrea, Diego, Cristina, Jose, Rolando y Edgar).

 *  ¿Preguntas?:
 *  ¿Quiénes están en ambos equipos?
 *  ¿Quiénes están en al menos uno de los dos equipos?
 *  ¿Quiénes están en el equipo de (futbol-sala) pero no en el otro?
 *  ¿Quiénes están en el equipo de las (Olimpiadas-Matemáticas) pero no en el otro?
 *  ¿Quiénes solo están en uno de los dos equipos?
 */

public class TeamsAndStudents {

    //Colección tipo Set
    private Map<Team, Set<Student>> teamSetMap;

    //Constructor sin Argumentos
    public TeamsAndStudents() {
        teamSetMap = new HashMap<>();


        //Creando Objetos tipo Team (futbol sala)
        Team futbolSala = new Team("Futbol sala");

        //Creando Objetos tipo Team (olimpiadas de matemáticas)
        Team olimpiadasMat = new Team("Olimpiadas Matemáticas");

        //Método con el que obtendremos estudiantes x medio de su nombre de equipo (futbolSala, estudiantes de futbol sala)
        teamSetMap.put(futbolSala, getStudentsByTeam(futbolSala.getName()));

        //Método con el que obtendremos estudiantes x medio de su nombre de equipo (olimpiadas mat, estudiantes olimpiadas)
        teamSetMap.put(olimpiadasMat, getStudentsByTeam(olimpiadasMat.getName()));

    }

    //Método que devuelve el mapa
    public Map <Team, Set <Student>> getMapTeams(){
        return teamSetMap;
    }

    //Método que obtiene un grupo de estudiantes x el equipo que pasamos como argumento
    private Set<Student> getStudentsByTeam(String teamName) {

        //Asegurate que la lista de estudiantes no sea null
        Collection <Student> allStudents = getStudents();
        if(allStudents == null){
            //Manejar el caso en el que la lista de estudiantes sea null
            return new LinkedHashSet<>();
        }

        //Lista que mantendrá el orden de inserción y recibirá el met. [getStudents]
        Set<Student> studentsByTeam = new LinkedHashSet<>(allStudents);

        //Iteraremos sobre toda la Colección de <Students>
//        for (Iterator<Student> iter = studentsByTeam.iterator(); iter.hasNext();){
//            //Obteniendo el -student- de cada Iteración
//            Student student = iter.next();
//            //y Preguntamos, si los (List) equipos del <student> en cuestión NO contienen el equipo pasado como parámetro (teamName)
//            if(!student.getTeams().contains(teamName)){
//                //Remuevo ese estudiante de mi Lista, asi obtengo una lista depurada con los
//                //estudiantes que pertenezcan al equipo pasado.
//                iter.remove();
//            }
//        }

        //Usando Programación Funcional
        System.out.println("Usando Programación Funcional: ");

        //Remueve si la lista de estudiantes no contiene el equipo pasado por parámetro
        studentsByTeam.removeIf(student -> !student.getTeams().contains(teamName));

        return studentsByTeam;

    }

    //Referencia de tipo Collection que va a guardar <Students> //BD Ficticia
    private Collection<Student> getStudents() {
        Collection<Student> students = new ArrayList<>();

        //Agregando Objeto <Student> pasando el nombre de estudiante y los equipos a los que pertenece
        students.add(
                new Student("Pedro", Arrays.asList("Futbol Sala")
                )
        );

        students.add(new Student("Jairo", Arrays.asList("Futbol Sala", "Olimpiadas de matemáticas")));
        students.add(new Student("Lina", Arrays.asList("Olimpiadas Matemáticas")));
        students.add(new Student("Camilo", Arrays.asList("Futbol Sala")));
        students.add(new Student("Julio", Arrays.asList("Olimpiadas Matemáticas")));
        students.add(new Student("Roberto", Arrays.asList("Futbol Sala")));
        students.add(new Student("Pablo", Arrays.asList("Olimpiadas Matemáticas")));
        students.add(new Student("Mario", Arrays.asList("Ajedrez, Decathlon")));
        students.add(new Student("Muriel", Arrays.asList("Olimpiadas Matemáticas")));

        students.add(new Student("Mauro", Arrays.asList("Baseball")));
        students.add(new Student("Herney", Arrays.asList("Softball")));
        students.add(new Student("Wilfred", Arrays.asList("Tennis")));


        return students;
    }

    //Método Ejecutable
    public static void main (String[] args){

        //Creamos un Objeto TeamsAndStudents
        TeamsAndStudents tas = new TeamsAndStudents();

        //Obtengo el Mapa
        Map <Team, Set <Student> > teams = tas.getMapTeams();

        //Creo 2 referencias de equipos
        Team futbolSala = new Team("Futbol Sala");
        Team olimiadasMat = new Team("Olimpiadas Matemáticas");

        //¿Quiénes están en ambos equipos?
        Set <Student> enDosEquipos = new LinkedHashSet<>(teams.get(futbolSala));
        enDosEquipos.addAll(teams.get(olimiadasMat));
        System.out.println("Estudiantes en al menos uno de los 2 Equipos = \n " + enDosEquipos);
        System.out.println("\n");

        //¿Quiénes están en al menos uno de los dos equipos?
        //¿Quiénes están en el equipo de (futbol-sala) pero no en el otro?
        //¿Quiénes están en el equipo de las (Olimpiadas-Matemáticas) pero no en el otro?
        //¿Quiénes solo están en uno de los dos equipos?


    }

}
