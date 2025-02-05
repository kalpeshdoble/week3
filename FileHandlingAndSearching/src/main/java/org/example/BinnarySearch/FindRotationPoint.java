package org.example.BinnarySearch;

public class FindRotationPoint {
    public static int findRotationPoint(int arr[]){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int arr[]={8,9,10,11,6,7,4,3,5,6};
        int result=findRotationPoint(arr);
        System.out.println(result);

    }
}
