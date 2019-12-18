package todolist;

import java.util.ArrayList;
import java.util.Iterator;

public class Operations{
    public static void displayList(ArrayList<ToDoList> myToDoList){
        Iterator<ToDoList> listIterator = myToDoList.iterator();
        while(listIterator.hasNext())
        {
            ToDoList temp = (ToDoList)listIterator.next();
            System.out.println(temp);
        }
    }

    public static String addTask(ArrayList<ToDoList> myToDoList, int id, String description){
        String message = "";
        myToDoList.add(new ToDoList(id, description));
        message += "Success.";
        return message;
    }

    public static void displayMenu(){
        System.out.println("Enter the corresponding number from the menu: ");
        System.out.println("1. Add Task");
        System.out.println("2. Update Task");
        System.out.println("3. Delete Task");
        System.out.println("4. Exit");
    }
}