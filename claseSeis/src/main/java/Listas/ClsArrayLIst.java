package Listas;

import java.util.ArrayList;
import java.util.List;

public class ClsArrayLIst
{

    public void ejemplo1()
    {
        List<String> taskList= new ArrayList<String>();
        //String lectura = "ir a votar";

        taskList.add("Hacer compras");
        taskList.add("Sacar al perro");
        taskList.add("hacer la cama");
        taskList.add("lavar el carro");

//        System.out.println(taskList);
//        String primerTarea= taskList.get(0);
//        System.out.println("Primer Tarea: " + primerTarea);
//        //REMOVER ITEM
//      //  taskList.remove(0);
//        primerTarea= taskList.get(0);
//        System.out.println("Primer Tarea: " + primerTarea);

        for (String tarea : taskList )   //iteración, recorrer el objeto, imprimer tarea por tarea
        {
            System.out.println("Tarea: " + tarea );
        }


//LISTA DE VALORES DE FORMA NUMERICA, INSERTAR (valores) 0,1,2,3,4 500,1000,1500,2000,2500

    }

//    public void listaValores ()
//    {
//        List<String> listNum= new ArrayList<String>();
//
//        listNum.add("500");
//        listNum.add("1000");
//        listNum.add("1500");
//        listNum.add("2000");
//        listNum.add("2500");
//
//
//        int suma=0;
//        for (int n : listNum)
//        {
//            suma= suma + n ;
//        }
//        System.out.println("la suma es: " + suma );
//    }


    public void listaValores()
    {

    }

    public void listaTareas()
    {
        List<ClsTaskList> task = new ArrayList<>();
        ClsTaskList tareaIndividual = new ClsTaskList();
        tareaIndividual.setTaskName("Hacer compras");
        tareaIndividual.setTaskDescription("Ir a la Torre");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual= new ClsTaskList(); //DEBEMOS VOLVER A INICIALIZAR CUANDO QUEREMOS AGREGAR ELEMENTOS AL CONTENEDOR


        tareaIndividual.setTaskName("sacar al perro");
        tareaIndividual.setTaskDescription("llevarlo al parque");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual= new ClsTaskList();

        tareaIndividual.setTaskName("Hacer la cama");
        tareaIndividual.setTaskDescription("Si no la hago me regañan");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual= new ClsTaskList();

        tareaIndividual.setTaskName("ir a votar");
        tareaIndividual.setTaskDescription("Cumplir con mi pais");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual= new ClsTaskList();

        task.get(1).setDone(true);
        task.get(3).setDone(true);





        int tarea_numero = 0;
        for (ClsTaskList tl : task)
        {
            if (!tl.isDone())
            {
                System.out.println(tarea_numero + "Tarea: " + tl.getTaskName() + "\nDescripción: " + tl.getTaskDescription());
                tarea_numero++;
            }
        }



    }





}
