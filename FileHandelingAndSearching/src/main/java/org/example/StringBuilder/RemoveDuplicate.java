package org.example.StringBuilder;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicate {
    public static String removeDuplicate(String s){
        StringBuilder sb=new StringBuilder();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                sb.append(s.charAt(i));
                set.add(s.charAt(i));
            }
        }
       return sb.toString();

    }

    public static void main(String[] args) {
        String str="hhhheelllowww";
        System.out.println(removeDuplicate(str));
    }
}
