public class Insertionsort {
    public static void printArray(int arr[]) {


        for (int i = 0; i <= arr.length - 1; i++) {


            System.out.println(arr[i] + "  ");


        }

        System.out.println();
    }
    public static void main(String[] args) {

        
        int arr[]={4,2,5,9,1};
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=temp;


        }

printArray(arr);
    }
    
}
