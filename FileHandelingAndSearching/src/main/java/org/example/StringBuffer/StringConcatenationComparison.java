package org.example.StringBuffer;

public class StringConcatenationComparison {
    public static void stringConcatenationComparison(int n){
        // Concatenating strings using StringBuffer
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i <n; i++) {
            stringBuffer.append("hello");
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Concatenating strings using StringBuilder
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <n; i++) {
            stringBuilder.append("hello");
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Output the results
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");
    }


    public static void main(String[] args) {
        // Number of iterations for string concatenation
        int iterations = 1_000_0000;
        stringConcatenationComparison(iterations);

          }
}

