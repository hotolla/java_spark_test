package com.example.test_js_spark;
import com.example.test_js_spark.textio.TextIO;
import com.example.test_js_spark.todo.TodoInterface;

public class App {

	public static void main(String[] args) {
		TodoInterface userInterface = new TodoInterface();
		boolean continueInApp;

		do {
			userInterface.todo();
			System.out.println("Do you want to continue in app (ENTER YES OR NO");
			continueInApp = TextIO.getlnBoolean();
		} while (continueInApp);
	}


}
