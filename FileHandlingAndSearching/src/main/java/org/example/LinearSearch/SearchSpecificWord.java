package org.example.LinearSearch;

public class SearchSpecificWord {
    public static String findSentenceWithWord(String[] sentences, String targetWord) {
        // Iterate through the array of sentences
        for (String sentence : sentences) {
            // Check if the sentence contains the target word
            if (sentence.toLowerCase().contains(targetWord.toLowerCase())) {
                return sentence; // Return the first sentence that contains the word
            }
        }

        // If no sentence contains the word, return "Not Found"
        return "Not Found";
    }
    public static void main(String[] args) {
                // Array of sentences
                String[] sentences = {
                        "Hellow to capgemini taem.",
                        "I am kalpesh doble",
                        "I am learning Java.",
                        "Linear search is simple.",
                        "Searching for a word in a sentence.",
                        "This is the search last sentence."
                };

                // Word to search for
                String targetWord = "search";

                String result = findSentenceWithWord(sentences, targetWord);

                // Output the result
                System.out.println(result);
            }


        }



