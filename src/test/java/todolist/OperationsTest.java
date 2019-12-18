package todolist;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.Assume;
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
    public void displayTaskTestWin(){
        ArrayList<ToDoList> testToDo = new ArrayList<ToDoList>();
        Operations.addTask(testToDo, 1, "Test message");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Operations.displayList(testToDo);
        String expectedOutput = "1. Test message\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void displayTaskTestLin(){
        Assume.assumeTrue(System.getProperty("os.name").toLowerCase().indexOf("nux") >= 0);
        ArrayList<ToDoList> testToDo = new ArrayList<ToDoList>();
        Operations.addTask(testToDo, 1, "Test message");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Operations.displayList(testToDo);
        String expectedOutput = "1. Test message\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void displayMenuTestWin(){
        Assume.assumeTrue(System.getProperty("os.name").toLowerCase().startsWith("win"));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Operations.displayMenu();
        String expectedOutput = "";
        expectedOutput += "Enter the corresponding number from the menu: \r\n";
        expectedOutput += "1. Add Task\r\n";
        expectedOutput += "2. Update Task\r\n";
        expectedOutput += "3. Delete Task\r\n";
        expectedOutput += "4. Exit\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void displayMenuTestLinux(){
        Assume.assumeTrue(System.getProperty("os.name").toLowerCase().indexOf("nux") >= 0);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Operations.displayMenu();
        String expectedOutput = "";
        expectedOutput += "Enter the corresponding number from the menu: \n";
        expectedOutput += "1. Add Task\n";
        expectedOutput += "2. Update Task\n";
        expectedOutput += "3. Delete Task\n";
        expectedOutput += "4. Exit\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}