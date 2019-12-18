package todolist;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class OperationsTest{
    @Test
    public void addTaskTest(){
        ArrayList<ToDoList> testToDo = new ArrayList<ToDoList>();
        assertEquals(0, testToDo.size());
        Operations.addTask(testToDo, 1, "Test message");
        assertEquals(1, testToDo.size());
    }
}