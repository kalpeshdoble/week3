package org.example.LinearSearch;

public class FirstNagetiveNumber {
    public static int firstNagetiveNumber(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,45,3,-4,5,6};
       int result= firstNagetiveNumber(arr);
       if(result>0){
           System.out.println("element found at index "+result);
       }
       else{
           System.out.println(result);
       }
    }
}
