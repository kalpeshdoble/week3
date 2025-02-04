package org.example.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputToFile {
    public static void main(String[] args) {
                // Path to the output file
                String filePath ="C:\\week3\\DAY04\\src\\main\\java\\org\\example\\InputStreamReader\\example.txt";

                // Create an InputStreamReader to read from System.in (console)
                try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                     BufferedReader consoleReader = new BufferedReader(inputStreamReader);
                     FileWriter fileWriter = new FileWriter(filePath, true)) {  // 'true' for appending to the file

                    String userInput;
                    System.out.println("Enter text (type 'exit' to quit):");

                    // Keep reading input from user until 'exit' is entered
                    while (true) {
                        // Read user input
                        userInput = consoleReader.readLine();

                        // Check if the user wants to exit the loop
                        if (userInput.equalsIgnoreCase("exit")) {
                            break;
                        }

                        // Write the user input to the file followed by a new line
                        fileWriter.write(userInput + System.lineSeparator());
                    }

                    System.out.println("User input has been written to the file.");

                } catch (IOException e) {
                    // Handle any I/O exceptions
                    System.out.println("An error occurred: " + e.getMessage());
                }
            }
}
