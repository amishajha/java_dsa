public class BubbleSort {


    public static  void printArray(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+"  ");
        }

        System.out.println();
    }
    public static void main(String[] args) {

        //timecomplexity -o(n*n);
        int []arr={3,5,1,2,4};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
   
        }

        
        printArray(arr);
    }

    
}
