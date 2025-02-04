package org.example.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CountOccurrence {
        public static void main(String[] args) {
            // Path to the file to be read
            String filePath ="C:\\week3\\DAY04\\src\\main\\java\\org\\example\\FileReader\\example.txt";
            // Word to be counted in the file
            String targetWord = "java";

            // Initialize the word occurrence counter
            int wordCount = 0;

            // Create FileReader and BufferedReader objects
            try (FileReader fileReader = new FileReader(filePath);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                String line;
                // Read each line from the file
                while ((line = bufferedReader.readLine()) != null) {
                    // Split the line into words
                    String[] words = line.split(" ");
                    // Check each word
                    for (String word : words) {
                        if (word.equalsIgnoreCase(targetWord)) {
                            wordCount++;
                        }
                    }
                }

                // Print the final word count
                System.out.println("The word \"" + targetWord + "\" appears " + wordCount + " times in the file.");

            } catch (IOException e) {
                // Handle any I/O exceptions
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }
        }
    }


