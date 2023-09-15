package com.example.test_js_spark.todo;
import com.example.test_js_spark.textio.TextIO;

import java.util.Scanner;

public class Todo {
    private String usersName;
    private String todoList;
    private boolean continueInApp;

    Scanner input = new Scanner(System.in);

    public void setUserName(String userName) {
        usersName = input.next();
        this.usersName = userName;
    }
    public String getUsersName(){
        return this.usersName;
    }
    public void setTodoList(String todoList) {
        input.useDelimiter("\\t");
        while (true) {
            todoList = input.next();
            break;
        }
        this.todoList = todoList;
    }
    public void continueInApp(boolean yesOrNo) {
        this.continueInApp = yesOrNo;
    }
    public boolean isContinueInApp() {
        return this.continueInApp;
    }
    public void createTxtFileForTodos() {
        TextIO.writeFile("Todos.txt");
        TextIO.put(this.todoList);
    }
}
