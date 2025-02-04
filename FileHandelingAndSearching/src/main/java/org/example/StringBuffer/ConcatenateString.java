package org.example.StringBuffer;

public class ConcatenateString {
    public static String concatenateString(String arr[]){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String arr[]={"Hellow","to","capgemini","from","my","side"};
        System.out.println(concatenateString(arr));
    }
}
