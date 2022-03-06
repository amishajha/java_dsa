public class Selectionsort {

    public static void printArray(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + "  ");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        //selection sort
 int []arr={3,5,2,9,1};


 for(int i=0;i<arr.length-1;i++){
     

   int ans=i;

   for(int j=i+1;j<arr.length;j++){

       if(arr[ans]>arr[j]){
           
           ans=j;

       }
   }


   int temp=arr[ans];
   arr[ans]=arr[i];
   arr[i]=temp;










 }

 printArray(arr);
    }
}
