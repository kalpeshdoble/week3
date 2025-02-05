package org.example.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLine {
    public static void main(String[] args) {
          // Path to the file to be read
                String filePath = "C:\\week3\\DAY04\\src\\main\\java\\org\\example\\FileReader\\example.txt";

                // Create FileReader and BufferedReader objects
                try (FileReader fileReader = new FileReader(filePath);
                     BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                    String line;
                    // Read each line from the file and print it to the console
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }

                } catch (IOException e) {
                    // Handle any I/O exceptions
                    System.out.println("An error occurred while reading the file: " + e.getMessage());
                }
            }
        }



