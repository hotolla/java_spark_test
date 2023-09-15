package com.example.test_js_spark.todo;
import java.util.Scanner;
public class TodoInterface {
    private String userName;
    private String createTodos;

    Scanner input = new Scanner(System.in);
    Todo todo = new Todo();

    public void todo() {
        System.out.println("MyApp");
        System.out.println("Welcome, Enter your first name");
        todo.getUsersName();
        System.out.println("Welcome " + todo.getUsersName() + ", Click on enter to continue");
        input.nextLine();
        System.out.println("Press tab and enter to save to-dos after you have written them");
        todo.setTodoList(createTodos);
        todo.createTxtFileForTodos();
    }
}
