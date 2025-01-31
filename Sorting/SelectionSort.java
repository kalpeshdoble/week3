public class SelectionSort {
    public static void main(String[] args) {
        int score[]={44,56,34,98,33,45};
        for(int i=0;i<score.length;i++){
            int min_index=i;
            for(int j=i+1;j<score.length;j++){
                if(score[min_index]>score[j]){
                    min_index=j;
                }
            }
            int temp=score[min_index];
            score[min_index]=score[i];
            score[i]=temp;
        }
    for(int i=0;i<score.length;i++){
        System.out.print(score[i]+" ");
    }
    }
    
}
