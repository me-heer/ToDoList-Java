package todolist;

import java.util.ArrayList;
import java.util.Iterator;

public class Operations{
    public static void displayList(ArrayList<ToDoList> myToDoList){
        Iterator<ToDoList> listIterator = myToDoList.iterator();
        while(listIterator.hasNext())
        {
            ToDoList temp = (ToDoList)listIterator.next();
            System.out.print(temp + "\n");
        }
    }

    public static String addTask(ArrayList<ToDoList> myToDoList, int id, String description){
        String message = "";
        myToDoList.add(new ToDoList(id, description));
        message += "Success.";
        return message;
    }
}