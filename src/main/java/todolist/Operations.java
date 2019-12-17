package todolist;

import java.util.ArrayList;
import java.util.Iterator;

public class Operations{
    public static void displayList(ArrayList<ToDoList> myToDoList){
        Iterator listIterator = myToDoList.iterator();
        while(listIterator.hasNext())
        {
            ToDoList temp = (ToDoList)listIterator.next();
            System.out.println(temp);
        }
    }
}