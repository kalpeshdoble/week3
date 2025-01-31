public class BubbleSort {
    public static void main(String[] args) {
        int studentMark[]={34,23,98,67,45,43};
        for(int i=0;i<studentMark.length;i++){
            for(int j=0;j<studentMark.length-1-i;j++){
                if(studentMark[j]>studentMark[j+1]){
                    int temp=studentMark[j];
                    studentMark[j]=studentMark[j+1];
                    studentMark[j+1]=temp;
                }
            }
        }
        for(int i=0;i<studentMark.length;i++){
            System.out.print(studentMark[i]+" ");
        }
    }
    
}
