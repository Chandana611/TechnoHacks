package todolist_technohacks.p2;

import java.util.Scanner;
import java.util.*;
public class Todolist 
{

    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    private static void showMenu() 
    {
    	System.out.println();
        System.out.println("Main Menu: ");
        System.out.println("1. Add item to list");
        System.out.println("2. Remove item from list");
        System.out.println("3. Display to-do list");
        System.out.println("4. Exit the program");
        System.out.println("Enter your choice: ");
    }  
    private static void showList() 
    {
        System.out.println("To-Do List");
        for(int i = 0; i < tasks.size(); i++) 
        {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        System.out.println();
    }

    private static void addItem() 
    {
        System.out.println("Add Item");
        System.out.print("Enter an item: ");
        String item = sc.nextLine();
        tasks.add(item);
        System.out.println(item + " added to the list.");
        System.out.println();
    }

    private static void removeItem() 
    {
        System.out.println("Remove Item");
        showList();
        System.out.print("What do you want to remove? ");
        int index = sc.nextInt();
        sc.nextLine(); 
        if (index > 0 && index <= tasks.size())
        {
            String item = tasks.remove(index - 1);
            System.out.println(item + " removed from the list.");
        }
        else 
        {
            System.out.println("Invalid index.");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
    	System.out.println("*****WELCOME TO TECHNOHACKS");
    	System.out.println("*****WELCOME TO JAVA PROGRAMMING");
    	System.out.println("*****WELCOME TO MY SIMPLE TO-DO-LIST");
        int choice = -1;
        while(choice != 0) 
        {
            showMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice) 
            {   
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    showList();
                    break;
                case 4:
                    System.out.println("Thank you for using the program.");
                    break;
                default:
                    System.out.println("Enter a valid option.");
                    System.out.println();
            }
        }
    }
}