package todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        System.out.println("Initializing...");
        final ArrayList<ToDoList> myToDoList = new ArrayList<ToDoList>();
        System.out.println("Initialized.");
        myToDoList.add(new ToDoList(myToDoList.index++, "Mail GirishSir"));
        Scanner input = new Scanner(System.in);
        while (true) {
            // displayToDoListFunction
            Operations.displayList(myToDoList);
            System.out.println("Enter the corresponding number from the menu: ");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");

            int choice = input.nextInt();
            input.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the task: ");
                    String description = input.nextLine();
                    System.out.println(Operations.addTask(myToDoList, myToDoList.index++, description));
                    break;
                case 4: System.exit(0);
            }
        }
    }
}