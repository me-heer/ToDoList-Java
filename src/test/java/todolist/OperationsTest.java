package todolist;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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

    @Test
    public void displayTaskTest(){
        ArrayList<ToDoList> testToDo = new ArrayList<ToDoList>();
        Operations.addTask(testToDo, 1, "Test message");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Operations.displayList(testToDo);
        String expectedOutput = "1. Test message\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}