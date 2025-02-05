package org.example.StringBuilder;


public class Reverse {
   public static String reverseString(String str) {
       StringBuilder sb = new StringBuilder();
       sb.append(str);
       sb.reverse();

       return sb.toString();
   }
   public static void main(String[] args) {
        String str="hellow";
       System.out.println(reverseString(str));
    }
}
