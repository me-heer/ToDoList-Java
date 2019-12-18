package todolist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class OperationsTest{
    public void addTaskTest(){
        ArrayList<ToDoList> testToDo = new ArrayList<ToDoList>();
        assertEquals(0, testToDo.size());
        Operations.addTask(testToDo, 1, "Test message");
        assertEquals(1, testToDo.size());
    }
}