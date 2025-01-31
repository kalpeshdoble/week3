public class InsertionSort {
    public static void main(String[] args) {
        int employeeId[]={4,5,3,6,3,7,10,9};
        int n=employeeId.length;
        for(int i=1;i<n;i++){
            int key=employeeId[i];
            int j=i-1;
           while(j>=0 && employeeId[j]>key){
            employeeId[j+1]=employeeId[j];
            j--;
           }
           employeeId[j+1]=key;
        }
        for(int i=0;i<n;i++){
            System.out.print(employeeId[i]+" ");
        }
    }
    
}
