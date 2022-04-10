package pl.coderslab.coderslab;

import org.apache.commons.lang3.ArrayUtils;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        showWelcomeMessage();
        options(args);


             //   System.out.println("Please add task description");
        }






    private static void showWelcomeMessage(){
        System.out.println(ConsoleColors.GREEN + "Hej, witaj w programie Task Manager " + System.getProperty("user name"));
        System.out.println(ConsoleColors.RESET);
    }
    private static void addTask() {
        Scanner scan = new Scanner(System.in);
    }

    public static void options(String [] choice){
        File file = new File ("tasks.csv");
        String[] option = {"add", "remove", "list", "exit"};
        Scanner scan = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE + "Please select an option:");
        System.out.println(Arrays.toString(option));

    }
}


