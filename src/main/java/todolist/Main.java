package todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ToDoList> myToDoList = new ArrayList<ToDoList>();   
        try(Scanner input = new Scanner(System.in)){
            while (true) {
                // displayToDoListFunction
                Operations.displayList(myToDoList);
                Operations.displayMenu();
                int choice = input.nextInt();
                input.nextLine();
                switch(choice)
                {
                    case 1:
                        System.out.println("Enter the task: ");
                        String description = input.nextLine();
                        System.out.println(Operations.addTask(myToDoList, ToDoList.index++, description));
                        break;
                    case 4: System.exit(0);
                }
            }
    }
    }
}