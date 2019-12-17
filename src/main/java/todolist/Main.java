package todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        System.out.println("Initializing...");
        final ArrayList<ToDoList> myToDo = new ArrayList<ToDoList>();
        System.out.println("Initialized.");
        myToDo.add(new ToDoList(1, "Mail GirishSir"));
        Scanner input = new Scanner(System.in);
        while (true) {
            // displayToDoListFunction
            Operations.displayList(myToDo);
            System.out.println("Enter the corresponding number from the menu: ");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");

            final int choice = input.nextInt();
            switch(choice)
            {
                case 4: break;
            }
            break;
        }
        input.close();

    }
}