package org.example.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class ConvertByteToCharacter {
    public static void main(String[] args) {
                // Path to the file to be read
                String filePath = "C:\\week3\\DAY04\\src\\main\\java\\org\\example\\InputStreamReader\\example.txt";
      // Create FileInputStream, InputStreamReader, and BufferedReader
                try (FileInputStream fileInputStream = new FileInputStream(filePath);
                     InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                     BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

                    String line;
                    // Read each line from the file and print it to the console
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }

                } catch (IOException e) {
                    // Handle any I/O exceptions, such as file not found or encoding issues
                    System.out.println("An error occurred: " + e.getMessage());
                }
            }
        }

